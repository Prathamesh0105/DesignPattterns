public class builderphonemain {
    public static void main(String[] args) {
        Phone p;//=new Phone("Android",1,6);
        //System.out.println(p);
        
        PhoneBuilder b1=new PhoneBuilder();
        p = b1.setOS("Windows").setRAM(8).setScreenSize(40).getgadget();
        System.out.println(p);
        
        
        System.out.println("-----------------------------------------------------");
        
        
        Laptop l=new Laptop("Android",8,18);
        System.out.println(l);
        
        LaptopBuilder b2=new LaptopBuilder();
        l = b2.setOS("Windows").setRAM(8).setScreenSize(40).getgadget();
        System.out.println(l);
    }
  
}


