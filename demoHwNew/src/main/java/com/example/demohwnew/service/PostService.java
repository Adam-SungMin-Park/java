package com.example.demohwnew.service;

import com.example.demohwnew.dto.PostDto;
import com.example.demohwnew.entity.Post;
import com.example.demohwnew.repository.PostRepository;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Optional;

@Component
@Service
public class PostService {
    @Autowired
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Transactional
    public Long update(Long id, PostDto postDto){
        Post post1 = postRepository.findById(id).orElseThrow(
                ()->new IllegalStateException("no id")
        );
        post1.update(postDto);
        return post1.getId();
    }

    public Optional<Post> getById(Long id){
        return postRepository.findById(id);
    }

    public List<Post> getAll() {
        return postRepository.findAllByOrderByModifiedAtDesc();
    }

    public Post save(Post post){
        if(post.getId()==null){
            post.setCreatedAt(LocalDateTime.now());
        }
        post.setModifiedAt(LocalDateTime.now());
        return postRepository.save(post);
    }
    public Long delete(@PathVariable Long id){
        postRepository.deleteById(id);
        return id;
    };
}
