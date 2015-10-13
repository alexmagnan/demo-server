package com.cs616;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by ian on 15-10-05.
 */
@RepositoryRestResource(collectionResourceRel = "post", path = "post")
public interface PostRepository extends CrudRepository<Post, Long> {
}
