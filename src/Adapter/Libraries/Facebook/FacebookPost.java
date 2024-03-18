package Adapter.Libraries.Facebook;

public class FacebookPost {
    private Long id;
    private String text;
    private Long userId;
    private Long timestamp;
    private Long noOfLikes;
    private Long noOfComments;

    public FacebookPost(Long id, String text, Long userId, Long timestamp, Long noOfLikes, Long noOfComments) {
        this.id = id;
        this.text = text;
        this.userId = userId;
        this.timestamp = timestamp;
        this.noOfLikes = noOfLikes;
        this.noOfComments = noOfComments;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public Long getNoOfLikes() {
        return noOfLikes;
    }

    public Long getNoOfComments() {
        return noOfComments;
    }
}
