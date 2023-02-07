package ShoppingApp;

public class MainClass {
    public static void main(String[] args) {
        /** Create abjects of all Typs of Seller,
         * Create objects of Product and add them to product list of sellers
         * Create all types of Buyers
         * add products to their cart and call checkOut methods.
         * Check if the results are correct*/
        RegularSeller regularSeller = new RegularSeller("John Doe" ,"55 Newyork Ave");
        PremiumSeller premiumSeller = new PremiumSeller("Jane Doe" , "33 Monacco Street");

        //Create objects of Product and add them to product list of sellers
        Product product1 = new Product("Television" , "$200" ,20);
        Product product2 = new Product("Book" , "$100" ,10);
        Product product3 = new Product("Book" ,"$20" , 33);
        regularSeller.addProduct(product1);
        premiumSeller.addProduct(product2);
        premiumSeller.addProduct(product3);
        regularSeller.addProduct(product3);


        //Create all types of Buyers
        RegularBuyer regularBuyer = new RegularBuyer("Peter Doe" , "77 Cora Ave");
        PremiumBuyer premiumBuyer = new PremiumBuyer("Richard Doe" , "56 Main Street " );

        // add products to their cart and call checkout methods.
        regularBuyer.addToCart(product1);
        regularBuyer.checkOut(PaymentMethod.CREDITCARD);

        premiumBuyer.addToCart(product2);
        premiumBuyer.addToCart(product3);
        premiumBuyer.checkOut(PaymentMethod.CASHonDELIVERY);


       // System.out.println("Regular Seller 1 product : " + regularSeller.getProducts() + product3);
        System.out.println(regularBuyer);
        System.out.println(regularSeller);
        System.out.println(premiumBuyer);
        System.out.println(premiumSeller);

    }
}
