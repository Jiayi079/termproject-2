public class Singleton {

    private static Singleton instance = new Singleton(); // only 1 instance ever
    int a; // test variable

    private Singleton(){
        System.out.println("Singleton is being created!");
    }

    public static Singleton getInstance(){
        // wait till this is called
        if (instance == null){
            instance = new Singleton(); // only created if something needs this object
        }
        return instance; // always returns same instance
    }


    public static void main(String[] args) {
        System.out.println("Starting");
        // just for testing
        Singleton a = Singleton.getInstance();
        System.out.println(a);
        a.a = 123;
        System.out.println(a.a); // 123
        doStuff();
        System.out.println(a.a); // 789
    }

    static void doStuff(){
        Singleton a = Singleton.getInstance();
        System.out.println(a);
        System.out.println(a.a); // 123
        a.a = 456;
        System.out.println(a.a); // 456
        doStuff2();
    }

    static void doStuff2(){
        Singleton a = Singleton.getInstance();
        System.out.println(a);
        System.out.println(a.a); // 456
        a.a = 789;
        System.out.println(a.a); // 789
    }
}
