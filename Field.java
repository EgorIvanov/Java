import java.util.LinkedList;

public class Field {

    Ball ball;
    int w;
    int h;
    int ball_radius;
    LinkedList<Listener> listener = new LinkedList<>();

    public Field(int w1, int h1, Ball ball1, int ball_radius1) {
        w= w1;
        h = h1;
        ball_radius = ball_radius1;
        ball = ball1;
    }

    public void ball_move() {
        ball.disloc.x += ball.direc.x + ball.velocity;
        ball.disloc.y += ball.direc.y + ball.velocity;
        for (Listener l : listener) {
            l.modelchanged();
        }
    }

    public void add(Listener l) {
        listener.add(l);
    }
}
