package com.dev;

public class Human {
      int age ;
     String name;
    static long population;

    public Human(int age, String name){
        this.age= age;
        this.name=name;
      //  this.population=population+=1; //this will work but dont do like this
        Human.population = population+=1;  //static is not related to obj(dev) its common to all Human(class)
    }
}
