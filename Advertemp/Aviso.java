package Advertemp;
import java.util.Scanner;
public class Aviso {
    Informacion imprimirInformacion = new Informacion();
    Scanner input = new Scanner(System.in);
    public void imprimirAviso(){
        int r = 0;
        int c = 0;
        System.out.println("La temperatura actual es demasiado alta, por ende su salud se puede ver vulnerable.");
        System.out.println("");
        System.out.println("¿Desea ver las recomendaciones para la temperatura actual?");
        System.out.println("[1] Si, [2] No.");
        while (r != 1 && r != 2) {
            r = input.nextInt();
            if (r != 1 && r != 2) {
                System.out.println("Valor invalido, porfavor vuelva a intentarlo.");
            } else if (r == 1) {
                imprimirInformacion.imprimirRiesgos();
            }
        }
        System.out.println("¿Desea ver los implementos que le pueden ser util para las altas temperaturas?");
        System.out.println("[1] Si, [2] No.");
        while (c != 1 && c != 2) {
            c = input.nextInt();
            if (c != 1 && c != 2) {
                System.out.println("Valor invalido, porfavor vuelva a intentarlo.");
            } else if (c == 1) {
                imprimirInformacion.imprimirImplementos();
            }
        }
    }
    public void imprimirAvisoMascota() {
        int m = 0;
        System.out.println("La temperatura actual es demasiado alta para su mascota, y puede ser vulnerable a esta.");
        System.out.println("¿Desea ver las recomendaciones para su mascota contra la temperatura?");
        System.out.println("[1] Si, [2] No.");
        while (m != 1 && m != 2) {
            m = input.nextInt();
            if (m != 1 && m != 2) {
                System.out.println("Valor invalido, porfavor vuelva a intentarlo.");
            } else if (m == 1) {
                imprimirInformacion.imprimirRiesgosMascota();
            }
        }
    }
    public void imprimirAvisoPosterior() {
        int r = 0;
        int c = 0;
        System.out.println("La temperatura de mañana es demasiado alta, por ende su salud se puede ver vulnerable.");
        System.out.println("¿Desea ver las recomendaciones para mañana?");
        System.out.println("[1] Si, [2] No.");
        while (r != 1 && r != 2) {
            r = input.nextInt();
            if (r != 1 && r != 2) {
                System.out.println("Valor invalido, porfavor vuelva a intentarlo.");
            } else if (r == 1) {
                imprimirInformacion.imprimirRiesgos();
            }
        }
        System.out.println("¿Desea ver los implementos que le pueden ser util para mañana?");
        System.out.println("[1] Si, [2] No.");
        while (c != 1 && c != 2) {
            c = input.nextInt();
            if (c != 1 && c != 2) {
                System.out.println("Valor invalido, porfavor vuelva a intentarlo.");
            } else if (c == 1) {
                imprimirInformacion.imprimirImplementos();
            }
        }
    }
    public void imprimirAvisoMascotaP() {
        int m = 0;
        System.out.println("La temperatura de mañana es demasiado alta para su mascota, y puede ser vulnerable a esta.");
        System.out.println("¿Desea ver las recomendaciones para su mascota para mañana?");
        System.out.println("[1] Si, [2] No.");
        while (m != 1 && m != 2) {
            m = input.nextInt();
            if (m != 1 && m != 2) {
                System.out.println("Valor invalido, porfavor vuelva a intentarlo.");
            } else if (m == 1) {
                imprimirInformacion.imprimirRiesgosMascota();
            }
        }
    }
}
