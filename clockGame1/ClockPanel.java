import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
public class ClockPanel extends JPanel
{
    ClockPanel()
    {
        this.setPreferredSize(new Dimension(800,800));
        this.setBackground(Color.yellow);
        this.setFocusable(true);
    }
}
