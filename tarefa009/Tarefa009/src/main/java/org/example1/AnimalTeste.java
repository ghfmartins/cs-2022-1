package org.example1;

public class AnimalTeste {
    public static void main(String[] args) {

        Veterinario vet = new Veterinario();
        Zoologico zoo = new Zoologico();
        Animal animal1 = new Cachorro("cachorro", 1);
        Animal animal2 = new Cavalo("cavalo", 10);
        Animal animal3 = new Preguica("preguica", 23);

        animal1.emitirSom();
        animal2.emitirSom();
        animal3.emitirSom();
        vet.examinar(animal2);
        zoo.jaulas[0] = animal1;
        zoo.jaulas[1] = animal2;
        zoo.jaulas[2] = animal3;
        zoo.jaulas[3] = animal1;
        zoo.jaulas[4] = animal2;
        zoo.jaulas[5] = animal3;
        zoo.jaulas[6] = animal1;
        zoo.jaulas[7] = animal2;
        zoo.jaulas[8] = animal3;
        zoo.jaulas[9] = animal1;
        zoo.visitarZoologico();
    }
}