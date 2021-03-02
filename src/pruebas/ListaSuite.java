package pruebas;

import junit.framework.Test;
import junit.framework.TestSuite;

public class ListaSuite {

	public static Test suite() {
		/*Hola Jonathan del pasado,para recordarte un poco los test se ejecutan siguiendo los siguientes pasos
		 * 1)crear un TestSuite principal al que llamaremos "raiz" no es necesario llamarlo asi.
		 * en el se encapsularán los 3 pruebas siguientes que haremos.
		 * 
		 * 2)crear los distintos casos de prueba dentro del "raiz",para crear un caso de prueba hay que ejecutar 
		 * TestSuite testSuite1=new TestSuite("Iguales"); y un nombre identificativo que lo llamaremos "Iguales" esta es la misma que esta 
		 * como variable de instancia al crear el objeto.
		 * 
		 * 3)en el paso 2 creaste un caso de prueba pero aun no tiene un test asociado necesitamos hacer  "testSuite1.addTest" y pasarle como
		 * parametro una instancia de ListaTester que es la clase que contiene nuestros metodos de prueba ver ejemplo abajo:
		 * 
		 * testSuite1.addTest(new ListaTester("testOrdenarTodosIguales"));
		 * 
		 * donde testOrdenarTodosIguales es el nombre exacto de nuestro metodo en la clase ListaTester
		 * 
		 * 4)puede un prueba contener varios test?si,de hecho,testsuite3 tiene tres pruebas asociadas asi misma.
		 * 
		 */
		
		
		//1)
		TestSuite jonathan = new TestSuite("raiz");

		//2)
		TestSuite testSuite1=new TestSuite("Iguales");
		
		//3)
		testSuite1.addTest(new ListaTester("testOrdenarTodosIguales"));

		TestSuite testSuite2=new TestSuite("Al reves");
		testSuite2.addTest(new ListaTester("testOrdenarReves"));

		TestSuite testSuite3=new TestSuite("Nulas o vacias");
		testSuite3.addTest(new ListaTester("testOrdenarNula1"));
		testSuite3.addTest(new ListaTester("testOrdenarNula2"));
		testSuite3.addTest(new ListaTester("testOrdenarListaVacia"));
		
		jonathan.addTest(testSuite1);
		jonathan.addTest(testSuite2);
		jonathan.addTest(testSuite3);
		
		return jonathan;
	}

}
