import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class GUI extends JFrame{

    JPanel p=new JPanel();
    JLabel b=new JLabel("Please Paste a Reddit URL Below");
    JTextField t=new JTextField("",45);

    JLabel l=new JLabel("Choose a save location");
    String choices[] = {
            "Downloads",
            "Desktop",
            "Documents",
            "Pictures",
            "Root"
    };
    JComboBox cb = new JComboBox(choices);

    JButton r=new JButton("Begin Image Scrape");
    JButton exitButton = new JButton("Exit");
    JButton restartButton = new JButton("Clear");
    
    public static void main(String[] args){
        new GUI();
    }

    public GUI(){
        super("Reddit Image Scraper");
        setSize(625,600);
        setResizable(true);
        p.add(b);
        p.add(t);
        p.add(l);
        p.add(cb);
        p.add(r);
        p.add(restartButton);
        p.add(exitButton);
        add(p);
        setVisible(true);
    }
}
