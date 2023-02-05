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

    public PremiumBuyer(String name, String address, Cart cart, double shippingCost, UserType userType) {
        super(name, address, cart, shippingCost, userType);
    }


    @Override
    public void checkOut(PaymentMethod paymentMethod) {

    }

    @Override
    public double calculateShippingCost(PaymentMethod paymentMethod) {
        return 0;
    }




}
