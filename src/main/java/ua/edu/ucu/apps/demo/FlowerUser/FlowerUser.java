package ua.edu.ucu.apps.demo.FlowerUser;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.Item.Item;

import java.util.ArrayList;
import java.util.List;


public class FlowerUser {
    @Setter
    @Getter
    double money;
    String name;
    List<Item> items = new ArrayList<>();

    public FlowerUser(String name, double money){
        this.name = name;
        this.money = money;
    }
    public void addItem(Item item){
        items.add(item);
    }

}
