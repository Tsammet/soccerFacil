package com.trabajosoccer;

import java.util.Hashtable;

import Entidades.Coach;
import Entidades.Doctor;
import Entidades.Player;
import Entidades.Team;

public class Controller {

    public Hashtable <String, Team> equipos = new Hashtable<>();

    public Hashtable <String, Player> jugadores = new Hashtable<>();

    public Hashtable <String, Coach> coachs = new Hashtable<>();

    public Hashtable <String, Doctor> doctors = new Hashtable<>();

}
