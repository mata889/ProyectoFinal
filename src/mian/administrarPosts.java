package mian;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class administrarPosts {

    

        ArrayList<posts> listaPosts = new ArrayList();
        File archivo = null;

    public administrarPosts() {
    }
    public administrarPosts(String admincbm) {
       archivo = new File(admincbm);
    }
    public ArrayList<posts> getListaPosts() {
        return listaPosts;
    }

    public void setListaPosts(ArrayList<posts> listaPosts) {
        this.listaPosts = listaPosts;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

       

        //extra mutador
        public void setPosts(posts p) {
            this.listaPosts.add(p);
        }

        public void cargarArchivo() {
            try {
                listaPosts = new ArrayList();
                posts temp;
                if (archivo.exists()) {
                    FileInputStream entrada = new FileInputStream(archivo);
                    ObjectInputStream objeto = new ObjectInputStream(entrada);
                    try {
                        while ((temp = (posts) objeto.readObject()) != null) {
                            listaPosts.add(temp);
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
                for (posts t : listaPosts) {
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

