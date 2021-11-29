package com.practica.cajablanca;




import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class PruebasNumPalabras {

    Editor prueba = new Editor();

    @Test
    @DisplayName("NumPalabrasPrueba1")
    public void NumPalabrasPrueba1() {
        assertThrows(IllegalArgumentException.class, () -> prueba.numPalabras(0,prueba.size()-1,"hola"));

    }
    @Test
    @DisplayName("NumPalabrasPrueba2")
    public void NumPalabrasPrueba2() {
        assertThrows(IllegalArgumentException.class, () -> prueba.numPalabras(3,prueba.size()+1,"hola"));
    }

    @Test
    @DisplayName("NumPalabrasPrueba3")
    public void NumPalabrasPrueba3() {
        int h = prueba.numPalabras(2,prueba.size()-1,"hola");
        assertEquals(0,h);
    }

    @Test
    @DisplayName("NumPalabrasPrueba4")
    public void NumPalabrasPrueba4() {
        prueba.leerFichero("ficheros/PruebasNumPalabras-Prueba4.txt");
        int h = prueba.numPalabras(1,0,"hola");
        assertEquals(0,h);
    }

    /* La prueba del  camino 5 no se puede realizar ya que this.lista.size no puede ser menor que posicion, ya que posicion inicialmente
        vale 1 y this.lista no puede estar vacia */

    @Test
    @DisplayName("NumPalabrasPrueba6")
    public void NumPalabrasPrueba6() {
        prueba.leerFichero("ficheros/PruebasNumPalabras-Pruebas6y7.txt");
        int h = prueba.numPalabras(1,2,"x");
        assertEquals(0,h);
    }

    @Test
    @DisplayName("NumPalabrasPrueba7")
    public void NumPalabrasPrueba7() {
        prueba.leerFichero("ficheros/PruebasNumPalabras-Pruebas6y7.txt");
        int h = prueba.numPalabras(1,2,"hola");
        assertEquals(1,h);
    }

}
