package AnimalClasses;

public class Sparrow extends Bird implements Interfaceflyable{
    public Sparrow(int age, String gender, int weightInLBs) {
        super(age, gender, weightInLBs);
    }

    public void fly() {
        System.out.println("Sparrow can Fly.........");

    }


    //No class can have more than 1 parent
}
