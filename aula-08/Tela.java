
package br.com.visao;

import br.com.controle.Dados;


public class Tela extends javax.swing.JFrame {
    Dados d = new Dados();
    
    public Tela() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTaltura = new javax.swing.JTextField();
        jRM = new javax.swing.JRadioButton();
        jRF = new javax.swing.JRadioButton();
        jLmaior = new javax.swing.JLabel();
        jLmenor = new javax.swing.JLabel();
        jLmedia = new javax.swing.JLabel();
        jBcalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Digite a altura:");

        jTaltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTalturaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRM);
        jRM.setText("Masculino");
        jRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRF);
        jRF.setText("Feminino");
        jRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRFActionPerformed(evt);
            }
        });

        jLmaior.setText("Maior");

        jLmenor.setText("Menor");

        jLmedia.setText("Media");

        jBcalcular.setText("Calcular");
        jBcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBcalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLmaior)
                        .addGap(18, 18, 18)
                        .addComponent(jLmenor)
                        .addGap(18, 18, 18)
                        .addComponent(jLmedia)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRM)
                        .addGap(18, 18, 18)
                        .addComponent(jRF)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTaltura, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addGap(203, 203, 203))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTaltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRM, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRF))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcalcular)
                    .addComponent(jLmaior)
                    .addComponent(jLmenor)
                    .addComponent(jLmedia))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jBcalcularActionPerformed(java.awt.event.ActionEvent evt) {                                           
        d.setAltura(Double.valueOf(jTaltura.getText()));
        if(jRM.isSelected()){
            d.setSexo(1);
        }
        jLmedia.setText(" "+d.getMedia());
        jLmaior.setText(" "+d.getMaior());
        jLmenor.setText(" "+d.getMenor());
    }                                          

    private void jRFActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void jTalturaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jRMActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBcalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLmaior;
    private javax.swing.JLabel jLmedia;
    private javax.swing.JLabel jLmenor;
    private javax.swing.JRadioButton jRF;
    private javax.swing.JRadioButton jRM;
    private javax.swing.JTextField jTaltura;
    // End of variables declaration                   
}
