package ebookxxx;

public class ManagerTest {

	public static void main(String[] args) {
		
		Manager boss = new Manager("Bobusia Nowak", 8000, 1997, 12, 15);
		boss.setBonus(5000);
		
		Employee[] staff = new Employee[4];
		staff[0] = boss;
		staff[1] = new Employee("Janek Wysniewski", 2000, 1999, 10, 4);
		staff[2] = new Employee("Jacek Wydzial", 3000, 1999, 10, 4);
		staff[3] = new Employee("Jan Nowak", 2500, 1985, 10, 4);
		for(Employee e : staff) {
			System.out.println("Name: "+e.getName() + " Salary: " + e.getSalary());
		}
	}
}
