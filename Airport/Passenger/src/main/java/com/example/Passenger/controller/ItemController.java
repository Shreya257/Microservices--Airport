package com.example.Passenger.controller;

import com.example.Passenger.model.Item;
import com.example.Passenger.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/passenger")
@RestController
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/get/{itemID}")
    public Item getItem(@PathVariable String itemID) {
        return itemService.getItem(itemID);
    }
}
