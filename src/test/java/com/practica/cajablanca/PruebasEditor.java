package com.practica.cajablanca;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PruebasEditor {

    Editor editor = new Editor();

    /* Probamos que la funcion editIsEmpty() funciona correctamente*/
    @Test
    @DisplayName("PruebaEditIsEmpty")
    public void PruebaEditIsEmpty() {
        boolean tamanioEditor= editor.editIsEmpty();
        assertTrue(tamanioEditor);
    }

    /* Probamos que la funcion getLinea(int linea) funciona correctamente*/
    @Test
    @DisplayName("PruebaGetLinea")
    public void PruebaGetLinea() throws EmptyCollectionException {
        editor.leerFichero("ficheros/PruebasEditor-Pruebas.txt");
        AbstractSingleLinkedListImpl<String> aux1 = editor.getLinea(1);
        AbstractSingleLinkedListImpl<String> aux2 = new SingleLinkedListImpl<>("hola");
        assertIterableEquals(aux2,aux1);
    }

    /* Probamos que la funcion leerFichero(String nombreFichero) funciona correctamente*/
    @Test
    @DisplayName("PruebaLeerFichero")
    public void PruebaLeerFichero() {
        assertTrue(editor.editIsEmpty());
        editor.leerFichero("ficheros/PruebasEditor-Pruebas.txt");
        assertFalse(editor.editIsEmpty());
    }

    /* Probamos que la funcion size() funciona correctamente*/
    @Test
    @DisplayName("PruebaSize")
    public void PruebaSize() {
        assertEquals(0, editor.size());
        editor.leerFichero("ficheros/PruebasEditor-Pruebas.txt");
        assertEquals(1, editor.size());
    }

    /* Probamos que la funcion numPalabras() funciona correctamente*/
    @Test
    @DisplayName("PruebaNumPalabrasVacio1")
    public void PruebaNumPalabrasVacio1() {
        assertThrows(EmptyCollectionException.class, () -> editor.numPalabras());
    }

    @Test
    @DisplayName("PruebaNumPalabrasVacio2")
    public void PruebaNumPalabrasVacio2() throws EmptyCollectionException {
        editor.leerFichero("ficheros/PruebasEditor-Pruebas.txt" );
        assertEquals(1, editor.numPalabras());
    }
}
