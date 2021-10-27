package dictionary.gui;

import dictionary.dao.impl.DictionaryRepositoryImpl;
import dictionary.model.Word;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.OptionPaneUI;

public class Review_HUPL extends javax.swing.JFrame {

    private static String category;
    Word wordForTest;
    private int maxRandom;
    private int qNum = 0;
    private int aCorr = 0;
    DictionaryRepositoryImpl dictDAO = new DictionaryRepositoryImpl();
    ArrayList<Integer> wordIdList = new ArrayList<>();
    ArrayList<Word> wordList = new ArrayList<>();
    private int num_quest = 10;

    public Review_HUPL(String category) {
        initComponents();
        setLocationRelativeTo(null);
        this.category = category;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_header = new javax.swing.JLabel();
        lb_headernrofq = new javax.swing.JLabel();
        tf_totalnrque = new javax.swing.JTextField();
        lb_totranslate = new javax.swing.JLabel();
        lb_translation = new javax.swing.JLabel();
        tf_reply = new javax.swing.JTextField();
        lb_magyar = new javax.swing.JLabel();
        bt_check = new javax.swing.JButton();
        lb_correct = new javax.swing.JLabel();
        lb_corrans = new javax.swing.JLabel();
        bt_start = new javax.swing.JButton();
        lb_counter = new javax.swing.JLabel();
        pb_progress = new javax.swing.JProgressBar();
        bt_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Review words HU-PL");

        lb_header.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        lb_header.setText("Click \"Next word\" to get a new word to translate. Once ready, click \"Check\".");

        lb_headernrofq.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N
        lb_headernrofq.setText("Default number of words to be tested is 10 - to change this, enter it here:");

        tf_totalnrque.setBackground(new java.awt.Color(204, 204, 204));

        lb_totranslate.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N
        lb_totranslate.setText("Translate this word:");

        lb_translation.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N
        lb_translation.setText("Translation:");

        tf_reply.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N

        lb_magyar.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N

        bt_check.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        bt_check.setText("CHECK");
        bt_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_checkActionPerformed(evt);
            }
        });

        lb_correct.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N

        lb_corrans.setFont(new java.awt.Font("Microsoft PhagsPa", 2, 14)); // NOI18N
        lb_corrans.setText("Correct answers:");

        bt_start.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        bt_start.setText("NEXT WORD");
        bt_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_startActionPerformed(evt);
            }
        });

        lb_counter.setFont(new java.awt.Font("Microsoft PhagsPa", 2, 14)); // NOI18N

        pb_progress.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N

        bt_back.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        bt_back.setText("BACK");
        bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_headernrofq, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_totalnrque, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lb_header)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_totranslate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(lb_magyar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_translation, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_reply, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(bt_check))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_counter, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(bt_start, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(pb_progress, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(lb_correct, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lb_corrans, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(bt_back)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_header, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_headernrofq)
                    .addComponent(tf_totalnrque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_start)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_totranslate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_magyar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_reply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_translation)
                    .addComponent(bt_check))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_correct, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pb_progress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_corrans, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_counter, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(bt_back)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_checkActionPerformed

        UIManager.put("OptionPane.buttonFont", new Font("Microsoft PhagsPa", Font.PLAIN, 12));
        UIManager.put("OptionPane.messageFont", new Font("Microsoft PhagsPa", Font.BOLD, 12));

        if (tf_reply.getText().equals(wordForTest.getPolski())) {
            tf_reply.setBackground(Color.green);
            aCorr++;
        } else {
            tf_reply.setBackground(Color.red);
            lb_correct.setText(wordForTest.getPolski());
        }

        pb_progress.setValue(qNum * 100 / num_quest);
        pb_progress.setStringPainted(true);
        pb_progress.setString("Progress: " + qNum * 100 / num_quest + "%");

        lb_counter.setText(aCorr + "/" + qNum + ", " + aCorr * 100 / qNum + "%");

        if (qNum == num_quest) {

            JOptionPane.showInternalMessageDialog(null, "Your result is: " + aCorr + " correct answer out of " + (qNum) + ".\nPercentage: " + aCorr * 100 / (qNum) + "%!", "GAME OVER!", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            new Start().setVisible(true);
        }
    }//GEN-LAST:event_bt_checkActionPerformed

    private void bt_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_startActionPerformed
        if (qNum == 0) {
            if (!tf_totalnrque.getText().isEmpty()) {
                num_quest = Integer.parseInt(tf_totalnrque.getText());
                tf_totalnrque.setEditable(false);
            }
        }

        lb_correct.setText("");
        tf_reply.setBackground(Color.WHITE);
        tf_reply.setText("");
        qNum++;

        showQuestion();
    }//GEN-LAST:event_bt_startActionPerformed

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
       dispose();
       new Start().setVisible(true);            
    }//GEN-LAST:event_bt_backActionPerformed

    private void showQuestion() {

        if (category == "All") {
        wordList = dictDAO.listAll();           
        } else {
            wordList = dictDAO.listByCat(category);
        }
        
         Random random = new Random();
        maxRandom = wordList.size();
        int randomId = random.nextInt(maxRandom);
        while (!wordIdIsValid(randomId)) {
            randomId = random.nextInt(maxRandom);
        }
         wordIdList.add(randomId);
        
        wordForTest = wordList.get(randomId);
        
        lb_magyar.setText(wordForTest.getMagyar());
    }

    private boolean wordIdIsValid(int wordId) {
        if (!wordIdList.contains(wordId)) {
            return true;
        } else {
            return false;
        }
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
            java.util.logging.Logger.getLogger(Review_HUPL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Review_HUPL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Review_HUPL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Review_HUPL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Review_HUPL(category).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_check;
    private javax.swing.JButton bt_start;
    private javax.swing.JLabel lb_corrans;
    private javax.swing.JLabel lb_correct;
    private javax.swing.JLabel lb_counter;
    private javax.swing.JLabel lb_header;
    private javax.swing.JLabel lb_headernrofq;
    private javax.swing.JLabel lb_magyar;
    private javax.swing.JLabel lb_totranslate;
    private javax.swing.JLabel lb_translation;
    private javax.swing.JProgressBar pb_progress;
    private javax.swing.JTextField tf_reply;
    private javax.swing.JTextField tf_totalnrque;
    // End of variables declaration//GEN-END:variables
}
