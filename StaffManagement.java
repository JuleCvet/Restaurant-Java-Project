package restaurantjava;
import java.util.ArrayList;


public class StaffManagement {

    private ArrayList<Employee> staff = new ArrayList<>();

    public StaffManagement() {
        Chef chef1 = new Chef(1,"Chef", "Bosse", "Hemma", GenderType.UNKNOWN, 12_000, ExperienceLevelType.HEADCHEF);
        Chef chef2 = new Chef(2,"Chef", "Ingmar", "Huset", GenderType.MALE, 8_000, ExperienceLevelType.ASSISTANTCHEF);
        Bartender b1 = new Bartender(3,"Bartender", "Emily", "Gamla Stan", GenderType.FEMALE, 10_000, 100);
        Bartender b2 = new Bartender(4,"Bartender", "Jonsson", "Slussen", GenderType.MALE, 10_000, 7);
        Waiter w1 = new Waiter(5,"Waiter", "Samhal", "Rågsved", GenderType.FEMALE, 7_000, 3);
        Waiter w2 = new Waiter(6,"Waiter", "Saml", "T-Centarlen", GenderType.MALE, 7_000,6);
        WasherUp wa1 = new WasherUp(7,"WasherUp", "Tanya", "Liljeholmen", GenderType.FEMALE, 7_000, 5, 3);
        WasherUp wa2 = new WasherUp(8,"WasherUp", "Thomas", "Mariatorget", GenderType.MALE, 7_000, 4, 300);
        
        staff.add(chef1);
        staff.add(chef2);
        staff.add(b1);
        staff.add(b2);
        staff.add(w1);
        staff.add(w2);
        staff.add(wa1);
        staff.add(wa2);       
    }
    
    public int getNumberOfEmployees() {
        return staff.size();
    }
    
    public void addEmployee(Employee obj) {
        staff.add(obj);
    }

    public boolean removeEmployee(int id) {
       // Employee objToRemove = null;  // Alternative way to remove th employee
        for (Employee e : staff) {
            if (e.getID()==id) {
                staff.remove(e);
                return true;         
            }
        }
        return false;
//  // Alternative way to remove th employee
//        if (objToRemove!=null) {
//            staff.remove(objToRemove);
//        } 
//        else {
//            System.out.println("No employee matching the ID, no employee was removed");
//        }
    }

    public void updateEmployee(int Id) {
        for (Employee employee : staff) {
            if(employee.getID()==Id){
                System.out.println("Do you want to change \n1. Salary \2. Adress");
            
            } 
        }
    }

    public void showEmployeeInformation() {
    }
    

    public double calculateAverageSalary() {
         double sum =0;
         double averageSalary = 0;
        for (Employee employee : staff) {
            sum+=(employee.getSalary());
        }
        averageSalary = sum / staff.size();
        return averageSalary;  
    }

    
    public double calculateAverageSalaryProfession(String proffesion) {
        double averageIndividualSalary=0;
        int count=0;
        
        for (Employee employee : staff) {
            if(employee.getProfessions().equals(proffesion)) {
                averageIndividualSalary = averageIndividualSalary + employee.getSalary();
                count++;
            }
        }
        return (averageIndividualSalary/count);
    }
    

    public double calculateTotalBonusOverall() {
       double bonus=0;
        for (Employee employee : staff) {
            bonus+=(employee.calculateBonus());
            }
        return bonus;
    }
    public double calculateBonusProfession(String proffesion) {
        double individualbonus=0;
        
        
        for (Employee employee : staff) {
            if(employee.getProfessions().equals(proffesion)) {
                individualbonus = individualbonus + employee.calculateBonus();
            }
        }
        return (individualbonus);
    }

    public void printGenderPercentTotal() {
        int count = 0,male=0,female=0,unknown=0;
        for (Employee employee : staff) {
            if(employee.getGender().name().equals("MALE"))
                male++;
            else if(employee.getGender().name().equals("FEMALE"))
                female++;
            else if (employee.getGender().name().equals("UNKNOWN"))
                unknown++;
            
        }
        System.out.println("Percentage of males is: "+((male/staff.size())*100)+" %");
        System.out.println("Percentage of females is: "+((female/staff.size())*100)+" %");
        System.out.println("Percentage of unknown is: "+((unknown/staff.size())*100)+" %");
    }

    public double genderPercentProfession() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double highestSalary() {
        Employee temporaryEmployee = staff.get(0);
        double max=temporaryEmployee.getSalary();
        
        for (int i = 1; i < staff.size(); i++) {
            if(max<staff.get(i).getSalary())
            {
                max=staff.get(i).getSalary();
            }
            
        }
 return max;
    }
    public double lowestSalary() {
        Employee temporaryEmployee = staff.get(0);
        double min=temporaryEmployee.getSalary();
        
        for (int i = 1; i < staff.size(); i++) {
            if(min>staff.get(i).getSalary())
            {
                min=staff.get(i).getSalary();
            }
            
        }
 return min;
    }
    
    
    
    public void printAll() {
        for (Employee e : staff) {
            e.print();
        }
    }
}