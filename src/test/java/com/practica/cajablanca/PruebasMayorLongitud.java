package com.practica.cajablanca;
import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PruebasMayorLongitud {

    Editor editor = new Editor();

    @Test
    @DisplayName("MayorLongitudPruebaCamino1")
    public void MayorLongitudPruebaCamino1() throws EmptyCollectionException {
        String h = editor.mayorLongitud();
        assertNull(h);
    }

    /* La prueba 2 no se puede probar porque el tamaño del editor tiene que ser minimo 1 y para que se salga del for tendría que ser 0, por lo que itera obligatoriamente dentro del for */
    /* La prueba 3 no se puede probar porque el tamaño del editor tiene que ser minimo 1 y para que se salga del for tendría que ser 0, por lo que itera obligatoriamente dentro del for */

    @Test
    @DisplayName("MayorLongitudPruebaCamino4")
    public void MayorLongitudPruebaCamino4() throws EmptyCollectionException {
        editor.leerFichero("ficheros/PruebasMayorLongitud-Prueba4.txt");
        String h = editor.mayorLongitud();
        assertEquals("hola",h);
    }

    @Test
    @DisplayName("MayorLongitudPruebaCamino5")
    public void MayorLongitudPruebaCamino5() throws EmptyCollectionException {
        editor.leerFichero("ficheros/PruebasMayorLongitud-Prueba5.txt");
        String h = editor.mayorLongitud();
        assertEquals("adios",h);
    }

    @Test
    @DisplayName("MayorLongitudPruebaCamino6")
    public void MayorLongitudPruebaCamino6() throws EmptyCollectionException {
        editor.leerFichero("ficheros/PruebasMayorLongitud-Prueba6.txt");
        String h = editor.mayorLongitud();
        assertEquals("adios",h);
    }
}
