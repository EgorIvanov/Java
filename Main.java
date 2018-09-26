import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        Vector direc = new Vector (0, 2);
        Vector disloc = new Vector(300, 300);
        double velocity = 1;
        Ball ball = new Ball(disloc, direc, velocity);
        int ball_radius = 10;
        Field model = new Field(600, 500, ball, ball_radius);
        new Frame(model);

        Timer timer = new Timer(15, new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                System.out.println("Tinemer");
                model.ball_move();
            }
        });
        timer.start();

    }
}
