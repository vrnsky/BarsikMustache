package me.vrnsky.service;

import me.vrnsky.domain.Item;
import me.vrnsky.persistence.interfaces.ItemRepository;
import me.vrnsky.service.interfaces.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepository repository;

    @Autowired
    public ItemServiceImpl(ItemRepository repository) {
        this.repository = repository;
    }

    public void add(Item item) {
        this.repository.add(item);
    }

    public List<Item> all() {
        return this.repository.all();
    }
}
