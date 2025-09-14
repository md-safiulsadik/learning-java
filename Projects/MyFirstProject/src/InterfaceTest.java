
public class InterfaceTest implements SomeInterface {

    @Override
    public String getName() {
        return "Some cool name";
    }

    @Override
    public double getId() {
        return 32432.3424;
    }

    @Override
    public void display() {
        System.out.println("Some display");
    }
}


class Test extends InterfaceTest {
    @Override
    public void display() {
        System.out.println("Test display");
    }

    public void cool() {
        System.out.println("This is cool function");
    }
}

class TestMain {

    public static void main(String[] args) {
        SomeInterface test = new Test();

        ((Test) test).cool();
    }
}