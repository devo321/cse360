/**
 * Name: Deven Pile
 * ClassID: 70605
 * Description: Creates a BarPlot from values in MarkedPlot 
 *              which gets its values from SimplePlot 
 */
import java.awt.*;

public class BarPlot extends DecoratedPlot {


    /**
     * Draws a bar from the point to the bottom of graph space, implemented version of the abstract
     * method from DecoratedPlot
     * @param g Graphics object to be drawn
     * @return void
     */
    public void draw(Graphics g){
        for (int x = 0; x < values.size() - 1 ; x++){
            g.setColor(Color.GRAY);
            g.fillRect(((x + 1) * 20) - 5, values.get(x + 1), 10, 500);
            g.setColor(Color.BLACK);
            g.fillRect(((x + 1) * 20) - 5, values.get(x + 1), 10, 10);
        }
        super.draw(g);
    }
    
}
