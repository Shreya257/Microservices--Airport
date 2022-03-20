package com.example.Passenger.service;

import com.example.Passenger.model.Item;
import com.example.Passenger.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    public Item getItem(String itemID) {
        return itemRepository.findById(itemID).orElse(null);
    }
}
