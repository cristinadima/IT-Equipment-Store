
package echipamenteit;


public class Cautare extends javax.swing.JFrame {

    Object n= "Tastatură", //am creat 3 obiecte si le-am itializat cu prima valoare care apare la combo box
           m= "Desktop",
           o= "Boxe";
    public Cautare() {
        initComponents();
       setSize(480,500);
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        boxDispozitiveInput = new javax.swing.JComboBox<>();
        butonInput = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        boxDispozitiveOutput = new javax.swing.JComboBox<>();
        boxSisteme = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        butonSisteme = new javax.swing.JButton();
        butonOutput = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);
        setSize(new java.awt.Dimension(480, 480));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel2.setText("Dispozitive Input");

        boxDispozitiveInput.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        boxDispozitiveInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tastatură", "Tabletă Grafică", "Webcam" }));
        boxDispozitiveInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxDispozitiveInputActionPerformed(evt);
            }
        });

        butonInput.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        butonInput.setText("Caută");
        butonInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonInputActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Dispozitive Output");

        boxDispozitiveOutput.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        boxDispozitiveOutput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boxe", "Ecran", "Videoproiector" }));
        boxDispozitiveOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxDispozitiveOutputActionPerformed(evt);
            }
        });

        boxSisteme.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        boxSisteme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desktop", "Laptop", "Tabletă" }));
        boxSisteme.setMinimumSize(new java.awt.Dimension(125, 25));
        boxSisteme.setPreferredSize(new java.awt.Dimension(125, 25));
        boxSisteme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSistemeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel1.setText("Sisteme");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        butonSisteme.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        butonSisteme.setText("Caută");
        butonSisteme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonSistemeActionPerformed(evt);
            }
        });

        butonOutput.setFont(new java.awt.Font("Cambria", 0, 15)); // NOI18N
        butonOutput.setText("Caută");
        butonOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonOutputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxDispozitiveInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxSisteme, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxDispozitiveOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butonSisteme, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butonInput, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butonOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel3)))
                .addGap(0, 133, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butonInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxDispozitiveInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxSisteme, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butonSisteme, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxDispozitiveOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butonOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boxDispozitiveInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxDispozitiveInputActionPerformed
          n=boxDispozitiveInput.getSelectedItem(); // aici preia ce a selectat userul la dispozitiveinput
    }//GEN-LAST:event_boxDispozitiveInputActionPerformed

    private void butonInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonInputActionPerformed
        Metode metode = new Metode(); //cream o instanta de tip metode
        FereastraAfisare buton = new FereastraAfisare(); //una de tip fereastraafisare
        buton.setVisible(true); //facem fereastra de afisare vizibila
        buton.setTitle(n.toString()); // ii setam titlu in functie de ce a ales user-ul
        if(n == "Tastatură") // daca ce a ales userul este egal cu tastatura actualizam textArea-ul folosind metoda de afisare
            buton.textAfisare.append(""+metode.afisareTastatura());
        if(n == "Webcam") 
            buton.textAfisare.append(metode.afisareWebcam());
        if(n == "Tabletă Grafică") 
            buton.textAfisare.append(metode.afisareTabletaGrafica());
          
          
        
    }//GEN-LAST:event_butonInputActionPerformed

    private void boxSistemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSistemeActionPerformed
        m=boxSisteme.getSelectedItem();
    }//GEN-LAST:event_boxSistemeActionPerformed

    private void butonSistemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonSistemeActionPerformed
        Metode metode = new Metode();
        FereastraAfisare buton = new FereastraAfisare();
        buton.setVisible(true);
        buton.setTitle(m.toString());
        if(m == "Desktop")
            buton.textAfisare.append(metode.afisareDesktop());
 
        if(m == "Laptop")
            buton.textAfisare.append(metode.afisareLaptop());
        if(m == "Tabletă")
            buton.textAfisare.append(metode.afisareTableta());
    }//GEN-LAST:event_butonSistemeActionPerformed

    private void boxDispozitiveOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxDispozitiveOutputActionPerformed
        o=boxDispozitiveOutput.getSelectedItem();
    }//GEN-LAST:event_boxDispozitiveOutputActionPerformed

    private void butonOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonOutputActionPerformed
        Metode metode = new Metode();
        FereastraAfisare buton = new FereastraAfisare();
        buton.setVisible(true);
        buton.setTitle(o.toString());
        if(o == "Boxe")
            buton.textAfisare.append(metode.afisareBoxe());
        if(o == "Ecran")
            buton.textAfisare.append(metode.afisareEcran());
        if(o ==  "Videoproiector")
            buton.textAfisare.append(metode.afisareVideoProiector());
    }//GEN-LAST:event_butonOutputActionPerformed

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
            java.util.logging.Logger.getLogger(Cautare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cautare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cautare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cautare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cautare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxDispozitiveInput;
    private javax.swing.JComboBox<String> boxDispozitiveOutput;
    private javax.swing.JComboBox<String> boxSisteme;
    private javax.swing.JButton butonInput;
    private javax.swing.JButton butonOutput;
    private javax.swing.JButton butonSisteme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
