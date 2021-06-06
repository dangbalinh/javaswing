import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ScopeClock extends JPanel implements ActionListener
{
    Timer timer = new Timer(1000,this);
    int secs = 0,mins = 0,total_secs = 0;
    double x_secs,y_secs;
    double x_mins,y_mins;
    ScopeClock()
    {
        this.setBounds(200, 350, 400, 400);
        this.setBackground(Color.red);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2D = (Graphics2D)g;
        g2D.setStroke(new BasicStroke(5));
        g2D.setPaint(Color.pink);
        g2D.fillOval(10, 10, 380, 380);
        x_secs = 200 + 180*Math.sin(6*secs * Math.PI/180);
        y_secs = 200 - 180*Math.cos(6*secs * Math.PI/180);
        x_mins = 200 + 140*Math.sin(6*mins * Math.PI/180);
        y_mins = 200 - 140*Math.cos(6*mins * Math.PI/180);
        g2D.setPaint(Color.black);
        g2D.drawLine(200,200,(int)x_mins,(int)y_mins);
        g2D.setStroke(new BasicStroke(2));
        g2D.drawLine(200,200,(int)x_secs,(int)y_secs);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(secs < total_secs)
        {
            repaint();
            secs++;
            if(secs % 60 == 0)
                mins++;
        }
    }
    public void startGame()
    {
        timer.start();
    }
    public void Reset()
    {
        secs = 0;
        mins = 0;
        total_secs = 0;
        repaint();
        timer.stop();
    }
    public void Stop()
    {
        timer.stop();
    }
}