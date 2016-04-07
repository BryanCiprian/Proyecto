package org.itskill.util;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.fileupload.FileItem;


/**
 *
 * @author ALFA 3
 */
public class Renombrar implements Runnable {

    private String nombre, ubicacion;
    private FileItem item;

    public Renombrar(FileItem Item, String Ubicacion, String Nombre) {
        this.nombre = Nombre;
        this.item = Item;
        this.ubicacion = Ubicacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public FileItem getItem() {
        return this.item;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public void run() {

        try {
            
            File files = new File(getUbicacion(), getNombre());
            getItem().write(files);
        } catch (Exception ex) {
            Logger.getLogger(Renombrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}