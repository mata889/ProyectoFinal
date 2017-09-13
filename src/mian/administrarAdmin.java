
package mian;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class administrarAdmin {
     ArrayList<Admin> listaPersonas = new ArrayList();
    File archivo = null;

    public administrarAdmin() {
    }

    administrarAdmin(String admincbm) {
       archivo = new File(admincbm);
    }

    public ArrayList<Admin> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Admin> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void setPersona(Admin p) {
        this.listaPersonas.add(p);
    }
    public void cargarArchivo() {
        try {
            listaPersonas = new ArrayList();
            Admin temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Admin) objeto.readObject()) != null) {
                        listaPersonas.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }//fin if
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Admin t : listaPersonas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
