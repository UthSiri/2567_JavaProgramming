package labsheet06;

public class Employee {
	private String name;
	private int hourWorked;
	private double hourlyRate;
	
	//
	public void setEmployeeDetails (String empName,int hours,double rate) {
		name = empName;
		hourWorked = hours;
		hourlyRate = rate;
	}
	//
	public double calculateSatary() {
		double salary = hourWorked * hourlyRate;
		if(hourWorked > 40) {
			double bonus = salary * 0.10; //
			salary +=bonus;
		}
		return salary;
	}
	//
	public void displayEmployeeDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Hour Worked: "+ hourWorked);
		System.out.println("Hourly Rate: "+ hourlyRate);
		System.out.println("Toyal Salary: "+ calculateSatary());
	}
}


