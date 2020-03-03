/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciostring;

/**
 *
 * @author Kevin
 */
public class EjercicioString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre, apellido,  genero, estudio, autoFavorito, colorFavorito, 
                comidaFavorita, oracion;
        byte edad;
        nombre="Kevin";
        apellido="Lezana";
        edad=23;
        genero="Masculino";
        estudio="medio";
        autoFavorito="Jeep";
        colorFavorito="Corinto";
        comidaFavorita="Hamburguesa";
        oracion="Mi nombre es "+nombre+" "+apellido+", "+"tengo "+edad+" años,"+"sexo :"+genero+", estudio: "+estudio+", mi auto favorito es : "
        +autoFavorito+", mi color favorito es "+colorFavorito+" y mi comida favorita es "+comidaFavorita;
        System.out.println(oracion);
        System.out.println(oracion.toLowerCase());
        System.out.println(oracion.toUpperCase());
    }
    
}
