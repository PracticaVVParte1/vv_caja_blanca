package com.practica.cajablanca;
import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PruebasSustituirPalabra {
    Editor editor= new Editor();

    @Test
    @DisplayName("SustituirPalabraPruebaCamino1")
    public void SustituirPalabraPruebaCamino1()  {
        boolean tamanioEditor= editor.editIsEmpty();
        assertTrue(tamanioEditor);
    }

    /* La prueba del camino 2 no se puede probar ya que this.lista.size no puede ser menor que j,
    ya que j inicialmente vale 1 y this.lista no puede estar vacia */

    @Test
    @DisplayName("SustituirPalabraPruebaCamino3")
    public void SustituirPalabraPruebaCamino3() throws EmptyCollectionException {

        editor.leerFichero("ficheros/PruebasSustituirPalabra-Prueba3.txt");

        editor.sustituirPalabra("hola","adios");
        AbstractSingleLinkedListImpl<String> aux1 = editor.getLinea(1);
        AbstractSingleLinkedListImpl<String> aux2 = new SingleLinkedListImpl<>("adios");
        assertIterableEquals(aux2,aux1);
    }

    @Test
    @DisplayName("SustituirPalabraPruebaCamino4")
    public void SustituirPalabraPruebaCamino4() throws EmptyCollectionException {

        editor.leerFichero("ficheros/PruebasSustituirPalabra-Prueba4.txt");

        editor.sustituirPalabra("hola","adios");
        AbstractSingleLinkedListImpl<String> aux1 = editor.getLinea(1);
        AbstractSingleLinkedListImpl<String> aux2 = new SingleLinkedListImpl<>("cactus");
        assertIterableEquals(aux2,aux1);
    }

    /* La prueba del camino 5 no se puede probar ya que this.lista.size no puede ser menor que j,
    ya que j inicialmente vale 1 y this.lista no puede estar vacia */

}
