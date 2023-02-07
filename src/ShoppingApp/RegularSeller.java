package ShoppingApp;

public class RegularSeller extends Seller {

    public RegularSeller(String name, String address) {
        super(name, address);
        this.setFeeFromPerSale(0.10);
        this.setUserType(UserType.REGULAR);
    }







    /**
     * This class inherits from Seller class. It has no additional variables.
     * Create a corresponding constructor with super and in the constructor
     * set feeFromPerSale to 0.10,
     * set userType as REGULAR
     * <p>
     * Implement sellProduct method and in the method
     * set balance to productPrice-productPrice*feeFromPerSale
     * and reduce product stock by 1
     */






    @Override
    public void sellProduct(Product product) {
        double balance = product.getPrice() - product.getPrice() * this.getFeeFromPerSale();
        this.setBalance(this.getBalance() + balance);
        product.setStock(product.getStock()-1);

    }
}