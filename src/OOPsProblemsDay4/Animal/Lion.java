package OOPsProblemsDay4.Animal;

public class Lion implements Animal,Eatable,Sleepable,Soundable {
    @Override
    public void eat() {
        System.out.println("Lion is eating deer meat");
    }

    @Override
    public void sleep() {
        System.out.println("Lion is sleeping in forest");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion making grunt");
    }
    @Override
    public void performActions() {
        eat();
        sleep();
        makeSound();
    }
}
