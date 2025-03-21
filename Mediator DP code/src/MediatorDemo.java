public class MediatorDemo {

    public static void main(String[] args) { 
    ApplicationMediator mediator = new ApplicationMediator();
    Colleague desktop = new DesktopColleague(mediator);
    Colleague mobile = new MobileColleague(mediator);
    mediator.addColleague(desktop);
    mediator.addColleague(mobile);
    desktop.send("Helloooooo ");
    mobile.send("Hiiiiii");
    System.out.println("Now mobile initiates communicating");
    mobile.send("How are you?????????????");
    desktop.send("I am fineeeeeeeeee");
  }

}
    
