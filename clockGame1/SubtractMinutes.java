import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
public class SubtractMinutes extends JPanel
{
    JLabel label;
    SubtractMinutes()
    {
        label = new JLabel();
        label.setText("-Mins");
        label.setFont(new Font("Fira Code",Font.BOLD,22));
        this.add(label);
        this.setBackground(Color.gray);
        this.setBounds(300,150,100,50);
    }
}
