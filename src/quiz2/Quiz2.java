/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz2;

/**
 *
 * @author TChaves
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Se hace el llamado de la clase ControlSpotify*/
        ControlSpotify cancion = new ControlSpotify(2912, "My Sacrifice", "Creed", 270, 2009);

        /*Se muestran los resultados*/
        System.out.println("El id de la cancion seleccionada es: " + cancion.id);
        System.out.println("El nombre de la cancion seleccionada es: " + cancion.nombre);
        System.out.println("El autor de la cancion seleccionada es: " + cancion.autor);
        System.out.println("La duracion de la cancion seleccionada es de: " + cancion.duracion + " segundos");
        System.out.println("El anio de creacion de la cancion seleccionada es: " + cancion.anio);

    }

}
