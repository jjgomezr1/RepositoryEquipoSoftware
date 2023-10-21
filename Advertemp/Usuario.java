package Advertemp;
import java.util.Scanner;
public class Usuario {
    Scanner input = new Scanner(System.in);
    public int definirCiudad(int x) {
        int g = 0;
        System.out.println("Entre las siguientes opciones, eliga en cual ciudad se ubica.");
        System.out.println("[1]Medellin, [2]Bogota, [3]Cartagena, [4]Cali, [5]Santa Marta");
        while (g < 1 || g > 5) {
            g = input.nextInt();
            if (g < 1 || g > 5) {
                System.out.println("Valor invalido, porfavor vuelva a intentarlo.");
            } else {
                x = g;
            }
        }
        return x;
    }
    public void definirEdad() {
        int b = -1;
        System.out.println("Ingrese su edad.");
        while (b < 0 || b > 130) {
            b = input.nextInt();
            if (b < 0 || b > 130) {
                System.out.println("Valor invalido, porfavor vuelva a intentarlo.");
            }
        }
    }
}
