package ritika.assignment.main;

import ritika.assignment.data.DefaultInitializationAssignment;
import ritika.assignment.singleton.JavaAssign;

public class myMain {
    public static void main(String[] args) {
        DefaultInitializationAssignment obj1 = new DefaultInitializationAssignment();
        obj1.print();
        obj1.display();

        JavaAssign obj2 = JavaAssign.method1("Ritika Chauhan");
        obj2.print();
    }
}