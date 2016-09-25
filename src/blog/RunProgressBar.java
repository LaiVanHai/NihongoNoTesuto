/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author haiyka
 */
public class RunProgressBar {
     
     public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                MyProgressBar giaodien = new MyProgressBar();
                giaodien.setSize(300,300);
                giaodien.setVisible(true);
                giaodien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
            }
        });
    }
}
