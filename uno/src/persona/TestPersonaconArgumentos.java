package persona;

public class TestPersonaconArgumentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre= args[0];
		int edad= Integer.parseInt(args[1]);
		
		Persona p1=new Persona(edad, nombre);
		if (p1.esMayordeEdad()) {
			System.out.println(p1.getNombre() +" es mayor de edad");
		} else {
			System.out.println("No es mayor de edad");
		}
	}

}
