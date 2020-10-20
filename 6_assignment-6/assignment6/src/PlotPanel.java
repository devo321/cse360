/**
 * Name: Deven Pile
 * ClassID: 70605
 * Description: Class that holds JPanels for each graph to be displayed in
 */


import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class PlotPanel extends JPanel implements Observer {

    Drawable drawable;

    /**
     * Sets passed in drawable object to the local drawable object
     * @param drawable obeject to be set
     * @return none its a Constructor
     */
    public PlotPanel(Drawable drawable){
        this.drawable = drawable;
    }

    /**
     * Overridden update method from observer class, sets value of drawable 
     * from Observable object o
     * @param o Observable object
     * @param arg argument object
     * @return void
     */
    @Override
    public void update(Observable o, Object arg){
        drawable.setValue(((Source)o).getValue());
        repaint();
    }
    /**
     * Draws graphic object g
     * @param g graphic object to be drawn
     * @return void 
     */
    public void paintComponent(Graphics g){
        if(drawable != null){
            drawable.draw(g);
        }
    }
}
