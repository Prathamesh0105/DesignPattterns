public class singleton1main {
    public static void main(String[] args) {
        System.out.println("Singleton Pattern");
        
        Singleton object1= Singleton.getInstance();
        object1.setSingletonInstance(37,"PM1");
        System.out.println(object1);
        
        Singleton object2= Singleton.getInstance();
       
        System.out.println(object2);
        if (object1 == object2) {  
            System.out.println("Both objects are the same instance.");  
        }  
        object2.setSingletonInstance(51,"PM2");
        System.out.println(object1);
        System.out.println(object2);
        //Singleton object2=new Singleton();
    }
    
}
