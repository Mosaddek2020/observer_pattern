package observer_pattern;

import observer_pattern.ClassRepresentative;
import observer_pattern.Observer;

public class Main {

    public static void main(String[] args) {

        ClassRepresentative cr = new ClassRepresentative();

        Observer o1 = new Observer("mssum");
        Observer o2 = new Observer("farhan");
        Observer o3= new Observer("mosaddek");

        cr.register(o1);
        cr.register(o2);
        cr.setMessage("hi there");


    }
}
