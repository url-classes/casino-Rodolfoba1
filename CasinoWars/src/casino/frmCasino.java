/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

import java.awt.Color;
import java.awt.Image;
import static java.awt.SystemColor.window;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

        

/**
 *
 * @author DELL
 */
public class frmCasino extends javax.swing.JFrame {

    Hilo miHilo1 = new Hilo();
    Hilo miHilo2 = new Hilo();
    Hilo miHilo3 = new Hilo();
    /**
     * Creates new form frmCasino
     */
    public frmCasino() {
        initComponents();
        Border border = BorderFactory.createLineBorder(Color.RED, 5);
        //ventana 1
        label1.setText("");
        label1.setBorder(border);
        Image img = new ImageIcon(this.getClass().getResource("/img/goku.jpg")).getImage();
        img = img.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH);
        label1.setIcon(new ImageIcon(img));
        //ventana 2
        label2.setText("");
        label2.setBorder(border);
        img = new ImageIcon(this.getClass().getResource("/img/krillin4.jpg")).getImage();
        img = img.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH);
        label2.setIcon(new ImageIcon(img));
        //ventana 3
        label3.setText("");
        label3.setBorder(border);
        img = new ImageIcon(this.getClass().getResource("/img/roshi.png")).getImage();
        img = img.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH);
        label3.setIcon(new ImageIcon(img));
        //hilos
        miHilo1.window = 1;
        miHilo1.start();
        miHilo2.window = 2;
        miHilo2.start();
        miHilo3.window = 3;
        miHilo3.start();
    }
    
    public class Hilo extends Thread {
        public int window = 0;
        public int c = 0;
        public int c2 = 0;
        public int c3 = 0;
        private boolean run = false;
        
        public void startRunning(){
            run  = true;
        }
        
        public void stopRunning(){
            run  = false;
        }
        
        public int getRandom(){
            int random = (int)(Math.random() * 3 + 1);
            return random;
        }
    
  
        @Override
    public void run(){
        Image img;
        while(window == 1){
            while(run){
                if(this.getRandom()==1){
                    c=1;
                    img = new ImageIcon(this.getClass().getResource("/img/goku.jpg")).getImage();
                }else if(this.getRandom()==2){
                    c=2;
                    img = new ImageIcon(this.getClass().getResource("/img/krillin4.jpg")).getImage();
                    
                }else{
                    c=3;
                    img = new ImageIcon(this.getClass().getResource("/img/roshi.png")).getImage();
                    img = img.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH);
                }
                    label1.setIcon(new ImageIcon(img));
                
                try{
                    Thread.sleep(100);
                } catch (InterruptedException ex){
                    Logger.getLogger(frmCasino.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                    Thread.sleep(100);                    
            } catch(InterruptedException ex){
                    Logger.getLogger(frmCasino.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
            
            
        while(window==2){
            while(run){
                if(this.getRandom()==1){
                    c2=1;
                    img = new ImageIcon(this.getClass().getResource("/img/goku.jpg")).getImage();
                }else if(this.getRandom()==2){
                    c2=2;
                    img = new ImageIcon(this.getClass().getResource("/img/krillin4.jpg")).getImage();
                }else{
                    c2=3;
                    img = new ImageIcon(this.getClass().getResource("/img/roshi.png")).getImage();
                    img = img.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH);
                }
                    label2.setIcon(new ImageIcon(img));
                
                try{
                    Thread.sleep(100);
                } catch (InterruptedException ex){
                    Logger.getLogger(frmCasino.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                    Thread.sleep(100);                    
            } catch(InterruptedException ex){
                    Logger.getLogger(frmCasino.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
            
        while(window==3){
            while(run){
                if(this.getRandom()==1){
                    c3=1;
                    img = new ImageIcon(this.getClass().getResource("/img/goku.jpg")).getImage();
                }else if(this.getRandom()==2){
                    c3=2;
                    img = new ImageIcon(this.getClass().getResource("/img/krillin4.jpg")).getImage();
                }else{
                    c3=3;
                    img = new ImageIcon(this.getClass().getResource("/img/roshi.png")).getImage();
                    img = img.getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH);
                    }
                    label3.setIcon(new ImageIcon(img));
                try{
                    Thread.sleep(100);
                } catch (InterruptedException ex){
                    Logger.getLogger(frmCasino.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                    Thread.sleep(100);                    
            } catch(InterruptedException ex){
                    Logger.getLogger(frmCasino.class.getName()).log(Level.SEVERE, null, ex);
        
            }
        }
    }
 }
        
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStop2 = new javax.swing.JButton();
        btnStop1 = new javax.swing.JButton();
        btnStar = new javax.swing.JButton();
        btnStopAll = new javax.swing.JButton();
        btnStop3 = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStop2.setBackground(new java.awt.Color(255, 102, 0));
        btnStop2.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        btnStop2.setForeground(new java.awt.Color(255, 255, 255));
        btnStop2.setText("Stop");
        btnStop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnStop2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 117, 60));

        btnStop1.setBackground(new java.awt.Color(255, 102, 0));
        btnStop1.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        btnStop1.setForeground(new java.awt.Color(255, 255, 255));
        btnStop1.setText("Stop");
        btnStop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnStop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 125, 60));

        btnStar.setBackground(new java.awt.Color(255, 102, 0));
        btnStar.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        btnStar.setForeground(new java.awt.Color(255, 255, 255));
        btnStar.setText("Start");
        btnStar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStarActionPerformed(evt);
            }
        });
        getContentPane().add(btnStar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 230, 49));

        btnStopAll.setBackground(new java.awt.Color(255, 102, 0));
        btnStopAll.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        btnStopAll.setForeground(new java.awt.Color(255, 255, 255));
        btnStopAll.setText("Stop all");
        btnStopAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopAllActionPerformed(evt);
            }
        });
        getContentPane().add(btnStopAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 220, 51));

        btnStop3.setBackground(new java.awt.Color(255, 102, 0));
        btnStop3.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        btnStop3.setForeground(new java.awt.Color(255, 255, 255));
        btnStop3.setText("Stop");
        btnStop3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStop3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnStop3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 118, 60));

        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 160, 220));

        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 160, 220));

        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 160, 220));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ball.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 210, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dragon.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 330, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casino/casinoooo.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -20, 800, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void btnStop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop1ActionPerformed
        // TODO add your handling code here:
        miHilo1.stopRunning();
        if(miHilo2.run == false && miHilo3.run == false){
            if(miHilo1.c == miHilo2.c2) {
              if(miHilo2.c2 == miHilo3.c3){
                  JOptionPane.showMessageDialog(frmCasino.this, "WINNER");
                }
           }
        }
        
    }//GEN-LAST:event_btnStop1ActionPerformed
    
    private void btnStopAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopAllActionPerformed
        // TODO add your handling code here:
        miHilo1.stopRunning();
        miHilo2.stopRunning();
        miHilo3.stopRunning();
         if(miHilo1.c == miHilo2.c2) {
            if(miHilo2.c2 == miHilo3.c3){
                JOptionPane.showMessageDialog(frmCasino.this, "WINNER");
            }
        }
    }//GEN-LAST:event_btnStopAllActionPerformed

    private void btnStarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStarActionPerformed
        // TODO add your handling code here:
        miHilo1.startRunning();
        miHilo2.startRunning();
        miHilo3.startRunning();
    }//GEN-LAST:event_btnStarActionPerformed

    private void btnStop2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop2ActionPerformed
        // TODO add your handling code here:
        miHilo2.stopRunning();
        if(miHilo1.run == false && miHilo3.run == false){
           if(miHilo1.c == miHilo2.c2) {
              if(miHilo2.c2 == miHilo3.c3){
                  JOptionPane.showMessageDialog(frmCasino.this, "WINNER");
                }
           }
        }
        
    }//GEN-LAST:event_btnStop2ActionPerformed

    private void btnStop3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStop3ActionPerformed
        // TODO add your handling code here:
        miHilo3.stopRunning();
        if(miHilo1.run == false && miHilo2.run == false){
           if(miHilo1.c == miHilo2.c2) {
              if(miHilo2.c2 == miHilo3.c3){
                  JOptionPane.showMessageDialog(frmCasino.this, "WINNER");
                }
           }
        }
    }//GEN-LAST:event_btnStop3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCasino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCasino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCasino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCasino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmCasino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStar;
    private javax.swing.JButton btnStop1;
    private javax.swing.JButton btnStop2;
    private javax.swing.JButton btnStop3;
    private javax.swing.JButton btnStopAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    // End of variables declaration//GEN-END:variables
}
