package exercicios.com.instagram.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tags {
    Set<String> tags;

    public Tags(Set<String> tags) {
        setTags(tags);

    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        if (tags == null) {
            this.tags = new HashSet<>();
            return;
        }

        Set<String> tagsMaiusculas = new HashSet<>();
        for (String tag : tags) {
            tagsMaiusculas.add(tag.toUpperCase());
        }
        this.tags = tagsMaiusculas;
    }


    public void addTag(String tag) {
        tags.add(tag);
    }

    public void removeTag(String tag) {
        tags.remove(tag);
    }

    public boolean contains(String tag) {
        return tags.contains(tag);
    }
}
