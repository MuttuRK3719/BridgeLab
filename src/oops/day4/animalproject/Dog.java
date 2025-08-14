package OOPsProblemsDay4.Animal;

public class Dog implements Animal,Eatable,Sleepable,Soundable {
    @Override
    public void eat() {
        System.out.println("Dog is eating kibble");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleep on bed");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }

    @Override
    public void performActions() {
        eat();
        sleep();
        makeSound();
    }
}
