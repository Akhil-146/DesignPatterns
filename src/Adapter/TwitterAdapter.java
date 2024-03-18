package Adapter;

import Adapter.Libraries.Twitter.TwitterApi;
import Adapter.Libraries.Twitter.TwitterPost;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class TwitterAdapter implements SocialMediaAdapter {
    private final TwitterApi twitterApi = new TwitterApi();
    Random random = new Random();

    @Override
    public List<SocialMediaPost> getPosts(Long userId, Long timestamp) {
        return twitterApi
                .getTwitterPosts(userId, timestamp)
                .stream()
                .map(TwitterAdapter::convertToSocialMediaPost)
                .collect(Collectors.toList());
    }

    @Override
    public List<SocialMediaPost> getAllPosts() {
        return twitterApi
                .fetchAllTwitterPosts()
                .stream()
                .map(TwitterAdapter::convertToSocialMediaPost)
                .collect(Collectors.toList());
    }

    private static SocialMediaPost convertToSocialMediaPost(TwitterPost twitterPost) {
        return new SocialMediaPost(twitterPost.getId().toString(), twitterPost.getText(), twitterPost.getUserId(), twitterPost.getTimestamp());
    }

    @Override
    public void createPost(Long userId, String message) {
        twitterApi.createTwitterPost(new TwitterPost(random.nextLong(), message, userId, System.currentTimeMillis(), 0L, 0L));
    }
}
