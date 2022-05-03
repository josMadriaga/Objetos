package ejercicio1;
/*El disco rígido se caracteriza por su marca, su capacidad en
gigabytes, y su velocidad de operación en RPM1*/
public class DiscoRigido {
String marca;
Integer capacidad,gigabytes;
Double velocidadDeOperacionesEnRPM1;
boolean estado=false;
void ingresarMarca(String marca) {
	this.marca=marca;
}
void ingresarCapacidad(Integer capacidad) {
	this.capacidad=capacidad;
}
void ingresarGigabytes(Integer gigabyte) {
	this.gigabytes=gigabyte;
}
void ingresarVelocidadDeOperacionesEnRPM1(Double velocidad) {
	this.velocidadDeOperacionesEnRPM1=velocidad;
}
@Override
public String toString() {
	return "DiscoRigido [marca=" + marca + ", capacidad=" + capacidad + ", gigabytes=" + gigabytes
			+ ", velocidad De Operaciones En RPM1=" + velocidadDeOperacionesEnRPM1 + "]";
}

}
