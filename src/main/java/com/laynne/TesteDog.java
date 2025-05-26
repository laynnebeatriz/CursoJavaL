package com.laynne;

public class TesteDog {

    public static void main(String[] args) {
        Dog fido = new Dog();
        fido.name = "Fido";
        fido.age = 18;
        fido.weight = 5;

        Dog[] dogs = new Dog[7];

        dogs[0] = fido;

        Dog wendy = new Dog();
        wendy.name = "Wendy";
        wendy.age = 10;
        wendy.weight = 3;

        dogs[1] = wendy;
        dogs[3] = dogs[1];
        Dog wendy2 = new Dog();

        wendy2.name = "Wendy";
        wendy2.age = 18;
        wendy2.weight = 5;

        dogs[4] = wendy2;

        wendy.name = "Wendy de Souza de Oliveira";

        System.out.println(dogs[1].name);
        System.out.println(dogs[3].name);
        System.out.println(dogs[4].name);
    }
}
