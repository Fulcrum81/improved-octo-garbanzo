package automation;

public class TestBase {

    public void setup() {
        System.out.println("Opening browser");
        System.out.println("Opening application URL");
        System.out.println("Logging in as Vadim");
    }

    public void teardown() {
        System.out.println("Closing browser");
    }
}
