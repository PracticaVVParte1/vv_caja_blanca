package com.practica.cajablanca;
import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MayorLongitud {

    Editor editor = new Editor();


    @Test
    @DisplayName("MayorLongitudPrueba1")
    public void MayorLongitudPrueba1() throws EmptyCollectionException {
        String h = editor.mayorLongitud();

        assertTrue(h == null);

    }
    // La prueba 2 no se puede probar porque el tamaño del editor tiene que ser minimo 1 y para que se salga del for tendría que ser 0
    // La prueba 3 no se puede probar porque el tamaño del editor tiene que ser minimo 1 y para que se salga del for tendría que ser 0

    @Test
    @DisplayName("MayorLongitudPrueba4")
    public void MayorLongitudPrueba4() throws EmptyCollectionException {
        editor.leerFichero("ficheros/MayorLongitud-1elemento.txt");
        String h = editor.mayorLongitud();

        assertEquals("hola",h);

    }

    @Test
    @DisplayName("MayorLongitudPrueba5")
    public void MayorLongitudPrueba5() throws EmptyCollectionException {
        editor.leerFichero("ficheros/MayorLongitud-2elementosInvertidos.txt");
        String h = editor.mayorLongitud();

        assertEquals("adios",h);

    }

    @Test
    @DisplayName("MayorLongitudPrueba6")
    public void MayorLongitudPrueba6() throws EmptyCollectionException {
        editor.leerFichero("ficheros/MayorLongitud-2elementos.txt");
        String h = editor.mayorLongitud();

        assertEquals("adios",h);

    }
}
