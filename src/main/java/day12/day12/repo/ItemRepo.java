package day12.day12.repo;

import org.springframework.stereotype.Repository;

import java.util.*;

import day12.day12.model.Item;

//Since it is a repo class, annotate wth @repository
@Repository
public class ItemRepo {

    private List<Item> itemList;

    public List<Item> getCartItems() {

        itemList = new ArrayList<Item>();

        Item itm = new Item();

        itm = new Item();
        itm.setItemName("Louis vuitton");
        itm.setQuantity(5);
        itemList.add(itm);

        itm = new Item();
        itm.setItemName("Hermes");
        itm.setQuantity(3);
        itemList.add(itm);

        itm = new Item();
        itm.setItemName("Coach");
        itm.setQuantity(5);
        itemList.add(itm);

        return itemList;
    }
    
}
