package automation;

public class PurchaseTest extends TestBase {

    public void addGoodsToCartTest() {
        setup();
        System.out.println("Selecting goods");
        System.out.println("Clicking 'Add to cart' button");
        System.out.println("Validating that the goods were added to cart");
        teardown();
    }


}
