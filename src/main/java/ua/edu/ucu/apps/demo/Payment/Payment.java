package ua.edu.ucu.apps.demo.Payment;

import ua.edu.ucu.apps.demo.FlowerUser.FlowerUser;

public interface Payment {
    void pay(double price, FlowerUser user);
}
