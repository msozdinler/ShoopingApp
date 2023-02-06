package ShoppingApp;

public class PremiumSeller extends Seller{
    public PremiumSeller(String name, String address, Cart cart, double shippingCost, UserType userType) {
        super(name, address, cart, shippingCost, userType);
        this.setFeeFromPerSale(0.5);
        this.setUserType(UserType.PREMIUM);
    }

    @Override
    public void sellProduct(Product product) {
        this.setBalance(product.getPrice() - product.getPrice() * this.getFeeFromPerSale());
        product.setStock(product.getStock() - 1);
    }


    /** This class inherits from Seller class. It has no additional variables.
     *
     * Create a corresponding constructor. In the constructor
     *                      set feeFromPerSale to 0.5
     *                      set userType as PREMIUM
     *
     * Implement sellProduct method the same way from RegularSeller class
     * */


    }

