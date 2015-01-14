package persona;

public class TestPersona {
	public static void main(String[] args) {
		Persona p1=new Persona(33, "Alguien");
		System.out.println(p1);
		p1.setEdad(999);
		System.out.println(p1);
		System.out.println("Es mayor de edad? "+p1.esMayordeEdad());
		Persona p2=new Persona(1, "Algu");
		System.out.println(p2);
		System.out.println("Es mayor de edad? "+p2.esMayordeEdad());
		
	}
}
