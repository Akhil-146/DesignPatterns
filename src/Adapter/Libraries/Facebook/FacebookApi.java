package Adapter.Libraries.Facebook;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FacebookApi {
    List<FacebookPost> facebookPosts = new ArrayList<>();

    public List<FacebookPost> fetchFacebookPosts(Long userId, Long Timestamp) {
        return facebookPosts
                .stream()
                .filter(facebookPost -> facebookPost.getUserId() == userId)
                .collect(Collectors.toList());
    }

    public void createFacebookPost(FacebookPost facebookPost) {
        facebookPosts.add(facebookPost);
    }

    public List<FacebookPost> fetchAllFacebookPosts() {
        return facebookPosts;
    }
}
