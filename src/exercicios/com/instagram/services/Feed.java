package exercicios.com.instagram.services;

import exercicios.com.instagram.entities.Post;
import exercicios.com.instagram.entities.Tags;
import exercicios.com.instagram.repositories.Dados;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class Feed {

    private List<Post> posts = new ArrayList<>();

    public static List<Post> generateFeed(List<Post> posts, Tags tags, int quantity) {

        List<Post> temp = copyPosts(posts);
        orderPostByData(temp);

        List<Post> feed = new ArrayList<>();

        Set<String> listTags=tags.getTags();
        if (tags.contains("ALL")){
            listTags = new Dados().tags.getTags();
        }

        for (Post p : temp) {
            for (String t : listTags) {
                if (p.hasTag(t)) {
                    feed.add(p);
                    break;
                }
            }

            if (feed.size() == quantity) {
                break;
            }
        }

        return feed;
    }

    public static List<Post> copyPosts(List<Post> posts) {
        List<Post> newList = new ArrayList<>();
        newList.addAll(posts);
        return newList;
    }

    public static void orderPostByData(List<Post> posts) {
        posts.sort(null);
    }

    public static List<Post> getPostByTag(List<Post> posts, String tag) {
        List<Post> filtered = new ArrayList<>();

        for (Post p : posts) {
            if (p.hasTag(tag)) {
                filtered.add(p);
            }
        }

        return filtered;
    }
}