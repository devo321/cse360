/**
 * Name: Deven Pile
 * ClassID: 70605
 * Description: Abstract class for Drawable graphs
 */

import java.awt.*;
import java.util.LinkedList;

public abstract class Drawable {

    protected LinkedList<Integer> values = new LinkedList<>();


    /**
     * Appends param v to the linked list values, if there is more than 20 values currently in values, 
     * removes the oldest value and appends param v
     * @param v value to be appeneded to the Linked List values
     */
    public void setValue( int v ){
        if(values.size() < 20){
            this.values.add(v);
        }
        else{
            this.values.removeFirst();
            this.values.add(v);
        }
        
    }
    /**
     * Abstract draw method to be implemented by children classes
     * @param g graphics variable to be drawn
     */
    public void draw(Graphics g){

    }
    
}
