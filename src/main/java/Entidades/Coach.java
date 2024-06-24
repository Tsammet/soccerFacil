package Entidades;

public class Coach extends Person{
    private int id;

    public  Coach(){
        super();
    }

    public Coach(int id) {
        this.id = id;
    }

    public Coach(int id, String nombre, String apellido, int edad, int id2) {
        super(id, nombre, apellido, edad);
        id = id2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    


}
