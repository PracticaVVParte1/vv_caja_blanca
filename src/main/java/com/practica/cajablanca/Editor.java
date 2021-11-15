package com.practica.cajablanca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;

public class Editor {

	private AbstractSingleLinkedListImpl<AbstractSingleLinkedListImpl<String>> editor;
	private AbstractSingleLinkedListImpl<String> lista;

	@SuppressWarnings("unchecked")
	public Editor() {
		editor = new SingleLinkedListImpl<>();
	}

	/**
	 * 
	 * @return el tamaño de la lista
	 */
	public int size() {
		return editor.size();
	}

	public boolean editIsEmpty() {
		return this.editor.size() == 0;
	}

	/**
	 * 
	 * @return la lista correspondiente a la línea pasada como parámetro
	 * @throws EmptyCollectionException si el editor está vacío
	 * //@throws Si                       el número de línea es incorrecta lanza
	 *                                  IllegalArgumentException
	 */
	public AbstractSingleLinkedListImpl<String> getLinea(int linea) throws EmptyCollectionException {
		if (editor.isEmpty()) {
			throw new EmptyCollectionException(" editor ");
		}
		if (linea < 0 || linea > editor.size()) {
			throw new IllegalArgumentException();
		}
		return this.editor.getAtPos(linea);
	}

	/**
	 * Leemos un fichero de entrada con líneas de texto que cargaremos en nuestra
	 * lista de listas "lineas".
	 * 
	 * //@param nombre del fichero del que leemos
	 */
	public void leerFichero(String nombreFichero) {
		File archivo;
		FileReader fr = null;
		BufferedReader br;
		String regex = "\\s+|,\\s*|\\.\\s*";
		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File(nombreFichero);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String cadena;
			while ((cadena = br.readLine()) != null) {
				String[] words = cadena.split(regex);
				lista = new SingleLinkedListImpl<>();
				for (String s : words) {
					lista.addLast(s);
				}
				editor.addLast(lista);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra, tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	// public int numPalabras(int inicio, int fin, String palabra) {
	/**
	 * 
	 * @param inicio
	 * @param fin
	 * @param palabra a buscar en el texto
	 * @return número de apariciones de palabra
	 * @throws EmptyCollectionException
	 * @throws IllegalArgumentException si inicio es &lt; 0 or fin &gt; size
	 */
	@SuppressWarnings("unchecked")

	/* 1 */		public int numPalabras(int inicio, int fin, String palabra) {
	/* 2 */			if (inicio <= 0)
	/* 3 */				throw new IllegalArgumentException("La línea de inicio no puede ser menor o igual a cero");
	/* 4 */			if (fin > this.editor.size())
	/* 5 */				throw new IllegalArgumentException("La línea fin no puede ser mayor que el máximo de líneas");
	/* 6 */			int apariciones = 0;
	/* 7 */			if (this.editor.size() > 0) {
	/* 8 */				while (inicio < fin) {
	/* 9 */					this.lista = this.editor.getAtPos(inicio);
	/* 10 */				int pos = 1;
	/* 11 */				while (pos <= this.lista.size()) {
	/* 12 */					String cadena = this.lista.getAtPos(pos);
	/* 13 */					if (cadena.equals(palabra)) {
	/* 14 */						apariciones++;
	/* 15 */					}
	/* 16 */					pos++;
	/* 17 */				}
	/* 18 */			inicio++;
	/* 19 */			}
	/* 20 */		}
	/* 21 */		return apariciones;
	/* 22 */	}

	public int numPalabras() throws EmptyCollectionException {
		if (this.editIsEmpty()) {
			throw new EmptyCollectionException("El editor está vacío");
		}
		int numPalabras = 0;
		if (this.size() > 0) {
			int i = 1;
			while (i <= this.size()) {
				this.lista = getLinea(i);
				for (String s : lista) {
					numPalabras++;
				}
				i++;
			}
		}
		return numPalabras;
	}

	/**
	 * 
	 * @return la palabra de mayor longitud
	 * @throws EmptyCollectionException
	 */

	/* 1 */			public String mayorLongitud() throws EmptyCollectionException {
	/* 2 */				String mayor = null;
	/* 3 */				if (this.editor.size() > 0) {
	/* 4 */					for (int i = 1; i <= this.editor.size(); i++) {
	/* 5 */						this.lista = this.editor.getAtPos(i);
	/* 6 */						for (int pos = 1; pos <= this.lista.size(); pos++) {
	/* 7 */							String cadena = this.lista.getAtPos(pos);
	/* 8 */							if (mayor == null) {
	/* 9 */								mayor = cadena;
	/* 10 */						} else if (cadena.length() > mayor.length()) {
	/* 11 */							mayor = cadena;
	/* 12 */						}
	/* 13 */					}
	/* 14 */				}
	/* 15 */			}
	/* 16 */			return mayor;
	/* 17 */		}

	/**
	 * @param palabra
	 * @param nuevaPalabra Sustituye palabra por nuevapalabra a lo largo de todo el
	 *                     texto
	 */

	/* 1 */			public void sustituirPalabra(String palabra, String nuevaPalabra) {
	/* 2 */				if (this.editor.size() > 0) {
	/* 3 */					AbstractSingleLinkedListImpl<AbstractSingleLinkedListImpl<String>> nuevoEditor =
	/* 4 */                            new SingleLinkedListImpl<>();
	/* 5 */					int i=1;
	/* 6 */					do {
	/* 7 */						AbstractSingleLinkedListImpl<String> aux = new SingleLinkedListImpl<String>();
	/* 8 */						this.lista = this.editor.getAtPos(i);
	/* 9 */						int j=1;
	/* 10 */					while (j<=this.lista.size()) {
	/* 11 */						if (this.lista.getAtPos(j).equals(palabra)) {
	/* 12 */							aux.addLast(nuevaPalabra);
	/* 13 */						}else {
	/* 14 */							aux.addLast(this.lista.getAtPos(j));
	/* 15 */						}
	/* 16 */						j++;
	/* 17 */					}
	/* 18 */					nuevoEditor.addLast(aux);
	/* 19 */					i++;
	/* 20 */				}while (i<=this.editor.size());
	/* 21 */				editor = nuevoEditor;
	/* 22 */				}
	/* 23 */		}

	public static void main(String[] args) throws EmptyCollectionException {
	
	}
}
