package mainPackage;

import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame{

    public MyFrame() {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(1280, 720));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.add(panel, BorderLayout.CENTER);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);

        }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;


    }
}
