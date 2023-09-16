package
public class Test{
        try {
        Ball ball = new Ball();
        panel.add(ball);

        for (int i = 1; i <= STEPS; i++) {
            ball.move(panel.getBounds());
            panel.paint(panel.getGraphics());  // (!!)
            Thread.sleep(DELAY);
        }
    }
    catch (InterruptedException e)
    { }



        try {
            Ball ball = new Ball();
            panel
    }
}