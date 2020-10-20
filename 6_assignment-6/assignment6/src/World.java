/**
 * Name: Deven Pile
 * ClassID: 70605
 * Description: Creates a world object, and runs main method
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class World extends JFrame implements ActionListener{

    Source source = new Source();

    /**
     * Constructor for World method, creates a 4x1 grid layout, creates a simple, marked, and bar plot
     * and adds them to panels, adds observers to the panels, then adds 3 panels and 1 button to the frame 
     * @return none its a constructor
     */
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
        pack();
        



    }

    /**
     * Main method for program, creates a new world object, sets frame bounds, shows frame
     * @param args
     * @return void
     */
    public static void main(String[] args){
        World world = new World();
        world.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        world.setSize(500, 1080);
        world.setVisible(true);
    }

    /**
     * Method that gets called whenever the "Run" is clicked
     * @return void
     */
    public void actionPerformed(ActionEvent e){
        source.create();
        repaint();
    }
    
}
