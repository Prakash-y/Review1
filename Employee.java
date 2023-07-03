package Review1;

import java.util.Scanner;

public class Employee {

     String name;
	 int age;
	 double salary;
	 
	 public Employee(String name, int age, double salary)
    {
	 this.name=name;
		 this.age=age;
		 this.salary=salary;
	 }
	 
	 public void display()
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter a name : ");
		 String s = sc.nextLine();
		 
		 System.out.println("Name : "+name);
		 
		 System.out.println("Enter a age : ");
		 int a = sc.nextInt();
		 System.out.println("Age : "+age);
		 
		 System.out.println("Enter a salary :");
		 double sal = sc.nextDouble(); 
		 System.out.println("Salary : "+salary);
	 }
	 
	 public double yearlySalary() {
		 double yearSalary = salary*12;
		 return yearSalary;
	 }
}
