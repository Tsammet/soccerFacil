package Views;

import java.util.Scanner;

import com.trabajosoccer.Controller;

import Entidades.Coach;

public class viewCoach {
    public static Controller controlador;
    public void startCoach(){

        Scanner scCoach = new Scanner(System.in);
        
        while (true) {
            
            System.out.println("-----------------------------------------");
            System.out.println("1. Agrega un nuevo Coach: ");
            System.out.println("2. Actualiza un Coach: ");
            System.out.println("3. Busca un Coach: ");
            System.out.println("4. Elimina un Coach: ");
            System.out.println("5. Lista todos los Coach: ");
            System.out.println("6. Salir ");
            System.out.println("-----------------------------------------");
            
            int choice = scCoach.nextInt();
            scCoach.nextLine();

            switch (choice) {
                case 1:
                   
                    Coach crearCoach = new Coach();
                    String codigoCoach = null;
                    System.out.println("Cuál es el código del Coach que vas a crear: ");
                    codigoCoach = scCoach.nextLine();
                    System.out.println("Cuál es el id del Coach: ");
                    crearCoach.setId(scCoach.nextInt());
                    scCoach.nextLine();
                    System.out.println("Cuál es el nombre del Coach: ");
                    crearCoach.setNombre(scCoach.nextLine());
                    System.out.println("Cuál es el apellido del Coach: ");
                    crearCoach.setApellido(scCoach.nextLine());
                    System.out.println("Cuál es la edad del Coach: ");
                    crearCoach.setEdad(scCoach.nextInt());
                    scCoach.nextLine(); 
                    controlador.coachs.put(codigoCoach, crearCoach);
                
                    break;

                case 2:

                    Coach actualizarCoach = new Coach();
                    String codigoCoachActualizar = null;
                    System.out.println("Cuál es el código del coach que quieres actualizar: ");
                    codigoCoachActualizar = scCoach.nextLine();
                    actualizarCoach = controlador.coachs.get(codigoCoachActualizar);
                    System.out.println("El coach que vas a modificar es:  " + actualizarCoach.getNombre() + " " + actualizarCoach.getApellido());
                    System.out.println("Cuál es el nombre del coach: ");
                    actualizarCoach.setNombre(scCoach.nextLine());
                    System.out.println("Cuál es el apellido del coach: ");
                    actualizarCoach.setApellido(scCoach.nextLine());
                    System.out.println("Cuál es la edad del coach: ");
                    actualizarCoach.setId(scCoach.nextInt());
                    scCoach.nextLine();
                    controlador.coachs.put(codigoCoachActualizar, actualizarCoach);

                    break;

                case 3:
                    Coach buscarCoach = new Coach();
                    String codigoCoachBuscar = null;
                    System.out.println("Cuál es el código del coach: ");
                    codigoCoachBuscar = scCoach.nextLine();
                    buscarCoach = controlador.coachs.get(codigoCoachBuscar);
                    System.out.println("El nombre del coach que usted busca es: " + buscarCoach.getNombre() + " " + buscarCoach.getApellido());
                    break;

                case 4:

                    Coach eliminarCoach = new Coach();
                    String codigoCoachEliminar = null;
                    System.out.println("Cuál es el código del coach que deseas eliminar: ");
                    codigoCoachEliminar = scCoach.nextLine();
                    eliminarCoach = controlador.coachs.get(codigoCoachEliminar);
                    controlador.coachs.remove(codigoCoachEliminar);
                    System.out.println("El coach que acabas de eliminar es: " + eliminarCoach.getNombre());
                    break;

                case 5:

                    for (String codCoach : controlador.coachs.keySet()) {
                        Coach coachs = controlador.coachs.get(codCoach);
                        System.out.println("NOMBRE COACH: " + coachs.getNombre() + " " + coachs.getApellido());
                    }

                case 6:
                    System.out.println("Salir");
                    return;

                default:
                    scCoach.close();
                    break;
            }

        }
    

    }

}
