// Interface I
interface I {
    void m1(); // Abstract method

    default void m2() {
        System.out.println("Default method m2()");
    }

    static void m3() {
        System.out.println("Static method m3()");
    }

    private void m4() {
        System.out.println("Private method m4() (Only accessible within the interface)");
    }
}

// Concrete class implementing I
class ConcreteI implements I {
    @Override
    public void m1() {
        System.out.println("Abstract method m1() implemented");
    }
}

// Main class
public class TestMain {
    public static void main(String[] args) {
        // Creating an object of ConcreteI
        ConcreteI obj = new ConcreteI();

        // Invoking methods
        obj.m1(); // Calls overridden method
        obj.m2(); // Calls default method

        // Static method called using interface name
        I.m3();
    }
}
