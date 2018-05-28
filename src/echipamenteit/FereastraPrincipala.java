
package echipamenteit;


public class FereastraPrincipala extends javax.swing.JFrame {

   
    public FereastraPrincipala() {
        initComponents();
        setSize(480,500);
        //getContentPane().setBackground(Color.GREEN); 
     
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        butonVizualizare = new javax.swing.JButton();
        butonCautare = new javax.swing.JButton();
        butonCautareAvansata = new javax.swing.JButton();
        butonSortare = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 255, 0));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Echipamente IT");

        butonVizualizare.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        butonVizualizare.setText("Vizualizare");
        butonVizualizare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonVizualizareActionPerformed(evt);
            }
        });

        butonCautare.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        butonCautare.setText("Căutare");
        butonCautare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonCautareActionPerformed(evt);
            }
        });

        butonCautareAvansata.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        butonCautareAvansata.setText("Căutare avansată");
        butonCautareAvansata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonCautareAvansataActionPerformed(evt);
            }
        });

        butonSortare.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        butonSortare.setText("Sortare");
        butonSortare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonSortareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(butonVizualizare, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(butonCautare, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(butonCautareAvansata, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(butonSortare, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(butonVizualizare, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(butonCautare, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(butonCautareAvansata, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(butonSortare, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(496, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void butonCautareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonCautareActionPerformed
        Cautare buton = new Cautare();
        buton.setVisible(true);
    }//GEN-LAST:event_butonCautareActionPerformed

    private void butonVizualizareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonVizualizareActionPerformed
        FereastraAfisare buton = new FereastraAfisare(); //creezi un obiect de tip FereastraAfisare
        Metode metode = new Metode(); // Cream un obiect de tip metode
        buton.setVisible(true); // facem fereastraafisare vizibila
        buton.textAfisare.append(metode.afisareLaptop() +"\n \n \n"+metode.afisareDesktop()+"\n \n \n"+metode.afisareTableta()+"\n \n \n"
                                +metode.afisareTastatura()+"\n \n \n"+metode.afisareTabletaGrafica()
                                + metode.afisareWebcam() +"\n \n \n"+ metode.afisareVideoProiector()+"\n \n \n"+metode.afisareEcran()
                                +"\n \n \n"+metode.afisareBoxe());
        //textAFisare este numele textArea-ului iar append este o functie prin care umplem textArea cu informatii
        //informatiile in cazul nostru sunt date prin apelarea functiilor din fisierul metode de asta avem metode.afisareLaptop etc
        
        //ca sa folosesti o functie din alt fisier trebuie sa creezi un obiect(o instanta) de tipul aceluii fisier(clase)
     
        
    }//GEN-LAST:event_butonVizualizareActionPerformed

    private void butonCautareAvansataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonCautareAvansataActionPerformed
       CautareAvansata buton = new CautareAvansata();
       buton.setVisible(true); //cream o instanta de tip CautareAvansata si il facem vizibil
       
    }//GEN-LAST:event_butonCautareAvansataActionPerformed

    private void butonSortareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonSortareActionPerformed
        Sortare buton = new Sortare(); 
        buton.setVisible(true);
        ;
    }//GEN-LAST:event_butonSortareActionPerformed

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
            java.util.logging.Logger.getLogger(FereastraPrincipala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FereastraPrincipala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FereastraPrincipala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FereastraPrincipala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FereastraPrincipala().setVisible(true); 
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butonCautare;
    private javax.swing.JButton butonCautareAvansata;
    private javax.swing.JButton butonSortare;
    private javax.swing.JButton butonVizualizare;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

