
public class Persona {
  String nom;
  int edad;
public Persona(String nom, int edad) {
	super();
	this.nom = nom;
	this.edad = edad;
}
@Override
public String toString() {
	return "Persona [nom=" + nom + ", edad=" + edad + "]";
}
  
}
