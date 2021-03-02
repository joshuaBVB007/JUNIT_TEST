package pruebas;

import java.util.Vector;

public class Lista extends Vector<String> {
	
	public Lista(String[] elementos) {	
		if(elementos!=null) {
			for (String s : elementos) {
				this.add(s);
			}
		}
	}
	
	
	public Lista ordenar() {
		for (int i = 0; i < Lista.this.size()-1; i++) {
			for (int j = i+1; j < this.size(); j++) {
				if(get(i).compareTo(get(j))==1) {
					String aux=get(i);
					set(i,get(j));
					set(j,aux);
				}
			}
		}
		return this;
	}
	
	
	

}
