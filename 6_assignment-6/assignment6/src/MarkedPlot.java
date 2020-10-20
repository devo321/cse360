/**
 * Name: Deven Pile
 * ClassID: 70605
 * Description: Creates a marked plot from a SimplePlot that is passed in
 */
import java.awt.*;

public class MarkedPlot extends DecoratedPlot {

    /**
     * Implemented draw method from abstract class DecoratedPlot
     * @param g Graphics object to be drawn
     * @return void
     */
    public void draw(Graphics g){
        for (int x = 0; x < values.size() - 1 ; x++){
            g.fillRect(((x + 1) * 20) - 5, values.get(x + 1), 10, 10);
        }
        super.draw(g);
    }
    
}
