package Entidades;

public class Doctor  extends Person{

    private String titulo;
    private int experienciaAños;

    public  Doctor() {
        super();
    }

    public Doctor(String titulo, int experienciaAños) {
        this.titulo = titulo;
        this.experienciaAños = experienciaAños;
    }

    public Doctor(int id, String nombre, String apellido, int edad, String titulo, int experienciaAños) {
        super(id, nombre, apellido, edad);
        this.titulo = titulo;
        this.experienciaAños = experienciaAños;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getExperienciaAños() {
        return experienciaAños;
    }

    public void setExperienciaAños(int experienciaAños) {
        this.experienciaAños = experienciaAños;
    }

    


}
