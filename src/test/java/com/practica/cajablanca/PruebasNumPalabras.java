package com.practica.cajablanca;




import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class PruebasNumPalabras {

    Editor prueba = new Editor();

    @Test
    @DisplayName("NumPalabrasPruebaCamino1")
    public void NumPalabrasPruebaCamino1() {
        assertThrows(IllegalArgumentException.class, () -> prueba.numPalabras(0,prueba.size()-1,"hola"));

    }
    @Test
    @DisplayName("NumPalabrasPruebaCamino2")
    public void NumPalabrasPruebaCamino2() {
        assertThrows(IllegalArgumentException.class, () -> prueba.numPalabras(3,prueba.size()+1,"hola"));
    }

    @Test
    @DisplayName("NumPalabrasPruebaCamino3")
    public void NumPalabrasPruebaCamino3() {
        int h = prueba.numPalabras(2,prueba.size()-1,"hola");
        assertEquals(0,h);
    }

    @Test
    @DisplayName("NumPalabrasPruebaCamino4")
    public void NumPalabrasPruebaCamino4() {
        prueba.leerFichero("ficheros/PruebasNumPalabras-Prueba4.txt");
        int h = prueba.numPalabras(1,0,"hola");
        assertEquals(0,h);
    }

    /* La prueba del  camino 5 no se puede realizar ya que this.lista.size no puede ser menor que posicion, ya que posicion inicialmente
        vale 1 y this.lista no puede estar vacia */

    @Test
    @DisplayName("NumPalabrasPruebaCamino6")
    public void NumPalabrasPruebaCamino6() {
        prueba.leerFichero("ficheros/PruebasNumPalabras-Pruebas6y7.txt");
        int h = prueba.numPalabras(1,2,"x");
        assertEquals(0,h);
    }

    @Test
    @DisplayName("NumPalabrasPruebaCamino7")
    public void NumPalabrasPruebaCamino7() {
        prueba.leerFichero("ficheros/PruebasNumPalabras-Pruebas6y7.txt");
        int h = prueba.numPalabras(1,2,"hola");
        assertEquals(1,h);
    }
}
