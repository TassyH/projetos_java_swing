
import java.awt.event.ActionListener;
import javax.swing.SpringLayout;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author tassy.7214
 */
public class MatriculaDeAluno extends javax.swing.JFrame {

    /**
     * Creates new form MatriculaDeAluno
     */
    public MatriculaDeAluno() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        comboPolo.addItem("-- Selecione --");
        comboPolo.addItem("Senac Centro");
        comboPolo.addItem("Faculdade Senac Portão");
        
        gpRadio.add(radioCursoFacul);
        gpRadio.add(radioCursoLivre);
        gpRadio.add(radioCursoTecnico);



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gpRadio = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        radioCursoLivre = new javax.swing.JRadioButton();
        radioCursoTecnico = new javax.swing.JRadioButton();
        radioCursoFacul = new javax.swing.JRadioButton();
        checkManha = new javax.swing.JCheckBox();
        checkTarde = new javax.swing.JCheckBox();
        checkNoite = new javax.swing.JCheckBox();
        btnEnviarMatricula = new javax.swing.JButton();
        comboPolo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        txtMsgEnvioForm = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        txtTurno = new javax.swing.JLabel();
        txtCurso = new javax.swing.JLabel();
        txtPolo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("SOLICITAÇÃO DE MATRICULA");

        radioCursoLivre.setText("Livre");

        radioCursoTecnico.setText("Curso tecnico");

        radioCursoFacul.setText("Tecnólogo");
        radioCursoFacul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCursoFaculActionPerformed(evt);
            }
        });

        checkManha.setText("Manhã");
        checkManha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkManhaActionPerformed(evt);
            }
        });

        checkTarde.setText("Tarde");

        checkNoite.setText("Noite");

        btnEnviarMatricula.setText("Enviar");
        btnEnviarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarMatriculaActionPerformed(evt);
            }
        });

        comboPolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPoloActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Selecione o polo que deseja");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Selecione a disponibilidade do período");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Selecione a forma de curso");

        jLabel5.setText("Nome:");

        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("FORMULARIO ENVIADO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(checkManha)
                                        .addGap(27, 27, 27)
                                        .addComponent(checkTarde)
                                        .addGap(47, 47, 47)
                                        .addComponent(checkNoite)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnEnviarMatricula)
                                            .addComponent(comboPolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(105, 105, 105))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(29, 29, 29))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(49, 49, 49))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(radioCursoLivre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioCursoTecnico)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioCursoFacul)
                                        .addGap(11, 11, 11))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(inputNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(70, 70, 70)
                        .addComponent(txtMsgEnvioForm)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPolo)
                            .addComponent(txtCurso)
                            .addComponent(txtTurno)
                            .addComponent(txtNome))
                        .addGap(304, 304, 304))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(txtMsgEnvioForm))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioCursoLivre)
                            .addComponent(radioCursoTecnico)
                            .addComponent(radioCursoFacul))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkManha)
                            .addComponent(checkTarde)
                            .addComponent(checkNoite))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(comboPolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEnviarMatricula)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel7)))
                .addGap(27, 27, 27)
                .addComponent(txtNome)
                .addGap(18, 18, 18)
                .addComponent(txtTurno)
                .addGap(24, 24, 24)
                .addComponent(txtCurso)
                .addGap(18, 18, 18)
                .addComponent(txtPolo)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioCursoFaculActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCursoFaculActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioCursoFaculActionPerformed

    private void checkManhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkManhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkManhaActionPerformed

    private void inputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeActionPerformed

    private void comboPoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPoloActionPerformed
        
    }//GEN-LAST:event_comboPoloActionPerformed

    private void btnEnviarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMatriculaActionPerformed
        
        String nome = inputNome.getText();
        
        if(checkManha.isSelected()){
            String turnoM = checkManha.getText();
            txtTurno.setText("Turno: "+turnoM);

        }
        if(checkTarde.isSelected()){
            String turnoT = checkTarde.getText();
            txtTurno.setText("Turno: "+turnoT);

        }
        if(checkNoite.isSelected()){
            String turnoN = checkNoite.getText();
            txtTurno.setText("Turno: "+turnoN);

        }
        if(checkNoite.isSelected() && checkManha.isSelected() && checkTarde.isSelected() ){
            String turnoN = checkNoite.getText();
            String turnoT = checkTarde.getText();
            String turnoM = checkManha.getText();
            
            txtTurno.setText("TURNO: "+turnoM+", "+turnoT+", "+turnoN);
        }else{
            txtTurno.setText("Turno nao selecionado");
        
        }
        
        txtMsgEnvioForm.setText("Solicitação de matrícula enviada com sucesso!!!");
        txtNome.setText("NOME: "+nome);
        
        String curso ;
        
        if(radioCursoLivre.isSelected()){
            curso = radioCursoLivre.getText();
            txtCurso.setText("CURSO: "+curso);
        } else if(radioCursoTecnico.isSelected()){
            curso = radioCursoTecnico.getText();
            txtCurso.setText("CURSO: "+curso);
        }else if(radioCursoFacul.isSelected()){
            curso = radioCursoFacul.getText();
            txtCurso.setText("CURSO: "+curso);
        }
        
       
        
        String poloSelec = comboPolo.getSelectedItem().toString();
        txtPolo.setText("POLO: "+poloSelec);
       
            
      
        
       
        
    }//GEN-LAST:event_btnEnviarMatriculaActionPerformed

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
            java.util.logging.Logger.getLogger(MatriculaDeAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatriculaDeAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatriculaDeAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatriculaDeAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatriculaDeAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarMatricula;
    private javax.swing.JCheckBox checkManha;
    private javax.swing.JCheckBox checkNoite;
    private javax.swing.JCheckBox checkTarde;
    private javax.swing.JComboBox<String> comboPolo;
    private javax.swing.ButtonGroup gpRadio;
    private javax.swing.JTextField inputNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton radioCursoFacul;
    private javax.swing.JRadioButton radioCursoLivre;
    private javax.swing.JRadioButton radioCursoTecnico;
    private javax.swing.JLabel txtCurso;
    private javax.swing.JLabel txtMsgEnvioForm;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtPolo;
    private javax.swing.JLabel txtTurno;
    // End of variables declaration//GEN-END:variables
}
