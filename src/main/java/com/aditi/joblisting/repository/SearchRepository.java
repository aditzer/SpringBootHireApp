package com.aditi.joblisting.repository;

import com.aditi.joblisting.models.Post;

import java.util.List;

public interface SearchRepository {
    public List<Post> findByText(String text);
}
