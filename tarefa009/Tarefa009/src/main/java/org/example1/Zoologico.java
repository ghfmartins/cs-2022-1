package org.example1;

public class Zoologico {

    Animal[] jaulas = new Animal[10];

    void visitarZoologico() {
       for( int i = 0; i < 10; i++){
           jaulas[i].emitirSom();
           jaulas[i].realizaAcao();
       }
    }
}
