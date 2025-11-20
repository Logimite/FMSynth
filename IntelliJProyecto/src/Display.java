import javax.swing.*;

public class Display extends JFrame {

    private JPanel JPanel;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JCheckBox onCheckBox;
    private JCheckBox onCheckBox3;
    private JCheckBox onCheckBox2;
    private JTextField x000TextField;
    private JTextField x000TextField1;
    private JTextField x000TextField2;
    private JSlider slider1;
    private JSlider slider2;
    private JSlider slider3;

    public Display()
    {
        setTitle("FM Synthesizer");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(1300, 700);
        setContentPane(JPanel);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
