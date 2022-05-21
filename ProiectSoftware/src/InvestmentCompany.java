import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class InvestmentCompany {
	
	public static ArrayList<Project> projects = new ArrayList<Project>();
	
	public boolean addProject(Project p) {
		return projects.add(p);
	}
	
	public Project getBestInvestment() {
		
		Iterator<Project> it = projects.iterator();
		Project profitProject = it.next();
		while(it.hasNext()) {
			Project project = it.next();
			
			if(project.getRisk() < profitProject.getRisk())
			   profitProject = project;
		}
		return profitProject;
	}

	public static void main(String[] args) {

		Member m1 = new Member("Andrei", 25);
		Member m2 = new Member("Amalia", 20);
		Member m3 = new Member("Eduard", 23);

		HashSet<Member> members = new HashSet<Member>();
		members.add(m1);
		members.add(m2);
		members.add(m3);
	}
}