package AnimalClasses;



public class Animal {

    int age;
    String gender;
    int weightInLBs;


            //constructor is used
    public Animal(int age, String gender,int weightInLBs){
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
}
