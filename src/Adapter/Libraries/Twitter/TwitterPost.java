package Adapter.Libraries.Twitter;

public class TwitterPost {
    private Long id;
    private String text;
    private Long userId;
    private Long timestamp;
    private Long noOfRetweets;
    private Long noOfComments;

    public TwitterPost(Long id, String text, Long userId, Long timestamp, Long noOfRetweets, Long noOfComments) {
        this.id = id;
        this.text = text;
        this.userId = userId;
        this.timestamp = timestamp;
        this.noOfRetweets = noOfRetweets;
        this.noOfComments = noOfComments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Long getNoOfRetweets() {
        return noOfRetweets;
    }

    public void setNoOfRetweets(Long noOfRetweets) {
        this.noOfRetweets = noOfRetweets;
    }

    public Long getNoOfComments() {
        return noOfComments;
    }

    public void setNoOfComments(Long noOfComments) {
        this.noOfComments = noOfComments;
    }
}
