package ua.edu.ucu.apps.demo.Delivery;

import ua.edu.ucu.apps.demo.Item.Item;
import ua.edu.ucu.apps.demo.FlowerUser.FlowerUser;

import java.util.List;

public class PostDeliveryStrategy {
    public void deliver(List<Item> items, FlowerUser user){
        for (Item item : items){
            user.addItem(item);
            user.setMoney(user.getMoney() - 2);
        }
    }
}
