/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.simon;

import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author johnwaldo
 */
public class Leaderboard extends javax.swing.JFrame {

    /**
     * Creates new form Leaderboard
     */
    public Leaderboard(int score,String user) {
        initComponents();
        PlayAgain.setOpaque(true);
        PlayAgain.setContentAreaFilled(true);
        PlayAgain.setBorderPainted(false);
        count=score;
        name=user;
        if (leaderboard.size()==0)
        {
            FirstText.setText(name+" got "+count);
            leaderboardText.add(name+" got "+count);
            leaderboard.add(count);
        }    
        else // Now I need to sort 
        {
           leaderboard.add(count);
           leaderboardText.add(name+" got "+count);
           for (int x = 0; x < leaderboard.size(); x++) 
           {
            for (int y = leaderboard.size() - 1; y > x; y--) 
            {
                if (leaderboard.get(x) < leaderboard.get(y)) 
                { 
                    int tempx = leaderboard.get(x);
                    leaderboard.set(x, leaderboard.get(y));
                    leaderboard.set(y, tempx);
                    String tempText = leaderboardText.get(x);
                    leaderboardText.set(x, leaderboardText.get(y));
                    leaderboardText.set(y, tempText);
                }
            }
           } 
           if(leaderboardText.size()==2)
           {    
            FirstText.setText(leaderboardText.get(0));
            SecondText.setText(leaderboardText.get(1));
           }
           if(leaderboardText.size()==3)
           {  
                FirstText.setText(leaderboardText.get(0));
                SecondText.setText(leaderboardText.get(1));   
                ThirdText.setText(leaderboardText.get(2));
           }
           if(leaderboardText.size()==4)
           {  
                FirstText.setText(leaderboardText.get(0));
                SecondText.setText(leaderboardText.get(1));   
                ThirdText.setText(leaderboardText.get(2));
                FourthText.setText(leaderboardText.get(3));
           }
           if(leaderboardText.size()==5)
           {  
                FirstText.setText(leaderboardText.get(0));
                SecondText.setText(leaderboardText.get(1));   
                ThirdText.setText(leaderboardText.get(2));
                FourthText.setText(leaderboardText.get(3));
                FifthText.setText(leaderboardText.get(4));
           }
           if(leaderboardText.size()==6)
           {  
                FirstText.setText(leaderboardText.get(0));
                SecondText.setText(leaderboardText.get(1));   
                ThirdText.setText(leaderboardText.get(2));
                FourthText.setText(leaderboardText.get(3));
                FifthText.setText(leaderboardText.get(4));
                SixthText.setText(leaderboardText.get(5));
           }
           if(leaderboardText.size()==7)
           {  
                FirstText.setText(leaderboardText.get(0));
                SecondText.setText(leaderboardText.get(1));   
                ThirdText.setText(leaderboardText.get(2));
                FourthText.setText(leaderboardText.get(3));
                FifthText.setText(leaderboardText.get(4));
                SixthText.setText(leaderboardText.get(5));
                SeventhText.setText(leaderboardText.get(6));
           }
           if(leaderboardText.size()==8)
           {  
                FirstText.setText(leaderboardText.get(0));
                SecondText.setText(leaderboardText.get(1));   
                ThirdText.setText(leaderboardText.get(2));
                FourthText.setText(leaderboardText.get(3));
                FifthText.setText(leaderboardText.get(4));
                SixthText.setText(leaderboardText.get(5));
                SeventhText.setText(leaderboardText.get(6));
                EighthText.setText(leaderboardText.get(7));
           }
           if(leaderboardText.size()==9)
           {  
                FirstText.setText(leaderboardText.get(0));
                SecondText.setText(leaderboardText.get(1));   
                ThirdText.setText(leaderboardText.get(2));
                FourthText.setText(leaderboardText.get(3));
                FifthText.setText(leaderboardText.get(4));
                SixthText.setText(leaderboardText.get(5));
                SeventhText.setText(leaderboardText.get(6));
                EighthText.setText(leaderboardText.get(7));
                NinthText.setText(leaderboardText.get(8));
           }
           if(leaderboardText.size()==10)
           {  
                FirstText.setText(leaderboardText.get(0));
                SecondText.setText(leaderboardText.get(1));   
                ThirdText.setText(leaderboardText.get(2));
                FourthText.setText(leaderboardText.get(3));
                FifthText.setText(leaderboardText.get(4));
                SixthText.setText(leaderboardText.get(5));
                SeventhText.setText(leaderboardText.get(6));
                EighthText.setText(leaderboardText.get(7));
                NinthText.setText(leaderboardText.get(8));
                TenthText.setText(leaderboardText.get(9));
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        Panel = new javax.swing.JPanel();
        Leaderboard = new javax.swing.JLabel();
        First = new javax.swing.JLabel();
        Second = new javax.swing.JLabel();
        Third = new javax.swing.JLabel();
        Fourth = new javax.swing.JLabel();
        Fifth = new javax.swing.JLabel();
        Sixth = new javax.swing.JLabel();
        Seventh = new javax.swing.JLabel();
        Eighth = new javax.swing.JLabel();
        Ninth = new javax.swing.JLabel();
        Tenth = new javax.swing.JLabel();
        PlayAgain = new javax.swing.JButton();
        FirstText = new javax.swing.JLabel();
        SecondText = new javax.swing.JLabel();
        ThirdText = new javax.swing.JLabel();
        FourthText = new javax.swing.JLabel();
        FifthText = new javax.swing.JLabel();
        SixthText = new javax.swing.JLabel();
        SeventhText = new javax.swing.JLabel();
        EighthText = new javax.swing.JLabel();
        NinthText = new javax.swing.JLabel();
        TenthText = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(0, 0, 0));

        Leaderboard.setBackground(new java.awt.Color(0, 0, 0));
        Leaderboard.setFont(new java.awt.Font("Phosphate", 1, 48)); // NOI18N
        Leaderboard.setForeground(new java.awt.Color(0, 153, 0));
        Leaderboard.setText("LEADERBOARD");

        First.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        First.setForeground(new java.awt.Color(0, 153, 0));
        First.setText("1.");

        Second.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        Second.setForeground(new java.awt.Color(0, 153, 0));
        Second.setText("2.");

        Third.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        Third.setForeground(new java.awt.Color(0, 153, 0));
        Third.setText("3.");

        Fourth.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        Fourth.setForeground(new java.awt.Color(0, 153, 0));
        Fourth.setText("4.");

        Fifth.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        Fifth.setForeground(new java.awt.Color(0, 153, 0));
        Fifth.setText("5.");

        Sixth.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        Sixth.setForeground(new java.awt.Color(0, 153, 0));
        Sixth.setText("6.");

        Seventh.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        Seventh.setForeground(new java.awt.Color(0, 153, 0));
        Seventh.setText("7.");

        Eighth.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        Eighth.setForeground(new java.awt.Color(0, 153, 0));
        Eighth.setText("8.");

        Ninth.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        Ninth.setForeground(new java.awt.Color(0, 153, 0));
        Ninth.setText("9.");

        Tenth.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        Tenth.setForeground(new java.awt.Color(0, 153, 0));
        Tenth.setText("10.");

        PlayAgain.setBackground(new java.awt.Color(0, 0, 0));
        PlayAgain.setFont(new java.awt.Font("Phosphate", 1, 36)); // NOI18N
        PlayAgain.setForeground(new java.awt.Color(0, 153, 0));
        PlayAgain.setText("PLAY AGAIN");
        PlayAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayAgainActionPerformed(evt);
            }
        });

        FirstText.setBackground(new java.awt.Color(0, 0, 0));
        FirstText.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        FirstText.setForeground(new java.awt.Color(0, 153, 0));

        SecondText.setBackground(new java.awt.Color(0, 0, 0));
        SecondText.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        SecondText.setForeground(new java.awt.Color(0, 153, 0));

        ThirdText.setBackground(new java.awt.Color(0, 0, 0));
        ThirdText.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        ThirdText.setForeground(new java.awt.Color(0, 153, 0));

        FourthText.setBackground(new java.awt.Color(0, 0, 0));
        FourthText.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        FourthText.setForeground(new java.awt.Color(0, 153, 0));

        FifthText.setBackground(new java.awt.Color(0, 0, 0));
        FifthText.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        FifthText.setForeground(new java.awt.Color(0, 153, 0));

        SixthText.setBackground(new java.awt.Color(0, 0, 0));
        SixthText.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        SixthText.setForeground(new java.awt.Color(0, 153, 0));

        SeventhText.setBackground(new java.awt.Color(0, 0, 0));
        SeventhText.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        SeventhText.setForeground(new java.awt.Color(0, 153, 0));

        EighthText.setBackground(new java.awt.Color(0, 0, 0));
        EighthText.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        EighthText.setForeground(new java.awt.Color(0, 153, 0));

        NinthText.setBackground(new java.awt.Color(0, 0, 0));
        NinthText.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        NinthText.setForeground(new java.awt.Color(0, 153, 0));

        TenthText.setBackground(new java.awt.Color(0, 0, 0));
        TenthText.setFont(new java.awt.Font("Phosphate", 1, 18)); // NOI18N
        TenthText.setForeground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Tenth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ninth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Sixth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(First, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Second)
                            .addComponent(Third, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fourth, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fifth, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Seventh, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Eighth, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(PlayAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(FirstText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SecondText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ThirdText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FourthText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FifthText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SixthText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SeventhText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EighthText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NinthText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TenthText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(Leaderboard, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Leaderboard, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(FirstText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SecondText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Second))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ThirdText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Third))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FourthText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fourth))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FifthText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fifth))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SixthText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sixth)))
                    .addComponent(First, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeventhText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Seventh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EighthText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eighth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NinthText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ninth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TenthText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tenth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PlayAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayAgainActionPerformed
        // TODO add your handling code here:
        Name newPlayer=new Name();
        newPlayer.setVisible(true);
    }//GEN-LAST:event_PlayAgainActionPerformed

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
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Leaderboard(count,name).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Eighth;
    private javax.swing.JLabel EighthText;
    private javax.swing.JLabel Fifth;
    private javax.swing.JLabel FifthText;
    private javax.swing.JLabel First;
    private javax.swing.JLabel FirstText;
    private javax.swing.JLabel Fourth;
    private javax.swing.JLabel FourthText;
    private javax.swing.JLabel Leaderboard;
    private javax.swing.JLabel Ninth;
    private javax.swing.JLabel NinthText;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton PlayAgain;
    private javax.swing.JLabel Second;
    private javax.swing.JLabel SecondText;
    private javax.swing.JLabel Seventh;
    private javax.swing.JLabel SeventhText;
    private javax.swing.JLabel Sixth;
    private javax.swing.JLabel SixthText;
    private javax.swing.JLabel Tenth;
    private javax.swing.JLabel TenthText;
    private javax.swing.JLabel Third;
    private javax.swing.JLabel ThirdText;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private static ArrayList<Integer> leaderboard=new ArrayList<Integer>();
    private static ArrayList<String> leaderboardText=new ArrayList<String>();
    private static int count;
    private static String name;
}
