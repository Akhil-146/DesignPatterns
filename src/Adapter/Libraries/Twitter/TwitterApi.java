package Adapter.Libraries.Twitter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TwitterApi {
    List<TwitterPost> twitterPosts = new ArrayList<>();

    public List<TwitterPost> getTwitterPosts(Long userId, Long Timestamp) {
        return twitterPosts
                .stream()
                .filter(twitterPost -> twitterPost.getUserId() == userId)
                .collect(Collectors.toList());
    }

    public void createTwitterPost(TwitterPost twitterPost) {
        twitterPosts.add(twitterPost);
    }

    public List<TwitterPost> fetchAllTwitterPosts() {
        return twitterPosts;
    }
}
