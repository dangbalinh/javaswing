import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
public class SubtractSeconds extends JPanel
{
    JLabel label;
    SubtractSeconds()
    {
        label = new JLabel();
        label.setText("-Secs");
        label.setFont(new Font("Fira Code",Font.BOLD,22));
        this.add(label);
        this.setBounds(450, 150, 100, 50);
        this.setBackground(Color.green);

    }
}
