
package echipamenteit;


public class Sortare extends javax.swing.JFrame {
   Object n = "Boxe",// 2 obiecte care sa retina ce a selectat userul
          m = "Preț crescător"; //le-am intializat cu primul item care apare 
  
    public Sortare() {
        initComponents();
        setSize(480,500);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        boxSortare = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        boxAlege = new javax.swing.JComboBox<>();
        butonOke = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        jLabel1.setText("Alege produsul: ");

        boxSortare.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        boxSortare.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preț crescător", "Preț descrescător", "Alfabetic A-Z", "Alfabetic Z-A", "" }));
        boxSortare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSortareActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        jLabel2.setText("Sortare:");

        boxAlege.setBackground(new java.awt.Color(153, 255, 102));
        boxAlege.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        boxAlege.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boxe", "Desktop", "Ecran", "Laptop", "Tabletă", "Tabletă grafică", "Tastatură", "Videoproiector", "Webcam", " ", " " }));
        boxAlege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxAlegeActionPerformed(evt);
            }
        });

        butonOke.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        butonOke.setText("OK");
        butonOke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonOkeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boxSortare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(boxAlege, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(butonOke, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxAlege, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(boxSortare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126)
                .addComponent(butonOke, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void butonOkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonOkeActionPerformed
        Metode metode = new Metode(); 
        FereastraAfisare buton = new FereastraAfisare();
        buton.setVisible(true);
        buton.setTitle(n.toString());
        if(n == "Boxe"){
            if(m == "Preț crescător")//pret crescator deci a =1   si b-0 ( sortare dupa pret)
                buton.textAfisare.append(metode.sortareBoxe(1,0));
            if(m == "Preț descrescător")
                buton.textAfisare.append(metode.sortareBoxe(0,0));
            if(m == "Alfabetic A-Z")
                buton.textAfisare.append(metode.sortareBoxe(1,1));
            if(m == "Alfabetic Z-A")
                buton.textAfisare.append(metode.sortareBoxe(0,1));   
        }
        if(n == "Ecran"){
            if(m == "Preț crescător")
                buton.textAfisare.append(metode.sortareEcran(1,0));
            if(m == "Preț descrescător")
                buton.textAfisare.append(metode.sortareEcran(0,0));
            if(m == "Alfabetic A-Z")
                buton.textAfisare.append(metode.sortareEcran(1,1));
            if(m == "Alfabetic Z-A")
                buton.textAfisare.append(metode.sortareEcran(0,1)); 
        }
        if(n == "Videoproiector"){
             if(m == "Preț crescător")
                buton.textAfisare.append(metode.sortareVideoProiector(1,0));
            if(m == "Preț descrescător")
                buton.textAfisare.append(metode.sortareVideoProiector(0,0));
            if(m == "Alfabetic A-Z")
                buton.textAfisare.append(metode.sortareVideoProiector(1,1));
            if(m == "Alfabetic Z-A")
                buton.textAfisare.append(metode.sortareVideoProiector(0,1)); 
        }
        if(n == "Desktop"){
            if(m == "Preț crescător")
                buton.textAfisare.append(metode.sortareDesktop(1,0));
            if(m == "Preț descrescător")
                buton.textAfisare.append(metode.sortareDesktop(0,0));
            if(m == "Alfabetic A-Z")
                buton.textAfisare.append(metode.sortareDesktop(1,1));
            if(m == "Alfabetic Z-A")
                buton.textAfisare.append(metode.sortareDesktop(0,1)); 
        }
        
        if(n == "Laptop"){
            if(m == "Preț crescător")
                buton.textAfisare.append(metode.sortareLaptop(1,0));
            if(m == "Preț descrescător")
                buton.textAfisare.append(metode.sortareLaptop(0,0));
            if(m == "Alfabetic A-Z")
                buton.textAfisare.append(metode.sortareLaptop(1,1));
            if(m == "Alfabetic Z-A")
                buton.textAfisare.append(metode.sortareLaptop(0,1)); 
        }
        if(n == "Tabletă"){
            if(m == "Preț crescător")
                buton.textAfisare.append(metode.sortareTableta(1,0));
            if(m == "Preț descrescător")
                buton.textAfisare.append(metode.sortareTableta(0,0));
            if(m == "Alfabetic A-Z")
                buton.textAfisare.append(metode.sortareTableta(1,1));
            if(m == "Alfabetic Z-A")
                buton.textAfisare.append(metode.sortareTableta(0,1)); 
        }
        if(n == "Tastatură"){
            if(m == "Preț crescător")
                buton.textAfisare.append(metode.sortareTastatura(1,0));
            if(m == "Preț descrescător")
                buton.textAfisare.append(metode.sortareTastatura(0,0));
            if(m == "Alfabetic A-Z")
                buton.textAfisare.append(metode.sortareTastatura(1,1));
            if(m == "Alfabetic Z-A")
                buton.textAfisare.append(metode.sortareTastatura(0,1)); 
        }
        if(n == "Webcam"){
            if(m == "Preț crescător")
                buton.textAfisare.append(metode.sortareWebcam(1,0));
            if(m == "Pre descrescător")
                buton.textAfisare.append(metode.sortareWebcam(0,0));
            if(m == "Alfabetic A-Z")
                buton.textAfisare.append(metode.sortareWebcam(1,1));
            if(m == "Alfabetic Z-A")
                buton.textAfisare.append(metode.sortareWebcam(0,1));
        }
        if(n == "Tableta Grafică"){
            if(m == "Preț crescător")
                buton.textAfisare.append(metode.sortareTabletaGrafica(1,0));
            if(m == "Preț descrescător")
                buton.textAfisare.append(metode.sortareTabletaGrafica(0,0));
            if(m == "Alfabetic A-Z")
                buton.textAfisare.append(metode.sortareTabletaGrafica(1,1));
            if(m == "Alfabetic Z-A")
                buton.textAfisare.append(metode.sortareTabletaGrafica(0,1));
        }
    }//GEN-LAST:event_butonOkeActionPerformed

    private void boxAlegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxAlegeActionPerformed
        n = boxAlege.getSelectedItem();
     
    }//GEN-LAST:event_boxAlegeActionPerformed

    private void boxSortareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSortareActionPerformed
        m = boxSortare.getSelectedItem();
    }//GEN-LAST:event_boxSortareActionPerformed

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
            java.util.logging.Logger.getLogger(Sortare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sortare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sortare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sortare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sortare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxAlege;
    private javax.swing.JComboBox<String> boxSortare;
    private javax.swing.JButton butonOke;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
