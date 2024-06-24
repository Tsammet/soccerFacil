package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Team {
    
    private String nombre;
    private String ciudad;
    private List<Player> listaJugadores;

    public Team(){
        listaJugadores = new ArrayList<Player>();
    }

    public Team(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    } 
    
    
    public List<Player> getListaJugadores() {
        return listaJugadores;
    }
    
    public void setListaJugadores(List<Player> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public void addJugador(Player jugador){
        this.listaJugadores.add(jugador);
    }
}
