package me.vrnsky.service.interfaces;

import me.vrnsky.domain.Item;

import java.util.List;

public interface ItemService {

    void add(Item item);

    List<Item> all();
}
