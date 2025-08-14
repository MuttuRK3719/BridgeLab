package OOPsProblemsDay4.Animal;

import java.util.Arrays;

class House {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal lion = new Lion();
        cat.performActions();
        dog.performActions();
        lion.performActions();
    }

}