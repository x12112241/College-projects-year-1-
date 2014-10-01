/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservices;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Brian Murphy
 */
public class ContactUs extends javax.swing.JFrame {

    private ArrayList <Contact> aList;
    private String Name, StudentID, Query;
    int count;
    
    
    /**
     * Creates new form ContactUs
     */
    public ContactUs() {
        initComponents();
        aList = new ArrayList<>();
        Name = new String();
        StudentID = new String();
        Query = new String();
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
        lblName = new javax.swing.JLabel();
        lblStudentID = new javax.swing.JLabel();
        JComCourse = new javax.swing.JComboBox();
        lblCourse = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtStudentID = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuery = new javax.swing.JTextArea();
        lblQuery = new javax.swing.JLabel();
        lblContent = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnLearning = new javax.swing.JButton();
        btnDisability = new javax.swing.JButton();
        btnMaths = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnGoBack = new javax.swing.JButton();
        lblMenu = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contact Us");
        setBounds(new java.awt.Rectangle(450, 200, 400, 500));
        setMaximizedBounds(new java.awt.Rectangle(450, 200, 400, 500));
        setMaximumSize(new java.awt.Dimension(400, 500));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setResizable(false);

        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name:");
        lblName.setBounds(40, 110, 70, 14);
        jLayeredPane1.add(lblName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblStudentID.setForeground(new java.awt.Color(255, 255, 255));
        lblStudentID.setText("Student ID:");
        lblStudentID.setBounds(40, 150, 80, 14);
        jLayeredPane1.add(lblStudentID, javax.swing.JLayeredPane.DEFAULT_LAYER);

        JComCourse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Computing", "Business", "Human Resource Management", "Marketing Practice", "Technology Management", "Psychology", "Accounting", "Business Information Systems", "Economics and Finance", "Cloud Computing", "Finance", "Marketing", "Web Technologies", " " }));
        JComCourse.setBounds(150, 180, 210, 30);
        jLayeredPane1.add(JComCourse, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblCourse.setForeground(new java.awt.Color(255, 255, 255));
        lblCourse.setText("Course:");
        lblCourse.setBounds(40, 180, 70, 30);
        jLayeredPane1.add(lblCourse, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtName.setBounds(150, 100, 210, 30);
        jLayeredPane1.add(txtName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtStudentID.setBounds(150, 140, 210, 30);
        jLayeredPane1.add(txtStudentID, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        btnSubmit.setBounds(290, 370, 70, 40);
        jLayeredPane1.add(btnSubmit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtQuery.setColumns(20);
        txtQuery.setRows(5);
        jScrollPane1.setViewportView(txtQuery);

        jScrollPane1.setBounds(150, 230, 210, 120);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblQuery.setForeground(new java.awt.Color(255, 255, 255));
        lblQuery.setText("Query:");
        lblQuery.setBounds(40, 230, 60, 14);
        jLayeredPane1.add(lblQuery, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblContent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservices/blue.png"))); // NOI18N
        lblContent.setBounds(10, 90, 380, 350);
        jLayeredPane1.add(lblContent, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
                .addContainerGap()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(btnMaths, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLearning, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnDisability, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLearning, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDisability, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMaths, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.setBounds(10, 440, 370, 60);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservices/blue.png"))); // NOI18N
        lblMenu.setBounds(10, 450, 380, 50);
        jLayeredPane1.add(lblMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentservices/background.png"))); // NOI18N
        lblBackground.setBounds(0, 0, 400, 500);
        jLayeredPane1.add(lblBackground, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
  
        Name = txtName.getText();
        StudentID = txtStudentID.getText();
        Query = txtQuery.getText();
        
        Contact c = new Contact();
        c.setName(Name);
        c.setStudentID(StudentID);
        c.setQuery(Query);
        
        File outFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        
        try{
            outFile = new File("contactcomputing.data");
            fStream = new FileOutputStream(outFile);
            oStream = new ObjectOutputStream(fStream);
            
            oStream.writeObject(aList);
            
            JOptionPane.showMessageDialog(null, "You submitted your query successfully, we will respond to you ASAP!");
            
            oStream.close();
            
            
        }
        catch(IOException e){
            System.out.println(e);
        }
         
       
        
   
           
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnMathsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMathsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MathsSupport ms = new MathsSupport();
        ms.setVisible(true);

    }//GEN-LAST:event_btnMathsActionPerformed

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
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ContactUs().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox JComCourse;
    private javax.swing.JButton btnDisability;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLearning;
    private javax.swing.JButton btnMaths;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblContent;
    private javax.swing.JLabel lblCourse;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblQuery;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtQuery;
    private javax.swing.JTextField txtStudentID;
    // End of variables declaration//GEN-END:variables
}
