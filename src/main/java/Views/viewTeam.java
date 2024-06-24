package Views;

import java.util.Scanner;

import com.trabajosoccer.Controller;

import Entidades.Team;

public class viewTeam {
    public static Controller controlador;

    public void start(){
        
        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("-----------------------------------------");
            System.out.println("1. Agrega un nuevo equipo: ");
            System.out.println("2. Actualiza un equipo: ");
            System.out.println("3. Busca un equipo: ");
            System.out.println("4. Elimina un equipo: ");
            System.out.println("5. Lista todos los equipo: ");
            System.out.println("6. Salir ");
            System.out.println("-----------------------------------------");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    Team equipoCrear = new Team();
                    String codigoEquipo = null;
                    System.out.println("Cuál es el código del equipo: ");
                    codigoEquipo = sc.nextLine();
                    System.out.println("Nombre del equipo: ");
                    equipoCrear.setNombre(sc.nextLine());
                    System.out.println("Ciudad del equipo: ");
                    equipoCrear.setCiudad(sc.nextLine());
                    controlador.equipos.put(codigoEquipo, equipoCrear);
                break;

                case 2:
                    Team equipoActualizar = new Team();
                    String codigoEquipoActualizar = null;
                    System.out.println("Cuál es el codigo del equipo que desea actualizar: ");
                    codigoEquipoActualizar = sc.nextLine();
                    equipoActualizar = controlador.equipos.get(codigoEquipoActualizar);
                    System.out.println("El nombre del equipo que vas a hacer cambios es: " + equipoActualizar.getNombre());
                    
                    System.out.println("------------------------------------");
                    
                    System.out.println("Cuál es el nuevo nombre del equipo: ");
                    equipoActualizar.setNombre(sc.nextLine());
                    System.out.println("Cuál es la nueva ciudad del equipo: ");
                    equipoActualizar.setCiudad(sc.nextLine());
                    controlador.equipos.put(codigoEquipoActualizar, equipoActualizar);
                    
                    System.out.println("------------------------------------");

                    System.out.println("El nuevo nombre del equipo con el código: " + codigoEquipoActualizar + " es : " + equipoActualizar.getNombre() + " Y su ciudad es: " + equipoActualizar.getCiudad());
                    break;

                case 3:

                    Team eqBuscar = new Team();
                    String codigoEquipoBuscar = null;
                    System.out.println("Ingrese el código del equipo que deseas buscar: ");
                    codigoEquipoBuscar = sc.nextLine();
                    eqBuscar = controlador.equipos.get(codigoEquipoBuscar);
                    if (eqBuscar == null){
                        System.out.println("El código del equipo que deseas buscar no se encuentra en el Hash <3");}
                    else{
                        System.out.println("El nombre del equipo que buscaste es " + eqBuscar.getNombre());
                    }
                    break;
                    
                case 4:

                    Team eqEliminar = new Team();
                    String codigoEquipoEliminar = null;
                    System.out.println("Cuál es el código del equipo que desea eliminar: ");
                    codigoEquipoEliminar = sc.nextLine();
                    eqEliminar = controlador.equipos.get(codigoEquipoEliminar);
                    if (eqEliminar != null) {
                        controlador.equipos.remove(codigoEquipoEliminar);
                        System.out.println("El equipo quedó eliminado correctamente");    
                    }else{
                        System.out.println("El código que ingresó es incorrecto.");
                    }
                    break;

                case 5:

                    for (String codEquipos : controlador.equipos.keySet()) {
                        Team equipo = controlador.equipos.get(codEquipos);
                        System.out.println("codigo: " + codEquipos + " Nombre: "+ equipo.getNombre());
                    }

                    break;
                    
                case 6:

                    System.out.println("Saliendo del menú de equipos...");
                    return;

                default:
                    sc.close();
                    break;
            }
        }

    }

}
