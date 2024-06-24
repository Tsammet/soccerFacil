package Views;

import java.util.Scanner;

import com.trabajosoccer.Controller;

import Entidades.Doctor;


public class viewDoctor {
    public static Controller controlador;
    public void startDoctor(){
        
        Scanner scDoctor = new Scanner(System.in);

        while (true) {

            System.out.println("-----------------------------------------");
            System.out.println("1. Agrega un nuevo Doctor: ");
            System.out.println("2. Actualiza un Doctor: ");
            System.out.println("3. Busca un Doctor: ");
            System.out.println("4. Elimina un Doctor: ");
            System.out.println("5. Lista todos los Doctores: ");
            System.out.println("6. Salir ");
            System.out.println("-----------------------------------------");

            int choise = scDoctor.nextInt();
            scDoctor.nextLine();

            switch (choise) {
                case 1:
                    
                    Doctor crearDoctor = new Doctor();
                    String codigoDoctorCrear = null;
                    System.out.println("Cuál es el código del doctor: ");
                    codigoDoctorCrear = scDoctor.nextLine();
                    System.out.println("Cuál es el id del doctor: ");
                    crearDoctor.setId(scDoctor.nextInt());
                    scDoctor.nextLine();
                    System.out.println("Cuál es el nombre del doctor : ");
                    crearDoctor.setNombre(scDoctor.nextLine());
                    System.out.println("Cuál es el apellido del doctor: ");
                    crearDoctor.setApellido(scDoctor.nextLine());
                    System.out.println("Cuál es la edad del Doctor: ");
                    crearDoctor.setEdad(scDoctor.nextInt());
                    scDoctor.nextLine();
                    System.out.println("Cuál es el titulo del doctor: ");
                    crearDoctor.setTitulo(scDoctor.nextLine());
                    System.out.println("Cuantos años de experiencia tiene: ");
                    crearDoctor.setExperienciaAños(scDoctor.nextInt());
                    scDoctor.nextLine();
                    controlador.doctors.put(codigoDoctorCrear, crearDoctor);

                    break;
                
                case 2:

                    Doctor doctorActualizar = new Doctor();
                    String codigoDoctorActualizar = null;
                    System.out.println("Cuál es el código del doctor que vas a actualizar: ");
                    codigoDoctorActualizar = scDoctor.nextLine();
                    doctorActualizar = controlador.doctors.get(codigoDoctorActualizar);
                    System.out.println("Cuál es el nombre del doc: ");
                    doctorActualizar.setNombre(scDoctor.nextLine());
                    System.out.println("Cuál es el apellido del doc: ");
                    doctorActualizar.setApellido(scDoctor.nextLine());
                    System.out.println("Cuál es la edad del doc: ");
                    doctorActualizar.setEdad(scDoctor.nextInt());
                    scDoctor.nextLine();
                    controlador.doctors.put(codigoDoctorActualizar, doctorActualizar);

                    break;

                case 3:
                    Doctor buscarDoctor = new Doctor();
                    String codigoDoctorBuscar = null;
                    System.out.println("Cuál es el código del doctor que deseas buscar: ");
                    codigoDoctorBuscar = scDoctor.nextLine();
                    buscarDoctor = controlador.doctors.get(codigoDoctorBuscar);
                    System.out.println("El Doctor  que buscas es: " + buscarDoctor.getNombre());
                    break;
                
                case 4:

                    Doctor doctorEliminar = new Doctor();
                    String codigoDoctorEliminar = null;
                    System.out.println("Cuál es el código del doctor que deseas eliminar: ");
                    codigoDoctorEliminar = scDoctor.nextLine();
                    doctorEliminar = controlador.doctors.get(codigoDoctorEliminar);
                    controlador.doctors.remove(codigoDoctorEliminar);
                    System.out.println("El doctor que ha sido eliminado fue : " + doctorEliminar.getNombre() + " " + doctorEliminar.getApellido());

                    break;

                case 5:

                    for (String codDoctor : controlador.doctors.keySet()) {
                        Doctor todosDoctores = controlador.doctors.get(codDoctor);
                        System.out.println("Nombre :" + todosDoctores.getNombre() + " " + todosDoctores.getApellido());
                    }

                    break;

                case 6:
                    
                    System.out.println("salir");
                    return;
                
                default:
                    scDoctor.close();
                    break;
            }

        }

    }

}
