package com.sofkaU.postcommentsapi.controller;

import com.sofkaU.postcommentsapi.entity.Comment;
import com.sofkaU.postcommentsapi.entity.Post;
import com.sofkaU.postcommentsapi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class Controller {

    @Autowired
    private PostService service;

    @GetMapping("get/posts")
    public List<Post> getAllPosts(){
        return service.findAllPosts();
    }

    @PostMapping("create/post")
    public Post createPost(@RequestBody Post post){
        return service.createPost(post);
    }

    @PostMapping("create/comment")
    public Post createComment(@RequestBody Comment comment){
        return service.createComment(comment);
    }

    @DeleteMapping("delete/post")
    public void deletePost(@RequestBody Post post){
        service.deletePost(post);
    }

    @DeleteMapping("delete/comment")
    public void deleteComment(@RequestBody Comment comment){
        service.deleteComment(comment);
    }
}