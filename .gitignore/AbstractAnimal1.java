package AnimalClasses;



//An abstract class is basically almost a regular class, it can have methods, method body but the keyword is abstract
//An abstract class can only be extended. You can not instantiate instance of an abstract class. It is only meant to be a
//Parent of another class

public abstract class AbstractAnimal1 {

    int age;
    String gender;
    int weightInLBs;


    //constructor is used
    public AbstractAnimal1(int age, String gender, int weightInLBs) {
        this.age = age;
        this.gender = gender;
        this.weightInLBs = weightInLBs;
    }

    public void eat() {
        System.out.println("Eating....");
        System.out.println("Hello, my gender is a " + gender);
        System.out.println("I am " + weightInLBs + " in weight");
        System.out.println("I am " + age + " years old");
    }

    public void sleep(){
        System.out.println("Sleeping....");
    }

    public abstract void move();//An Abstract method
}
