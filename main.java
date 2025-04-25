import java.util.Scanner;

public class RegistroVisitanteSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("REGISTRO DE VISITANTE");
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();


        int visitas = 0;
        int totalMinutos = 0;

        System.out.println("\nREGISTRO SEMANAL (7 días)");
        for (int dia = 1; dia <= 7; dia++) {
            System.out.print("¿Visitó el día " + dia + "? (s/n): ");
            String respuesta = sc.nextLine().toLowerCase();

            if (respuesta.equals("s")) {
                visitas++;
                System.out.print("Minutos de visita: ");
                totalMinutos += sc.nextInt();
                sc.nextLine(); // Limpiar buffer
            }
        }

        double promedio = visitas > 0 ? (double) totalMinutos / visitas : 0;
        boolean mayorEdad = edad >= 18;

        // 4. Mostrar reporte
        System.out.println("\nREPORTE FINAL");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " - " + (mayorEdad ? "Mayor" : "Menor") + " de edad");
        System.out.println("Total visitas: " + visitas);
        System.out.println("Promedio minutos: " + promedio);
    }
}


