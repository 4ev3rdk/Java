package com.dev;

public class Main {
    public static void main(String[] args) {
        Human Dev = new Human(18,"Dev");
        Human Rishita = new Human(18,"Rishita");
        System.out.println("Age :"+Dev.age +" Name: "+Dev.name);
        System.out.println(Dev.population); //this will work but dont do like this
        System.out.println(Human.population);

        System.out.println(Rishita.population); //this will work but dont do like this
        System.out.println(Rishita.population);


    }
}
