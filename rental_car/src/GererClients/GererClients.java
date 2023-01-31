/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GererClients;

import Connexion.Connexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import GererVoitures.GererVoitures;
import GererDemandes.GereDemandes;
import Login.LoginForm;
/**
 *
 * @author dell5
 */
public class GererClients extends javax.swing.JFrame {

    /**
     * Creates new form GererClients
     */
    public GererClients() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        RedBackground = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        telephone = new javax.swing.JTextField();
        cin = new javax.swing.JTextField();
        prenom = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        adresse = new javax.swing.JTextField();
        editer = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        refresh1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Gerer Les Voitures");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 250, 40));

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Gerer les demandes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 250, 40));

        jButton3.setBackground(new java.awt.Color(255, 51, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Gerer les Clients");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 250, 40));
        jPanel1.add(RedBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 420, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Donn�es Client");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 280, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Adresse");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 90, 16));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Pr�nom");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 90, 16));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Telephone");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 90, 16));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 90, 16));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Nom");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 90, 16));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Cin");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, 16));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 240, -1));

        telephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telephoneActionPerformed(evt);
            }
        });
        jPanel1.add(telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 150, -1));

        cin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinActionPerformed(evt);
            }
        });
        jPanel1.add(cin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 150, -1));

        prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenomActionPerformed(evt);
            }
        });
        jPanel1.add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 150, -1));

        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        jPanel1.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 150, -1));

        adresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adresseActionPerformed(evt);
            }
        });
        jPanel1.add(adresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 240, -1));

        editer.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        editer.setForeground(new java.awt.Color(255, 51, 51));
        editer.setText("Editer");
        editer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editerActionPerformed(evt);
            }
        });
        jPanel1.add(editer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 110, -1));

        supprimer.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        supprimer.setForeground(new java.awt.Color(255, 51, 51));
        supprimer.setText("Supprimer");
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });
        jPanel1.add(supprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 110, -1));

        refresh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        refresh.setForeground(new java.awt.Color(255, 0, 51));
        refresh.setText("Charger");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 110, -1));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 51, 51));
        jButton7.setText("Enregistrer");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 110, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Liste de Client");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 130, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nom du Client", "Cin", "Num�ro", "Adresse"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setMinimumSize(new java.awt.Dimension(60, 30));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 620, 600));

        refresh1.setBackground(new java.awt.Color(255, 51, 51));
        refresh1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        refresh1.setText("Se d�connecter");
        refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh1ActionPerformed(evt);
            }
        });
        jPanel1.add(refresh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 570, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        GererVoitures v = new GererVoitures();
        v.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void telephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telephoneActionPerformed

    private void cinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cinActionPerformed

    private void prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenomActionPerformed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void adresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adresseActionPerformed

    private void editerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editerActionPerformed
        try{
            
            int CIN = Integer.parseInt(cin.getText());
            String Nom = nom.getText();
            String Prenom = prenom.getText();
            String mail = email.getText();
            int tel = Integer.parseInt(telephone.getText());
            String adr = adresse.getText();
            if (cin.getText().equals("") || Nom.equals("") || Prenom.equals("") || mail.equals("") || telephone.getText().equals("") || adr.equals("")){
                JOptionPane.showMessageDialog(null,"Le remplissage de tout les champs est obligatoire!","Erreur",JOptionPane.WARNING_MESSAGE);
            }
            else{
                
                Connexion con = new Connexion();
                Statement st = con.connect().createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM client WHERE CIN='"+CIN+"'");
                if (!rs.next()){
                    JOptionPane.showMessageDialog(null,"Le client � modifier n'existe pas!","Erreur",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    st.executeUpdate("UPDATE client SET Nom='"+Nom+"', Prenom='"+Prenom+"', tel='"+tel+"', email='"+mail+"', adresse='"+adr+"' WHERE CIN='"+CIN+"'");
                }
                
                
            }
            

            
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_editerActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        try{
            DefaultTableModel tbmodel = (DefaultTableModel)table.getModel();
            tbmodel.setRowCount(0);
            
            Connexion con = new Connexion();
            
            Statement st = con.connect().createStatement();
            ResultSet rs = st.executeQuery("SELECT CIN, Nom, Prenom, tel, adresse FROM client");
            
            while (rs.next() != false){
                String cin = Integer.toString(rs.getInt(1));
                String NomClient = rs.getString(2) + " " + rs.getString(3);
                String tel = Integer.toString(rs.getInt(4));
                String adresse = rs.getString(5);
                
                String row[] = {NomClient, cin, tel, adresse};
                
                
                tbmodel.addRow(row);
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_refreshActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try{
            if (cin.getText().equals("") || nom.getText().equals("") || prenom.getText().equals("") || email.getText().equals("") || telephone.getText().equals("") || adresse.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Le remplissage de tout les champs est obligatoire!","Erreur",JOptionPane.WARNING_MESSAGE);
            }
            else{
                int CIN = Integer.parseInt(cin.getText());
                String Nom = nom.getText();
                String Prenom = prenom.getText();
                String mail = email.getText();
                int tel = Integer.parseInt(telephone.getText());
                String adr = adresse.getText();
                Connexion con = new Connexion();
                Statement st = con.connect().createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM client WHERE CIN='"+CIN+"'");
                if (rs.next()){
                    JOptionPane.showMessageDialog(null,"Le client existe d�ja!","Erreur",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    st.executeUpdate("INSERT INTO client VALUES('"+CIN+"','"+Nom+"','"+Prenom+"','"+tel+"','"+mail+"','"+adr+"');"); 
                    JOptionPane.showMessageDialog(null,"Client ajout�!","Ajout",JOptionPane.INFORMATION_MESSAGE);
            }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
        try{
            Connexion con = new Connexion();
            Statement st = con.connect().createStatement();
            int CIN = Integer.parseInt(cin.getText());
            ResultSet rs = st.executeQuery("SELECT * FROM client WHERE CIN='"+CIN+"'");
            if (!rs.next()){
                JOptionPane.showMessageDialog(null,"Le client � supprimer n'existe pas!","Erreur",JOptionPane.ERROR_MESSAGE);
            }
            else{
                st.executeUpdate("DELETE FROM client WHERE CIN='"+CIN+"'");
            }
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_supprimerActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        GereDemandes g = new GereDemandes();
        g.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void refresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh1ActionPerformed
        this.dispose();
        LoginForm log = new LoginForm();
        log.setVisible(true);
    }//GEN-LAST:event_refresh1ActionPerformed

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
            java.util.logging.Logger.getLogger(GererClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GererClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GererClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GererClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GererClients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RedBackground;
    private javax.swing.JTextField adresse;
    private javax.swing.JTextField cin;
    private javax.swing.JButton editer;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prenom;
    private javax.swing.JButton refresh;
    private javax.swing.JButton refresh1;
    private javax.swing.JButton supprimer;
    private javax.swing.JTable table;
    private javax.swing.JTextField telephone;
    // End of variables declaration//GEN-END:variables
}
