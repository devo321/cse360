import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class PlotPanel extends JPanel implements Observer {

    Drawable drawable;

    public PlotPanel(Drawable drawable){
        this.drawable = drawable;
    }

    @Override
    public void update(Observable o, Object arg){
        drawable.setValue(((Source)o).getValue());
        repaint();
    }

    public void paintComponents(Graphics g){
        if(drawable != null){
            drawable.draw(g);
        }
    }
}