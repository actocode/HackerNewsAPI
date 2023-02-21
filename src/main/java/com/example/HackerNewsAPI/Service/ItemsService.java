package com.example.HackerNewsAPI.Service;

import com.example.HackerNewsAPI.Model.Items;
import com.example.HackerNewsAPI.Repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ItemsService {

    @Autowired
    ItemsRepository itemsRepository;

    public List<Items> getAllStories()
    {
        List<Items> itemsList=new ArrayList<>();
        itemsRepository.findAll().forEach(items -> {
            itemsList.add(items);
        });
        return itemsList;
    }

    public List<Items> getPastStories()
    {
        List<Items> itemsList=new ArrayList<>();
        itemsRepository.findAll().forEach(items -> itemsList.add(items));
        return itemsList;
    }

    public List<Items> getComments()
    {
        List<Items> itemsList=new ArrayList<>();
        itemsRepository.findAll().forEach(items -> itemsList.add(items));
        return itemsList;
    }
}
