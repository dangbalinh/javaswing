import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
public class PlusMinutes extends JPanel
{
    JLabel label;
    PlusMinutes()
    {
        label = new JLabel();
        label.setText("+Mins");
        label.setFont(new Font("Fira Code",Font.BOLD,22));
        this.add(label);
        this.setBounds(300,50,100,50);
        this.setBackground(Color.gray);

    }
}
