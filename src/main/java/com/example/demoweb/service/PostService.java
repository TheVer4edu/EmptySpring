package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.*;

import java.util.List;

@Service
public class PostService {

    public Iterable<Post> listAllPosts() {
        return List.of(new Post[] {new Post("Hello world"),
                new Post("September is burning"),
                new Post("The killer is crying")});
    }

}
