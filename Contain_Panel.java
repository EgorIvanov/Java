//painting

import javax.swing.*;
import java.awt.*;

public class Contain_Panel extends JPanel implements Listener{
    Ball ball;
    int w;
    int h;
    int ball_radius;

    public Contain_Panel(Field f) {
        ball = f.ball;
        w = f.w;
        h = f.h;
        ball_radius = f.ball_radius;
        f.add(this);
    }

    public void paint(Graphics g) {

        super.paintComponent(g);                   // What will be after removal super? why?
        g.setColor(Color.white);
        g.fillRect(0, 0, w, h);
        g.setColor(Color.black);
        g.drawRect(1, 1, w - 1, h - 1);
        g.setColor(Color.black);
        g.fillOval((int) ball.disloc.x, (int) ball.disloc.y, ball_radius, ball_radius);

    }

    @Override
    public void modelchanged() {
        this.repaint();
    }
}
