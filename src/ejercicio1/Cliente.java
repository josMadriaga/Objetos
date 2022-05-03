package ejercicio1;

public class Cliente {
public static void main(String[] args) {
	Computadora compu=new Computadora("Commodore","alguno",2010);
	compu.asignarTipo("D");
	compu.discorigido.ingresarCapacidad(1);
	compu.discorigido.ingresarGigabytes(1000);
	compu.discorigido.ingresarMarca("pepito");
	compu.discorigido.ingresarVelocidadDeOperacionesEnRPM1(2.4);
	compu.memoria.IngresarCapacidad(4);
	compu.procesador.ingresarMarca("Intel");
	compu.procesador.ingresarModelo("Core i5");
	compu.procesador.ingresarVelocidad(3);
	System.out.println(compu.toString());
}
}
