import java.io.IOException;       
class PrototypeDemo{  
         public static void main(String[] args) throws IOException {  
            
            //create Prototype for Employee Record using Builder pattern                    
            Prototype P1=new EmployeeRecord(000000,"XXXXemployeeXXXXXXXX","CSE",00000.00,"Nagpur");  
            // Prototype is ready to use for Employee
            P1.showRecord();  
            System.out.println("\n");  
            
            EmployeeRecord e2=(EmployeeRecord)P1.getClone();  
            e2.setSalary(200000);
            e2.showRecord();  
            System.out.println("\n");
            
            //create Prototype for Student Record using Builder pattern
            Prototype P2=new StudentRecord(000,"YYYYYYstudentYYYYYY","CSE",00.00,"Nagpur");  
            // Prototype is ready to use for Student
            P2.showRecord();  
            System.out.println("\n");  
            
            StudentRecord s2=(StudentRecord) P2.getClone();  
            s2.showRecord();    
        }     
    }