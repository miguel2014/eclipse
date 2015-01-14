package persona;

import java.util.Scanner;

public class TestPersonaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Di nombre");
		String nombre=in.next();
		System.out.println("Di edad");
		int edad=in.nextInt();
		Persona p1 =new Persona(edad, nombre);
		System.out.println(p1);
		in.close();
	}

}
