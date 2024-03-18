import Adapter.FacebookAdapter;
import Adapter.SocialMediaPost;
import Adapter.TwitterAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AdapterClient {
    private static final Random random = new Random();

    private static final FacebookAdapter facebookAdapter = new FacebookAdapter();
    private static final TwitterAdapter twitterAdapter = new TwitterAdapter();

    public static void main(String[] args) {
        //Initialize Posts
        createPosts();
        List<SocialMediaPost> socialMediaPosts = new ArrayList<>();

        //Fetch Facebook Posts
        socialMediaPosts.addAll(facebookAdapter.getAllPosts());

        //Fetch Twitter Posts
        socialMediaPosts.addAll(twitterAdapter.getAllPosts());

        for (SocialMediaPost socialMediaPost : socialMediaPosts)
            System.out.println(socialMediaPost.toString());

    }

    private static void createPosts() {
        //Facebook Posts
        for (int i = 0; i < 15; i++) {
            long num = random.nextLong(10, 100);
            String userId = "1000" + num;
            facebookAdapter.createPost(Long.parseLong(userId), "Post Created by " + userId);
        }

        //Twitter Posts
        for (int i = 0; i < 15; i++) {
            long num = random.nextLong(10, 100);
            String userId = "1000" + num;
            twitterAdapter.createPost(Long.parseLong(userId), "Post Created by " + userId);
        }
    }
}
