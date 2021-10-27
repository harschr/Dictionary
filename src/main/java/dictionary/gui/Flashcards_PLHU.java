
package dictionary.gui;

import dictionary.dao.impl.DictionaryRepositoryImpl;
import dictionary.model.Word;
import java.util.ArrayList;
import java.util.Random;
import java.awt.CardLayout;

public class Flashcards_PLHU extends javax.swing.JFrame {

   private static String category;
    private int maxRandom;
    DictionaryRepositoryImpl dictDAO = new DictionaryRepositoryImpl();
    ArrayList<Integer> wordIdList = new ArrayList<>();
    ArrayList<Word> wordList = new ArrayList<>();
    Word wordForTest;
    
    public Flashcards_PLHU(String category) {
        initComponents();
         setLocationRelativeTo(null);
        this.category = category;
        showQuestion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_flash_plhu = new javax.swing.JPanel();
        pn_flash_pl = new javax.swing.JPanel();
        lb_question = new javax.swing.JLabel();
        pn_flash_hu = new javax.swing.JPanel();
        lb_answer = new javax.swing.JLabel();
        bt_back = new javax.swing.JButton();
        bt_nextpair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary HU-PL / PL-HU");

        pn_flash_plhu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PL - HU words flashcards", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 3, 16))); // NOI18N
        pn_flash_plhu.setLayout(new java.awt.CardLayout());

        pn_flash_pl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_flash_plMouseClicked(evt);
            }
        });

        lb_question.setFont(new java.awt.Font("Lucida Bright", 0, 16)); // NOI18N

        javax.swing.GroupLayout pn_flash_plLayout = new javax.swing.GroupLayout(pn_flash_pl);
        pn_flash_pl.setLayout(pn_flash_plLayout);
        pn_flash_plLayout.setHorizontalGroup(
            pn_flash_plLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_flash_plLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lb_question, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pn_flash_plLayout.setVerticalGroup(
            pn_flash_plLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_flash_plLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lb_question, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pn_flash_plhu.add(pn_flash_pl, "card2");

        pn_flash_hu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_flash_huMouseClicked(evt);
            }
        });

        lb_answer.setFont(new java.awt.Font("Lucida Bright", 0, 16)); // NOI18N

        bt_back.setText("Back to menu");
        bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backActionPerformed(evt);
            }
        });

        bt_nextpair.setText("Next pair");
        bt_nextpair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nextpairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_flash_huLayout = new javax.swing.GroupLayout(pn_flash_hu);
        pn_flash_hu.setLayout(pn_flash_huLayout);
        pn_flash_huLayout.setHorizontalGroup(
            pn_flash_huLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_flash_huLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lb_answer, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_flash_huLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_nextpair)
                .addGap(18, 18, 18)
                .addComponent(bt_back)
                .addGap(68, 68, 68))
        );
        pn_flash_huLayout.setVerticalGroup(
            pn_flash_huLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_flash_huLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lb_answer, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(pn_flash_huLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_nextpair)
                    .addComponent(bt_back))
                .addGap(19, 19, 19))
        );

        pn_flash_plhu.add(pn_flash_hu, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(pn_flash_plhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(pn_flash_plhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pn_flash_plMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_flash_plMouseClicked
        CardLayout card = (CardLayout) pn_flash_plhu.getLayout();
        card.show(pn_flash_plhu, "card3");
        showAnswer(wordForTest);
    }//GEN-LAST:event_pn_flash_plMouseClicked

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
        dispose();
        new Start().setVisible(true);
    }//GEN-LAST:event_bt_backActionPerformed

    private void bt_nextpairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nextpairActionPerformed
        dispose();
        new Flashcards_PLHU(category).setVisible(true);
    }//GEN-LAST:event_bt_nextpairActionPerformed

    private void pn_flash_huMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_flash_huMouseClicked
        dispose();
        new Flashcards_PLHU(category).setVisible(true);
    }//GEN-LAST:event_pn_flash_huMouseClicked

       private void showQuestion() {
        if (category == "All") {
            wordList = dictDAO.listAll();
        } else {
            wordList = dictDAO.listByCat(category);
        }

        Random random = new Random();
        maxRandom = wordList.size();
        int randomId = random.nextInt(maxRandom);
        wordForTest = wordList.get(randomId);
        lb_question.setText("<html>" + wordForTest.getPolski()+ "</html>");
    }

    private void showAnswer(Word wordForTest) {
        lb_answer.setText("<html>" + wordForTest.getMagyar()+ "</html>");
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
            java.util.logging.Logger.getLogger(Flashcards_PLHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Flashcards_PLHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Flashcards_PLHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Flashcards_PLHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flashcards_PLHU(category).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_nextpair;
    private javax.swing.JLabel lb_answer;
    private javax.swing.JLabel lb_question;
    private javax.swing.JPanel pn_flash_hu;
    private javax.swing.JPanel pn_flash_pl;
    private javax.swing.JPanel pn_flash_plhu;
    // End of variables declaration//GEN-END:variables
}
