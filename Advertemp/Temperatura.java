package Advertemp;
import java.util.Scanner;
public class Temperatura {
    Aviso imprimirA = new Aviso();
    Scanner input = new Scanner(System.in);
    public int pedirTemperatura(int x) {
        System.out.println("¿Cual es la temperatura actual en su ubicacion? (Grados centigrados)");
        x = input.nextInt();
        return x;
    }
    public boolean pedirTemperaturaPosterior(boolean y) {
        int v = 0;
        System.out.println("¿Sabe cual sera la temperatura de mañana de su ubicacion actual?");
        System.out.println("[1] Si, [2] No.");
        while (v != 1 && v != 2) {
            v = input.nextInt();
            if (v != 1 && v != 2) {
                System.out.println("Valor invalido, porfavor vuelva a intentarlo.");
            } else if (v == 1) {
                y = true;
            } else if (v == 2) {
                y = false;
            }
        }
        return y;
    }
    public int determinarPeligroCiudad(int x, int y) {
        if (x == 1) {
            y = 32;
        } else if (x == 2) {
            y = 25;
        } else if (x == 3) {
            y = 35;
        } else if (x == 4) {
            y = 34;
        } else if (x == 5) {
            y = 36;
        } 
        return y;
    }
    public void determinarPeligrosidad(int x, int y) {
        if (x >= y) {
            imprimirA.imprimirAviso();
        } else {
            System.out.println("La temperatura actual no posee un riesgo para su salud.");
            System.out.println("");
        }
    }
    public void determinarPeligroMascota(int x) {
        if (x > 30) {
            imprimirA.imprimirAvisoMascota();
        } else {
            System.out.println("La temperatura actual no posee un riesgo para la salud de su mascota.");
            System.out.println("");
        }
    }
    public int determinarPeligroPosterior(int y) {
        int x;
        System.out.println("¿Cual va a ser la temperatura de mañana?");
        x = input.nextInt();
        if (x >= y) {
            imprimirA.imprimirAvisoPosterior();
        } else {
            System.out.println("La temperatura de mañana no posee un riesgo para su salud.");
            System.out.println("");
        }
        return x;
    }
    public void determinarPeligroMascotaP(int x) {
        if (x > 30) {
            imprimirA.imprimirAvisoMascotaP();
        } else {
            System.out.println("La temperatura de mañana no posee un riesgo para la salud de su mascota.");
            System.out.println("");
        }
    }
}
