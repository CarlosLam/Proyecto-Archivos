/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author lam_m
 */
public class ModificarDatosLista extends javax.swing.JFrame {

    /**
     * Creates new form ModificarDatosLista
     */
    static String nL;
    static String usr;
    public ModificarDatosLista(String usu, String noL) {
        initComponents();
        usr = usu;
        nL = noL;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Confirmar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        NombreL = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nuevo nombre de la lista");

        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        Regresar.setText("Regresar");
        Regresar.setActionCommand("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        jLabel2.setText("Descripcion");

        Descripcion.setColumns(20);
        Descripcion.setRows(5);
        jScrollPane1.setViewportView(Descripcion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(NombreL)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(Confirmar)
                        .addGap(18, 18, 18)
                        .addComponent(Regresar)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NombreL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirmar)
                    .addComponent(Regresar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ModificarLista(usr).setVisible(true);
    }//GEN-LAST:event_RegresarActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        // TODO add your handling code here:
        if(NombreL.getText().length() > 0 && Descripcion.getText().length() > 0){
            File u = new File("C:\\MEIA\\lista.txt");
            File m = new File("C:\\MEIA\\Master_lista.txt");
            File ilu = new File("C:\\MEIA\\Indice_ListaUsuario.txt");
            File lu = new File("C:\\MEIA\\Lista_usuario.txt");
            
            
            BufferedReader brp = null;
            FileReader frp = null;
            
            try{
                frp = new FileReader(u);
                brp = new BufferedReader(frp);
                String nombreL = "";
                String linea;
                Boolean existente = false;
                Boolean remplazarL = false;
                
                while((linea=brp.readLine())!= null){
                    nombreL = linea.substring(0,linea.indexOf("|"));
                    if(nombreL.equals(NombreL.getText())){
                        String Usuario = linea.substring((linea.indexOf("|") +1), linea.length());
                        Usuario = Usuario.substring(0,Usuario.indexOf("|"));
                        if (Usuario.equals(usr)) {
                            JOptionPane.showMessageDialog(rootPane, "Ya existe una lista con ese nombre", "Error Message", JOptionPane.ERROR_MESSAGE);
                            existente = true;
                        }
                    }
                }
                brp.close();

                frp = new FileReader(m);
                brp = new BufferedReader(frp);
                while((linea=brp.readLine())!= null){
                    nombreL = linea.substring(0,linea.indexOf("|"));
                    if(nombreL.equals(NombreL.getText())){
                        String Usuario = linea.substring((linea.indexOf("|") +1), linea.length());
                        Usuario = Usuario.substring(0,Usuario.indexOf("|"));
                        if (Usuario.equals(usr)) {
                            JOptionPane.showMessageDialog(rootPane, "Ya existe una lista con ese nombre", "Error Message", JOptionPane.ERROR_MESSAGE);
                            existente = true;
                        }
                    }
                }
                brp.close();
                
                if(existente == false){
                    frp = new FileReader(u);
                    brp = new BufferedReader(frp);
                    List datos = new ArrayList<String>();
                    
                    while((linea=brp.readLine())!= null){
                        nombreL = linea.substring(0,linea.indexOf("|"));
                        String Usuario = linea.substring((linea.indexOf("|") +1), linea.length());
                        String Des = Usuario.substring(Usuario.indexOf("|") + 1);
                        String noU = Des.substring(Des.indexOf("|") + 1);
                        String fechaC = noU.substring(noU.indexOf("|") + 1);
                        noU = noU.substring(0,noU.indexOf("|"));
                        

                        Usuario = Usuario.substring(0,Usuario.indexOf("|"));

                        if(nombreL.equals(nL) && Usuario.equals(usr)){
                            //Esta es la lista que debemos modificar
                            String nuevaLinea = NombreL.getText() + "|" + usr + "|" + Descripcion.getText() + "|" + noU + "|" + fechaC;
                            remplazarL = true;
                            datos.add(nuevaLinea);
                        }
                        else{
                            datos.add(linea);
                        }
                    }
                    
                    if (remplazarL) {
                        FileWriter flw = new FileWriter(u,false);
                        for (int i = 0; i < datos.size(); i++) {
                            flw.write(datos.get(i).toString() + "\r\n");
                        }
                        flw.close();
                        JOptionPane.showMessageDialog(rootPane, "Lista modificada");
                        this.setVisible(false);
                        new ModificarLista(usr).setVisible(true);
                        //Aquí debe ir el desc_lista
                        
                    }else{
                        datos = new ArrayList<String>();
                        frp = new FileReader(m);
                        brp = new BufferedReader(frp);
                        
                        while((linea=brp.readLine())!= null){
                            nombreL = linea.substring(0,linea.indexOf("|"));
                            String Usuario = linea.substring((linea.indexOf("|") +1), linea.length());
                            String Des = Usuario.substring(Usuario.indexOf("|") + 1);
                            String noU = Des.substring(Des.indexOf("|") + 1);
                            String fechaC = noU.substring(noU.indexOf("|") + 1);
                            noU = noU.substring(0,noU.indexOf("|"));


                            Usuario = Usuario.substring(0,Usuario.indexOf("|"));

                            if(nombreL.equals(nL) && Usuario.equals(usr)){
                                //Esta es la lista que debemos modificar
                                String nuevaLinea = NombreL.getText() + "|" + usr + "|" + Descripcion.getText() + "|" + noU + "|" + fechaC;
                                remplazarL = true;
                                datos.add(nuevaLinea);
                            }
                            else{
                                datos.add(linea);
                            }
                        }
                        FileWriter flw = new FileWriter(m,false);
                        Collections.sort(datos);
                        for (int i = 0; i < datos.size(); i++) {
                            flw.write(datos.get(i).toString() + "\r\n");
                        }
                        flw.close();
                        JOptionPane.showMessageDialog(rootPane, "Lista modificada");
                        this.setVisible(false);
                        new ModificarLista(usr).setVisible(true);
                        //Aqui debe ir el desc_masterlista
                    }
                    
                    //Buscamos y modificamos en Indice lista usuario
                    frp = new FileReader(ilu);
                    brp = new BufferedReader(frp);
                    List nuevosDatos = new ArrayList<>();
                    while((linea=brp.readLine())!= null){
                        String[] dato = linea.split("\\|");//2 Lista y 3 usuario
                        if (nL.equals(dato[2]) && usr.equals(dato[3])) {
                            String aux = dato[0] + "|" + dato[1] + "|" + NombreL.getText() + "|" + dato[3] + "|" + dato[4] + "|" + dato[5] + "|" + dato[6];
                            nuevosDatos.add(aux);
                        }else{
                            nuevosDatos.add(linea);
                        }
                    }
                    brp.close();
                     
                    FileWriter TextOut = new FileWriter(ilu, false);
                    for (int i = 0; i < nuevosDatos.size(); i++) {
                        TextOut.write(nuevosDatos.get(i) + "\r\n");
                    }
                    TextOut.close();
                    
                    //Buscamos y modificamos en lista usuario
                    nuevosDatos = new ArrayList<>();
                    frp = new FileReader(lu);
                    brp = new BufferedReader(frp);
                    while((linea=brp.readLine())!= null){
                        String[] dato = linea.split("\\|");//0 Lista y 1 usuario
                        if (nL.equals(dato[0]) && usr.equals(dato[1])) {
                            String aux = NombreL.getText() + "|" + dato[1] + "|" + dato[2] + "|" + dato[3] + "|" + dato[4];
                            nuevosDatos.add(aux);
                        }else{
                            nuevosDatos.add(linea);
                        }
                    }
                    brp.close();
                    TextOut = new FileWriter(lu, false);
                    for (int i = 0; i < nuevosDatos.size(); i++) {
                        TextOut.write(nuevosDatos.get(i) + "\r\n");
                    }
                    TextOut.close();
                }
            }catch(Exception e){}
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "No se pueden dejar campos vacios", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarDatosLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarDatosLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarDatosLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarDatosLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarDatosLista(usr,nL).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirmar;
    private javax.swing.JTextArea Descripcion;
    private javax.swing.JTextField NombreL;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
