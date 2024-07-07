/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pendaftaranmahasiswabaru;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author acer
 */
public class PendaftaranMahasiswaBaru {

    /**
     * @param args the command line arguments
     */
    private JFrame frame;
    private JTextField textField1;
    private JTextField APP;
    public static void main(String[] args) {
        // TODO code application logic here
         EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PendaftaranMahasiswaBaru window = new PendaftaranMahasiswaBaru();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
         
        
        
    }
    public PendaftaranMahasiswaBaru() {
        initialize();
        }
        
     private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setTitle("PENDAFTARAN MAHASISWA");
        textField1 = new JTextField();
        textField1.setBounds(50, 30, 130, 26);
        frame.getContentPane().add(textField1);
        textField1.setColumns(10);
     }
}
