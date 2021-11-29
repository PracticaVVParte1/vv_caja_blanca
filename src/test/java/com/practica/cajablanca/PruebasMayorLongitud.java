package com.practica.cajablanca;
import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PruebasMayorLongitud {

    Editor editor = new Editor();

    @Test
    @DisplayName("MayorLongitudPrueba1")
    public void MayorLongitudPrueba1() throws EmptyCollectionException {
        String h = editor.mayorLongitud();
        assertNull(h);
    }

    /* La prueba 2 no se puede probar porque el tamaño del editor tiene que ser minimo 1 y para que se salga del for tendría que ser 0, por lo que itera obligatoriamente dentro del for */
    /* La prueba 3 no se puede probar porque el tamaño del editor tiene que ser minimo 1 y para que se salga del for tendría que ser 0, por lo que itera obligatoriamente dentro del for */

    @Test
    @DisplayName("MayorLongitudPrueba4")
    public void MayorLongitudPrueba4() throws EmptyCollectionException {
        editor.leerFichero("ficheros/PruebasMayorLongitud-Prueba4.txt");
        String h = editor.mayorLongitud();
        assertEquals("hola",h);
    }

    @Test
    @DisplayName("MayorLongitudPrueba5")
    public void MayorLongitudPrueba5() throws EmptyCollectionException {
        editor.leerFichero("ficheros/PruebasMayorLongitud-Prueba5.txt");
        String h = editor.mayorLongitud();
        assertEquals("adios",h);
    }

    @Test
    @DisplayName("MayorLongitudPrueba6")
    public void MayorLongitudPrueba6() throws EmptyCollectionException {
        editor.leerFichero("ficheros/PruebasMayorLongitud-Prueba6.txt");
        String h = editor.mayorLongitud();
        assertEquals("adios",h);
    }
}
