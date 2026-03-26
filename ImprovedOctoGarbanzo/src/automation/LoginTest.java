package automation;

public class LoginTest extends TestBase {

    @Override
    public void setup() {
        System.out.println("Opening browser");
        System.out.println("Opening application URL");
    }

    public void loginWithCorrectCredentialsTest() {
        setup();
        super.setup();
        System.out.println("Enter 'Vadim' as login");
        System.out.println("Enter 'qwerty1234!' as password");
        teardown();
    }
}
