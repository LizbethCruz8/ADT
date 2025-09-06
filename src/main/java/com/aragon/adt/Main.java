package com.aragon.adt;

public class Main {
    public static void main(String[] args) {
        Array2DT<String> tablero = new Array2DT<>(8, 8);

        String Rey_Negro = "\u265A";
        String Reina_Negra = "\u265B";
        String Torre_Negra = "\u265C";
        String Alfil_Negro = "\u265D";
        String Caballo_Negro = "\u265E";
        String Peon_Negro = "\u265F";


        String Rey_Blanco = "\u2654";
        String Reina_Blanca = "\u2655";
        String Torre_Blanca = "\u2656";
        String Alfil_Blanco = "\u2657";
        String Caballo_Blanco = "\u2658";
        String Peon_Blanco = "\u2659";


        tablero.setElemento(0, 0, Torre_Negra);
        tablero.setElemento(0, 1, Caballo_Negro);
        tablero.setElemento(0, 2, Alfil_Negro);
        tablero.setElemento(0, 3, Reina_Negra);
        tablero.setElemento(0, 4, Rey_Negro);
        tablero.setElemento(0, 5, Alfil_Negro);
        tablero.setElemento(0, 6, Caballo_Negro);
        tablero.setElemento(0, 7, Torre_Negra);


        for(int j = 0; j < 8; j++) {
            tablero.setElemento(1, j, Peon_Negro);
        }
        for(int j = 2; j < 6; j++) {
            for(int k = 0; k < 8; k++) {
                tablero.setElemento(j, k, "|_|");
            }
        }



        tablero.setElemento(7, 0, Torre_Blanca);
        tablero.setElemento(7, 1, Caballo_Blanco);
        tablero.setElemento(7, 2, Alfil_Blanco);
        tablero.setElemento(7, 3, Reina_Blanca);
        tablero.setElemento(7, 4, Rey_Blanco);
        tablero.setElemento(7, 5, Alfil_Blanco);
        tablero.setElemento(7, 6, Caballo_Blanco);
        tablero.setElemento(7, 7, Torre_Negra);


        for(int j = 0; j < 8; j++) {
            tablero.setElemento(6, j, Peon_Blanco);
        }

        System.out.println(tablero.toString());

    }
}


