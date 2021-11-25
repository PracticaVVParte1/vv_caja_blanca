package com.practica.cajablanca;
import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class SustituirPalabra {

    Editor editor= new Editor();

    @Test
    @DisplayName("SustituirPalabra1")
    public void SustituirPalabra1()  {

        boolean tamañoEditor= editor.editIsEmpty();
        assertEquals(true,tamañoEditor);



    }
    // this.lista.size no puede ser menor que j, ya que j inicialmente vale 1 y this.lista no puede estar vacia
    @Test
    @DisplayName("SustituirPalabra3")
    public void SustituirPalabra3()  {

        editor.leerFichero("ficheros/SustituirPalabra-1elemento.txt");
    }
    @Test
    @DisplayName("SustituirPalabra4")
    public void SustituirPalabra4()  {

        int tamañoEditor= editor.size();
        assertEquals(0,tamañoEditor);

    }
    @Test
    @DisplayName("SustituirPalabra5")
    public void SustituirPalabra5()  {

        int tamañoEditor= editor.size();
        assertEquals(0,tamañoEditor);

    }




}
