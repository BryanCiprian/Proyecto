/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itskill.bean;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class UsuarioBean implements Serializable{
    
   // private Integer id_usuario;
    private String id_estado;
    //private Integer id_persona;
    private PersonaBean personaBean;
    private String var_usuario;
    private String var_clave;
    private Date tms_fechacreacion;
    private Date tms_fechamodif;
    
    private String fec_eli;
    private String fec_inicio;
    private String fec_fin;
    
    
    //private Integer id_rol;
    
    private String nombres;

  
    
    
    public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	/**
     * @return the id_usuario
     */
    public UsuarioBean(){
        personaBean= new PersonaBean();
    }


	public String getId_estado() {
		return id_estado;
	}


	public void setId_estado(String id_estado) {
		this.id_estado = id_estado;
	}

 


	public PersonaBean getPersonaBean() {
		return personaBean;
	}


	public void setPersonaBean(PersonaBean personaBean) {
		this.personaBean = personaBean;
	}


	public String getVar_usuario() {
		return var_usuario;
	}


	public void setVar_usuario(String var_usuario) {
		this.var_usuario = var_usuario;
	}


	public String getVar_clave() {
		return var_clave;
	}


	public void setVar_clave(String var_clave) {
		this.var_clave = var_clave;
	}


	public Date getTms_fechacreacion() {
		return tms_fechacreacion;
	}


	public void setTms_fechacreacion(Date tms_fechacreacion) {
		this.tms_fechacreacion = tms_fechacreacion;
	}


	public Date getTms_fechamodif() {
		return tms_fechamodif;
	}


	public void setTms_fechamodif(Date tms_fechamodif) {
		this.tms_fechamodif = tms_fechamodif;
	}


	public String getFec_eli() {
		return fec_eli;
	}


	public void setFec_eli(String fec_eli) {
		this.fec_eli = fec_eli;
	}


	public String getFec_inicio() {
		return fec_inicio;
	}


	public void setFec_inicio(String fec_inicio) {
		this.fec_inicio = fec_inicio;
	}


	public String getFec_fin() {
		return fec_fin;
	}


	public void setFec_fin(String fec_fin) {
		this.fec_fin = fec_fin;
	}
    
    
   
}

