import acm.graphics.GImage;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.*;


public class BouncingBall extends GraphicsProgram {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private static final int DELAY = 50;
    private static final int BALL_DIAM = 50;
    private GObject ball;
    private int xVelocity = 4;
    private int yVelocity = 2;

    public void run() {
        // init
        this.resize(WIDTH, HEIGHT);
        pause(DELAY);

        ball = new GOval(BALL_DIAM, BALL_DIAM);
        ((GOval) ball).setFilled(true);
        ball.setColor(Color.red);

        //ball = new Smiley();
        //ball = new GImage("airplane.png");

        add(ball, 100, 10);

        // game loop
        while (true) {
            moveBall();
            checkForCollision();
            pause(DELAY);
        }
    }

    private void checkForCollision() {
        double y = ball.getY();
        if (y > (getHeight() - BALL_DIAM)) {
            yVelocity = -yVelocity;
        }
        double x = ball.getX();
        if (x > (getWidth() - BALL_DIAM) || x < 0) {
            xVelocity = -xVelocity;
        }

    }

    private void moveBall() {
        yVelocity += 1;
        ball.move(xVelocity, yVelocity);
    }
}
