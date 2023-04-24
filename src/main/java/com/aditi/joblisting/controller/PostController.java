package com.aditi.joblisting.controller;

import com.aditi.joblisting.models.Post;
import com.aditi.joblisting.repository.PostRepository;
import com.aditi.joblisting.repository.SearchRepository;
import com.aditi.joblisting.repository.SearchRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PostController {

    @Autowired
    PostRepository repository;

    @Autowired
    SearchRepositoryImpl searchRepository;

    @GetMapping("/getPosts")
    public List<Post> getAllPosts(){
        return repository.findAll();
    }

    @GetMapping("/getPosts/{text}")
    public List<Post> search(@PathVariable String text){
        return searchRepository.findByText(text);
    }

    @PostMapping("/addPost")
    public Post addPost(@RequestBody Post post){
        return repository.save(post);
    }

}
