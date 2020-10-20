import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class World extends JFrame implements ActionListener{

    Source source = new Source();

    public World(){
        setLayout(new GridLayout(4,1));

        SimplePlot simple = new SimplePlot();
        MarkedPlot marked = new MarkedPlot();
        BarPlot bar = new BarPlot();

        marked.add(simple);
        bar.add(marked);

        PlotPanel panel1 = new PlotPanel(bar);
        PlotPanel panel2 = new PlotPanel(marked);
        PlotPanel panel3 = new PlotPanel(simple);

        source.addObserver(panel1);
        source.addObserver(panel2);
        source.addObserver(panel3);

        JButton button = new JButton("Run");
        button.setFocusPainted(false);
        button.addActionListener(this);

        add(panel1);
        add(panel2);
        add(panel3);
        add(button);




    }

    public static void main(String[] args){
        World world = new World();
        world.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        world.setSize(500,500);
        world.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        source.create();
        repaint();
    }
    
}
