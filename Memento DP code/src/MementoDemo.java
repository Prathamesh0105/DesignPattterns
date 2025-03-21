public class MementoDemo {                  
        public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
                                                       
        originator.setState("State1");         // setState()should be followed by addMemento()
        caretaker.addMemento( originator.save() ); // prints memento list after saving
        originator.setState("State2");
        caretaker.addMemento( originator.save() ); // prints memento list after saving
        originator.setState("State3");
        caretaker.addMemento( originator.save() ); // prints memento list after saving
        originator.setState("State4");
        caretaker.addMemento( originator.save() ); // prints memento list after saving
        originator.restore( caretaker.getMemento() );
        originator.restore( caretaker.getMemento() );
       
    }          
}
    