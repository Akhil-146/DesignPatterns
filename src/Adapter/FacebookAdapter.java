package Adapter;

import Adapter.Libraries.Facebook.FacebookApi;
import Adapter.Libraries.Facebook.FacebookPost;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FacebookAdapter implements SocialMediaAdapter {
    private final FacebookApi facebookApi = new FacebookApi();
    Random random = new Random();
    @Override
    public List<SocialMediaPost> getPosts(Long userId, Long timestamp) {
        return facebookApi
                .fetchFacebookPosts(userId, timestamp)
                .stream()
                .map(FacebookAdapter::convertToSocialMediaPost)
                .collect(Collectors.toList());
    }

    @Override
    public List<SocialMediaPost> getAllPosts() {
        return facebookApi
                .fetchAllFacebookPosts()
                .stream()
                .map(FacebookAdapter::convertToSocialMediaPost)
                .collect(Collectors.toList());
    }

    private static SocialMediaPost convertToSocialMediaPost(FacebookPost facebookPost) {
        return new SocialMediaPost(facebookPost.getId().toString(), facebookPost.getText(), facebookPost.getUserId(), facebookPost.getTimestamp());
    }

    @Override
    public void createPost(Long userId, String message) {
        facebookApi.createFacebookPost(new FacebookPost(random.nextLong(), message, userId, System.currentTimeMillis(), 0L, 0L));
    }
}
