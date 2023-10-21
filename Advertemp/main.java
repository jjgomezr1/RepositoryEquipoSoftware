package Advertemp;
import java.util.Scanner;
class Main { 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Usuario usuario=new Usuario();
    Necesidades necesidad=new Necesidades();
    Temperatura temperatura=new Temperatura();
    int temp = 0;   int ciudad = 0;   boolean mascota = false;  boolean sabe = false;   int indice = 0;   int tempm = 0;   int i = 0;   int j = 0;
    usuario.definirEdad();
    ciudad = usuario.definirCiudad(ciudad);
    indice = temperatura.determinarPeligroCiudad(ciudad, indice);
    mascota = necesidad.tieneMascota(mascota);
    indice = necesidad.definirTemperaturaPerjudicial(indice);
    while (i == 0) {
        System.out.println("¿Que desea hacer?");
        System.out.println("");
        System.out.println("[1] Ver informacion del peligro de la temperatura");
        System.out.println("[2] Volver a registrarse");
        System.out.println("[3] Cerrar la aplicacion");
        while (j != 1 && j != 2 && j != 3) {
            j = 0;
            j = input.nextInt();
            if (j != 1 && j != 2 && j != 3) {
                System.out.println("Valor invalido, porfavor vuelva a intentarlo.");
            } else if (j == 1) {
                temp = temperatura.pedirTemperatura(temp);
                temperatura.determinarPeligrosidad(temp, indice);
                if (mascota == true) {
                   temperatura.determinarPeligroMascota(temp);
                }
                sabe = temperatura.pedirTemperaturaPosterior(sabe);
                if (sabe == true) {
                   tempm = temperatura.determinarPeligroPosterior(indice);
                    if (mascota == true) {
                       temperatura.determinarPeligroMascotaP(tempm);
                    }
                } 
            } else if (j == 2) {
               usuario.definirEdad();
               ciudad = usuario.definirCiudad(ciudad);
               indice = temperatura.determinarPeligroCiudad(ciudad, indice);
               mascota = necesidad.tieneMascota(mascota);
               indice = necesidad.definirTemperaturaPerjudicial(indice);
            } else {
                i = 1;
            }
        }
        j = 0;
    }
}
}