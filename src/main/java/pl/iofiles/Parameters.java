package pl.iofiles;

public class Parameters {
    private String id;
    private String messageText;

    public Parameters(String id, String messageText) {
        this.id = id;
        this.messageText = messageText;
    }

    public Parameters() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
