package by.cdp.ksr.task2.entity;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by Vitali_Markusheusky on 5/20/2019.
 */
public class Shop {
    private ArrayList<Product> products;

    public Shop(){
        products = new ArrayList<Product>();
     }

     private boolean isProductsInShop(){
        if (products.size()== 0){
            return false;
        }
        return true;
     }

     public Product getProduct(String nameProducts) {
         Product product = null;

             if (isProductsInShop()) {
                 for (Product prod : products) {
                     if (prod.getProductName() == nameProducts) {
                         product = prod;
                     }
                 }
             }

         return product;
     }


     public void addProductToShop(Product product){
         products.add(product);
     }



}
