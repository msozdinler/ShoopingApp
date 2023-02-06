package ShoppingApp;

public class MainClass {
    public static void main(String[] args) {
        /** Create abjects of all Typs of Seller,
         * Create objects of Product and add them to product list of sellers
         * Create all types of Buyers
         * add products to their cart and call checkOut methods.
         * Check if the results are correct*/
        RegularSeller regularSeller = new RegularSeller("regularSeller");
        PremiumSeller premiumSeller = new PremiumSeller("premiumSeller");

        //Create objects of Product and add them to product list of sellers
        Product product1 = new Product("product1" , 200 ,20);
        Product product2 = new Product("product2" , 100,10);
        regularSeller.addProduct(product1);
        premiumSeller.addProduct(product2);

        //Create all types of Buyers
        RegularBuyer regularBuyer = new RegularBuyer("regularBuyer");
        PremiumBuyer premiumBuyer = new PremiumBuyer("premiumBuyer");

        // add products to their cart and call checkout methods.
        regularBuyer.addToCart(product1);
        regularBuyer.checkOut(PaymentMethod.CREDITCARD);

        premiumBuyer.addToCart(product2);
        premiumBuyer.checkOut(PaymentMethod.CASHonDELIVERY);

    }
}
