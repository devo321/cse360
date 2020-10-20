import java.awt.*;

public class SimplePlot extends Drawable {

    public void draw(Graphics g){
        System.out.print(values.size());
        for (int x = 0; x < values.size() - 1 ; x++){
            g.drawLine(x, values.get(x), (x + 1), values.get(x + 1));
        }
    }
}
