import java.util.LinkedList;
import java.util.List;

/**
 * Created by PC_key on 14.06.2017.
 */
public class IntegerValue implements Observable {
    private List<Observer> observers;
    private int value;

    public IntegerValue(){
        observers = new LinkedList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update(value);
    }

    public void changeValue(){
        System.out.println("Число изменено!");
        value = 5;
        notifyObservers();
    }

}
