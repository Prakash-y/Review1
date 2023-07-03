package Review1;

public class Diver {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Pankaj",10,20000);
		emp1.display();

		double yearlSalary = emp1.yearlySalary();
		
		
		System.out.println("Yearly salary : "+ yearlSalary);
		
	}
}
