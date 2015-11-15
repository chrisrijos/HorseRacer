import javax.swing.*;

/**
 * @clr45
 * acts as the controller handling the interaction between the user and the main horse race frame.
 */
public class RaceController {

    public static void main(String[] args){
        new RaceController();
    }
    public RaceController(){
    /*Constructor*/
        JFrame mFrame = new RacePanel();
        mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mFrame.setVisible(true);
    }

}
