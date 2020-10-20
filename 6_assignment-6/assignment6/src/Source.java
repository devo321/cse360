/**
 * Name: Deven Pile
 * ClassID: 70605
 * Description: Genereates a random number between 0 and 250
 */
import java.util.Observable;


public class Source extends Observable{

    private int value;

    /**
     * Creates a random number and stores it into value
     * @return void
     */
    public void create(){
        value = (int) (Math.random() * (250 - 0)) + 1;
        setChanged();
        notifyObservers();

    }
    /**
     * Returns the value of value
     * @return int value
     */
    public int getValue(){
        return value;
    }
    
}
