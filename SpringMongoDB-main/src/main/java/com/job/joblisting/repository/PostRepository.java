package com.job.joblisting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.job.joblisting.model.Post;

@Repository
public interface PostRepository extends MongoRepository<Post,String>
{

}
