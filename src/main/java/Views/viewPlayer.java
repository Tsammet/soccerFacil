package 
Views;

import java.util.Scanner;

import com.trabajosoccer.Controller;

import Entidades.Player;

public class viewPlayer {
    public static Controller controlador;
    public void startPlayer(){

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("1. Agrega un nuevo Jugador: ");
            System.out.println("2. Actualiza un Jugador: ");
            System.out.println("3. Busca un Jugador: ");
            System.out.println("4. Elimina un Jugador: ");
            System.out.println("5. Lista todos los Jugador: ");
            System.out.println("6. Salir ");
            System.out.println("-----------------------------------------");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:

                    Player jugador = new Player();
                    String codigoJugador = null;
                    System.out.println("Cuál es el código del jugador");
                    codigoJugador = sc.nextLine();
                    System.out.println("Id del jugador");
                    jugador.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Cuál es el nombre del jugador: ");
                    jugador.setNombre(sc.nextLine());
                    System.out.println("Cuál es el apellido del jugador: ");
                    jugador.setApellido(sc.nextLine());
                    System.out.println("Cuál es la edad del jugador: ");
                    jugador.setEdad(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Cuál es el dorsal del jugador: ");
                    jugador.setDorsal(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Cuál es la posición del jugador: ");
                    jugador.setPosicion(sc.nextLine());
                    controlador.jugadores.put(codigoJugador, jugador);

                    break;

                case 2:
                    Player jugadorActualizar = new Player();
                    String codigoJugadorActualizar = null;
                    System.out.println("Cuál es el código del Jugador que desea actualizar: ");
                    codigoJugadorActualizar = sc.nextLine();
                    jugadorActualizar = controlador.jugadores.get(codigoJugadorActualizar);
                    System.out.println("El jugador que vas a modificar es: " + jugadorActualizar.getNombre());
                    System.out.println("Cuál es el nombre del jugador: ");
                    jugadorActualizar.setNombre(sc.nextLine());
                    System.out.println("Cuál es el apellido del jugador: ");
                    jugadorActualizar.setApellido(sc.nextLine());
                    System.out.println("Cuál es el número de su dorsal: ");
                    jugadorActualizar.setDorsal(sc.nextInt());
                    sc.nextLine();
                    controlador.jugadores.put(codigoJugadorActualizar, jugadorActualizar);
                    System.out.println("El nombre del jugador que usted actualizo es " + jugadorActualizar.getNombre() + " " + jugadorActualizar.getApellido() + " y su dorsal ahora es el: " + jugadorActualizar.getDorsal());
                    break;

                case 3:
                    Player buscarJugador = new Player();
                    String codigoJugadorBuscar = null;
                    System.out.println("Cuál es el código del jugador que deseas buscar: ");
                    codigoJugadorBuscar = sc.nextLine();
                    buscarJugador = controlador.jugadores.get(codigoJugadorBuscar);
                    System.out.println("El jugador que usted está buscando es :" + buscarJugador.getNombre());
                    break;

                case 4:
                    Player jugadorEliminar = new Player();
                    String codigoJugadorEliminar = null;
                    System.out.println("Cuál es el código del jugador que deseas eliminar: ");
                    codigoJugadorEliminar = sc.nextLine();
                    jugadorEliminar = controlador.jugadores.get(codigoJugadorEliminar);
                    controlador.jugadores.remove(codigoJugadorEliminar);
                    System.out.println("El jugador que usted acaba de eliminar fue: " + jugadorEliminar.getNombre());
                    break;

                case 5:
                        
                    for (String codJugador : controlador.jugadores.keySet()) {
                        Player jugadoresTodos = controlador.jugadores.get(codJugador);
                        System.out.println("Codigo Jugador: "+ codJugador + " nombre jugador : " + jugadoresTodos.getNombre() + " " + jugadoresTodos.getApellido()+
                        " edad " + jugadoresTodos.getEdad() + " dorsal " + jugadoresTodos.getDorsal() );
                    }
                    break;



                case 6:
                    System.out.println("salir");
                    return;
            
                default:
                    sc.close();
                    break;
            }

        }

    }

}
