package Adapter;

import java.util.List;

public interface SocialMediaAdapter {
    List<SocialMediaPost> getPosts(Long userId, Long timestamp);

    List<SocialMediaPost> getAllPosts();

    void createPost(Long userId, String message);
}
