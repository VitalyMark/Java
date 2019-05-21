package by.cdp.ksr.task2.entity;

/**
 * Created by Vitali_Markusheusky on 5/20/2019.
 */
public class Payment {


    public static void doPayment(Cart cart, double myAccount){
        if (cart.getСostProductsInCart()<=myAccount){
            System.out.println("Сумма к оплате = "+ cart.getСostProductsInCart());
            System.out.println("Оплата прошла успешно");
            cart.clearCart();
        }
        else  System.out.println("Недостаточно средств");

    }


}
