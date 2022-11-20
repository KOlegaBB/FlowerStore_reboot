package ua.edu.ucu.apps.demo.Payment;

import ua.edu.ucu.apps.demo.FlowerUser.FlowerUser;

public class PayPalPaymentStrategy {
    public void pay(double price, FlowerUser user){
        user.setMoney(user.getMoney() - price * 1.1);
    }
}
