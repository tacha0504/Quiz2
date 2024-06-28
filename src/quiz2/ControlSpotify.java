/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2;

/**
 *
 * @author TChaves
 */
public class ControlSpotify {

    /*Spotify requiere crear una clase para controlar la programación de sus canciones,
para ello requiere los siguientes atributos: Id. de la canción, título, autor, duración
y año de creación. */
    
 /*Se crean los atributos solicitados*/
    public int id;
    public String nombre;
    public String autor;
    public int duracion;
    public int anio;

    /*Se crea el constructor con sus respectivos métodos*/
    public ControlSpotify(int id, String nombre, String autor, int duracion, int anio) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.duracion = duracion;
        this.anio = anio;
    }
}
