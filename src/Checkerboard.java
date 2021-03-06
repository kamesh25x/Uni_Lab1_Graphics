import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

/**
 * 5th Simple Java Program: Checkerboard: write a GraphicsProgram that draws a
 * checker board on the screen using GRects.
 *
 * @author Kameswar Malladi
 */
public class Checkerboard extends GraphicsProgram {

    //Dimensions
    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;

    private static final int DELAY = 50;

    /* number of rows */
    private static final int NROWS = 8;

    /* number of columns */
    private static final int NCOLUMNS = 8;

    @Override
    public void init() {
        super.init();
        this.setSize(WIDTH, HEIGHT);
    }

    /* runs the program */
    public void run() {

        for (int j = 0; j < NROWS; j++) {
            for (int i = 0; i < NCOLUMNS; i++) {
                if ((i + j) % 2 == 0) {
                    GRect rect = new GRect(50, 50);
                    add(rect, i * 50, j * 50);
                    rect.setFilled(true);
                    rect.setFillColor(Color.blue);
                    pause(DELAY);
                }
            }
        }
    }
}
