import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
public class ClockFrame extends JFrame implements ActionListener,MouseListener
{
    JButton reset;
    JButton start;
    JButton stop;
    ClockPanel panel;
    PlusSecs plusSecs;
    SubtractMinutes subtractMins;
    SubtractSeconds subtractSecs;
    PlusMinutes plusMins;
    ScopeClock sclock;
    ElectronicClock elecClock;
    ClockFrame()
    {;
        sclock = new ScopeClock();
        plusMins = new PlusMinutes();
        plusSecs = new PlusSecs();
        subtractMins = new SubtractMinutes();
        subtractSecs = new SubtractSeconds();
        elecClock = new ElectronicClock();
        start = new JButton("Start");
        reset = new JButton("Reset");
        stop = new JButton("Stop");
        panel = new ClockPanel();
        start.setBounds(100, 50, 100, 50);
        reset.setBounds(100, 150, 100, 50);
        stop.setBounds(100,250,100,50);
        this.add(start);
        this.add(reset);
        this.add(stop);
        this.add(plusMins);
        this.add(subtractMins);
        this.add(plusSecs);
        this.add(subtractSecs);
        this.add(sclock);
        this.add(elecClock);
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Alarm Clock");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        start.addActionListener(this);
        reset.addActionListener(this);
        stop.addActionListener(this);
        panel.addMouseListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == start)
        {
            sclock.startGame();
            elecClock.StartElec();
        }
        if(e.getSource() == reset)
        {
            sclock.Reset();
            elecClock.paintReset();
        }
        if(e.getSource() == stop)
        {
            sclock.Stop();
            elecClock.paintStop();
        }


    }
    public void mouseClicked(MouseEvent e) 
    {
        if(e.getX() >= 300 && e.getX() <= 400 && e.getY() >= 50 && e.getY() <= 100)
        {
            sclock.total_secs += 60;
            elecClock.total_seconds += 60;
            elecClock.paintValue();
        }
        if(e.getX() >= 450 && e.getX() <= 550 && e.getY() >= 50 && e.getY() <= 100)
        {
            sclock.total_secs += 1;
            elecClock.total_seconds += 1;
            elecClock.paintValue();
        }
        if(e.getX() >= 300 && e.getX() <= 400 && e.getY() >= 150 && e.getY() <= 200)
        {
            sclock.total_secs -= 60;
            elecClock.total_seconds -= 60;
            if(elecClock.total_seconds < 0)
            {
                elecClock.total_seconds = 0;
                sclock.total_secs = 0;
            }
            elecClock.paintValue();
        }
        if(e.getX() >= 450 && e.getX() <= 550 && e.getY() >= 150 && e.getY() <= 200)
        {
            sclock.total_secs -= 1;
            elecClock.total_seconds -= 1;
            if(elecClock.total_seconds < 0)
            {
                elecClock.total_seconds = 0;
                sclock.total_secs = 0;
            }
            elecClock.paintValue();
        }        
    }
    @Override
    public void mousePressed(MouseEvent e) 
    {

    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    
    


}
