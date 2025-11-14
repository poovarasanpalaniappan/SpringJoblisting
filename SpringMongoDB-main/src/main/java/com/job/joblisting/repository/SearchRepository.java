package com.job.joblisting.repository;

import java.util.List;

import com.job.joblisting.model.Post;

public interface SearchRepository {

    List<Post> findByText(String text);

}
