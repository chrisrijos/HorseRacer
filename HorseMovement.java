import java.awt.*;
import java.util.Random;

/**
 * @clr45
 * Implements runnable to create thread to handle horse movements across the RaceTrack panel
 */
public class HorseMovement implements Runnable{

    public final int xStartPos = 10; //change
    public final int yStartPos = 20;

    private RaceTrack hRaceTrack;
    private HorseModel Horse2D;
    private int xPos, yPos;

    public HorseMovement(RaceTrack r, int yPos_Spacing){
    /*Constructor*/
        xPos = xStartPos;
        yPos = yStartPos * yPos_Spacing;
        Horse2D = new HorseModel(xPos, yPos);
        hRaceTrack = r;
    }
    public HorseModel moveHorse(HorseModel horseObject){
    /*Updates horse positon*/
        horseObject = new HorseModel(xPos += ((int)(Math.random() * 3)), yPos); //maximum horse movement is randomed up to 3 spaces
        return horseObject;
    }
    public void paintComponent(Graphics h){
    /*paints the new horse after movement*/
        this.Horse2D = moveHorse(Horse2D);
        Graphics2D hMod = (Graphics2D) h;
        Horse2D.createHorse(hMod);
    }
    public void run(){
    /*Repaints the horse models as they increment movement across the screen*/
        final int FINISH_LINE = 500;//sets a finish line as far as the X value position

        while(this.xPos < FINISH_LINE) {
            //ends when the horse reaches the designated
            //FINISH_LINE
            hRaceTrack.repaint();
            hRaceTrack.revalidate();
        }
    }
}
