
package mian;

import java.io.Serializable;

public class solicitudes implements Serializable {
    String emisor,receptor,estado;

    public solicitudes(String emisor, String receptor, String estado) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.estado = estado;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
