package exercicios.com.instagram.entities;

import java.util.List;

public class Profile {
    private User user;
    private List<Post> posts;

    public Profile(User user, List<Post> posts) {
        this.user = user;
        this.posts = posts;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
