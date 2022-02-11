import java.net.BindException;

class Bird {
    String type;
    Integer wingSpan;
    // ...

    // change return type to builder
    public Bird(String type, Integer wingSpan) {
        this.type = type;
        this.wingSpan = wingSpan;
    }
}

// name it thing you are building + "Builder"
class BirdBuilder {
    // copy paste the parameters
    String type;
    Integer wingSpan;
    // ...

    public BirdBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public BirdBuilder setWingSpan(Integer wingSpan) {
        this.wingSpan = wingSpan;
        return this;
    }

    // return finalized object
    // do call new
    // name it "Build"
    public Bird build() {
        return new Bird(type, wingSpan);
    }
}

public class BuilderDemo {
    public static void main(String[] args) {
        Bird a = new Bird("Emu", 5);

        BirdBuilder bBuilder = new BirdBuilder();
        bBuilder.setType("Eagle"); // is more verbose, but easier to read if too many args
        bBuilder.setWingSpan(8);
        Bird b = bBuilder.build();

        Bird c = new BirdBuilder().setType("Ostrich").setWingSpan(9).build();
    }
}
