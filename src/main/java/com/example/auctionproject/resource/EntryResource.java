package com.example.auctionproject.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/entry")

public class EntryResource {
    @GetMapping
    public String Resource(){
        return "Resource";
    }
}
