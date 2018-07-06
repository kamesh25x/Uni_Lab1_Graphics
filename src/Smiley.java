import java.awt.Color;

import acm.graphics.GArc;
import acm.graphics.GCompound;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;


public class Smiley extends GCompound {

    private static final int MOUTH_RADIUS = 40;

    public Smiley() {
        //setSize(200,250);
        drawShapeOfFace();
        drawEyes();
        drawMouth();
    }

    private void drawMouth() {
        GArc mouth = new GArc(MOUTH_RADIUS, MOUTH_RADIUS, 180, 180);
        add(mouth, 80, 100);
    }

    private void drawEyes() {
        GOval leftEye = new GOval(25, 25);
        add(leftEye, 75, 75);
        GOval rightEye = new GOval(25, 25);
        add(rightEye, 125, 75);
    }

    private void drawShapeOfFace() {
        GOval face = new GOval(100, 100);
        face.setColor(Color.YELLOW);
        face.setFilled(true);
        add(face, 50, 50);
    }
}
