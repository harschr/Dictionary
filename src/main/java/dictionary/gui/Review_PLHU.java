package dictionary.gui;

import dictionary.dao.impl.DictionaryRepositoryImpl;
import dictionary.model.Word;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.OptionPaneUI;

public class Review_PLHU extends javax.swing.JFrame {

   private static String category;
    Word wordForTest;
    private int maxRandom;
    private int qNum = 0;
    private int aCorr = 0;
    DictionaryRepositoryImpl dictDAO = new DictionaryRepositoryImpl();
    ArrayList<Integer> wordIdList = new ArrayList<>();
    ArrayList<Word> wordList = new ArrayList<>();
    private int num_quest = 10;

    public Review_PLHU(String category) {
        initComponents();
        setLocationRelativeTo(null);
        this.category = category;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        lb_totranslate = new javax.swing.JLabel();
        bt_start = new javax.swing.JButton();
        lb_polski = new javax.swing.JLabel();
        tf_reply = new javax.swing.JTextField();
        bt_check = new javax.swing.JButton();
        lb_translation = new javax.swing.JLabel();
        pb_progress = new javax.swing.JProgressBar();
        lb_corrans = new javax.swing.JLabel();
        lb_counter = new javax.swing.JLabel();
        lb_correct = new javax.swing.JLabel();
        lb_header = new javax.swing.JLabel();
        lb_headernrofq = new javax.swing.JLabel();
        tf_totalnrque = new javax.swing.JTextField();
        bt_back = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Review words PL-HU");

        lb_totranslate.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N
        lb_totranslate.setText("Translate this word:");

        bt_start.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        bt_start.setText("NEXT WORD");
        bt_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_startActionPerformed(evt);
            }
        });

        lb_polski.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N

        tf_reply.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N

        bt_check.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        bt_check.setText("CHECK");
        bt_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_checkActionPerformed(evt);
            }
        });

        lb_translation.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N
        lb_translation.setText("Translation:");

        pb_progress.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N

        lb_corrans.setFont(new java.awt.Font("Microsoft PhagsPa", 2, 14)); // NOI18N
        lb_corrans.setText("Correct answers:");

        lb_counter.setFont(new java.awt.Font("Microsoft PhagsPa", 2, 14)); // NOI18N

        lb_correct.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N

        lb_header.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        lb_header.setText("Click \"Next word\" to get a new word to translate. Once ready, click \"Check\".");

        lb_headernrofq.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 12)); // NOI18N
        lb_headernrofq.setText("Default number of words to be tested is 10 - to change this, enter it here:");

        tf_totalnrque.setBackground(new java.awt.Color(204, 204, 204));

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_totranslate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(lb_polski, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lb_header)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(lb_counter, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(88, 88, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb_headernrofq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(bt_start, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(131, 131, 131)))
                                .addComponent(tf_totalnrque, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pb_progress, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_corrans, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lb_translation, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lb_correct, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tf_reply, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(27, 27, 27)
                                            .addComponent(bt_check))))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(bt_back)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_header, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_headernrofq)
                    .addComponent(tf_totalnrque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_start)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_totranslate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_polski, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_reply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_translation)
                    .addComponent(bt_check))
                .addGap(1, 1, 1)
                .addComponent(lb_correct, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pb_progress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_corrans, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_counter, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(bt_back)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        
        lb_polski.setText(wordForTest.getPolski());
    }

    private boolean wordIdIsValid(int wordId) {
        if (!wordIdList.contains(wordId)) {
            return true;
        } else {
            return false;
        }
    }

    private void bt_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_checkActionPerformed

        UIManager.put("OptionPane.buttonFont", new Font("Microsoft PhagsPa", Font.PLAIN, 12));
        UIManager.put("OptionPane.messageFont", new Font("Microsoft PhagsPa", Font.BOLD, 12));

        if (tf_reply.getText().equals(wordForTest.getMagyar())) {
            tf_reply.setBackground(Color.green);
            aCorr++;
        } else {
            tf_reply.setBackground(Color.red);
            lb_correct.setText(wordForTest.getMagyar());
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

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
        dispose();
        new Start().setVisible(true);
    }//GEN-LAST:event_bt_backActionPerformed

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
            java.util.logging.Logger.getLogger(Review_PLHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Review_PLHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Review_PLHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Review_PLHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Review_PLHU(category).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_check;
    private javax.swing.JButton bt_start;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_corrans;
    private javax.swing.JLabel lb_correct;
    private javax.swing.JLabel lb_counter;
    private javax.swing.JLabel lb_header;
    private javax.swing.JLabel lb_headernrofq;
    private javax.swing.JLabel lb_polski;
    private javax.swing.JLabel lb_totranslate;
    private javax.swing.JLabel lb_translation;
    private javax.swing.JProgressBar pb_progress;
    private javax.swing.JTextField tf_reply;
    private javax.swing.JTextField tf_totalnrque;
    // End of variables declaration//GEN-END:variables
}
