package pruebas;

public class Prueba1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] e3= {"e","d","c","b","a"};
		Lista reves=new Lista(e3);
		
		//el metodo ordenar lo creamos en la clase Lista
		Lista derecha=reves.ordenar();
		
		String [] e2= {"a","b","c","d","e"};
		
		Lista expected=new Lista(e2);
		
		if(derecha.equals(expected)) {
			System.out.println("Resultado Correcto!");
		}else {
			System.out.println("Resultado Incorrecto!");
		}
		

	}
}
