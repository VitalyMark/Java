package by.cdp.ksr.task2.entity;

import java.util.ArrayList;

/**
 * Created by Vitali_Markusheusky on 5/20/2019.
 */
public class Cart {
   private ArrayList<Product> cart;

   public Cart(){
       this.cart=new ArrayList<Product>();
   }

    public void addToCart(Product product){
       this.cart.add(product);
    }

    public double getСostProductsInCart(){
        double cost=0;
        if(cart.size()!=0){
            for (Product prod : cart){
                cost = cost+prod.getCost();
            }
        }
        return cost;
    }

    public void clearCart(){
        this.cart.clear();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cart cart1 = (Cart) o;

        return cart.equals(cart1.cart);
    }

    @Override
    public int hashCode() {
        return cart.hashCode();
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cart=" + cart +
                '}';
    }
}
