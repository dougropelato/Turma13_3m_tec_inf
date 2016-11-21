package formularios;

import dao.GenericDao;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tabelas.Cidades;
import tabelas.Estados;
import tabelas.Usuarios;

public class loginUsuarios extends javax.swing.JFrame {

    public loginUsuarios() {
        super("Re-MIRC");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtNo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jbLi = new javax.swing.JButton();
        jbLi1 = new javax.swing.JButton();
        jbLi2 = new javax.swing.JButton();
        jpSe = new javax.swing.JPasswordField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Swis721 Cn BT", 1, 24)); // NOI18N
        jLabel1.setText("LOGIN");

        jtNo.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jLabel12.setText("Nome ou Email");

        jLabel13.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jLabel13.setText("Senha");

        jbLi.setBackground(new java.awt.Color(204, 204, 204));
        jbLi.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jbLi.setText("LogIn!");
        jbLi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLiActionPerformed(evt);
            }
        });

        jbLi1.setBackground(new java.awt.Color(204, 204, 204));
        jbLi1.setFont(new java.awt.Font("Swis721 Cn BT", 0, 12)); // NOI18N
        jbLi1.setText("Esqueci minha senha");
        jbLi1.setBorderPainted(false);
        jbLi1.setOpaque(false);
        jbLi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLi1ActionPerformed(evt);
            }
        });

        jbLi2.setBackground(new java.awt.Color(204, 204, 204));
        jbLi2.setFont(new java.awt.Font("Swis721 Cn BT", 0, 14)); // NOI18N
        jbLi2.setText("Cadastro");
        jbLi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLi2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbLi, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                            .addComponent(jbLi2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtNo)
                                .addComponent(jbLi1)
                                .addComponent(jpSe, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jpSe, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbLi1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLi)
                    .addComponent(jbLi2))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbLiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLiActionPerformed
        String lo = jtNo.getText();
        String se = jpSe.getText();
        String s = se;
        MessageDigest m;
        try {

            m = MessageDigest.getInstance("MD5");
            m.update(s.getBytes(), 0, s.length());
            String smd5 = new BigInteger(1, m.digest()).toString(16);

            try {

                GenericDao gd = new GenericDao();
                List<Object> l = gd.listar(Usuarios.class);
                for (Object o : l) {
                    Usuarios us = (Usuarios) o;

                    String loc = us.getEmail_usuarios();
                    String noc = us.getNome_usuarios();
                    String sec = us.getSenha_usuarios();

                    System.out.print(noc);
                    System.out.println(lo);
                    
                    System.out.print(smd5 + " ");
                    System.out.println(sec);
                    
                    if (lo.equalsIgnoreCase(noc) && smd5.equals(sec)) {

                        System.out.println("testeeeeeeeeeee");
                        String cons = loc;
                        new Menu(cons).setVisible(true);

                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(loginUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(loginUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(loginUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchMethodException ex) {
                Logger.getLogger(loginUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(loginUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvocationTargetException ex) {
                Logger.getLogger(loginUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(loginUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jbLiActionPerformed

    private void jbLi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLi1ActionPerformed
        JOptionPane.showMessageDialog(null, "Opção ainda indisponível!", " Oops!", 0);
    }//GEN-LAST:event_jbLi1ActionPerformed

    private void jbLi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLi2ActionPerformed

        GenericDao g;
        try {

            g = new GenericDao();
            List<Object> l = g.listar(Estados.class);
            List<Object> le = g.listar(Cidades.class);
            new CadastroUsuario(l, le).setVisible(true);

        } catch (SQLException ex) {
            Logger.getLogger(loginUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(loginUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(loginUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(loginUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(loginUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(loginUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(loginUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbLi2ActionPerformed

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
            java.util.logging.Logger.getLogger(loginUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JButton jbLi;
    private javax.swing.JButton jbLi1;
    private javax.swing.JButton jbLi2;
    private javax.swing.JPasswordField jpSe;
    private javax.swing.JTextField jtNo;
    // End of variables declaration//GEN-END:variables
}
