package dictionary.gui;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

public class KekASzeme extends javax.swing.JFrame {

    String[] kekASzemeLyrics = {"Álom", "tűnj", "el", "nem", "érdekelsz\n", "ma", "nem", "alszom", "el\n", "Három", "éjjel", "és", "újra", "látlak\n", "ha", "nem", "jön", "közbe", "semmi", "sem\n", "Egyedül", "nem", "pótol", "a", "remény\n", "valaki", "kell", "aki", "hazakísér", "s", "a", "szívemben", "él\n"};
    int task = 0;
    String[] amendedKek = new String[33];
    String[] checkKek = new String[33];
    int selected = 0;
    int corrAns = 0;

    public KekASzeme() {
        initComponents();
        setLocationRelativeTo(null);
        showLyrics();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ta_lyrics = new javax.swing.JTextArea();
        lb_lyrics = new javax.swing.JLabel();
        bt_start = new javax.swing.JButton();
        lb_corrans = new javax.swing.JLabel();
        lb_counter = new javax.swing.JLabel();
        bt_check = new javax.swing.JButton();
        lb_missing = new javax.swing.JLabel();
        tf_answer = new javax.swing.JTextField();
        lb_correct = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ta_lyrics.setColumns(20);
        ta_lyrics.setRows(5);
        jScrollPane1.setViewportView(ta_lyrics);

        bt_start.setText("START");
        bt_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_startActionPerformed(evt);
            }
        });

        lb_corrans.setText("Correct answers:");

        bt_check.setText("CHECK");
        bt_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_checkActionPerformed(evt);
            }
        });

        lb_missing.setText("Missing word:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_lyrics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_start)
                                .addGap(140, 140, 140))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lb_missing, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_corrans, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_counter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lb_correct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tf_answer, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(bt_check)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_lyrics, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_start))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_missing)
                    .addComponent(tf_answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_correct, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_check)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_corrans)
                    .addComponent(lb_counter, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_startActionPerformed
        lb_correct.setText("");
        tf_answer.setBackground(Color.WHITE);
        tf_answer.setText("");
        task++;
        editLyrics();

    }//GEN-LAST:event_bt_startActionPerformed

    private void bt_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_checkActionPerformed
        String lowCase = kekASzemeLyrics[selected].strip().toLowerCase();
        if (tf_answer.getText().equals(lowCase)) {
            tf_answer.setBackground(Color.GREEN);
            corrAns++;
        } else {
            tf_answer.setBackground(Color.RED);
            lb_correct.setText(kekASzemeLyrics[selected]);
        }
        lb_counter.setText(corrAns + "/" + task + ", " + corrAns * 100 / task + "%");

        if (task == 5) {
            JOptionPane.showInternalMessageDialog(null, "Your result is: " + corrAns + " correct answer out of " + (task) + ". Percentage:" + corrAns * 100 / (task) + "%!", "GAME OVER!", JOptionPane.INFORMATION_MESSAGE);
            dispose();          
            new Start().setVisible(true);
        }
    }//GEN-LAST:event_bt_checkActionPerformed

    private void showLyrics() {
        String text = "";

        for (String word : kekASzemeLyrics) {
            text += word + " ";
        }
        ta_lyrics.setText(text);
        ta_lyrics.setEditable(false);
    }

    private void editLyrics() {
        Random random = new Random();
        int maxRandom = kekASzemeLyrics.length;
        selected = random.nextInt(maxRandom - 1) + 1;

        StringBuilder empty = new StringBuilder();
        StringBuilder newText = new StringBuilder();
        String emptyString = "";

        for (int i = 0; i < kekASzemeLyrics.length; i++) {
            if (kekASzemeLyrics[i].equals(kekASzemeLyrics[selected])) {
                for (int j = 0; j < kekASzemeLyrics[i].length(); j++) {
                    empty.append("_");
                }
                emptyString = empty.toString();
                amendedKek[i] = emptyString;
            } else {
                amendedKek[i] = kekASzemeLyrics[i];
            }
        }
        for (String string : amendedKek) {
            newText.append(string + " ");
        }
        ta_lyrics.setText(newText.toString());
    }

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
            java.util.logging.Logger.getLogger(KekASzeme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KekASzeme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KekASzeme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KekASzeme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KekASzeme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_check;
    private javax.swing.JButton bt_start;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_corrans;
    private javax.swing.JLabel lb_correct;
    private javax.swing.JLabel lb_counter;
    private javax.swing.JLabel lb_lyrics;
    private javax.swing.JLabel lb_missing;
    private javax.swing.JTextArea ta_lyrics;
    private javax.swing.JTextField tf_answer;
    // End of variables declaration//GEN-END:variables
}
