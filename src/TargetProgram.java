import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

/**
 * 7th Simple Java Program: TargetProgram: Your program should draw an image of
 * an archery target or, if you prefer the logo for a national department store
 * chain—that called "Target". This figure is simply three GOval objects, two
 * red and one white, drawn in the correct order. The outer circle should have a
 * radius of one inch (72 pixels), the white circle has a radius of 0.65 inches,
 * and the inner red circle has a radius of 0.3 inches. The figure should be
 * centered in the window of a GraphicsProgram subclass.
 *
 * @author put your name here
 */
public class TargetProgram extends GraphicsProgram {

    public static final double CONVERSION_INCH_TO_PIXEL = 72.0 / 1.0;
    public static final double OUTER_RED_RADIUS = 1.0 * CONVERSION_INCH_TO_PIXEL;
    public static final double MIDDLE_WHITE_RADIUS = 0.65 * CONVERSION_INCH_TO_PIXEL;
    public static final double INNER_RED_RADIUS = 0.3 * CONVERSION_INCH_TO_PIXEL;

    public static final int WINDOW_SIZE_X = 400;
    public static final int WINDOW_SIZE_Y = 400;

    public static final int START_LOC_X = 120;
    public static final int START_LOC_Y = 100;

    //public static final int START_LOC_X = (int) ((WINDOW_SIZE_X/2) - OUTER_RED_RADIUS) ;
    //public static final int START_LOC_Y = (int) ((WINDOW_SIZE_Y/2) - OUTER_RED_RADIUS);

    /**
     * runs the program
     */
    public void run() {
        // your code goes here:

        //setSize((START_LOC_X + (int) OUTER_RED_RADIUS)*2 , (START_LOC_Y + (int) OUTER_RED_RADIUS)*2);

        setSize(WINDOW_SIZE_X, WINDOW_SIZE_Y);

        GOval oval1 = new GOval(OUTER_RED_RADIUS * 2, OUTER_RED_RADIUS * 2);
        add(oval1, START_LOC_X, START_LOC_Y);
        oval1.setFilled(true);
        oval1.setFillColor(Color.RED);

        GOval oval2 = new GOval(MIDDLE_WHITE_RADIUS * 2, MIDDLE_WHITE_RADIUS * 2);
        add(oval2, START_LOC_X + (OUTER_RED_RADIUS - MIDDLE_WHITE_RADIUS), START_LOC_Y + (OUTER_RED_RADIUS - MIDDLE_WHITE_RADIUS));
        oval2.setFilled(true);
        oval2.setFillColor(Color.WHITE);

        GOval oval3 = new GOval(INNER_RED_RADIUS * 2, INNER_RED_RADIUS * 2);
        add(oval3, START_LOC_X + (OUTER_RED_RADIUS - INNER_RED_RADIUS), START_LOC_Y + (OUTER_RED_RADIUS - INNER_RED_RADIUS));
        oval3.setFilled(true);
        oval3.setFillColor(Color.RED);

    }

}
