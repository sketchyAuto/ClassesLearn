package AnimalClasses;

import java.util.concurrent.Callable;

public class Zoo {
    public static void main(String args[]){

        //Objects Exist during Application Runtime

        Animal animal1 = new Animal(12, "Female", 23);
        animal1.eat();
        System.out.println();
        animal1.sleep();


        Bird bird1 = new Bird(4, "male", 2);
        bird1.eat();
        bird1.sleep();


        Chicken chick1 = new Chicken(1,"f", 1);
        chick1.eat();

        Sparrow spa = new Sparrow(3,"f",4);
        spa.fly();


        //Abstract method as Parent
        AbstractAnimal1 fish1 = new Fish(1,"F",3);
        fish1.move();

    }
}

