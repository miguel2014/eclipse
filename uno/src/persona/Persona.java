package persona;

public class Persona {
// definimos atributos
		private int edad;
		private String nombre;
		/**
		 * @param edad
		 * @param nombre
		 */
		public Persona(int edad, String nombre) {
			this.edad = edad;
			this.nombre = nombre;
		}
		/**
		 * @return the edad
		 */
		public int getEdad() {
			return edad;
		}
		/**
		 * @param edad the edad to set
		 */
		public void setEdad(int edad) {
			this.edad = edad;
		}
		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}
		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Persona [edad=" + edad + ", nombre=" + nombre + "]";
		}
		/**Metodo que devuelve si es mayor de edad
		 * @return true si es mayor de edad
		 */
		public boolean esMayordeEdad(){
			return this.edad>=18;
		}
		
	}