import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {

         public  static  void  crearMensajeDB(Mensaje mensaje){

             Conexion db_connect =new Conexion();
             try (Connection conexion = db_connect.get_connection()){
                 PreparedStatement ps=null;
                 try {
                     String query="INSERT INTO mensaje (mensaje, auto_mensaje) VALUES (?,?);";
                     ps =conexion.prepareStatement(query);
                     ps.setString(1 ,mensaje.getMensajes());
                     ps.setString(2,mensaje.getAuto_mensaje());
                     ps.executeUpdate(); //actualizar los cambios
                     System.out.println("Mensaje Creado");

                 }catch (SQLException ex){
                     System.out.println(ex);
                 }
             }catch (SQLException e){
                 System.out.println(e);
             }
         }

         public static void  leerMensajesDB(){
               Conexion db_connect =new Conexion();
               PreparedStatement ps=null;
               ResultSet rs=null;

               try(Connection conexion = db_connect.get_connection()){
                   String query="SELECT * FROM mensaje";
                   ps=conexion.prepareStatement(query);
                   rs= ps.executeQuery();

                   //iesntras rs tenga datos
                   while (rs.next()){
                       System.out.println("ID: "+rs.getInt("id_mensaje"));
                       System.out.println("Mensaje: "+rs.getString("mensaje"));
                       System.out.println("Autor: "+rs.getString("auto_mensaje"));
                       System.out.println("Feche: "+rs.getString("fecha_mensaje"));
                       System.out.println("");
                   }
                       }catch (SQLException e){
                   System.out.println("No se pudieron traer los mensajes");
                           System.out.println(e);
                       }
         }
        public static void borrarMenssajeDB(int id_mensaje){
             Conexion db_connect = new Conexion();

             try(Connection conexion = db_connect.get_connection()){
                 PreparedStatement ps=null;

                 try{
                     String query="DELETE FROM mensaje WHERE id_mensaje = ?";
                     ps=conexion.prepareStatement(query);
                     ps.setInt(1,id_mensaje);
                     ps.executeUpdate();
                     System.out.println("Mensaje Borrado ");
                 }catch (SQLException ex){
                     System.out.println(ex);
                     System.out.println("No se pudo Borrar el mensaje ");
                 }
             }catch (SQLException e){
                 System.out.println(e);
             }
         }

        public static void actualizarMensajeDB(Mensaje mensaje){
             Conexion db_connect = new Conexion();

             try(Connection conexion=db_connect.get_connection()){
                 PreparedStatement ps=null;
                 try{
                     String query="UPDATE mensaje SET mensaje = ? WHERE id_mensaje = ?";
                     ps=conexion.prepareStatement(query);
                     ps.setString(1,mensaje.getMensajes());
                     ps.setInt(2,mensaje.getId_mensaje());
                     ps.executeUpdate();
                     System.out.println("El mensaje se actualizo correctamente");
                 }catch (SQLException ex){
                     System.out.println("ex");
                     System.out.println("NO se pudo actualizar el mensaje");
                 }

             }catch (SQLException e){
                 System.out.println(e);
             }

        }

     }


