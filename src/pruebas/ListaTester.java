package pruebas;

import junit.framework.TestCase;

public class ListaTester extends TestCase {
	public ListaTester(String testcase) {
		super(testcase);
	}
	
	public void testOrdenarReves() {
		String [] ex= {"a","b","c","d","e"};
		Lista expected=new Lista(ex);
		String [] e3= {"e","d","c","b","a"};
		Lista listaAlReves=new Lista(e3);
		this.assertEquals(expected, listaAlReves.ordenar());
	}
	
	
	public void testOrdenarTodosIguales() {
		String [] e2= {"a","a","a","a","a"};
		Lista listaTodosIguales=new Lista(e2);
		String [] ex= {"a","a","a","a","a"};
		Lista expected=new Lista(ex);
		this.assertEquals(expected, listaTodosIguales.ordenar());
	}
	
	
	public void testOrdenarNula1() {
		Lista listaNula1=null;
		this.assertNull(listaNula1);
	}
	
	public void testOrdenarNula2() {
		String [] e4=null;
		Lista listaNula2=new Lista(e4);
		String[] ex=null;
		Lista expected=new Lista(ex);
		this.assertEquals(expected, listaNula2.ordenar());
	}
	
	public void testOrdenarListaVacia() {
		String[] e5= {};
		Lista listaVacia=new Lista(e5);
		String[] ex= {};
		Lista expected=new Lista(ex);
		this.assertEquals(expected, listaVacia.ordenar());
	}
	

}
