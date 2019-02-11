package Lesson8;

import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.ORANGE);
        g.drawLine(20, 20, 20, 120);

        g.setColor(Color.BLACK);
        g.drawRect(30, 30, 50, 50);

        g.setColor(Color.RED);
        g.drawLine(20, 20, 120, 120);
    }

    public static void main(String[] args) {

        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("Draw objects");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.CYAN);
        frame.setBounds(500, 300, 400, 400);

        Draw panel = new Draw();
        frame.add(panel);
        frame.setVisible(true);

    }
}
