/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservices;

/**
 *
 * @author x12533897
 */
public class ExtraClasses extends javax.swing.JFrame {

   

    /**
     * Creates new form ExtraClasses
     */
    public ExtraClasses() {
        initComponents();
    }
    
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        btnLearning = new javax.swing.JButton();
        btnDisability = new javax.swing.JButton();
        btnMaths = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnGoBack = new javax.swing.JButton();
        lblMenu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblContent = new javax.swing.JLabel();
        lblExtraClasses = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(450, 200, 400, 500));
        setMaximizedBounds(new java.awt.Rectangle(450, 200, 400, 500));
        setMaximumSize(new java.awt.Dimension(400, 500));
        setMinimumSize(new java.awt.Dimension(400, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(400, 500));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(400, 500));

        jPanel1.setOpaque(false);

        btnLearning.setBackground(new java.awt.Color(0, 0, 0));
        btnLearning.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        btnLearning.setForeground(new java.awt.Color(255, 255, 255));
        btnLearning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservices/learning.png"))); // NOI18N
        btnLearning.setContentAreaFilled(false);
        btnLearning.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLearning.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservices/learning2.png"))); // NOI18N

        btnDisability.setBackground(new java.awt.Color(0, 0, 0));
        btnDisability.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        btnDisability.setForeground(new java.awt.Color(255, 255, 255));
        btnDisability.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservices/disability.png"))); // NOI18N
        btnDisability.setContentAreaFilled(false);
        btnDisability.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDisability.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservices/disability2.png"))); // NOI18N

        btnMaths.setBackground(new java.awt.Color(0, 0, 0));
        btnMaths.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        btnMaths.setForeground(new java.awt.Color(255, 255, 255));
        btnMaths.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservices/maths.png"))); // NOI18N
        btnMaths.setContentAreaFilled(false);
        btnMaths.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMaths.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservices/maths2.png"))); // NOI18N
        btnMaths.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMathsActionPerformed(evt);
            }
        });

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservices/home.png"))); // NOI18N
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservices/home2.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnGoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservices/backbutton.png"))); // NOI18N
        btnGoBack.setContentAreaFilled(false);
        btnGoBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGoBack.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservices/backbutton2.png"))); // NOI18N
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(btnMaths, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLearning, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDisability, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
            .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnMaths, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnLearning, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnDisability, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel1.setBounds(10, 450, 370, 50);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservices/blue.png"))); // NOI18N
        lblMenu.setBounds(10, 450, 380, 50);
        jLayeredPane1.add(lblMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null},
                {"HTML", "2.01", "May 1st", "15:00"},
                {"HTML", "2.02", "May 2nd", "17:00"},
                {null, null, null, null},
                {"OOP", "3.01", "May 3rd", "14:00"},
                {"OOP", "3.03", "May 4th", "15:00"},
                {null, null, null, null},
                {"Multimedia", "1.01", "May 5th", "18:00"},
                {"Multimedia", "2.02", "May 6th", "14:00"},
                {null, null, null, null},
                {"MFIS", "3.03", "May 7th", "16:00"},
                {"MFIS", "2.01", "May 8th", "17:00"},
                {null, null, null, null},
                {"OPS SYS", "1.02", "May 9th", "15:00"},
                {"OPS SYS", "2.02", "May 10th", "12:00"},
                {null, null, null, null},
                {"COMP ARC", "1.01", "May 11th", "16:00"},
                {"COMP ARC", "2.02", "May 12th", "13:00"}
            },
            new String [] {
                "Module", "Classroom", "Date", "Time"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jScrollPane1.setBounds(30, 110, 330, 320);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblContent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservices/blue.png"))); // NOI18N
        lblContent.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblContent.setBounds(10, 90, 380, 350);
        jLayeredPane1.add(lblContent, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblExtraClasses.setBackground(new java.awt.Color(255, 255, 255));
        lblExtraClasses.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        lblExtraClasses.setForeground(new java.awt.Color(255, 255, 255));
        lblExtraClasses.setText("Extra Classes");
        lblExtraClasses.setBounds(180, 30, 200, 40);
        jLayeredPane1.add(lblExtraClasses, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblBackground.setBackground(new java.awt.Color(255, 255, 255));
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservices/background.png"))); // NOI18N
        lblBackground.setMaximumSize(new java.awt.Dimension(420, 520));
        lblBackground.setMinimumSize(new java.awt.Dimension(420, 520));
        lblBackground.setPreferredSize(new java.awt.Dimension(420, 520));
        lblBackground.setBounds(0, -10, 420, 520);
        jLayeredPane1.add(lblBackground, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        StudentForm st = new StudentForm();
        st.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ComputingSupport cs = new ComputingSupport();
        cs.setVisible(true);
       
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void btnMathsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMathsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MathsSupport ms = new MathsSupport();
        ms.setVisible(true);
      
    }//GEN-LAST:event_btnMathsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExtraClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExtraClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExtraClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExtraClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new ExtraClasses().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisability;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLearning;
    private javax.swing.JButton btnMaths;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblContent;
    private javax.swing.JLabel lblExtraClasses;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables
}
