import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int opcion =0;
        do {
            System.out.println("___________________________");
            System.out.println("APLICACION DE MENSAJES");
            System.out.println("1. Crear mensajes");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Eliminar mensaje");
            System.out.println("4. Editar mensaje");
            System.out.println("5. Salir ");
            System.out.println("___________________________");
            //leemos la opcion del usuario
            opcion =sc.nextInt();
            switch (opcion){
                case 1:
                    mensajeService.crearMensaje();
                    break;
                case 2:
                    mensajeService.listarmensajes();
                    break;
                case 3:
                    mensajeService.borrarMensaje();
                    break;
                case 4:
                    mensajeService.editarMensaje();
                    break;
                case 5:
                    System.out.println("Gracias");
                    break;

            }

        }while (opcion!=5);



    }
}
