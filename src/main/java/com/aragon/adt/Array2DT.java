package com.aragon.adt;

public class Array2DT<T> {
    private int numRenglones;
    private int numColumnas;
    private T[][] datos;

    public Array2DT(int renglon, int columna) {
        this.numRenglones = renglon;
        this.numColumnas = columna;
        this.datos = (T[][]) new Object[renglon][columna];
    }

    public int getrenglon() {
        return numRenglones;
    }

    public int getCoLSize() {
        return numColumnas;
    }

    public void setElemento(int renglon, int columna, T dato) {
        if (renglon >= 0 && renglon < numRenglones && columna >= 0 && columna < numColumnas) {
            datos[renglon][columna] = dato;
        } else {
            System.out.println("El elemento no es válido");
        }
    }

    public T getElemento(int renglon, int columna) {
        if (renglon >= 0 && renglon < numRenglones && columna >= 0 && columna < numColumnas) {
            return datos[renglon][columna];
        } else {
            System.out.println("El elemento no existe");
            return null;
        }
    }

    public void limpiar(T dato) {
        for (int i = 0; i < numRenglones; i++) {
            for (int j = 0; j < numColumnas; j++) {
                datos[i][j] = dato;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getrenglon(); i++) {
            for (int j = 0; j < getCoLSize(); j++) {
                sb.append(getElemento(i, j)).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
