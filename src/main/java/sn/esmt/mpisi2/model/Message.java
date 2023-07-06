package sn.esmt.mpisi2.model;

public class Message {

    private String content;

    public Message(String s) {
        content = s;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
