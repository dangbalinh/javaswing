import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ElectronicClock extends JPanel implements ActionListener
{
    int minutes;
    int seconds;
    int total_seconds = 0;
    Timer timer = new Timer(1000, this);
    ElectronicClock()
    {
        this.setBounds(550, 200, 200, 100);
        this.setBackground(Color.white);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setFont(new Font("Fira Code",Font.BOLD,50));
        g2D.drawString(String.valueOf(minutes), 35, 65);
        g2D.drawString(":",65,65);
        g2D.drawString(String.valueOf(seconds), 85, 65);
    }
    public void actionPerformed(ActionEvent e) 
    {
        if(total_seconds > 0)
        {
            total_seconds--;
            minutes = total_seconds / 60;
            seconds = total_seconds - minutes * 60;
            repaint();
        }
    }
    public void paintValue()
    {
        minutes = total_seconds / 60;
        seconds = total_seconds - minutes * 60;
        repaint();
    }
    public void paintReset()
    {
        total_seconds = 0;
        minutes = 0;
        seconds = 0;
        repaint();
        timer.stop();
    }
    public void paintStop()
    {
        timer.stop();
    }
    public void StartElec()
    {
        timer.start();
    }
}
