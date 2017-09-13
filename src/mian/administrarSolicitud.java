package mian;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class administrarSolicitud {

    ArrayList<solicitudes> listasolicitud = new ArrayList();
    File archivo = null;

    public administrarSolicitud(String admincbm) {
        archivo = new File(admincbm);
    }

    public ArrayList<solicitudes> getListasolicitud() {
        return listasolicitud;
    }

    public void setListasolicitud(ArrayList<solicitudes> listasolicitud) {
        this.listasolicitud = listasolicitud;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    //extra mutador
    public void setSolicitud(solicitudes p) {
        this.listasolicitud.add(p);
    }

    public void cargarArchivo() {
        try {
            listasolicitud = new ArrayList();
            solicitudes temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (solicitudes) objeto.readObject()) != null) {
                        listasolicitud.add(temp);
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
            for (solicitudes t : listasolicitud) {
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
