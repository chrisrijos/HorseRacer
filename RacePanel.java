import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @clr45
 * Race panel creates the interface for initiating the race.
 */
public class RacePanel extends JFrame{

    /*Frame Buttons*/
    private JPanel mPanel;
    private JButton startRace = new JButton("Start Race");
    private JButton stopRace = new JButton("Stop Race");
    private JButton startOver = new JButton("Start Over");


    /*Panel to fill with HorseModels for race*/
    private RaceTrack rTrack;

    /*Window dimensions*/
    public int Window_Height = 1024;
    public int Window_Width = 768;

    public RacePanel(){
    /*Constructor*/

        initGui();
        initRace();
        initQuit();

        setSize(Window_Width, Window_Height);
    }
    public void initGui(){
    /*Initializes the main race panel and sets button positions and layouts*/
        mPanel = new JPanel(new BorderLayout());
        rTrack = new RaceTrack();

        JPanel horsePanel = new JPanel(); //panel to house horse objects before running across screen

        horsePanel.setLayout(new GridLayout(1, 3));

        positionJPanels(horsePanel, mPanel);
    }
    public void initRace(){
    /*implements action listener for start race button*/
        class StartRace implements ActionListener{
            public void actionPerformed(ActionEvent e){
                startRace.setEnabled(true);
                rTrack.initTrack();
            }
        }
        ActionListener event = new StartRace();
        startRace.addActionListener(event);
    }
    public void initQuit(){
    /*Implements the action listener for stop race button*/
        class StopRace implements ActionListener{
            public void actionPerformed(ActionEvent e){
                System.exit(0);//exits program if race is stopped
            }
        }
        ActionListener event = new StopRace();
        stopRace.addActionListener(event);
    }
    public void initReset(){
        class StartOver implements ActionListener{
            public void actionPerformed(ActionEvent e){
                rTrack.reset();
            }
        }
        ActionListener event = new StartOver();
        startOver.addActionListener(event);
    }
    public void positionJPanels(JPanel h, JPanel p){
    /*Handles adding buttons to a JPanel*/
        h.add(startRace);
        h.add(startOver);
        h.add(stopRace);

        p.add(h, BorderLayout.NORTH); //sets the horse panel buttons to the top of the layout
        p.add(rTrack, BorderLayout.CENTER); //sets

        add(p);
    }
}
