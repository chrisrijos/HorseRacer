import javax.swing.*;

/**
 * @author: clr45
 * Controls the running of the main HorseRace thread.
 */
public class RaceController {

    public static void main(String[] args){
        new RaceController();
    }
    public RaceController(){
        JFrame mFrame = new RacePanel();
        mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mFrame.setVisible(true);
    }
}
