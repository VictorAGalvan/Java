package exercicios.com.instagram.entities;

import java.time.Instant;

public class Comment {
    private Instant date;
    private String text;
    private User user;

    public Comment(Instant date, String text, User user) {
        this.date = date;
        this.text = text;
        this.user = user;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
