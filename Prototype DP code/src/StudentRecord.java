class StudentRecord implements Prototype{  
      
    private int rollno;  
    private String name, department;  
    private double CGPA;  
    private String address;  
      
    public StudentRecord(){  
        
    }  
  
    public  StudentRecord(int rollno, String name, String department, double CGPA, String address) {  
        this();  
        this.rollno = rollno;  
        this.name = name;  
        this.department = department;  
        this.CGPA = CGPA;  
        this.address = address;  
    }  
      
    public void showRecord(){  
        System.out.println("   Student Records ");         
        System.out.println("Sroll number: "+rollno+"\t"+"Sname: "+name+"\t"+"Sdepartment: "+department+"\t"+"SCGPA: "+CGPA+"\t"+"Saddress: "+address);  
      
        System.out.println("---------------------------------------------");   
         
    }  
  
    @Override  
    public Prototype getClone() {  
          
        return new StudentRecord(rollno,name,department,CGPA,address);  
    }  
}