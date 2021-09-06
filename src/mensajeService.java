import java.util.Scanner;

public class mensajeService {
    public static void crearMensaje(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe tu Mensaje");
        String mensaje =sc.nextLine(); //leemos y pasamos los datos a al variable mensaje

        System.out.println("Tu nombre");
        String nombre = sc.nextLine();

        Mensaje registro = new Mensaje();//pasamos los datso al clase
        registro.setMensajes(mensaje);
        registro.setAuto_mensaje(nombre);
        MensajesDAO.crearMensajeDB(registro);
    }
    public static void listarmensajes(){
        MensajesDAO.leerMensajesDB();

    }
    public static void borrarMensaje(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Indica la ID del mensaje a borrar");
        int id_mensaje=sc.nextInt();
        MensajesDAO.borrarMenssajeDB(id_mensaje);

    }
    public  static void editarMensaje(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe tu nuevo mensaje");
        String mensaje= sc.nextLine();

        System.out.println("Indicar el ID del Mensaje a editar");
        int id_mensaje= sc.nextInt();
        Mensaje actualizacion = new Mensaje();
        actualizacion.setId_mensaje(id_mensaje);
        actualizacion.setMensajes(mensaje);
        MensajesDAO.actualizarMensajeDB(actualizacion);

    }

}
