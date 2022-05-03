package ejercicio1;

import java.util.ArrayList;

/*
 Realizar el diagrama de clases, incluir las relaciones existentes e implementar la siguiente situación.
a) Una computadora consta de una marca, un modelo y un año de fabricación. Para distinguir entre las
computadoras, se les ha asignado un tipo: Tipo D para desktop, tipo A para All-in-one y tipo L para
Laptop.													LISTO
b) Cada computadora posee 3 características básicas, independiente de su tipo. Todas poseen un disco
rígido, un procesador y memoria. El disco rígido se caracteriza por su marca, su capacidad en
gigabytes, y su velocidad de operación en RPM1			LISTO
. Por su lado, los procesadores tienen marca, modelo
y velocidad en gigahertz. 								LISTO
De la memoria interesa solo su capacidad en Gigabytes.	LISTO
- Cada computadora debe tener la posibilidad de mostrar los valores suyos y de sus componentes,
por ejemplo, si quiero imprimir los valores de una computadora, puedo imprimir: "Toshiba G480
-- Procesador: AMD -- Disco: 500gb -- Ram:4gb".			LISTO
c) Probar las clases generadas creando un código cliente de éstas. Se espera que escriban una clase
main, donde se crean computadoras y se muestra su información.	LISTO

d) Agregarle a la computadora el comportamiento de encendido y apagado. La computadora debe
permitir encenderla y apagarla, así como también consultar su estado actual. Recordar que, al
encender una computadora, también se encienden su disco rígido y su procesador.	LISTO

 */
public class Computadora {
String marca,modelo,tipo;
Integer añoFabricacion;
DiscoRigido discorigido;
Procesador procesador;
Memoria memoria;
boolean estado=false;
Computadora (String marca,String modelo,Integer año){
	discorigido=new DiscoRigido();
	procesador=new Procesador();
	memoria=new Memoria();
	this.añoFabricacion=año;
	this.modelo=modelo;
	this.marca=marca;
}
void asignarTipo(String tipo) {
	if(tipo.equals("A"))
		this.tipo="All-in-one";
	else if(tipo.equals("D"))
		this.tipo="desktop";
	else if(tipo.equals("L"))
		this.tipo="Laptop";
	else
		throw new RuntimeException("tipo no valido");
}
boolean verEstadoDeComputadora() {
	return estado;
}
void Encender() {
	this.estado=true;
	discorigido.estado=true;
	procesador.estado=true;
}
void Apagar() {
	this.estado=false;
	discorigido.estado=false;
	procesador.estado=false;
}
@Override
public String toString() {
	return "Computadora [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", añoFabricacion="
			+ añoFabricacion + "," + discorigido.toString() + "," + procesador.toString() + "," + memoria.toString()
			+ "]";
}

}
