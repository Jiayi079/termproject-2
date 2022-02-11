// Base class
abstract class AnimalBase {
    abstract void makeSound();
}

class Cat extends AnimalBase {
    void makeSound() {
        System.out.println("meow");
    }
}

class Tiger extends AnimalBase {
    @Override
    void makeSound() {
    }
}

class AnimalBaseFactory{
    static AnimalBase getInstance(Double number) {
        // switching logic
        // if/else, map, switch
        if(number < 0.5) {
            return new Cat();
        } else {
            return new Tiger();
        }
    }
}

public class FactoryDemo {
    public static void main(String[] args) {
        AnimalBase animal = AnimalBaseFactory.getInstance(Math.random());
        animal.makeSound();

    }
}
