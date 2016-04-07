/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itskill.bean;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author usuario
 */
public class MenuBean implements Serializable{
    
    private Long id_vista;
    private Integer id_estado;
    private Integer id_padre;
    private String var_urlvista;
    private String var_labelvista;
    private String var_icon;
    private Integer id_sub_padre;
    /**
     * @return the id_vista
     */
    public Long getId_vista() {
        return id_vista;
    }

    public String getVar_icon() {
		return var_icon;
	}

	public void setVar_icon(String var_icon) {
		this.var_icon = var_icon;
	}

	/**
     * @param id_vista the id_vista to set
     */
    public void setId_vista(Long id_vista) {
        this.id_vista = id_vista;
    }

    /**
     * @return the id_estado
     */
    public Integer getId_estado() {
        return id_estado;
    }

    /**
     * @param id_estado the id_estado to set
     */
    public void setId_estado(Integer id_estado) {
        this.id_estado = id_estado;
    }

    /**
     * @return the id_padre
     */
    public Integer getId_padre() {
        return id_padre;
    }

    /**
     * @param id_padre the id_padre to set
     */
    public void setId_padre(Integer id_padre) {
        this.id_padre = id_padre;
    }

    /**
     * @return the var_urlvista
     */
    public String getVar_urlvista() {
        return var_urlvista;
    }

    /**
     * @param var_urlvista the var_urlvista to set
     */
    public void setVar_urlvista(String var_urlvista) {
        this.var_urlvista = var_urlvista;
    }

    /**
     * @return the var_labelvista
     */
    public String getVar_labelvista() {
        return var_labelvista;
    }

    /**
     * @param var_labelvista the var_labelvista to set
     */
    public void setVar_labelvista(String var_labelvista) {
        this.var_labelvista = var_labelvista;
    }

    /**
     * @return the var_urlimagen
     */
     

	public Integer getId_sub_padre() {
		return id_sub_padre;
	}

	public void setId_sub_padre(Integer id_sub_padre) {
		this.id_sub_padre = id_sub_padre;
	}

 
}

