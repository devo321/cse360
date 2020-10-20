import java.awt.*;


public abstract class DecoratedPlot extends Drawable {
    Drawable drawable;

    public void add(Drawable d){
        drawable = d;
        
    }

    @Override
    public void setValue( int value ){
        this.values.add(value);
        drawable.setValue(value);
    }

    @Override
    public void draw(Graphics g){
        drawable.draw(g);

    }
    
}
