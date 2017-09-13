/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mian;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class administrarMensajes {

    ArrayList<mensajes> listamensajes = new ArrayList();
    File archivo = null;

    

    public administrarMensajes(String admincbm) {
        archivo = new File(admincbm);
    }

    public ArrayList<mensajes> getListamensajes() {
        return listamensajes;
    }

    public void setListamensajes(ArrayList<mensajes> listamensajes) {
        this.listamensajes = listamensajes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    //extra mutador
    public void setMensajes(mensajes p) {
        this.listamensajes.add(p);
    }

    public void cargarArchivo() {
        try {
            listamensajes = new ArrayList();
            mensajes temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (mensajes) objeto.readObject()) != null) {
                        listamensajes.add(temp);
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
            for (mensajes t : listamensajes) {
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
