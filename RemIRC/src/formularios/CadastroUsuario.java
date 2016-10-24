package formularios;

import dao.GenericDao;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tabelas.Cidades;
import tabelas.Estados;
import tabelas.Usuarios;
import tabelas.login_usuarios;

public class CadastroUsuario extends javax.swing.JFrame {

    public CadastroUsuario() {
        super("Re-MIRC");
        initComponents();
    }

    public CadastroUsuario(List<Object> l, List<Object> le) {
        initComponents();
        montaCombo(l, le);
    }

    int idade;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcSe = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtAp = new javax.swing.JTextField();
        jtEm = new javax.swing.JTextField();
        jtEn = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jbFo = new javax.swing.JButton();
        jbCa = new javax.swing.JButton();
        jbLi = new javax.swing.JButton();
        jtNo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHu = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jpSe = new javax.swing.JPasswordField();
        jpRs = new javax.swing.JPasswordField();
        jcEc = new javax.swing.JComboBox<>();
        jcId = new javax.swing.JComboBox<>();
        jcCi = new javax.swing.JComboBox<>();

        jLabel8.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jLabel8.setText("Cidade");

        jTextField6.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N

        jButton1.setText("jButton1");

        jTextField11.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jLabel13.setText("Nome");

        jTextField12.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jLabel14.setText("Nome");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Swis721 Cn BT", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro");

        jLabel3.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jLabel3.setText("Senha *");

        jLabel4.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jLabel4.setText("Email *");

        jLabel5.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jLabel5.setText("Sexo *");

        jcSe.setBackground(new java.awt.Color(204, 204, 204));
        jcSe.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jcSe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        jLabel6.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jLabel6.setText("Idade *");

        jLabel7.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jLabel7.setText("Endereço");

        jLabel9.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jLabel9.setText("Rep. Senha *");

        jLabel10.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jLabel10.setText("Apelido *");

        jtAp.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N

        jtEm.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N

        jtEn.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jLabel11.setText("Foto");

        jbFo.setBackground(new java.awt.Color(204, 204, 204));
        jbFo.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jbFo.setText("...");
        jbFo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFoActionPerformed(evt);
            }
        });

        jbCa.setBackground(new java.awt.Color(204, 204, 204));
        jbCa.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jbCa.setText("Cadastrar!");
        jbCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCaActionPerformed(evt);
            }
        });

        jbLi.setBackground(new java.awt.Color(204, 204, 204));
        jbLi.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jbLi.setText("Limpar");
        jbLi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLiActionPerformed(evt);
            }
        });

        jtNo.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jLabel12.setText("Nome *");

        jLabel15.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jLabel15.setText("Estado");

        jLabel16.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jLabel16.setText("Humor");

        jtHu.setColumns(20);
        jtHu.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jtHu.setLineWrap(true);
        jtHu.setRows(5);
        jtHu.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jtHu);

        jLabel17.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jLabel17.setText("Cidade");

        jLabel18.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jLabel18.setText("* Campos obrigatórios");

        jpSe.setMinimumSize(new java.awt.Dimension(6, 24));
        jpSe.setPreferredSize(new java.awt.Dimension(6, 24));
        jpSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpSeActionPerformed(evt);
            }
        });

        jpRs.setPreferredSize(new java.awt.Dimension(6, 24));

        jcEc.setBackground(new java.awt.Color(204, 204, 204));
        jcEc.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N

        jcId.setBackground(new java.awt.Color(204, 204, 204));
        jcId.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jcId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70" }));

        jcCi.setBackground(new java.awt.Color(204, 204, 204));
        jcCi.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jcCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jpRs, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel12)
                                .addGap(50, 50, 50)
                                .addComponent(jtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10)
                                .addGap(40, 40, 40)
                                .addComponent(jtAp, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)
                                .addGap(47, 47, 47)
                                .addComponent(jpSe, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel4)
                                .addGap(51, 51, 51)
                                .addComponent(jtEm, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel7)
                                .addGap(40, 40, 40)
                                .addComponent(jtEn, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jcSe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcEc, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jcCi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel18)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbFo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcId, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbCa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbLi, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel12))
                    .addComponent(jtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10))
                    .addComponent(jtAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpSe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jpRs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(jtEm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jtEn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jcCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jcEc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(jcSe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jcId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbLi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel11))
                    .addComponent(jbFo)
                    .addComponent(jbCa))
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCaActionPerformed

        Usuarios u = new Usuarios();

        u.setApelido_usuarios(jtAp.getText());
        u.setEmail_usuarios(jtEm.getText());
        u.setNome_usuarios(jtNo.getText());
        u.setHumor_usuarios(jtHu.getText());
        u.setEndereco_usuarios(jtEn.getText());
        String sen = new String(jpSe.getPassword());
        String rsen = new String(jpRs.getPassword());

        if (sen.equals(rsen)) {
            String s = sen;
            MessageDigest m;
            try {
                m = MessageDigest.getInstance("MD5");
                m.update(s.getBytes(), 0, s.length());
                String smd5 = new BigInteger(1, m.digest()).toString(16);
                u.setSenha_usuarios(smd5);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "As senhas não conferem!", " Ops!", 0);
            jpRs.setText("");
            jpSe.setText("");
        }

        u.setCodigo_cidades(jcCi.getSelectedIndex() + 1);
        u.setCodigo_estados(jcEc.getSelectedIndex() + 1);
        u.setIdade_usuarios(jcId.getSelectedIndex() + 13);
        String seo = jcSe.getSelectedItem().toString();
        System.out.println(seo);
        u.setSexo_usuarios(seo);

        if (jtNo.getText().isEmpty() || jtAp.getText().isEmpty() || sen.isEmpty() || rsen.isEmpty() || jtEm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Algum campo obrigatório está vazio!", " Ops!", 0);
        } else {

            try {

                GenericDao g = new GenericDao();
                g.adicionar(u);

            } catch (SQLException ex) {
                Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(null, "Você foi cadastrado com sucesso, muito obrigado!", " Sucesso!", 1);
        }

    }//GEN-LAST:event_jbCaActionPerformed

    private void jbLiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLiActionPerformed

        jtAp.setText("");
        jtEm.setText("");
        jtEn.setText("");
        jtHu.setText("");
        jtNo.setText("");
        jpRs.setText("");
        jpSe.setText("");

    }//GEN-LAST:event_jbLiActionPerformed

    private void jpSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpSeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpSeActionPerformed

    private void jbFoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFoActionPerformed

        try {
            Runtime.getRuntime().exec("explorer c:\\");
        } catch (IOException ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbFoActionPerformed

    private void jcCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcCiActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton jbCa;
    private javax.swing.JButton jbFo;
    private javax.swing.JButton jbLi;
    private javax.swing.JComboBox<String> jcCi;
    private javax.swing.JComboBox<String> jcEc;
    private javax.swing.JComboBox<String> jcId;
    private javax.swing.JComboBox<String> jcSe;
    private javax.swing.JPasswordField jpRs;
    private javax.swing.JPasswordField jpSe;
    private javax.swing.JTextField jtAp;
    private javax.swing.JTextField jtEm;
    private javax.swing.JTextField jtEn;
    private javax.swing.JTextArea jtHu;
    private javax.swing.JTextField jtNo;
    // End of variables declaration//GEN-END:variables

    public void montaCombo(List<Object> l, List<Object> le) {

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

        if (le.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Nada cadastrado");

        } else {
            String[] linha = new String[]{null};
            for (int i = 0; i < le.size(); i++) {
                Cidades e = (Cidades) le.get(i);
                String x = e.getNome_Cidades();
                jcCi.addItem(x);
            }
        }

    }
}
