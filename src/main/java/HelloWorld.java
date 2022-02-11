// import java.util.Calendar;
class Animals {
    public void sayHello(){
        System.out.println("Animal");
    }
}

class Canine extends Animals {
    @Override
    public void sayHello(){
        System.out.println("Howl");
    }
}


class Dog extends Canine {

    @Override
    public void sayHello(){
        System.out.println("Bark");
    }

    public void sayHelloSuper(){
        super.sayHello();
    }
}



public class HelloWorld {

    public static void main(String args[]){
        Animals animal = new Animals();
        Dog dog = new Dog();
        Animals aa = new Dog(); // Is DOG an Animal? (Yes)

        animal.sayHello(); //Animal
        dog.sayHello(); //Bark
        aa.sayHello(); //Bark

        System.out.println("--------------");
        animal = dog; // Dog is an Animal
        // b = new ClassA(); now allowed
        animal.sayHello();; //Bark

        System.out.println("--------------");
        dog.sayHelloSuper();

    }
}
