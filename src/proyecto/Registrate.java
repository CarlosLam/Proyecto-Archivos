/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author lam_m
 */
public class Registrate extends javax.swing.JFrame {

    /**
     * Creates new form Registrate
     */
    String rutaArchivo;
    public static Boolean usuario;
    public static String User;
    public Registrate(Boolean usuario, String user) {
        initComponents();
        Registrate.usuario = usuario;
        User = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        CargaFoto = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Correo = new javax.swing.JTextField();
        Confirmar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        Foto = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Telefono = new javax.swing.JFormattedTextField();
        Fecha = new javax.swing.JFormattedTextField();
        showFoto = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Nuevo usuario");

        jLabel1.setText("Nombre");

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellido");

        jLabel3.setText("Usuario");

        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });

        jLabel4.setText("Contraseña");

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PasswordKeyTyped(evt);
            }
        });

        jLabel5.setText("Fotografia");

        CargaFoto.setText("Selecciona");
        CargaFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaFotoActionPerformed(evt);
            }
        });

        jLabel6.setText("Correo");

        jLabel7.setText("Telefono");

        Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoActionPerformed(evt);
            }
        });

        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        Foto.setText("Sin seleccionar");

        jLabel9.setText("Fecha de nacimiento");

        Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TelefonoKeyTyped(evt);
            }
        });

        Fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FechaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(showFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(53, 53, 53))
                                        .addComponent(CargaFoto))
                                    .addGap(18, 18, 18)
                                    .addComponent(Foto)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                            .addComponent(Regresar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Confirmar))
                        .addComponent(jLabel4)
                        .addComponent(Password))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(Nombre)
                                .addComponent(Apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                .addComponent(Usuario))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 59, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Fecha)))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addGap(35, 35, 35)))
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(29, 29, 29)))
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Confirmar)
                        .addComponent(Regresar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CargaFoto)
                        .addComponent(Foto)))
                .addGap(30, 30, 30)
                .addComponent(showFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        //NOMBRE
                
    }//GEN-LAST:event_NombreActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // TODO add your handling code here:
         if(usuario){
            this.setVisible(false);
            new Admin(User).setVisible(true);
        }else{
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_RegresarActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        //AGREGAR USUARIOS
        //Aqui va if(){
            File u = new File("C:\\MEIA\\usuario.txt");
            File m = new File("C:\\MEIA\\Master.txt");
            BufferedReader brp = null;
            FileReader frp = null;
            String linea = null;  
            Boolean creacion = true;
            Boolean emptyOrNot = true;
            int rol = 1;
           
            try{
                
                frp = new FileReader(u);
                brp = new BufferedReader(frp);
                String username = "";
                while((linea=brp.readLine())!= null){
                    rol = 0;
                    username = linea.substring(0,linea.indexOf("|"));
                    if(username.equals(Usuario.getText())){
                        JOptionPane.showMessageDialog(rootPane, "Ya existe el usuario", "Error Message", JOptionPane.ERROR_MESSAGE);
                        creacion = false;
                    }
                }
                brp.close();
                
                frp = new FileReader(m);
                brp = new BufferedReader(frp);
                while((linea=brp.readLine())!= null){
                    rol = 0;
                    username = linea.substring(0,linea.indexOf("|"));
                    if(username.equals(Usuario.getText())){
                        JOptionPane.showMessageDialog(rootPane, "Ya existe el usuario", "Error Message", JOptionPane.ERROR_MESSAGE);
                        creacion = false;
                    }
                }
                brp.close();
                String password= Arrays.toString(Password.getPassword());
                emptyOrNot= Nombre.getText().isEmpty()&&Apellido.getText().isEmpty()&&Usuario.getText().isEmpty()&&Correo.getText().isEmpty()&&Telefono.getText().isEmpty()&&Fecha.getText().isEmpty();
                
                if(validpassword(password) > 1){
                    creacion = true;
                  
                   
                }else{
                    creacion = false;
                 
                    JOptionPane.showMessageDialog(rootPane, "Contraseña Inválida", "Error Message", JOptionPane.ERROR_MESSAGE);
                }
                if(creacion&&!emptyOrNot){
                    Escribir();
                    String pasword = getMD5(password);
                    FileWriter TextOut = new FileWriter(u, true);
                    
                    TextOut.write(Usuario.getText() + "|" + Nombre.getText()+ "|" + Apellido.getText() + "|" + pasword +"|"+ rol + "|" + Fecha.getText() + "|" + Correo.getText() +"|"+ Telefono.getText() + "|" + rutaArchivo + "|1\r\n");
                    TextOut.close();    
                    JOptionPane.showMessageDialog(rootPane, "Usuario creado");
                    if(usuario){
                        this.setVisible(false);
                        new Admin(username).setVisible(true);
                    }else{
                        this.setVisible(false);
                        new Login().setVisible(true);
                    }
                }
                else{
                     JOptionPane.showMessageDialog(rootPane, "No se pueden dejar campos vacios", "Error Message", JOptionPane.ERROR_MESSAGE);
                }
                  
            }catch(HeadlessException | IOException e){

            }
            // }else{JOptionPane.showMessageDialog(rootPane, "Contraseña de nivel bajo", "Error Message", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    private void CargaFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaFotoActionPerformed
        // Carga imagen
        JFileChooser dialogo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de Texto", "jpg");
        File ficheroImagen;
        rutaArchivo = "";
        dialogo.setFileFilter(filtro);
        int valor = dialogo.showOpenDialog(this);
        if (valor == JFileChooser.APPROVE_OPTION) {
            ficheroImagen = dialogo.getSelectedFile();
            rutaArchivo = ficheroImagen.getPath();                
            Foto.setText("Listo");
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(rutaArchivo).getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT));
            showFoto.setIcon(imageIcon);
            Path destPath = new File(("C:\\MEIA")).toPath();
	    File sourceFile = ficheroImagen;
            Path sourcePath = sourceFile.toPath();
            try {
                Files.copy(sourcePath, destPath.resolve(sourcePath.getFileName()));
            } catch (IOException ex) {
                Logger.getLogger(Registrate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_CargaFotoActionPerformed

    private void TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
          if((car<'0' || car>'9')&& Telefono.getText().length()==8 ) evt.consume();
       
    }//GEN-LAST:event_TelefonoKeyTyped

    private void FechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FechaKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar(); 
        if((car<'0' || car>'9')&&(car<'/'||car>'/') && Fecha.getText().length()==10) evt.consume();
      
    }//GEN-LAST:event_FechaKeyTyped

    private void PasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyTyped
        // TODO add your handling code here:
      
 
     
    }//GEN-LAST:event_PasswordKeyTyped

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
            java.util.logging.Logger.getLogger(Registrate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrate(usuario, User).setVisible(true);
            }
        });
    }
    private void Escribir(){
        try{
            File v = new File("C:\\MEIA\\Master.txt");
            FileReader frpp = new FileReader(v);
            BufferedReader brpp = new BufferedReader(frpp);
            
            File p = new File("C:\\MEIA\\desc_Master.txt");
            FileReader fw = new FileReader(p);
            BufferedReader bw = new BufferedReader(fw);
            
            File w = new File("C:\\MEIA\\usuario.txt");
            FileReader fr = new FileReader(w);
            BufferedReader br = new BufferedReader(fr);
            
            File u = new File("C:\\MEIA\\desc_usuario.txt");
            FileReader frp = new FileReader(u);
            BufferedReader brp = new BufferedReader(frp);
            
            
            String linea = brp.readLine(); 
            String aux = linea;
            if(linea == null){//Creamos el archivo
                FileWriter TextOut = new FileWriter(u, true);
                TextOut.write("BitacoraUsuarios|" + LocalDateTime.now()+ "|" + Usuario.getText()+ "|" + LocalDateTime.now() + "|"+Usuario.getText() +  "|1|1|0|7"+"\r\n");
                TextOut.close();
                
            }else{//Modificamos la informacion contenida xdxd
                
                String nombreS = linea.substring(0,linea.length());
                String fecha = nombreS.substring(nombreS.indexOf("|")+1,nombreS.length());
                String usrC = fecha.substring(fecha.indexOf("|")+1,fecha.length());
                String fechaM = usrC.substring(usrC.indexOf("|")+1,usrC.length());
                String usrM = fechaM.substring(fechaM.indexOf("|")+1,fechaM.length());
                String nReg = usrM.substring(usrM.indexOf("|")+1,usrM.length());
                String regA = nReg.substring(nReg.indexOf("|")+1,nReg.length());
                String regI = regA.substring(regA.indexOf("|")+1,regA.length());
                String maxO = regI.substring(regI.indexOf("|")+1,regI.length());
                
                nombreS = nombreS.substring(0,nombreS.indexOf("|")+1);
                fecha = fecha.substring(0,fecha.indexOf("|")+1);
                usrC = usrC.substring(0,usrC.indexOf("|")+1);
                fechaM = fechaM.substring(0,fechaM.indexOf("|"));
                usrM = usrM.substring(0,usrM.indexOf("|"));
                nReg = nReg.substring(0,nReg.indexOf("|"));
                regA = regA.substring(0,regA.indexOf("|"));
                regI = regI.substring(0,regI.indexOf("|"));
                maxO = maxO.substring(0,maxO.length());
                
                int Num = Integer.valueOf(nReg);
                Num+= 1;
                int NumA = Integer.valueOf(regA);
                NumA+= 1;
                int Max = Integer.valueOf(maxO);
                
                if(Num > Max){//Se debe reoranizar todo
                    String datos = "";
                    while((linea=br.readLine())!= null){
                        datos = datos + linea + "\r\n";
                    }
                    br.close();
                    
                    while((linea=brpp.readLine())!= null){
                        datos = datos + linea + "\r\n";
                    }
                    brpp.close(); 
                    
                    //Ordenar los datos.
                    String[] orden = datos.split("\\n");
                    Arrays.sort(orden);
                    
                    //Limpiamos los archivos
                    FileWriter TextOut = new FileWriter(w, false);//usuarios
                    TextOut.write("");
                    TextOut.close();
                    
                    TextOut = new FileWriter(v, false);//master
                    TextOut.write("");
                    TextOut.close();
                    
                    TextOut = new FileWriter(v, true);//master
                    for (int i = 0; i < orden.length; i++) {
                        TextOut.write(orden[i] + "\r\n");
                    }
                    TextOut.close();
                    
                    String nombre = aux;
                    String Fecha = nombre.substring(nombre.indexOf("|")+1,nombre.length());
                    String usr = Fecha.substring(Fecha.indexOf("|")+1, Fecha.length());
                    String reg = aux.substring(aux.lastIndexOf("|"),aux.length());

                    nombre = nombre.substring(0,nombre.indexOf("|")+1);
                    Fecha = Fecha.substring(0,Fecha.indexOf("|")+1);
                    usr = usr.substring(0,usr.indexOf("|")+1);

                    TextOut = new FileWriter(u, false);//desc_usurio
                    TextOut.write(nombre + Fecha + usr + LocalDateTime.now() + User + "|1|1|0|7");
                    TextOut.close();
                    
                    linea = bw.readLine();  
                    if(linea == null){//Debemos crear desc_master
                        TextOut = new FileWriter(p, true);//desc_master
                        TextOut.write("DescripcionMaster|" + LocalDateTime.now() + "|" + User + "|" + LocalDateTime.now() + "|" + User + "|" + orden.length);
                        TextOut.close();
                    }else{//Se debe sustituir
                        int noReg = Integer.valueOf(orden.length) + 1;
                        TextOut = new FileWriter(p, false);//desc_master
                        TextOut.write(nombre + Fecha + usr + LocalDateTime.now() + User + "|" + noReg);
                        TextOut.close();
                    }
                }else{//Solamente se actualiza el valor
                    FileWriter TextOut = new FileWriter(u, false);
                    TextOut.write(nombreS + fecha + usrC + LocalDateTime.now() + "|"+Usuario.getText() + "|" + Num + "|" + NumA + "|" + regI + "|"+maxO);
                    TextOut.close();
                }
            }
        }catch(IOException e){}
    }
    /**
     * @param args the command line arguments
     */
    public static String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);

            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
     private int  validpassword (String pass)
  {
      int total = pass.length()-1;
  
     if(total >= 6)
      {
          if(total>=8)
          {
              if(total <=6)
              {
                  if(numerosIngresados(pass)<2 && mayusculasIngresadas(pass)<1)
                  {
                      
                     return 5;
                  }
                  else 
                  {
                      return 4; 
                  }
              }
              else 
              {
                  if (numerosIngresados(pass)<3 && mayusculasIngresadas(pass)<2&&simbolosIngresados(pass)<1)
                  {
                      return 9;
                  }
                  else 
                  {
                      return 8;
                  }
              }
          }
          else
          {
              return 1;
            
          }       

      }
      else 
      {
            
          return 0;
      }
      
      
  }
  
   public int numerosIngresados(String s )         
    { 
        int total =0;
        for (int i = 0; i < s.length()-1; i++) {
            
        if(Character.isDigit(s.charAt(i)))
        {
            total++;
        }
        }
        return total;
    }
   public int mayusculasIngresadas(String s)
    {
        int total = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if (Character.isUpperCase(s.charAt(i)))
            {
                total++;
            }
            
        }
                return total;
    }         
   public int simbolosIngresados(String s)
    {
        int total = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if(!(Character.isLetter(s.charAt(i)))&&!(Character.isDigit(i)))
            {
                total++;
            }
            }
        return total;
                    
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JButton CargaFoto;
    private javax.swing.JButton Confirmar;
    private javax.swing.JTextField Correo;
    private javax.swing.JFormattedTextField Fecha;
    private javax.swing.JLabel Foto;
    private javax.swing.JTextField Nombre;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton Regresar;
    private javax.swing.JFormattedTextField Telefono;
    private javax.swing.JTextField Usuario;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JLabel showFoto;
    // End of variables declaration//GEN-END:variables
}
