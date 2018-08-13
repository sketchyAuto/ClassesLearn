package AnimalClasses;

public class Chicken extends Bird {
    public Chicken(int age, String gender, int weightInLBs) {
        super(age, gender, weightInLBs);
    }
    //Chicken cannot fly so no need to inheritance the fly method from bird
    //To do this we can create an Abstract Class. called Overriding = Replacing
    //public void fly(){
      //  System.out.println("Chicken cannot fly.......");
    //}

}
