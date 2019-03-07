
package ejemployee;

public class EjEmployee {

    public static void main(String[] args) {
                EmployeeBuilder miBuilder = new EmployeeBuilder(123,"Pepe");
        miBuilder.setNewMiddleName("Rodriguez");
        
        Employee nuevoEmpleado = new EmployeeBuilder((long)1234,"Carlos")
                .setNewMiddleName("Gomez")
                .setNewBirthDate(7)
                .setNewBirthMonth(5)
                .setNewBirthYear(1984)
                .createEmployee();
        
       
    }
    
}
