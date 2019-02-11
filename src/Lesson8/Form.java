package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Form extends JFrame {
    public Form() throws HeadlessException {
//        setMaximumSize(new Dimension(300, 300));
//        setMinimumSize(new Dimension(300, 300));
        setTitle("Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 300, 300);
        setResizable(false);
        //кнопка
        //задали кнопку

//        BorderLayout

//        JButton[] jbs = new JButton[3];
//        for (int i = 0; i < 3; i++) {
//            jbs[i] = new JButton("#" + i);
//        }
//        setLayout(new BorderLayout());
//        add(jbs[0], BorderLayout.WEST);
//        jbs[0].setPreferredSize(new Dimension(200,10));
////        add(jbs[1], BorderLayout.SOUTH);
////        add(jbs[2], BorderLayout.NORTH);
//        add(jbs[1], BorderLayout.EAST);
//        add(jbs[2], BorderLayout.CENTER);
//        setVisible(true);


//        JButton[] jbs = new JButton[9];
//        setLayout(new GridLayout(3,3));
//        for (int i = 0; i < 9; i++) {
//            jbs[i] = new JButton("#" + i);
////            jbs[i].setAlignmentX(CENTER_ALIGNMENT);
//            add(jbs[i]);
//        }


        //Action for Button

//        JButton button = new JButton("Button");
//        setLayout(new BorderLayout());
//        button.setBounds(100, 100, 100, 100);
//        add(button, BorderLayout.CENTER);
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JFrame f = new JFrame();
//                f.setBounds(300,300,300,300);
//                f.setVisible(true);
//                System.out.println("Button press!");
//            }
//        });
//        setVisible(true);


        //Action for TextField

//        JTextField field = new JTextField();
//        add(field);
//        field.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Text " + field.getText());
//            }
//        });
//        setVisible(true);


//        Action for Panel

        JPanel p = new JPanel();
        add(p);
        p.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("mouse pozition " + e.getX() + " " + e.getY());
            }
        });
        setVisible(true);
    }
}

class Main {
    public static void main(String[] args) {
        Form form = new Form();
    }
}
