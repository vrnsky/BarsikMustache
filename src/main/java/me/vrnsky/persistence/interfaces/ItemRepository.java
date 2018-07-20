package me.vrnsky.persistence.interfaces;

import me.vrnsky.domain.Item;

import java.util.List;

public interface ItemRepository {

    void add(Item item);

    List<Item> all();
}
