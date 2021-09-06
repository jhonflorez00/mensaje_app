public class Mensaje {
    int id_mensaje;
    String mensajes;
    String auto_mensaje;
    String fecha_mensaje;


    public  Mensaje(){}

    public Mensaje( String mensajes, String auto_mensaje, String fecha_mensaje) {

        this.mensajes = mensajes;
        this.auto_mensaje = auto_mensaje;
        this.fecha_mensaje = fecha_mensaje;
    }

    public int getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getMensajes() {
        return mensajes;
    }

    public void setMensajes(String mensajes) {
        this.mensajes = mensajes;
    }

    public String getAuto_mensaje() {
        return auto_mensaje;
    }

    public void setAuto_mensaje(String auto_mensaje) {
        this.auto_mensaje = auto_mensaje;
    }

    public String getFecha_mensaje() {
        return fecha_mensaje;
    }

    public void setFecha_mensaje(String fecha_mensaje) {
        this.fecha_mensaje = fecha_mensaje;
    }
}
