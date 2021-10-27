package dictionary.gui;

import dictionary.dao.DictionaryRepository;
import dictionary.dao.impl.DictionaryRepositoryImpl;
import dictionary.model.Word;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class AddNewWord extends javax.swing.JFrame {

    public AddNewWord() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_hun = new javax.swing.JLabel();
        lb_polski = new javax.swing.JLabel();
        lb_deutsch = new javax.swing.JLabel();
        lb_englisch = new javax.swing.JLabel();
        tf_hun = new javax.swing.JTextField();
        tf_pol = new javax.swing.JTextField();
        tf_ger = new javax.swing.JTextField();
        tf_eng = new javax.swing.JTextField();
        lb_cat = new javax.swing.JLabel();
        tf_cat = new javax.swing.JTextField();
        bt_addnew = new javax.swing.JButton();
        bt_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add new word");

        lb_hun.setText("Magyar");

        lb_polski.setText("Polski");

        lb_deutsch.setText("Deutsch");

        lb_englisch.setText("English");

        lb_cat.setText("Category");

        bt_addnew.setText("ADD");
        bt_addnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addnewActionPerformed(evt);
            }
        });

        bt_cancel.setText("Cancel");
        bt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_englisch)
                        .addGap(18, 18, 18)
                        .addComponent(tf_eng))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_deutsch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_ger))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_hun)
                            .addComponent(lb_polski))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_hun, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(tf_pol)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_cat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_cat, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_addnew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_cancel)
                                .addGap(60, 60, 60)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_hun)
                    .addComponent(tf_hun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_polski)
                    .addComponent(tf_pol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_deutsch)
                    .addComponent(tf_ger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_englisch)
                    .addComponent(tf_eng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_cat)
                    .addComponent(tf_cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_addnew)
                    .addComponent(bt_cancel))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_addnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addnewActionPerformed
        String ger;
        String eng;

        if (tf_hun.getText().isBlank() || tf_pol.getText().isBlank()) {
            showError();
        } else {

            DictionaryRepositoryImpl dictDAO = new DictionaryRepositoryImpl();
            String hun = tf_hun.getText();
            String pol = tf_pol.getText();
            if (tf_ger.getText() == null) {
                ger = "";
            }
            ger = tf_ger.getText();

            if (tf_eng.getText() == null) {
                eng = "";
            }
            eng = tf_eng.getText();

            String cat = tf_cat.getText();

            Word word = new Word(cat, hun, pol, ger, eng);

            //tf_title.requestFocus();
            dictDAO.insert(word);

            JOptionPane.showMessageDialog(this, "The word has been succesfully added to the dictionary.");

            tf_hun.setText("");
            tf_pol.setText("");
            tf_ger.setText("");
            tf_eng.setText("");
            tf_cat.setText("");
            // dispose();
            /*    ListAllPassword updatedList = new ListAllPassword(new javax.swing.JFrame(), true, userId);
            updatedList.setVisible(true);*/
        }

    }//GEN-LAST:event_bt_addnewActionPerformed

    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed
        dispose();
        new Start().setVisible(true);
    }//GEN-LAST:event_bt_cancelActionPerformed

    private void showError() {
        JOptionPane.showInternalMessageDialog(null, "Polish and Hungarian fields need to be filled in!", "Error!", JOptionPane.ERROR_MESSAGE);
    }

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
            java.util.logging.Logger.getLogger(AddNewWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewWord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addnew;
    private javax.swing.JButton bt_cancel;
    private javax.swing.JLabel lb_cat;
    private javax.swing.JLabel lb_deutsch;
    private javax.swing.JLabel lb_englisch;
    private javax.swing.JLabel lb_hun;
    private javax.swing.JLabel lb_polski;
    private javax.swing.JTextField tf_cat;
    private javax.swing.JTextField tf_eng;
    private javax.swing.JTextField tf_ger;
    private javax.swing.JTextField tf_hun;
    private javax.swing.JTextField tf_pol;
    // End of variables declaration//GEN-END:variables
}
