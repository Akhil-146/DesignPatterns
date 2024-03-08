package Builder;

import java.sql.Timestamp;

public class Message {
    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private Timestamp timestamp;

    private Message(MessageBuilder messageBuilder) {
        messageType = messageBuilder.messageType;
        content = messageBuilder.content;
        sender = messageBuilder.sender;
        recipient = messageBuilder.recipient;
        isDelivered = messageBuilder.isDelivered;
        timestamp = messageBuilder.timestamp;
    }

    public static MessageBuilder getBuilder() {
        return new MessageBuilder();
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageType=" + messageType +
                ", content='" + content + '\'' +
                ", sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", isDelivered=" + isDelivered +
                ", timestamp=" + timestamp +
                '}';
    }

    public static class MessageBuilder {
        private MessageType messageType;
        private String content;
        private String sender;
        private String recipient;
        private boolean isDelivered;
        private Timestamp timestamp;

        public MessageBuilder setMessageType(MessageType messageType) {
            this.messageType = messageType;
            return this;
        }

        public MessageBuilder setContent(String content) {
            this.content = content;
            return this;
        }

        public MessageBuilder setSender(String sender) {
            this.sender = sender;
            return this;
        }

        public MessageBuilder setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }

        public MessageBuilder setDelivered(boolean delivered) {
            isDelivered = delivered;
            return this;
        }

        public MessageBuilder setTimestamp(Timestamp timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Message build() throws Exception{
            if (sender == null || recipient == null || content == null)
                throw new Exception("Invalid Message");

            if (timestamp == null)
                timestamp = new Timestamp(System.currentTimeMillis());

            isDelivered = true;
            return new Message(this);
        }
    }
}
