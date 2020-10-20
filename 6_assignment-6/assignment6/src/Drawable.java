import java.awt.*;
import java.util.LinkedList;

public abstract class Drawable {

    protected LinkedList<Integer> values = new LinkedList<>();

    public void setValue( int v ){
        this.values.add(v);
    }

    public void draw(Graphics g){

    }
    
}
