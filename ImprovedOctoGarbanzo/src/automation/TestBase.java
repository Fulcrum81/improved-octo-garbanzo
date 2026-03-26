package automation;

import javax.annotation.processing.SupportedAnnotationTypes;

public class TestBase {

    public void setup() {
        Browser browser = Browser.firefox;

        switch (browser) {
            case chrome -> System.out.println(browser.getPath());
            case firefox -> System.out.println("Opening firefox");
            case safari -> System.out.println("Opening safari");
            default -> System.out.println("Unknown browser");
        }

        System.out.println("Opening browser: ");
        System.out.println("Opening application URL");
        System.out.println("Logging in as Vadim");
    }

    public void teardown() {
        System.out.println("Closing browser");
    }
}
