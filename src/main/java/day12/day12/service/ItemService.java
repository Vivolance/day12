package day12.day12.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import day12.day12.repo.ItemRepo;
import day12.day12.model.Item;


@Service    
public class ItemService {

    @Autowired
    ItemRepo itmRepo;

    public List<Item> retrieveItemList() {
        return itmRepo.getCartItems();
    }
    
}
