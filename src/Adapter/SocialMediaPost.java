package Adapter;

public class SocialMediaPost {
    private String id;
    private String text;
    private Long userId;
    private Long timestamp;

    public SocialMediaPost(String id, String text, Long userId, Long timestamp) {
        this.id = id;
        this.text = text;
        this.userId = userId;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "SocialMediaPost {" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", userId=" + userId +
                ", timestamp=" + timestamp +
                '}';
    }
}
