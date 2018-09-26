import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame(Field f) {
        super("hui");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());

        Contain_Panel jp = new Contain_Panel(f);
        this.getContentPane().add(jp);
        this.setSize(f.w, f.h);

        this.setVisible(true);
    }
}
