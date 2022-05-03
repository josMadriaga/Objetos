package ejercicio1;
//De la memoria interesa solo su capacidad en Gigabytes
public class Memoria {
Integer Capacidad;
void IngresarCapacidad(Integer capacidad) {
	this.Capacidad=capacidad;
}
@Override
public String toString() {
	return "Memoria [Capacidad=" + Capacidad + "]";
}

}
