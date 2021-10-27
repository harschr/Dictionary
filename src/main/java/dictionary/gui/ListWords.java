package dictionary.gui;

import dictionary.dao.impl.DictionaryRepositoryImpl;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import dictionary.model.Word;

public class ListWords extends javax.swing.JFrame {

    DictionaryRepositoryImpl dictDAO = new DictionaryRepositoryImpl();

    public ListWords() {
        initComponents();
        setLocationRelativeTo(null);
        listWords();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_words = new javax.swing.JTable();
        bt_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb_words.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Category", "Magyar", "Polski"
            }
        ));
        jScrollPane1.setViewportView(tb_words);
        if (tb_words.getColumnModel().getColumnCount() > 0) {
            tb_words.getColumnModel().getColumn(0).setMinWidth(40);
            tb_words.getColumnModel().getColumn(0).setPreferredWidth(40);
            tb_words.getColumnModel().getColumn(0).setMaxWidth(40);
            tb_words.getColumnModel().getColumn(1).setMinWidth(100);
            tb_words.getColumnModel().getColumn(1).setPreferredWidth(100);
            tb_words.getColumnModel().getColumn(1).setMaxWidth(100);
            tb_words.getColumnModel().getColumn(2).setMinWidth(200);
            tb_words.getColumnModel().getColumn(2).setPreferredWidth(200);
            tb_words.getColumnModel().getColumn(2).setMaxWidth(200);
            tb_words.getColumnModel().getColumn(3).setMinWidth(200);
            tb_words.getColumnModel().getColumn(3).setPreferredWidth(200);
            tb_words.getColumnModel().getColumn(3).setMaxWidth(200);
        }

        bt_back.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(bt_back)
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addGap(79, 79, 79)
                .addComponent(bt_back)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
        dispose();
        new Start().setVisible(true);
    }//GEN-LAST:event_bt_backActionPerformed

    private void listWords() {
        ArrayList<String[]> wordArray = dictDAO.arrayAll();
        DefaultTableModel tableModel = (DefaultTableModel) tb_words.getModel();
        for (String[] word : wordArray) {
            tableModel.addRow(word);
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
            java.util.logging.Logger.getLogger(ListWords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListWords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListWords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListWords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListWords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_back;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_words;
    // End of variables declaration//GEN-END:variables
}
