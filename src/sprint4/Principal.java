package sprint4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        public static Cliente crearCliente() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el RUT del cliente: ");
            int rut = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Ingrese los nombres del cliente: ");
            String nombres = scanner.nextLine();
            System.out.print("Ingrese los apellidos del cliente: ");
            String apellidos = scanner.nextLine();
            System.out.print("Ingrese el teléfono del cliente: ");
            String telefono = scanner.nextLine();
            System.out.print("Ingrese la AFP del cliente: ");
            String afp = scanner.nextLine();
            System.out.print("Ingrese el sistema de salud (1 para Fonasa, 2 para Isapre): ");
            int sistemaSalud = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Ingrese la dirección del cliente: ");
            String direccion = scanner.nextLine();
            System.out.print("Ingrese la comuna del cliente: ");
            String comuna = scanner.nextLine();
            System.out.print("Ingrese la edad del cliente: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            return new Cliente(rut, nombres, apellidos, telefono, afp, sistemaSalud, direccion, comuna, edad);
        }

        public static Profesional crearProfesional() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el nombre del profesional: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la fecha de ingreso del profesional (DD/MM/AAAA): ");
            String fechaIngreso = scanner.nextLine();
            System.out.print("Ingrese el título del profesional: ");
            String titulo = scanner.nextLine();

            return new Profesional(nombre, fechaIngreso, titulo);
        }

        public static Administrativo crearAdministrativo() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el nombre del administrativo: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la fecha de ingreso del administrativo (DD/MM/AAAA): ");
            String fechaIngreso = scanner.nextLine();
            System.out.print("Ingrese el área del administrativo: ");
            String area = scanner.nextLine();
            System.out.print("Ingrese la experiencia previa del administrativo: ");
            String experienciaPrevia = scanner.nextLine();

            return new Administrativo(nombre, fechaIngreso, area, experienciaPrevia);
        }

        public static Capacitacion crearCapacitacion() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el identificador de la capacitación: ");
            int identificador = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Ingrese el RUT del cliente asociado a la capacitación: ");
            int rutCliente = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Ingrese el día de la semana (lunes, martes, etc.): ");
            String dia = scanner.nextLine();
            System.out.print("Ingrese la hora de la capacitación (HH:MM): ");
            String hora = scanner.nextLine();
            System.out.print("Ingrese el lugar de la capacitación: ");
            String lugar = scanner.nextLine();
            System.out.print("Ingrese la duración de la capacitación: ");
            String duracion = scanner.nextLine();
            System.out.print("Ingrese la cantidad de asistentes: ");
            int cantidadAsistentes = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            return new Capacitacion(identificador, rutCliente, dia, hora, lugar, duracion, cantidadAsistentes);
        }

        while (opcion != 9) {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    Cliente cliente = crearCliente();
                    contenedor.almacenarCliente(cliente);
                    System.out.println("Cliente almacenado.");
                    break;
                case 2:
                    Profesional profesional = crearProfesional();
                    contenedor.almacenarProfesional(profesional);
                    System.out.println("Profesional almacenado.");
                    break;
                case 3:
                    Administrativo administrativo = crearAdministrativo();
                    contenedor.almacenarAdministrativo(administrativo);
                    System.out.println("Administrativo almacenado.");
                    break;
                case 4:
                    Capacitacion capacitacion = crearCapacitacion();
                    contenedor.almacenarCapacitacion(capacitacion);
                    System.out.println("Capacitación almacenada.");
                    break;
                case 5:
                    System.out.print("Ingrese el RUN del usuario a eliminar: ");
                    int runEliminar = scanner.nextInt();
                    contenedor.eliminarUsuario(runEliminar);
                    System.out.println("Usuario eliminado.");
                    break;
                case 6:
                    contenedor.listarUsuarios();
                    break;
                case 7:
                    System.out.print("Ingrese el tipo de usuario (cliente, profesional, administrativo): ");
                    String tipo = scanner.nextLine();
                    contenedor.listarUsuariosPorTipo(tipo);
                    break;
                case 8:
                	contenedor.listarCapacitaciones();
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("----- Menú Principal -----");
        System.out.println("1. Almacenar Cliente");
        System.out.println("2. Almacenar Profesional");
        System.out.println("3. Almacenar Administrativo");
        System.out.println("4. Almacenar Capacitación");
        System.out.println("5. Eliminar Usuario");
        System.out.println("6. Listar Usuarios");
        System.out.println("7. Listar Usuarios por Tipo");
        System.out.println("8. Listar Capacitaciones");
        System.out.println("9. Salir");
        System.out.print("Ingrese su opción: ");
    }
}
