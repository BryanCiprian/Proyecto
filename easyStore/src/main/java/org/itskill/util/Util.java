/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itskill.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

/**
 *
 * @author Administrador
 */
public class Util {

	public static String rellenandoDeCerosIzquierda(int num, int tamaoNumero) {
		Formatter fmt = new Formatter();
		fmt.format("%0" + tamaoNumero + "d", num);
		System.out.println("El numero formateado " + fmt);
		String numeroformateado = fmt.toString();
		System.out.println("EL numeroformateado: " + numeroformateado);
		return numeroformateado;
	}

	public static int from(int paginaMostrar, int totalPaginas) {
		int inicio = paginaMostrar - 5;
		if (inicio < 1) {
			inicio = 1;
		}
		totalPaginas = totalPaginas - 10;
		if (totalPaginas < 1) {
			totalPaginas = 1;
		}
		if (inicio > totalPaginas) {
			inicio = totalPaginas;
		}
		return inicio;
	}

	public static int to(int paginaMostrar, int totalPaginas) {
		int fin = paginaMostrar + 4;
		if (fin < 10) {
			fin = 10;
		}
		if (fin > totalPaginas) {
			fin = totalPaginas;
		}
		return fin;
	}

	public static String validarString(String cadena) {
		if (cadena == null) {
			cadena = "";
		}
		System.out.println("Cadena: " + cadena);
		return cadena;
	}

	public static Integer validarEntero(Integer entero) {
		if (entero == null) {
			entero = 0;
		}
		System.out.println("entero: " + entero);
		return entero;
	}

	public static Double validarDouble(Double doubles) {
		double d = 0.0;
		if (doubles == null) {

			doubles = new Double(d);
			System.out.println(" doubles: " + doubles);
		}
		return doubles;
	}

	// public static Object validarCampos(Object pObjeto) {
	// Object objeto = pObjeto;
	// Method metodos[] = pObjeto.getClass().getMethods();
	// for (int i = 0; i < metodos.length; i++) {
	// Method metodo = metodos[i];
	// //Si es un metodo get o is lo utilizo con su equivalente set
	// if ((metodo.getName().substring(0, 3).equalsIgnoreCase("get") ||
	// metodo.getName().substring(0, 2).equalsIgnoreCase("is")) &&
	// !metodo.getName().equals("getClass")) {
	// String methodNameSet = "";
	// if(metodo.getName().substring(0, 3).equalsIgnoreCase("get")){
	// methodNameSet = metodo.getName().replaceFirst("get", "set");
	// }else{
	// methodNameSet = methodNameSet.replaceFirst("is", "set");
	// }
	// try {
	// Method metodoSet = pObjeto.getClass().getMethod(methodNameSet,
	// metodo.getReturnType());
	// if (metodoSet != null) {
	// //Datos numericos
	// //Si es byte
	// if (metodo.getReturnType().equals(java.lang.Byte.class)) {
	// Byte valor = (Byte)metodo.invoke(pObjeto, new Object[0]);
	// if(valor==null){
	// metodoSet.invoke(pObjeto, 0);
	// }
	// }
	// //Si es bigDecimal
	// if (metodo.getReturnType().equals(java.math.BigDecimal.class)) {
	// BigDecimal valor = (BigDecimal)metodo.invoke(pObjeto, new Object[0]);
	// if(valor==null){
	// metodoSet.invoke(pObjeto, new BigDecimal(0));
	// }
	// }
	// // Si es Double
	// if (metodo.getReturnType().equals(java.lang.Double.class)) {
	// Double valor = (Double)metodo.invoke(pObjeto, new Object[0]);
	// if(valor==null){
	// metodoSet.invoke(pObjeto, new Double(0));
	// }
	// }
	// //Si es un string
	// if (metodo.getReturnType().equals(java.lang.String.class)) {
	// String valor = (String)metodo.invoke(pObjeto, new Object[0]);
	// if(valor==null){
	// metodoSet.invoke(pObjeto, "");
	// }
	// }
	// //Si es una lista
	// if (metodo.getReturnType().equals(java.util.List.class)) {
	// List objetosList = (List)metodo.invoke(pObjeto, new Object[0]);
	// for(Object objetoFromList:objetosList){
	// NullValidator.validarCampos(objetoFromList);
	// }
	// }
	// //Si es date
	// if (metodo.getReturnType().equals(java.util.Date.class)) {
	// Date valor = (Date)metodo.invoke(pObjeto, new Object[0]);
	// if(valor==null){
	// metodoSet.invoke(pObjeto, new Date());
	// }
	// }
	// //Si es primitivo
	// if (metodo.getReturnType().isPrimitive()) {
	// //los primitivos no permiten null
	// }
	// }
	// } catch (Exception e) {
	// }
	// }
	// }
	// return objeto;
	// }
}
