
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christianjackson
 */
public class LambdaMethod1717 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Employee[] ITemployee = {
    new Employee("Jason", "Kidd", 5000, "IT"),
    new Employee("Ashley", "Green", 7600, "IT"),
    new Employee("Luke", "Kennard", 6200, "IT"),};

Employee[] salesEmployee = {
    new Employee("Matthew", "Harden", 3587.5, "Sales"),
    new Employee("Jake", "Shields", 3200, "Sales")};

    Employee[] marketingEmployee = {
    new Employee("Lebron", "James", 4700.77, "Marketing"),
    new Employee("Wendy", "Williams", 4236.4, "Marketing")};
    
        System.out.printf("Average salary of IT employees is : %.2f %n",
     Arrays.stream(ITemployee)
          .mapToDouble(x-> x.getSalary())
          .average()
           .getAsDouble());
        
        System.out.printf("Average salary of Sales employees is : %.2f %n",
     Arrays.stream(salesEmployee)
          .mapToDouble(x-> x.getSalary())
          .average()
           .getAsDouble());
        
        System.out.printf("Average salary of Marketing employees is : %.2f %n",
     Arrays.stream(marketingEmployee)
          .mapToDouble(x-> x.getSalary())
          .average()
           .getAsDouble());
          
}

    
}
