
import java.util.HashSet;

public class OpenSourceProject extends Project {
	
	private String mailingList;

	public OpenSourceProject(Manager manager, HashSet<Member> members, String title, double fund) {
		super(manager, title, fund);
	}

	public String getMailingList() {
		return mailingList;
	}

	public void setMailingList(String mailingList) {
		this.mailingList = mailingList;
	}

	@Override
	public double getRisk() {
		return getMembers().size() / getFund();
	}
}