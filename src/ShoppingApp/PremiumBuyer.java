package ShoppingApp;

public class PremiumBuyer extends Buyer {
    public PremiumBuyer(String name, String address) {
        super(name, address);


    }
    /**This class inherits from Buyer class. It has no additional variables.
     *
     * Create corresponding constructor to super. In the constructor
     *                           set the shippingCost to the value you are getting from calculateShippingCost method
     *
     * Implement checkOut method same as RegularBuyer class
     *
     * Implement calculateShippingCost method. return 0.
     * */




    @Override
    public void checkOut(PaymentMethod paymentMethod) {
        double cartTotal = getCart().getTotal();
        double total = cartTotal + getShippingCost();
        if (paymentMethod == PaymentMethod.CREDITCARD){
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
