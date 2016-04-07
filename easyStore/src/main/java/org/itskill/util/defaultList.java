package org.itskill.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class defaultList {
	public final String id = "id";
	public final String name = "nombre";

	public List<Map<String, String>> tipoDiseno() {
		List<Map<String, String>> lista = new ArrayList<>();
		Map<String, String> item;
		item = new HashMap<String, String>();
		item.put(id, "smart-style-5");
		item.put(name, "Glass");

		lista.add(item);
		item = new HashMap<String, String>();
		item.put(id, "smart-style-6");
		item.put(name, "Material Design");
		lista.add(item);
		item = new HashMap<String, String>();
		item.put(id, "smart-style-4");
		item.put(name, "PixelSmash");

		lista.add(item);
		item = new HashMap<String, String>();
		item.put(id, "smart-style-1");
		item.put(name, "Dark Elegance");
		lista.add(item);
		item = new HashMap<String, String>();
		item.put(id, "smart-style-3");
		item.put(name, "Google");
		lista.add(item);

		item = new HashMap<String, String>();
		item.put(id, "smart-style-2");
		item.put(name, "Ultra Light");
		lista.add(item);

		item = new HashMap<String, String>();
		item.put(id, "smart-style-0");
		item.put(name, "Default");
		lista.add(item);

		return lista;
	}

	public List<Map<String, String>> tipoNavegacion() {
		List<Map<String, String>> lista = new ArrayList<>();
		Map<String, String> item;
		item = new HashMap<String, String>();
		item.put(id, "minified");
		item.put(name, "Navigation Minified");

		lista.add(item);
		item = new HashMap<String, String>();
		item.put(id, "hidden-menu");
		item.put(name, "Hidden Navigation");
		lista.add(item);
		item = new HashMap<String, String>();
		item.put(id, "top-navigation container");
		item.put(name, "Menu on Top with center content");

		lista.add(item);
		item = new HashMap<String, String>();
		item.put(id, "minified container");
		item.put(name, "Center content with minified nav");
		lista.add(item);
		item = new HashMap<String, String>();
		item.put(id, "smart-rtl");
		item.put(name, "RTL Layout");
		lista.add(item);
		item = new HashMap<String, String>();
		item.put(id, "smart-rtl top-navigation menu-on-top");
		item.put(name, "RTL with Menu on Top");
		lista.add(item);
		return lista;
	}

}
