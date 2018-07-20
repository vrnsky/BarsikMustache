package me.vrnsky.persistence;

import me.vrnsky.domain.Item;
import me.vrnsky.persistence.interfaces.HibernateManager;
import me.vrnsky.persistence.interfaces.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemRepositoryImpl implements ItemRepository {

    private HibernateManager hbManager;

    @Autowired
    public ItemRepositoryImpl(HibernateManager manager) {
        this.hbManager = manager;
    }

    public void add(Item item) {

    }

    public List<Item> all() {
        return null;
    }
}
