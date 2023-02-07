package ShoppingApp;


import java.util.ArrayList;
import java.util.List;

public class Cart {

    /** This class has
     *              private double total variable and private list of products named cartProducts
     * Create a constructor with no parameters. In the constructor
     *              set total to 0.
     *              initialize the list
     *
     * Create all getters and setters
     *
     * In setTotal method increment balance by the value you are getting as parameter
     */

    private double total;
    private List<Product> cartProducts;

    public Cart() {
        this.setTotal(0.0);
        this.cartProducts = new ArrayList<>();
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total += total;
    }

    public List<Product> getCartProducts() {
        return cartProducts;
    }

    public void setCartProducts(List<Product> cartProducts) {
        this.cartProducts = cartProducts;
    }
    public void addProduct(Product product){
        this.cartProducts.add(product);
    }
    public void removeProduct(Product product){
        this.cartProducts.remove(product);
    }
}
