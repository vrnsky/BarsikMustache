package me.vrnsky.controllers;

import me.vrnsky.domain.Item;
import me.vrnsky.service.interfaces.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/items")
public class ItemController {

    private ItemService itemService;

    @Autowired
    public ItemController(ItemService service) {
        this.itemService = service;
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addItem(Model model) {
        model.addAttribute("item", new Item());
        return "additem";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("items", this.itemService.all());
        return "index";
    }



}
