package ShoppingApp;

public class PremiumBuyer extends Buyer {


    /**
     * This class inherits from Buyer class. It has no additional variables.
     * <p>
     * Create corresponding constructor to super. In the constructor
     * set the shippingCost to the value you are getting from calculateShippingCost method
     * <p>
     * Implement checkOut method same as RegularBuyer class
     * <p>
     * Implement calculateShippingCost method. return 0.
     */

    public PremiumBuyer(String name, String address) {
        super(name, address);
        this.setShippingCost(calculateShippingCost());
    }

    @Override
    public void checkOut(PaymentMethod paymentMethod) {

    }

    @Override
    public double calculateShippingCost() {
        return 0;
    }


}
