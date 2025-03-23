public class ProxyDemo {
    public static void main(String[] args) {
        RealObject proxy = new RealObjectProxy();
        proxy.doSomething();
    }
    
}
