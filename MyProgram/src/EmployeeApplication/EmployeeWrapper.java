package EmployeeApplication;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import InvalidAgeException.InvalidAgeException;
public class EmployeeWrapper {               //Wrapper Class
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<EmployeeWrapper> employee;
	
	public static void main(String[] args) {
		long empId = 0;
		String empName = " ";
		int empAge = 0;
		double empSalary = 0;
		System.out.println("Enter the number of Employees: ");
		int n = sc.nextInt();
		@SuppressWarnings("removal") Integer in = new Integer(n);    //wrapping
		employee = new ArrayList<EmployeeWrapper>(in); //assigning n to the arraylist
		ArrayList<Long> employeeId = new ArrayList<Long>(in);
		ArrayList<String> employeeName = new ArrayList<String>(in);
		ArrayList<Integer> employeeAge = new ArrayList<Integer>(in);
		ArrayList<Double> employeeSalary = new ArrayList<Double>(in);
		System.out.println("The number of Employees are: " + in);
		System.out.println(" ");
	for(int i=0;i<in;i++) {
		System.out.println("Enter the Id of the Employee: ");
		empId = sc.nextLong();
		sc.nextLine();
		@SuppressWarnings("removal") Long lObj = new Long(empId);   //wrapping
		System.out.println("The Employee Id is: " + lObj);
		employeeId.add(lObj);
	System.out.println(" ");
		System.out.println("Enter the Name of the Employee: ");
		empName = sc.nextLine();
		String sObj = new String(empName);   //wrapping
		System.out.println("The Employee Name is: " + sObj);
		employeeName.add(empName);
	System.out.println(" ");
		System.out.println("Enter the Salary of the Employee: ");
		empSalary = sc.nextDouble();
		@SuppressWarnings("removal") Double dObj = new Double(empSalary);   //wrapping
		System.out.println("The Employee Salary is: " + dObj);
		employeeSalary.add(dObj);
	System.out.println(" ");
	try {
			System.out.println("Enter the Age of the Employee: ");
			empAge = sc.nextInt();
			@SuppressWarnings("removal") int iObj1 = new Integer(empAge);   //wrapping
			ageValid(iObj1);
			employeeAge.add(iObj1);
		}
	catch(InvalidAgeException e) {
		employeeAge.add(null);
		System.out.println("Age is Null," + " " + e.getMessage());
		e.printStackTrace();     //print stack trace(this method used to print this throwable along with other
		//details like class name and line number where the exception occured. 
	} 
	}
	Collections.sort(employeeSalary);
	
	System.out.println(" ");
	System.out.println("The Employee's details are: ");
	for(int i=0;i<in;i++) {
		System.out.println("The Employee Id is: " + employeeId.get(i) );
		System.out.println("The Employee Name is: " + employeeName.get(i));
		System.out.println("The Employee Age is: " + employeeAge.get(i));
		System.out.println("The Employee Salary is: " + employeeSalary.get(i));
		System.out.println(" ");
	}
	}

	public static void ageValid(int iObj) throws InvalidAgeException  {
 		if(iObj < 21) {
 			throw new InvalidAgeException("Age should not be less than 21");   
 		}
 		else {
 		System.out.println("Age is: " + iObj);
 		System.out.println(" ");
 		}    }
}
