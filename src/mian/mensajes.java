package mian;

import java.io.Serializable;
import java.util.Date;

public class mensajes implements Serializable {
    String enviado;
    String mensaje, receptor, emisor,estado;
    
    private static final long SerialVersionUID = 666L;

    public mensajes(String enviado, String mensaje, String receptor, String emisor, String estado) {
        this.enviado = enviado;
        this.mensaje = mensaje;
        this.receptor = receptor;
        this.emisor = emisor;
        this.estado = estado;
    }

    public String getEnviado() {
        return enviado;
    }

    public void setEnviado(String enviado) {
        this.enviado = enviado;
    }

    

    

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    

    
}
