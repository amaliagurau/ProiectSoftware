import java.util.HashSet;

public class MilitaryProject extends DeadLine {

	private String password;

	public MilitaryProject(Manager manager, String title, double fund) {
		super(manager, title, fund);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public double getRisk() {
		return getMembers().size() / password.length() / getFund();
	}
}