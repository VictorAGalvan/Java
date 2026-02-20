package exercicios.com.instagram.entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post implements Comparable<Post> {
    private User user;
    private Instant date;
    private String text;
    private String urlImage;
    private Tags tags;
    private List<Like> likes = new ArrayList<>();
    private List<Comment> comments = new ArrayList<>();


    public Post(Instant date, String text, String urlImage, User user, Tags tags) {
        this.date = date;
        this.text = text;
        this.urlImage = urlImage;
        this.user = user;
        this.tags = tags;
    }

    @Override
    public String toString(){
        List<String> lista = new ArrayList<>(tags.getTags());

        for (int i = 0; i < lista.size(); i++) {
            String tag = lista.get(i).toLowerCase();

            tag = tag.substring(0, 1).toUpperCase() + tag.substring(1);

            lista.set(i, tag);
        }
        String temp = user + " -- " +   DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault()).format(date) + " \n" +
                "----------------------------------------\n" +
                urlImage + "\n"  +
                "----------------------------------------\n" +
                text +"\n" +
                ">> ";
        if (tags.getTags().size() != 0){
            for (int i=0; i <lista.size(); i++){
                if (i==3){
                    break;
                }
                temp = temp + " #" + lista.get(i);
            }
        }else{
            temp = temp + "VOID TAGS";
        }
        temp += "<->-<->-<->-<->-<->-<->-<->-<->-<->-<->\n";
        return temp;
    }

    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }


    public List<Like> getLikes() {
        return likes;
    }

    public void addLikes(Like like) {
        likes.add(like);
    }

    public void removeLikes(Like like) {
        likes.remove(like);
    }

    public Instant getData() {
        return date;
    }

    public void setData(Instant data) {
        this.date = data;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean hasTag(String tag) {
        return tags.contains(tag);
    }


    @Override
    public int compareTo(Post o) {
        if (o.getData().isBefore(this.getData())){
            return -12;
        }else if (this.getData().isBefore(o.getData())){
            return 12;
        }else {
            return 0;
        }
    }
}

