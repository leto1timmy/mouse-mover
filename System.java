import java.util.Random;
import java.awt.Robot;

import javax.swing.JFrame;
import javax.swing.JLabel;

class System {
    public static final int FIVE_SECONDS = 5000;
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400;

    public static void main(String... args) throws Exception {
        // Create and set up the window.
        JFrame frame = new JFrame("Smart Move :)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Have a perfect working day :D");
        frame.add(label);

        // Display the window.
        frame.pack();
        frame.setVisible(true);

        Robot robot = new Robot();
        Random random = new Random();
        while (true) {
            robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
            Thread.sleep(FIVE_SECONDS);
        }
    }
}