/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Listener extends Thread {
    private Connection Conexion;
    private final org.postgresql.PGConnection pgconn;
    private String id;
    private String GrupoReceptor;
    private String GrupoEmisor;
    private String Receptor;
    private String Emisor;
    private String Asunto;
    private String Mensaje;
    private Notificacion Not;  

    Listener(Connection conn) throws SQLException {
        this.Conexion = conn;
        this.pgconn = (org.postgresql.PGConnection)conn;
        Statement stmt = conn.createStatement();
        stmt.execute("LISTEN q_event");
        stmt.close();
    }

    public void run() {
        while (true) {
            try {
                //Escucha en la base de Datos para ver si hay mensajes nuevos
                Statement stmt = Conexion.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT 1"); 
                rs.close();
                stmt.close();

                //Recibe las notificaciones de JDBC
                org.postgresql.PGNotification notifications[] = pgconn.getNotifications();
                if (notifications != null) {
                    for (int i=0; i<notifications.length; i++) {
                        //Aca se recibe cada una de las notificaciones de Postgresql notifications[i] para luego descomponer el json que se recibe
                        String parameter = notifications[i].getParameter().replace("\\","");
                        String action = parameter.split("\\{")[1].split(",")[1].split(":")[1].substring(2,8);   
                                          
                        if(action.equals("INSERT")){
                        //Se comprueba si el correo es para mi
                            id = parameter.split("\\{")[2].replace("}","").split(",")[0].split(":")[1];
                            GrupoEmisor = parameter.split("\\{")[2].replace("}","").split(",")[1].split(":")[1];  
                            GrupoReceptor = parameter.split("\\{")[2].replace("}","").split(",")[2].split(":")[1];
                            Emisor = parameter.split("\\{")[2].replace("}","").split(",")[3].split(":")[1];
                            Emisor = Emisor.substring(1, Emisor.length() - 1);
                            Receptor = parameter.split("\\{")[2].replace("}","").split(",")[4].split(":")[1];
                            Receptor = Receptor.substring(1,Receptor.length()-1);
                            Asunto = parameter.split("\\{")[2].replace("}","").split(",")[6].split(":")[1];
                            Mensaje = parameter.split("\\{")[2].replace("}","").split(",")[7].split(":")[1];
                            boolean existe = false;
                            
                            if(GrupoReceptor.equals("6"))
                            {
                                //si es para mi se envia el update con la respuesta
                                
                                //ACA USTEDES DEBEN GESTIONAR A DONDE ENVIAR LOS DATOS OBTENIDOS DE LA NOTIFICACION PARA MOSTRARLOS EN LA BANDEJA DE ENTRADA
                                existe=false;
                                //si es para mi enviar el update con la respuesta de que el usuario existe
                                //Deben de validar cada uno si el usuario existe o no en su ordenador y enviar la respuesta de esta forma al servidor
                                File u = new File("C:\\MEIA\\usuario.txt");
                                File m = new File("C:\\MEIA\\Master.txt");
                                BufferedReader brp = null;
                                FileReader frp = null;
                                String linea = null;  
                                String username = "";
                                
                                try{
                                    frp = new FileReader(u);
                                    brp = new BufferedReader(frp);
                                    while((linea=brp.readLine())!= null){
                                    username = linea.substring(0,linea.indexOf("|"));
                                        if(username.equals(Receptor)){
                                            existe = true;
                                            break;
                                        }
                                    }
                                    brp.close();

                                    frp = new FileReader(m);
                                    brp = new BufferedReader(frp);
                                    if (existe == false) {
                                       while((linea=brp.readLine())!= null){
                                           username = linea.substring(0,linea.indexOf("|"));
                                           if(username.equals(Receptor)){
                                              existe = true;
                                              break;
                                           }
                                       }
                                       brp.close();
                                    }
                                }catch(Exception e){}
                                if(existe)
                                {
                                    BDD.getInstancia().Update(id, existe);
                                    BDD.getInstancia().setMensaje("El Grupo " + GrupoEmisor + " te ha enviado un Correo." );
                                   
                                    Not = new Notificacion();
                                    Not.setVisible(true);
                                    
                                    File co = new File("C:\\MEIA\\Correo.txt");
                                    try{

                                        String fecha = LocalDateTime.now().toString();
                                        frp = new FileReader(co);
                                        brp = new BufferedReader(frp);

                                        linea = brp.readLine();
                                        brp.close();
                                        String nuevaLinea = "0|0|" + Emisor + "|" + Receptor + "|" + fecha + "|" + Asunto + "|" + Mensaje + "|null|1";
                                        if(linea == null){
                                            FileWriter flw = new FileWriter(co,false);
                                            flw.write(nuevaLinea);
                                            flw.close();
                                        }else{
                                            frp = new FileReader(co);
                                            brp = new BufferedReader(frp);
                                            List nuevosDatos = new ArrayList<>();
                                            while((linea=brp.readLine())!= null){
                                                nuevosDatos.add(linea);
                                            }
                                            Determinar(nuevaLinea, nuevosDatos);
                                        }
                                    }catch(Exception e){}
                                    
                                }else{
                                    BDD.getInstancia().Update(id, existe);
                                    Not = new Notificacion();
                                    Not.setVisible(true);
                                }                                        
                            }
                        }else{
                            //UPDATE                            
                            //comprobar si yo fui el que envie la solicitud
                            //Descomponer id, grupo emisor y grupo receptor en esta parte
                            id = parameter.split("\\{")[2].replace("}","").split(",")[0].split(":")[1];
                            GrupoEmisor = parameter.split("\\{")[2].replace("}","").split(",")[1].split(":")[1];
                            GrupoReceptor = parameter.split("\\{")[2].replace("}","").split(",")[2].split(":")[1];
                            Emisor = parameter.split("\\{")[2].replace("}","").split(",")[3].split(":")[1];
                            Receptor = parameter.split("\\{")[2].replace("}","").split(",")[4].split(":")[1];
                            Asunto = parameter.split("\\{")[2].replace("}","").split(",")[6].split(":")[1];
                            Mensaje = parameter.split("\\{")[2].replace("}","").split(",")[7].split(":")[1];
                            
                            //Aca deben de colocar su numero de Grupo 
                            if(GrupoEmisor.equals("6")){
                                String respuesta = parameter.split("\\{")[2].replace("}","").split(",")[8].split(":")[1];
                                 //Comprobar cual fue la respuesta
                                 if(respuesta.equals("false")){
                                    BDD.getInstancia().setMensaje("El grupo " + GrupoReceptor + " no ha encontrado el usuario al cual enviaste el correo." );
                                    Not = new Notificacion();
                                    Not.setVisible(true);
                                 }else{
                                    BDD.getInstancia().setMensaje("El grupo " + GrupoReceptor + " ha recibido el mensaje." );
                                    Not = new Notificacion();
                                    Not.setVisible(true);
                                 }
                                 //Para Eliminar la solicitud (NO ES NECESARIO, OPCIONAL)
                                 BDD.getInstancia().Delete(id);
                            }
                        }                                             
                    }
                }
            //Espera para la siguiente Notificacion
                Thread.sleep(500);
            } catch (SQLException | InterruptedException sqle) {
                    sqle.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Listener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void Determinar(String nueva, List datos){
        File co = new File("C:\\MEIA\\Correo.txt");
        
        try{
            String primeraLinea = (String) datos.get(0);
            String Izq = primeraLinea.substring(0,primeraLinea.indexOf("|"));
            String Der = primeraLinea.substring(primeraLinea.indexOf("|") + 1);
            String Info = Der.substring(Der.indexOf("|") + 1);

            String der = nueva.substring(nueva.indexOf("|") + 1);
            String info = der.substring(der.indexOf("|") + 1);
            if (datos.size() == 1) {
                
                if (info.compareTo(Info) > 1) {
                    datos.set(0, "2|0|" + Info);
                }else{
                    datos.set(0, "0|2|" + Info);
                }
                datos.add(nueva);
            }else{
                boolean salir = false;
                int posicion = 0;
                
                while(salir == false){
                    if(info.compareTo(Info) >= 1){
                        Der = Der.substring(0, Der.indexOf("|"));
                        int de = Integer.valueOf(Der);
                        if (de == 0) {
                             datos.add(nueva);
                             datos.set(posicion, Izq + "|" + datos.size() + "|" + Info);
                             salir = true;
                        }else{
                            de--;
                            posicion = de;//VALIDAR
                            primeraLinea = (String) datos.get(posicion);
                            Izq = primeraLinea.substring(0,primeraLinea.indexOf("|"));
                            Der = primeraLinea.substring(primeraLinea.indexOf("|") + 1);
                            Info = Der.substring(Der.indexOf("|") + 1);
                        }
                    }else{
                        int iz = Integer.valueOf(Izq);
                        if (iz == 0) {
                             datos.add(nueva);
                             datos.set(posicion, datos.size() + "|" + Der.substring(0,Der.indexOf("|")) + "|" + Info);
                             salir = true;
                        }else{
                            iz--;
                            posicion = iz;//Hay que validar que si sea la posicion que corresponde
                            primeraLinea = (String) datos.get(posicion);
                            Izq = primeraLinea.substring(0,primeraLinea.indexOf("|"));
                            Der = primeraLinea.substring(primeraLinea.indexOf("|") + 1);
                            Info = Der.substring(Der.indexOf("|") + 1);
                        }
                    }
                }
               
            }
            FileWriter flw = new FileWriter(co,false);
            for (int i = 0; i < datos.size(); i++) {
                flw.write(datos.get(i) + "\r\n");
            }
            flw.close();
            
        }catch(Exception e ){}
    }
}
