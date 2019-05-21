package by.cdp.ksr.task2.main;


import by.cdp.ksr.task2.entity.Cart;
import by.cdp.ksr.task2.entity.Payment;
import by.cdp.ksr.task2.entity.Product;
import by.cdp.ksr.task2.entity.Shop;

/**
 * Created by Vitali_Markusheusky on 5/16/2019.
 */
public class Main {


    public static void main (String[]  avg){
        Shop goodShop=new Shop();
        goodShop.addProductToShop(new Product("Хлеб", 10.2));
        goodShop.addProductToShop(new Product("Крэкер", 14.99));
        goodShop.addProductToShop(new Product("Кефир", 15.2));
        goodShop.addProductToShop(new Product("Молоко", 11.2));
        goodShop.addProductToShop(new Product("Сметана", 8.2));
        Cart mycart = new Cart();
        mycart.addToCart(goodShop.getProduct("Хлеб"));
        mycart.addToCart(goodShop.getProduct("Кефир"));
        mycart.addToCart(goodShop.getProduct("Молоко"));
        Payment.doPayment(mycart, 100);





    }


}
