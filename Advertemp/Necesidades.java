package Advertemp;
import java.util.Scanner;
public class Necesidades {
    Scanner input = new Scanner(System.in);
    public boolean tieneMascota(boolean x) {
        int i = 0;
        System.out.println("¿Posee de una o mas mascotas?");
        System.out.println("[1] Si, [2] No.");
        while (i != 1 && i != 2) {
            i = input.nextInt();
            if (i == 1) {
                x = true;
            } else if (i == 2) {
                x = false;
            } else {
                System.out.println("Valor invalido, porfavor vuelva a intentarlo.");
            }
        }
        return x;
    }
    public int definirTemperaturaPerjudicial(int x) {
        int j = 0;
        int l = 0;
        System.out.println("¿Posee de alguna condicion que lo haga vulnerable a ciertas temperaturas?");
        System.out.println("[1] Si, [2] No.");
        while (j != 1 && j != 2) {
            j = input.nextInt();
            if (j != 1 && j != 2) {
                System.out.println("Valor invalido, porfavor vuelva a intentarlo.");
            } else if (j == 1) {
                System.out.println("Segun su medico, ¿a partir de que temperatura su salud se ve vulnerable?");
                while (l < 1) {
                    l = input.nextInt();
                    if (l < 1) {
                        System.out.println("Valor invalido, porfavor vuelva a intentarlo.");
                    } else {
                        if (x > l) {
                          x = l;
                        }
                    }
                }
            }
        }
        return x;
    }
}