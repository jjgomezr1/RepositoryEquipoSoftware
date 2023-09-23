import java.util.Scanner;
class Main { 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    int i;    int b = 0;   int t;   int n = 0;    int c;    int o;    int k;    int m;    int u;    int s = 0;    int t2 = 0;    int t3 = 0;
    String informacion = "- Evite exposicion prolongada al sol, esto aumenta el rieso de un golpe de calor. " + //
            "- Elija ropa liviana a la hora de vestirse. " + //
            "- Tenga al alcanze una fuente de agua para hidratarse, haga uso de esta frecuentemente. " + //
            "- Mantengase en lugraes frescos bien ventilados. " + //
            "- Evite tomar alcohol y bebidas con altos indices de azucar. " + //
            "- Evite el trabajo fisico arduo y prolongado. " + //
            "- Situece en sombras en la medida de lo posible. " + //
            "- No espere a tener sed para hidratarse. ";
    String informacion2 = "- Evite dejar su mascota solos en vehiculos sin aire acondicionado. " + //
            "- Abra las ventanas de su hogar para permitir el flugo del aire. " + //
            "- Evite colocar accesorios para mascotas como por ejemplo ropa. " + //
            "- Evite medidas extremas, como baños de agua fria. " + //
            "- Asegurese que su mascota tenga disponible de agua, y evite que este la beba de manera acelerada.";
    System.out.println("¿Que desea hacer?");
    System.out.println("Escriba [1] si quiere saber como lo perjudica la temperatura actual");
    System.out.println("Escriba [2] si quiere ver como se puede ver perjudicado en los siguientes dias");
    i = input.nextInt();
    System.out.println("Temperatura hipotetica: ");
    t = input.nextInt();
    if (i == 2) {
        System.out.println("Temperatura hipotetica (Mañana): ");
        t2 = input.nextInt();
        System.out.println("Temperatura hipotetica (Pasado mañana): ");
        t3 = input.nextInt();
    }
    System.out.println("Seleccione su ciudad entre las siguientes opciones: ");
    System.out.println("[1]Medellin, [2]Bogota, [3]Cartagena, [4]Cali, [5]Santa Marta");
    c = input.nextInt();
    if (c == 1) {
        s = 32;
    } else if (c == 2) {
        s = 25;
    } else if (c == 3) {
        s = 35;
    } else if (c == 4) {
        s = 34;
    } else if (c == 5) {
        s = 36;
    }
    System.out.println("¿Presenta condiciones medicas que lo hagan vulnerable a ciertas temperaturas? Escibra [1] si las presenta.");
    k = input.nextInt();
    if (k==1) {
        System.out.println("Segun su medico, ¿A partir de que temperatura se puede ver vulnerable?");
        s = input.nextInt();
    }
    System.out.println("¿Posee de una o mas mascotas? Escriba [1] si posee.");
    m = input.nextInt();
    if (i == 1) {
        if (t >= s) {
            if (t >= s) {
                System.out.println("La temperatura actual puede poseer un riesgo para su salud.");
                System.out.println("¿Desea ver las recomendaciones para esta temperatura? Escibra [1] si lo desea.");
                o = input.nextInt();
                if (o == 1) {
                    System.out.println("");
                    System.out.println(informacion);
                    System.out.println("");
                }
            } else {
                System.out.println("La temperatura actual no posee un riesgo para su salud");
            }
            if (m == 1) {
                if (t > 30) {
                    System.out.println("La temperatura actual puede poseer un riesgo para la salud de su mascota.");
                    System.out.println("¿Desea ver las recomendaciones para su mascota? Escibra [1] si lo desea.");
                    u = input.nextInt();
                    if (u == 1) {
                        System.out.println("");
                        System.out.println(informacion2);
                    }
                } else {
                    System.out.println("La temperatura actual no posee un riesgo para su mascota.");
                }
            }
        }
    } else if (i == 2) {
        System.out.println("Informacion de hoy, mañana y pasado mañana:");
        System.out.println("");
        System.out.print("HOY: Temperatura actual: " +t+ "° ");
        if (t >= s) {
            System.out.print("(RIESGO POR ALTA TEMPERATURA) ");
            n = 1;
        }
        if (m == 1 && t > 30) {
            System.out.print("(RIESGO DE MASCOTA POR TEMPERATURA)");
            b = 1;
        }
        System.out.println("");
        System.out.print("MAÑANA: Temperatura pronosticada: " +t2+ "° ");
        if (t2 >= s) {
            System.out.print("(RIESGO POR ALTA TEMPERATURA) ");
            n = 1;
        }
        if (m == 1 && t2 > 30) {
            System.out.print("(RIESGO DE MASCOTA POR TEMPERATURA)");
            b = 1;
        }
        System.out.println("");
        System.out.print("PASADO MAÑANA: Temperatura pronosticada: " +t3+ "° ");
        if (t3 >= s) {
            System.out.print("(RIESGO POR ALTA TEMPERATURA) ");
            n = 1;
        }
        if (m == 1 && t3 > 30) {
            System.out.print("(RIESGO DE MASCOTA POR TEMPERATURA)");
            b = 1;
        }
        System.out.println("");
        System.out.println("");
        if (n == 1) {
            System.out.println("Un dia o mas entre hoy y pasado mañana padecen temperaturas con riesgo a la salud.");
            System.out.println("¿Desea ver informacion para prevenir riesgos a la salud durante estos dias? Presione [1] si lo desea.");
            o = input.nextInt();
            if (o == 1) {
                System.out.println("");
                System.out.println(informacion);
                System.out.println("");
                o = 0;
            }
        } else {
            System.out.println("No tiene riesgo en su salud por la temperatura en ninguno de los 3 dias.");
        }
        if (b == 1) {
            System.out.println("Un dia o mas entre hoy y pasado mañana parecen temperaturas con riesgo a la salud de su mascota.");
            System.out.println("Desea ver informacion para prevenir riesgos a la salud de su mascota? Presione [1] si lo desea.");
            o = input.nextInt();
            if (o == 1) {
                System.out.println("");
                System.out.println(informacion2);
                System.out.println("");
            } 
        }
    }
}
}