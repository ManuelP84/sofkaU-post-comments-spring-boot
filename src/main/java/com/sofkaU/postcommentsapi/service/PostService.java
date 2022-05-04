package com.sofkaU.postcommentsapi.service;

import com.sofkaU.postcommentsapi.entity.Comment;
import com.sofkaU.postcommentsapi.entity.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {

    Post createPost(Post post);

    Post createComment(Comment comment);

    void deleteComment(Comment comment);

    void deletePost(Post post);

    List<Post> findAllPosts();
}
