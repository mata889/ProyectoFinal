

package mian;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;

public class Usuarios implements Serializable{
    String nombre,nickname,contraseña,pais,estado;
    Date fecha;
    Icon icon;
    ArrayList amigos=new ArrayList();
    ArrayList album=new ArrayList();
   
    
    private static final long SerialVersionUID=777L;

    public Usuarios() {
    }

    public Usuarios(String nombre, String nickname, String contraseña, String pais, Date fecha, Icon icon ,String estado) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.contraseña = contraseña;
        this.pais = pais;
        this.estado = estado;
        this.fecha = fecha;
        this.icon = icon;
    }

    

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getPais() {
        return pais;
    }

    public ArrayList getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList amigos) {
        this.amigos = amigos;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    
    
}
