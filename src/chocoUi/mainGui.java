package chocoUi;

import javax.swing.*;

public class mainGui {
    private JPanel mainPanel;
    private JLabel testLabel;

    public void createAndShowGui() {
        JFrame frame = new JFrame("Choco UI");
        frame.setSize(1500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }
}