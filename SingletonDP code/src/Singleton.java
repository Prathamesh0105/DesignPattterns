/*public class Singleton {
    private int age;
    private String name;
    private static Singleton singleInstance=new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
    System.out.println("eager initialization ");  
    return singleInstance;
    }
    public void setSingletonInstance(int a, String name){
        this.age=a;
        this.name=name;
    }
    public String toString(){
        return("age=" + age+"           Name="+name);
    }
}*/
public class Singleton {
    private  int age;
    private  String name;
    private  static Singleton singleInstance=null;
    private Singleton(){}
    public static Singleton getInstance(){
      System.out.println("lazy initialization ");
      if(singleInstance==null)  
          singleInstance= new Singleton();
      return singleInstance;
    }
    public void setSingletonInstance(int a, String n){
        age=a;
        name=n;
    }
    public String toString(){
        return("age=" + age+"           Name="+name);
    }
}
