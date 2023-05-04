package com.openbootcamp.ejercicio.sesion3;

public class concatenarTextos {

    public static void main(String[] args) {

        /*
        Advantages of the StringBuilder class
        It stores characters specified by its capacity, if this is exceeded, it is increased to accommodate the additional characters;
        Does not need to allocate new objects when performing a concatenation;
        Are not synchronized;
        Not thread-safe;
         */

        String[] nombres = {"Ana", "Juan", "Pedro", "Luis"};
        StringBuilder resultado = new StringBuilder();
        for (String nombre : nombres) {
            resultado.append(nombre + " ");
        }
        System.out.println(resultado);

        // Using while
        System.out.println("\n");
        String[] nombres2 = {"Ana", "Juan", "Pedro", "Luis"};
        StringBuilder resultado2 = new StringBuilder();
        int i = 0;
        while (i < nombres.length) {
            resultado2.append(nombres2[i] + " ");
            i++;
        }
        System.out.println(resultado);
    }


}
