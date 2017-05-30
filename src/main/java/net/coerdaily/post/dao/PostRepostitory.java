package net.coerdaily.post.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.coderdaily.bean.Post;

public interface PostRepostitory extends MongoRepository<Post, String>{
	Post findByTitle(String title);
}
