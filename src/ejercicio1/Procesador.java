package ejercicio1;
/*los procesadores tienen marca, modelo y velocidad en gigahertz*/
public class Procesador {
String marca,modelo;
Integer velocidad;
boolean estado=false;
void ingresarMarca(String marca) {
	this.marca=marca;
}
void ingresarModelo(String modelo) {
	this.modelo=modelo;
}
void ingresarVelocidad(Integer velocidad) {
	this.velocidad=velocidad;
}
@Override
public String toString() {
	return "Procesadores [marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + "]";
}

}
