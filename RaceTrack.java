import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @clr45
 * Implements the race track to handel the arraylist of horses movement threads as well
 * as the threads handling the start of the horse movements.
 */
public class RaceTrack extends JPanel{

    /*Sets horses within race track*/
    private int numOfHorseObjects = 5;// change this to a dynamic
    private int numOfThreads = 25;

    /*Holds horse thread from HorseObject class*/
    private ArrayList<HorseMovement> horses = new ArrayList<>();
    private ArrayList<Thread> threads = new ArrayList(numOfThreads);

    public RaceTrack(){
    /*Constructor*/
        setBackground(Color.black);
        reset();
    }
    public void initTrack(){
    /*Starts the RaceTrack simulation*/
        threads.clear(); //clears the thread arraylist still residing

        for(int i = 0; i < horses.size(); i++){
            Thread T = new Thread(horses.get(i));
            T.start();
            threads.add(T);
        }
    }
    public void reset(){
    /*resets horse position within screen*/
        horses.clear();
        for(int i = 0; i < numOfHorseObjects; i++){
            horses.add(new HorseMovement(this, i));
        }
    }
    public void paintComponent(Graphics g){
    /*overrides graphics paint method in order to paint the horse movements
    * through the arraylist of HorseMovements*/
        super.paintComponent(g);
        for(HorseMovement h : horses){
            h.paintComponent(g);
        }
    }
}
