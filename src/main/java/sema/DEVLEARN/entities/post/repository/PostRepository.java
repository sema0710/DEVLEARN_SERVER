package sema.DEVLEARN.entities.post.repository;

import sema.DEVLEARN.entities.post.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
    Post save(Post post);
    Optional<Post> findById(Integer id);
    Optional<Post> findByTitle(String title);
}
