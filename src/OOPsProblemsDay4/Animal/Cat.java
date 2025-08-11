package OOPsProblemsDay4.Animal;

public class Cat implements Animal,Eatable,Sleepable,Soundable {

    @Override
    public void eat() {
        System.out.println("Cat drinking milk");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleep on table");
    }

    @Override
    public void makeSound() {
        System.out.println("Meows");
    }
    @Override
    public void performActions() {
        eat();
        sleep();
        makeSound();
    }
}
