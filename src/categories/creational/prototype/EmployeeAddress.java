package categories.creational.prototype;

import java.util.EnumMap;

//Implementing Prototype by copying constructor
//considered better than implementing cloneable
public class EmployeeAddress {
    public String streetAddress, city, country;

    public EmployeeAddress(String streetAddress, String city, String country) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.country = country;
    }

    public EmployeeAddress (EmployeeAddress other){
        this(other.streetAddress, other.city, other.country);
    }

    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

class Employee{

    public String name;
    public EmployeeAddress employeeAddress;

    public Employee(String name, EmployeeAddress employeeAddress) {
        this.name = name;
        this.employeeAddress = employeeAddress;
    }

    public Employee (Employee other){
        this(other.name, new EmployeeAddress(other.employeeAddress));
//        this.name = other.name;
//        this.employeeAddress = new EmployeeAddress(other.employeeAddress);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeAddress=" + employeeAddress +
                '}';
    }
}

class CopyConstructorDemo{
    public static void main(String[] args) {
        Employee john = new Employee("John", new EmployeeAddress("123 London rd","London","UK"));

        Employee chris = new Employee(john);
        chris.name = "Chris";
        chris.employeeAddress.city = "New York";

        System.out.println(john);
        System.out.println(chris);
    }
}



