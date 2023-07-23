package chocoUi;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class mainGui {
    private JPanel mainPanel;
    private JButton okButton;
    private JButton installedButton;
    private JButton updateButton;
    private JTextField searchBar;
    private JButton searchButton;
    private JScrollPane packageFrame;

    public void createAndShowGui() {
        JFrame frame = new JFrame("Choco UI");
        frame.setSize(1500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }

    public void add_packages(){
        List<String> packages = new ArrayList<String>();
        packages.add("Obama");
        for(String packag:packages){
            System.out.println(packag);
            packageGui temp_gui = new packageGui(packag);
            temp_gui.createAndShowGui();
            packageFrame.add(temp_gui);
        }
    }
}