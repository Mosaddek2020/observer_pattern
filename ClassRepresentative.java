package observer_pattern;

import java.util.ArrayList;
import java.util.LinkedList;

public class ClassRepresentative implements Subject{

    ArrayList<Observer> list = new ArrayList<>();
    String message = "";

   public void setMessage(String s){
        message = s;
        notifyObservers();
    }

    @Override
    public void register(Observer o) {
        list.add(o);

    }

    @Override
    public void unregister(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyObservers() {

        for( int i = 0; i<list.size();i++){
            list.get(i).update(message);

        }

    }
}

