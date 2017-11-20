package restaurantjava;


public abstract class Employee {

    private int ID;
    private String fullName;
    private String address;
    private GenderType gender;
    private double salary;
    private String professions;

    public Employee(int ID,String professions, String fullName, String address, GenderType gender, double salary) {
        this.ID = ID;
        this.fullName = fullName;
        this.address = address;
        this.gender = gender;
        this.salary = salary;
        this.professions=professions;
    }

    public int getID() {
        return ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getProfessions() {
        return professions;
    }

    public void setProfessions(double salary) {
        this.professions = professions;
    }
    
//    public abstract double calculateSalary();
    public abstract double calculateBonus();
    public abstract void print();

    @Override
    public String toString() {
        return "ID " + ID +"Professions"+professions+ ": " + fullName + ", " + address + ", " + gender + ", Salary = " + salary;
    }  
}
