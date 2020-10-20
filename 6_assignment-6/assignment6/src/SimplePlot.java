/**
 * Name: Deven Pile
 * ClassID: 70605
 * Description: Creates a Simple Plot from random values
 */

import java.awt.*;

public class SimplePlot extends Drawable {

    /**
     * Draws a line from one point to another, implemented abstract method from Drawable
     * @return void
     */
    public void draw(Graphics g){
        for (int x = 0; x < values.size() - 1 ; x++){
            g.drawLine(x * 20 , values.get(x), (x + 1) * 20, values.get(x + 1));
        }
    }
}
