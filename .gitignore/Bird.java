package AnimalClasses;

//Bird class (Child) inheriting from the Animal class (Parent) we use extends keyword

public class Bird extends Animal{

    public Bird(int age, String gender, int weightInLBs) {
        super(age, gender, weightInLBs);
    }

//    public void fly(){
//        System.out.println("Flying......");

    //Because not all birdrs can fly we need to create an interface. Interface is like a contract and any class that
    //implements that interface, it becomes mandatory for the class to implement the method define in the interface
    //}
}
