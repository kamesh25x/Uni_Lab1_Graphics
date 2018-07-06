import java.awt.Color;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class House extends GraphicsProgram {

    public void run() {
        // sun
        GOval sun = new GOval(20, 20);
        sun.setColor(Color.YELLOW);
        sun.setFilled(true);
        add(sun, 150, 20);
        // tree
        GRect treeTrunk = new GRect(20, 50);
        treeTrunk.setColor(Color.BLACK);
        treeTrunk.setFilled(true);
        add(treeTrunk, 50, 150);
        GOval treeCrown = new GOval(60, 40);
        treeCrown.setColor(Color.GREEN);
        treeCrown.setFilled(true);
        add(treeCrown, 30, 110);
        //house
        GRect house = new GRect(50, 50);
        house.setColor(Color.PINK);
        house.setFilled(true);
        add(house, 100, 150);
        GLine leftRoof = new GLine(100, 150, 125, 125);
        add(leftRoof);
        GLine rightRoof = new GLine(125, 125, 150, 150);
        add(rightRoof);
    }
}
