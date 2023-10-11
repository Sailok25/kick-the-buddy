import java.util.Scanner;

public class kick_the_buddy_juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean juegoActivo = true;

        String nombreJugador; // Variable para el nombre del jugador

        while (juegoActivo) {
            int vidaManiqui = 100;
            String nombreManiqui;

            System.out.println("Bienvenido a Kick The Buddy");
            System.out.println("Por favor, ingresa tu nombre:");
            nombreJugador = scanner.nextLine(); // Pedir y guardar el nombre del jugador

            System.out.println("¡Bienvenido, " + nombreJugador + "!");
            System.out.println("Por favor, ingresa el nombre de tu objetivo (el maniquí):");
            nombreManiqui = scanner.nextLine(); // Pedir y guardar el nombre del maniquí

            System.out.println(nombreManiqui + " tiene 100 puntos de vida.");

            while (vidaManiqui > 0) {
                System.out.println("Elige una acción:");
                System.out.println("1. Golpear a " + nombreManiqui);
                System.out.println("2. Disparar a " + nombreManiqui);
                System.out.println("3. Explotar a " + nombreManiqui);
                System.out.println("4. Salir");

                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        vidaManiqui -= 10;
                        System.out.println("Has golpeado a " + nombreManiqui + ". Vida restante: " + vidaManiqui);
                        break;
                    case 2:
                        vidaManiqui -= 20;
                        System.out.println("Has disparado a " + nombreManiqui + ". Vida restante: " + vidaManiqui);
                        break;
                    case 3:
                        vidaManiqui -= 30;
                        System.out.println("Has explotado a " + nombreManiqui + ". Vida restante: " + vidaManiqui);
                        break;
                    case 4:
                        System.out.println("Gracias por jugar, " + nombreJugador + ". ¡Hasta luego!");
                        vidaManiqui = 0;  // Para salir del bucle del juego
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elige una acción válida.");
                }
            }

            System.out.println("¡Has derrotado a " + nombreManiqui + "!");
            System.out.println("¿Deseas jugar de nuevo? (Sí/No)");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("Sí")) {
                juegoActivo = false;
            }
        }

        scanner.close();
    }
}
