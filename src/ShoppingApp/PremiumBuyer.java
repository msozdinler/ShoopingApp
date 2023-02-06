package ShoppingApp;

public class PremiumBuyer extends Buyer {
    /**
     * This is an abstract class and inherits from User class. It has no additional variables
     * <p>
     * Create corresponding constructor to super.
     * <p>
     * Create abstract void checkOut method with PaymentMethod parameter
     * Create abstract double calculateShippingCost method with PaymentMethod parameter
     *
     */
    public PremiumBuyer(String name, String address) {
        super(name, address);
    }



    /* This is an abstract class and inherits from User class. It has no additional variables
     * <p>
     * Create corresponding constructor to super.
     * <p>
     * Create abstract void checkOut method with PaymentMethod parameter
     * Create abstract double calculateShippingCost method with PaymentMethod parameter
     *
     * @param name
     * @param address
     * @param cart
     * @param shippingCost
     * @param userType */




    @Override
    public void checkOut(PaymentMethod paymentMethod) {
        double cartTotal = getCart().getTotal();
        double total = cartTotal + getShippingCost();
        if (paymentMethod == paymentMethod.CREDITCARD){
            System.out.println("$" + total + "has been deducted from your card");
        } else if (paymentMethod== PaymentMethod.CREDITCARD) {
            System.out.println("The amount you must pay on delivery is $" + total);

        }
    }

    @Override
    public double calculateShippingCost(PaymentMethod paymentMethod) {
        return 0;
    }




}
