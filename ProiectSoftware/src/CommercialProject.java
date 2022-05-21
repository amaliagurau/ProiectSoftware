import java.util.ArrayList;

public class CommercialProject extends DeadLine {

	private double marketingFund;
	private int teamNr=0;

	public CommercialProject(Manager manager, String title, double fund) {
		super(manager, title, fund);
	}

	public double getMarketingFund() {
		return getFund()/2;
	}

	public int getTeamNr() {
		return teamNr;
	}

	public boolean setTeamNr(int teamNr) {
		if(teamNr<getMembers().size()) {
		this.teamNr = teamNr;
		return true;}
		return false;
	}

	@Override
	public double getRisk() {
		return teamNr * 3 / getMembers().size()/(getFund()-getMarketingFund());
	}
}