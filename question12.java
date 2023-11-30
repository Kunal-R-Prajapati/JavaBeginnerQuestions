// Save Person class in Person.java file
 class Person {
    String Name;
    
}
// Beginning of Employee Class
/**
 * Employee
 */
 class Employee extends Person {
    double AnnualSalary ;
    String YearOfJoining;
    String NationalInsuranceNumber;
    Employee(String name, double salary, String year, String nin) {
        Name = name;
        AnnualSalary = salary;
        YearOfJoining = year;
        NationalInsuranceNumber = nin;
    }   
}

public class question12 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Anuksha", 1000000, "2020", "Ans1457");
        System.out.println("Name : "+emp1.Name);
        System.out.println("Annual Salary : "+emp1.AnnualSalary);
        System.out.println("Year of Joining : "+emp1.YearOfJoining);
        System.out.println("National Insurance Number : "+emp1.NationalInsuranceNumber);
    }    
}
