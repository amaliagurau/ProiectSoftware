import java.util.ArrayList;

public abstract class DeadLine extends Project {
	
	private String deadLine;
	private final int MAX_NR=15;
	
	public DeadLine(Manager manager, String title, double fund) {
		super(manager, title, fund);
	}

	public String getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(String deadLine) {
		this.deadLine = deadLine;
	}
	
	public boolean addMember(Member m) {
		if(getMembers().size() == MAX_NR)
			return false;
		return getMembers().add(m);
	}
}