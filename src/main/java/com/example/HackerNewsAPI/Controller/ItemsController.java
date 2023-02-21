package com.example.HackerNewsAPI.Controller;


import com.example.HackerNewsAPI.Model.Items;
import com.example.HackerNewsAPI.Service.ItemsService;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ItemsController {

    @Autowired
    ItemsService itemsService;

    @GetMapping("/top-stories")
    public JSONArray getAllStories()
    {
        JSONArray jsonArray=getFromExternal();
        return jsonArray;
    }

    @GetMapping("/past-stories")
    public List<Items> getPastStories()
    {
        return itemsService.getPastStories();
    }

    @GetMapping("/comments")
    public List<Items> getComments()
    {
        return itemsService.getComments();
    }


    public JSONArray getFromExternal()
    {
        String uri="https://hacker-news.firebaseio.com/v0/";
        RestTemplate restTemplate=new RestTemplate();
        JSONArray result=restTemplate.getForObject(uri, JSONArray.class);
        return result;
    }



}
