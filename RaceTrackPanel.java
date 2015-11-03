import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author: clr45
 * Class to create a panel where the Horse objects move with in
 */
public class RaceTrackPanel extends JPanel{

    /*Number of horses*/
    private int i = 10;

    private ArrayList<HorseObject> h = new ArrayList<HorseObject>();
    private ArrayList<Thread> t = new ArrayList<Thread>(25);

    public RaceTrackPanel(){
        setBackground(Color.BLACK);
        //reset();
    }
    public void refreshPanel(){
    /*Removes running threads, and refreshes panel*/
        h.clear(); // clears horse thread objects
        for(int i : h){
            Thread t = new Thread(h.get(i));
            t.start();
            this.t.add(t);
        }
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(HorseObject o : h){
            o.paint(g);
        }
    }

}
