import javax.swing.*;

public class Display extends JFrame {

    private JPanel JPanel;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JCheckBox onCheckBox;
    private JCheckBox onCheckBox1;
    private JCheckBox onCheckBox2;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public Display()
    {
        setTitle("FM Synthesizer");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(1000, 700);
        setContentPane(JPanel);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
