package chocoUi;


import javax.swing.*;
import java.awt.*;

public class packageGui extends Component {

    private JLabel packageName;
    private JPanel mainPanel;
    private JLabel packageDesc;

    private final String name;

    public packageGui(String name){
        this.name = name;
        this.packageName.setText(name);
    }

    public void createAndShowGui() {
        JFrame frame = new JFrame(this.name);
        frame.setSize(1500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
