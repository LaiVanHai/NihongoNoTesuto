/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextField;


/**
 *
 * @author haiyka
 */
public class MyProgressBar extends JFrame implements ActionListener {

    JProgressBar progressBar;
    JButton bt1;
    JTextField txt_cau_hoi;
    int i=0;

    public MyProgressBar() {
        super("Vi du ProgressBar");

        progressBar = new JProgressBar(0, 100);
        bt1 = new JButton("run ProgressBar");
        txt_cau_hoi = new JTextField("fgfgfg");
        bt1.addActionListener(this);

        this.setLayout(new FlowLayout());

        this.add(progressBar);
        this.add(bt1);
        this.add(txt_cau_hoi);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //while(i==0){
        Thread t1 = new Thread(new Runnable() {
            int i=0;
            @Override
            public void run() {
                while(i<100) {
                    i = i+1;
                    progressBar.setValue(i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MyProgressBar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (progressBar.getValue() == 100) {
                        i=0;
                        //JOptionPane.showConfirmDialog(null, "Chương trình đã xử lý xong");
                        progressBar.setValue(0);
                    }
                }
            }
        });
        t1.start();
      //progressBar.setValue(0)
        //}
        // progressBar.setValue(10);//tăng giá trị của thanh progress
    }

}
