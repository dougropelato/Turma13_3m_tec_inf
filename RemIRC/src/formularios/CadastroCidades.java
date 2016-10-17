package formularios;

import dao.GenericDao;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tabelas.Cidades;
import tabelas.Estados;

public class CadastroCidades extends javax.swing.JFrame {

    public CadastroCidades(){
        initComponents();
    }

    public CadastroCidades(List<Object> l) {
        
        initComponents();
        montaCombo(l);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfNomeCidade = new javax.swing.JTextField();
        jcEc = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jtfNomeCidade);
        jtfNomeCidade.setBounds(100, 10, 110, 20);

        getContentPane().add(jcEc);
        jcEc.setBounds(100, 40, 110, 20);

        jLabel1.setText("Cidade:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 14, 60, 14);

        jLabel3.setText("Estado:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 40, 60, 20);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 90, 73, 23);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Cidades c = new Cidades();
        c.setNome_Cidades(jtfNomeCidade.getText());
        
        
        try {
           GenericDao gd = new GenericDao();
           gd.adicionar(c);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCidades.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastroCidades.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(CadastroCidades.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CadastroCidades.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(CadastroCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                    new CadastroCidades().setVisible(true);
                    
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> jcEc;
    private javax.swing.JTextField jtfNomeCidade;
    // End of variables declaration//GEN-END:variables

    private void montaCombo(List<Object> l) {
        
        if (l.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Nada cadastrado");

        } else {
            String[] linha = new String[]{null, null};
            for (int i = 0; i < l.size(); i++) {
                Estados e = (Estados) l.get(i);
                String x = e.getNome_estados();
                String y = e.getSigla_estados();
                jcEc.addItem(y + " - " + x);
            }
        }
        
    }
}
