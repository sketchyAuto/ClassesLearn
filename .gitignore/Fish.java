package AnimalClasses;

public class Fish extends AbstractAnimal1 {
    public Fish(int age, String gender, int weightInLBs) {
        super(age, gender, weightInLBs);
    }

    public void move() {
        System.out.println("The fish is Swimming.....");

    }

    public void swim(){
        System.out.println("Swimming.....");
    }
}
