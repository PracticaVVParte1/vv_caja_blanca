package com.practica.cajablanca;




import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class NumPalabras {
    Editor prueba = new Editor();



    @Test
    @DisplayName("numPalabrasPrueba1")
    public void numPalabrasPrueba1() {

        assertThrows(IllegalArgumentException.class, () -> {
            prueba.numPalabras(0,prueba.size()-1,"hola");

        });

    }
    @Test
    @DisplayName("numPalabrasPrueba2")
    public void numPalabrasPrueba2() {

        assertThrows(IllegalArgumentException.class, () -> {
            prueba.numPalabras(3,prueba.size()+1,"hola");
        });

    }
    @Test
    @DisplayName("numPalabrasPrueba3")
    public void numPalabrasPrueba3() {

       int h = prueba.numPalabras(2,prueba.size()-1,"hola");
       assertEquals(0,h);

    }
    @Test
    @DisplayName("numPalabrasPrueba4")
    public void numPalabrasPrueba4() {

        prueba.leerFichero("ficheros/numPalabras-1elemento.txt");
        int h = prueba.numPalabras(1,0,"hola");
        assertEquals(0,h);
    }
    /*@Test
    @DisplayName("numPalabrasPrueba5")
    public void numPalabrasPrueba5() {

        prueba2.leerFichero("ficheros/numPalabras-3elementos.txt");
        System.out.println(prueba2.size());
       int h = prueba2.numPalabras(1,2,"hola");
        assertEquals(0,h);
        /*  this.lista.size no puede ser menor que posicion, ya que posicion inicialmente
        vale 1 y this.lista no puede estar vacia
        }
     */






    @Test
    @DisplayName("numPalabrasPrueba6")
    public void numPalabrasPrueba6() {
        prueba.leerFichero("ficheros/numPalabras-3elementos.txt");
        int h = prueba.numPalabras(1,2,"x");
        assertEquals(0,h);

    }


    @Test
    @DisplayName("numPalabrasPrueba7")
    public void numPalabrasPrueba7() {

        prueba.leerFichero("ficheros/numPalabras-3elementos.txt");
        int h = prueba.numPalabras(1,2,"hola");
        assertEquals(1,h);

    }


}
