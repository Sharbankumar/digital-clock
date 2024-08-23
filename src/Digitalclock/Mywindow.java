package Digitalclock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mywindow extends JFrame {
private JLabel heading;
private JLabel clocklevel ;

private Font font =new Font("",Font.BOLD,36);
    Mywindow(){
        super.setTitle("my clock");
        super.setSize(400,400);
        super.setLocation(500,200);
        this.createGUI();
        this.startclock();
        super.setVisible(true);
    }
    public void createGUI(){
        heading =new JLabel("clock");
        clocklevel=new JLabel("my clock");
        heading.setFont(font);
        clocklevel.setFont(font);
this.setLayout(new GridLayout(2,2));
this .add(heading);
this.add(clocklevel);


    }
    public  void startclock(){
        Timer timer =new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           //     String datetime =new Date().toString();
               // String  datetime= new Date().toLocaleString();
                Date d=new Date();
                SimpleDateFormat dd=new SimpleDateFormat();
                String datetime=dd.format(d);
                clocklevel.setText(datetime);
            }
        });
        timer.start();

    }
}
