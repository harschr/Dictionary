package dictionary.gui;

import dictionary.dao.impl.DictionaryRepositoryImpl;
import javax.swing.UIManager;
import java.util.Set;

public class Start extends javax.swing.JFrame {
    
    DictionaryRepositoryImpl dictDAO = new DictionaryRepositoryImpl();
    
    public Start() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_add = new javax.swing.JButton();
        bt_plhu = new javax.swing.JButton();
        lb_select = new javax.swing.JLabel();
        bt_dictionary = new javax.swing.JButton();
        bt_close = new javax.swing.JButton();
        bt_kekaszeme = new javax.swing.JButton();
        bt_hupl = new javax.swing.JButton();
        lb_select_cat = new javax.swing.JLabel();
        cb_categories = new javax.swing.JComboBox<>();
        bt_flashcards_plhu = new javax.swing.JButton();
        bt_flashcards_hupl = new javax.swing.JButton();
        bt_przegrywac = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary HU-PL / PL-HU");

        bt_add.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        bt_add.setText("Add new word");
        bt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addActionPerformed(evt);
            }
        });

        bt_plhu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        bt_plhu.setText("Review words PL-HU");
        bt_plhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_plhuActionPerformed(evt);
            }
        });

        lb_select.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_select.setText("Select from below what you would like to do:");

        bt_dictionary.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        bt_dictionary.setText("Dictionary");
        bt_dictionary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dictionaryActionPerformed(evt);
            }
        });

        bt_close.setBackground(new java.awt.Color(0, 0, 0));
        bt_close.setFont(new java.awt.Font("Bauhaus 93", 0, 13)); // NOI18N
        bt_close.setForeground(new java.awt.Color(255, 255, 255));
        bt_close.setText("Close");
        bt_close.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_closeActionPerformed(evt);
            }
        });

        bt_kekaszeme.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        bt_kekaszeme.setText("Kék a szeme");
        bt_kekaszeme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_kekaszemeActionPerformed(evt);
            }
        });

        bt_hupl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        bt_hupl.setText("Review words HU-PL");
        bt_hupl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_huplActionPerformed(evt);
            }
        });

        lb_select_cat.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lb_select_cat.setText("If you would like to review words, first select category below:");

        cb_categories.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"All"}));

        bt_flashcards_plhu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        bt_flashcards_plhu.setText("Flashcards PL-HU");
        bt_flashcards_plhu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_flashcards_plhuActionPerformed(evt);
            }
        });

        bt_flashcards_hupl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        bt_flashcards_hupl.setText("Flashcards HU-PL");
        bt_flashcards_hupl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_flashcards_huplActionPerformed(evt);
            }
        });

        bt_przegrywac.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        bt_przegrywac.setText("Przegrywać czasem");
        bt_przegrywac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_przegrywacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_close, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_select_cat)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_select, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(bt_przegrywac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bt_hupl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bt_dictionary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bt_flashcards_hupl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(54, 54, 54)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(bt_flashcards_plhu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(bt_plhu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(67, 67, 67)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(bt_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(bt_kekaszeme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(cb_categories, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_select, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_dictionary, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_add, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_kekaszeme, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_przegrywac, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_select_cat)
                .addGap(18, 18, 18)
                .addComponent(cb_categories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_flashcards_plhu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_flashcards_hupl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_plhu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_hupl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(bt_close)
                .addGap(38, 38, 38))
        );

        Set<String> categories = dictDAO.findCategories();
        for (String category : categories) {
            cb_categories.addItem(category);
        }

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addActionPerformed
        dispose();
        AddNewWord addNew = new AddNewWord();
        addNew.setVisible(true);
    }//GEN-LAST:event_bt_addActionPerformed

    private void bt_plhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_plhuActionPerformed
        String category = cb_categories.getSelectedItem().toString();
        dispose();
        new Review_PLHU(category).setVisible(true);
    }//GEN-LAST:event_bt_plhuActionPerformed

    private void bt_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_closeActionPerformed

    private void bt_dictionaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dictionaryActionPerformed
        dispose();
        new ListWords().setVisible(true);
    }//GEN-LAST:event_bt_dictionaryActionPerformed

    private void bt_kekaszemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_kekaszemeActionPerformed
        dispose();
        new KekASzeme().setVisible(true);
    }//GEN-LAST:event_bt_kekaszemeActionPerformed

    private void bt_huplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_huplActionPerformed
        String category = cb_categories.getSelectedItem().toString();
        dispose();
        new Review_HUPL(category).setVisible(true);
    }//GEN-LAST:event_bt_huplActionPerformed

    private void bt_flashcards_plhuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_flashcards_plhuActionPerformed
        String category = cb_categories.getSelectedItem().toString();
        dispose();
        new Flashcards_PLHU(category).setVisible(true);
    }//GEN-LAST:event_bt_flashcards_plhuActionPerformed

    private void bt_flashcards_huplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_flashcards_huplActionPerformed
        String category = cb_categories.getSelectedItem().toString();        
        dispose();
        new Flashcards_HUPL(category).setVisible(true);
    }//GEN-LAST:event_bt_flashcards_huplActionPerformed

    private void bt_przegrywacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_przegrywacActionPerformed
        dispose();
        new PrzegrywacCzasemToNormalnaRzecz().setVisible(true);
    }//GEN-LAST:event_bt_przegrywacActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                javax.swing.UIManager.setLookAndFeel("com.formdev.flatlaf.FlatIntelliJLaf");
                UIManager.put("TextComponent.arc", 6);
                UIManager.put("ScrollBar.width", 16);
                UIManager.put("ScrollBar.showButtons", true);
            }
         //  UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); Metal LookAndFeel
         //   UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel"); MotifLookAndFeel
        } catch (ClassNotFoundException e) {
            System.err.println("Failed to initialize LaF");
        } catch (Exception e) {
            System.err.println("Failed to initialize LaF");
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_add;
    private javax.swing.JButton bt_close;
    private javax.swing.JButton bt_dictionary;
    private javax.swing.JButton bt_flashcards_hupl;
    private javax.swing.JButton bt_flashcards_plhu;
    private javax.swing.JButton bt_hupl;
    private javax.swing.JButton bt_kekaszeme;
    private javax.swing.JButton bt_plhu;
    private javax.swing.JButton bt_przegrywac;
    private javax.swing.JComboBox<String> cb_categories;
    private javax.swing.JLabel lb_select;
    private javax.swing.JLabel lb_select_cat;
    // End of variables declaration//GEN-END:variables
}
