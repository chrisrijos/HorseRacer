import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * @clr45
 * This class handles the creation of the Horse objects within the pane as
 * 2D objects on a JPane using javas 2D graphics libraries.
 */
public class HorseModel{

    /*Horse dimensions*/
    private int x;
    private int y;
    private final int horsePerimeter = 20;

    public HorseModel(int xT, int yT){
    /*Constructor*/
        x = xT;
        y = yT;
    }
    public void setDimensions(int dimX, int dimY){
    /*Sets program dimensions*/
        x = dimX;
        y = dimY;
    }
    public void createHorse(Graphics2D h){
    /*Paints HorseModel on screen as 2 dimensional object*/

        Ellipse2D.Double horseModel = new Ellipse2D.Double(x, y, horsePerimeter, horsePerimeter);
        h.setColor(Color.RED);
        h.fill(horseModel);
        h.setColor(Color.YELLOW);
        h.draw(horseModel);
    }
}
