public class Main {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOs("Android").setColor("Red").getPhone();
        System.out.println(p);
    }
}