
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import  java.util.*;
import  javax.mail.*;
import  javax.mail.internet.*;
import  javax.activation.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruvinya
 */
public class SendingEmails extends javax.swing.JFrame {

    /**
     * Creates new form SendingEmails
     */
    
    String  from,to,host,subject,message;
    
    public SendingEmails() {
        initComponents();
        setSize(1079,730);
        //setLocation(570,170);
        setResizable(false);
        showDate();
        showTime();
    }
    
        void showDate() {

        java.util.Date d = new java.util.Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        jLabelDate.setText(s.format(d));

    }

    void showTime() {

        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                java.util.Date d = new java.util.Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
                jLabelTime.setText(s.format(d));
            }

        }).start();

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelSendingEmails = new javax.swing.JLabel();
        jLabelTo = new javax.swing.JLabel();
        jLabelFrom = new javax.swing.JLabel();
        jLabelSubject = new javax.swing.JLabel();
        jLabelMessage = new javax.swing.JLabel();
        jTextFieldTo = new javax.swing.JTextField();
        jTextFieldFrom = new javax.swing.JTextField();
        jTextFieldSubject = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMessage = new javax.swing.JTextArea();
        jButtonSend = new javax.swing.JButton();
        jLabelDate = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/unnamed (1).jpg"))); // NOI18N

        jLabelSendingEmails.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabelSendingEmails.setForeground(new java.awt.Color(0, 204, 102));
        jLabelSendingEmails.setText("SENDING  EMAILS");

        jLabelTo.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabelTo.setForeground(new java.awt.Color(51, 102, 255));
        jLabelTo.setText("To");

        jLabelFrom.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabelFrom.setForeground(new java.awt.Color(51, 102, 255));
        jLabelFrom.setText("From");

        jLabelSubject.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabelSubject.setForeground(new java.awt.Color(51, 102, 255));
        jLabelSubject.setText("Subject");

        jLabelMessage.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabelMessage.setForeground(new java.awt.Color(51, 102, 255));
        jLabelMessage.setText("Message");

        jTextFieldTo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldTo.setForeground(new java.awt.Color(102, 102, 102));

        jTextFieldFrom.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldFrom.setForeground(new java.awt.Color(102, 102, 102));

        jTextFieldSubject.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldSubject.setForeground(new java.awt.Color(102, 102, 102));

        jTextAreaMessage.setColumns(20);
        jTextAreaMessage.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextAreaMessage.setForeground(new java.awt.Color(102, 102, 102));
        jTextAreaMessage.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMessage);

        jButtonSend.setBackground(new java.awt.Color(102, 153, 255));
        jButtonSend.setFont(new java.awt.Font("Dubai", 0, 22)); // NOI18N
        jButtonSend.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-send-email-40.png"))); // NOI18N
        jButtonSend.setText("Send");
        jButtonSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSendActionPerformed(evt);
            }
        });

        jLabelDate.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(0, 204, 102));
        jLabelDate.setText("Date");

        jLabelTime.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabelTime.setForeground(new java.awt.Color(0, 204, 102));
        jLabelTime.setText("Time");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/email-incoming.gif"))); // NOI18N

        jLabelClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-close-window-40.png"))); // NOI18N
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSendingEmails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                        .addComponent(jLabelClose)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFrom)
                            .addComponent(jLabelTo)
                            .addComponent(jLabelSubject)
                            .addComponent(jLabelMessage))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTo, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jButtonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabelDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTime)
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelClose))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabelSendingEmails)))
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTo)
                            .addComponent(jTextFieldTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFrom)
                            .addComponent(jTextFieldSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSubject)
                            .addComponent(jTextFieldFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMessage)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addComponent(jButtonSend)
                        .addGap(0, 84, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDate)
                    .addComponent(jLabelTime))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        setVisible(false);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jButtonSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSendActionPerformed
 
        from =  "ruvinyafernando@gmail.com";
        to = jTextFieldTo.getText();
        host = "localhost";
        subject =  jTextFieldSubject.getText();
        message = jTextAreaMessage.getText();
        
        Properties p =  new  Properties();
        p.put("mail.smtp.auth", "true");
        p.put("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.port", "587");
        
        Session s  = Session.getDefaultInstance(p, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication ()
            {
                return new PasswordAuthentication("nilmaliyanage99@gmail.com","123");
            }
    });
        try
        {
            MimeMessage  m  =  new  MimeMessage(s);
            m.setFrom(from);
            m.addRecipient(Message.RecipientType.TO, new  InternetAddress(to));
            m.setSubject(subject);
            m.setText(message);
            Transport.send(m);
            System.out.println("Success");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonSendActionPerformed

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
            java.util.logging.Logger.getLogger(SendingEmails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SendingEmails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SendingEmails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SendingEmails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SendingEmails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelFrom;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JLabel jLabelSendingEmails;
    private javax.swing.JLabel jLabelSubject;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JLabel jLabelTo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaMessage;
    private javax.swing.JTextField jTextFieldFrom;
    private javax.swing.JTextField jTextFieldSubject;
    private javax.swing.JTextField jTextFieldTo;
    // End of variables declaration//GEN-END:variables
}
