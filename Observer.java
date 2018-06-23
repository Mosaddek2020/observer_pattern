package observer_pattern;

public class Observer {
    String name;
    Observer(String name){
        this.name = name;
    }
    public void update(String msg){

        System.out.println("Message from CR to "+name+": "+msg+"\n");


    }
}
