package exercicios.com.instagram.entities;

import java.time.LocalDate;
import java.util.List;

public class User {
    private String name;
    private String email;
    private String userName;
    private String password;
    private LocalDate birthDay;
    private Tags tagsPreference;


    public User(LocalDate birthDay, String email, String name, String userName, String password, Tags tagsPreference) {
        this.birthDay = birthDay;
        this.email = email;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.tagsPreference = tagsPreference;
    }

    @Override
    public String toString() {
        return userName;
    }

    public Tags getTagsPreference() {
        return tagsPreference;
    }

    public void addTagPreference (String tag){this.tagsPreference.addTag(tag);}

    public void removeTagPreference (String tag){this.tagsPreference.removeTag(tag);}

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
