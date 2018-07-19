package me.vrnsky.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * It is item or task in real life.
 * @author vrnsky.
 * @version 0.1
 */
@Data
@NoArgsConstructor
public class Item {

    private int id;

    private String description;

    public Item(int id, String description) {
        this.id = id;
        this.description = description;
    }
}
