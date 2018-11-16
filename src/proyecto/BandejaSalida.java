/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.DefaultListModel;

/**
 *
 * @author Carlos Lam
 */
public class BandejaSalida extends javax.swing.JFrame {

    /**
     * Creates new form BandejaSalida
     */
    static String usr;
    DefaultListModel model;
    public BandejaSalida(String username) {
        initComponents();
        usr = username;
        
        model = new DefaultListModel();
        
        correos.setModel(model);
        File co = new File("C:\\MEIA\\Correo.txt");
        
        try{
            FileReader frp = new FileReader(co);
            BufferedReader brp = new BufferedReader(frp);
            String linea;
            while((linea=brp.readLine())!= null){
                String[] info = linea.split("\\|");
                if (info[3].equals(usr)) {
                    String nuevaLinea = info[2] + " - " + info[5] + " - " + info[6];
                    model.addElement(nuevaLinea);
                }
            }
            brp.close();
        }catch(Exception e){}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Regresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        correos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        Busqueda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        correos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(correos);

        jLabel1.setText("Receptor - Asunto - Mensaje");

        Busqueda.setText("Busqueda");
        Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(Busqueda)
                .addGap(18, 18, 18)
                .addComponent(Regresar)
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regresar)
                    .addComponent(Busqueda))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Usuario(usr).setVisible(true);
    }//GEN-LAST:event_RegresarActionPerformed

    private void BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaActionPerformed

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
            java.util.logging.Logger.getLogger(BandejaSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BandejaSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BandejaSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BandejaSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BandejaSalida(usr).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Busqueda;
    private javax.swing.JButton Regresar;
    private javax.swing.JList<String> correos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
