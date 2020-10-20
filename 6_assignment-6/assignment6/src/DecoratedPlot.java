/**
 * Name: Deven Pile
 * ClassID: 70605
 * Description: Abstract class for creating decorated plots MarkedPlot
 *              and BarPlot
 */
import java.awt.*;


public abstract class DecoratedPlot extends Drawable {
    Drawable drawable;

    /**
     * Creates local variable from param d
     * @param d passed in drawable variable
     * @return void 
     */
    public void add(Drawable d){
        drawable = d;
        
    }
    /**
     * Overriden method for setValue from Drawable
     * @param value value to be added to values
     * @return void
     */
    @Override
    public void setValue( int value ){
        if(values.size() < 20){
            this.values.add(value);
        }
        else{
            this.values.removeFirst();
            this.values.add(value);
        }
    }

    /**
     * Overridden draw method from Drawable
     * @param g Graphics object to be drawn
     * @return void
     */
    @Override
    public void draw(Graphics g){
        drawable.draw(g);

    }
    
}
