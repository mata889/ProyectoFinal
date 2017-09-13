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

/**
 *
 * @author Family
 */
public class administrarPersonas {
    
    ArrayList<Usuarios> listaPersonas = new ArrayList();
    File archivo = null;
    ArrayList amigos = new ArrayList();
    
    public administrarPersonas(String path) {
        archivo = new File(path);
    }
    
    public ArrayList<Usuarios> getListaPersonas() {
        return listaPersonas;
    }
    
    public void setListaPersonas(ArrayList<Usuarios> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
    
    public File getArchivo() {
        return archivo;
    }
    
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    
    
    @Override
    public String toString() {
        return "administrarPersona{" + "listaPersonas=" + listaPersonas + '}';
    }

    //extra mutador
    public void setPersona(Usuarios p) {
        this.listaPersonas.add(p);
    }
    
    public void cargarArchivo() {
        try {
            listaPersonas = new ArrayList();
            Usuarios temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuarios) objeto.readObject()) != null) {
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
            for (Usuarios t : listaPersonas) {
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
