package ShoppingApp;

public class RegularBuyer extends Buyer {
    public RegularBuyer(String name, String address, Cart cart, double shippingCost, UserType userType) {
        super(name, address);
    }


    @Override
    public double calculateShippingCost(PaymentMethod paymentMethod) {
        if (getCart().getTotal() < 50) {
            return getCart().getTotal() * 0.10;
        }
        return 0;
    }

    @Override
    public void checkOut(PaymentMethod paymentMethod) {
        for (Product product : getCart().getCartProducts()) {
            sellProduct(product);
        }
       /** double shipping = calculateShippingCost(paymentMethod); */  /**  ->  not sure this part */
        // double total = getCart().getTotal() + shipping;

        if (paymentMethod == PaymentMethod.CREDITCARD) {
            System.out.println("$" + getCart().getTotal() + getShippingCost() + "has been deducted from your card");

        } else if (paymentMethod == PaymentMethod.CASHonDELIVERY) {
            System.out.println("The amount you must pay on delivery is $" + getCart().getTotal() + getShippingCost());
        }
    }


}


/**
 * This class inherits from Buyer class. It has no additional variables
 * Create a corresponding constructor to super.
 * <p>
 * implement calculateShipping method. In the method
 * if cart total is less than $50 return cartTotal*0.10
 * <p>
 * Implement checkOut method. In the method
 * call sellProduct method for each product and
 * if payment method is CREDITCARD print "$cardTotal+shipping has been deducted from your card"
 * if payment method is CASHonDELIVERY print "The amount you must pay on delivery is $cardTotal+shipping"
 */

