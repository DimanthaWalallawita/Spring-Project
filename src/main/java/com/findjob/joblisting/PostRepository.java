package com.findjob.joblisting;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.findjob.joblisting.models.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
