package exercicios.com.instagram.repositories;

import exercicios.com.instagram.entities.Post;
import exercicios.com.instagram.entities.Tags;
import exercicios.com.instagram.entities.User;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dados {

    public User[] users = {
            new User(
                    LocalDate.parse("2008-12-23"),
                    "victoragalvann@gmail.com",
                    "Victor",
                    "Vag",
                    "123",
                    new Tags(Set.of("Viagem"))
                    ),

            new User(
                    LocalDate.parse("2007-12-23"),
                    "Gui@gmail.com",
                    "Guiz",
                    "guilherme",
                    "23412",
                    new Tags(Set.of("Viagem"))
                    ),
            new User(
                    LocalDate.parse("2007-12-23"),
                    "Gui@gmail.com",
                    "Andriel",
                    "AndriZ",
                    "6643",
                    new Tags(Set.of("Viagem"))
                    )
    };
    public List<Post> posts = new ArrayList<>(List.of(
            new Post(
                    Instant.parse("2020-05-23T11:41:14Z"),
                    "Minha Viagem",
                    "https://www.imagens.com/123.jpg",
                    users[0],
                    new Tags(Set.of("Viagem", "Barco"))
                    ),


            new Post(
                    Instant.parse("2021-05-23T11:41:14Z"),
                    "Programando...",
                    "https://www.imagens.com/2026/01/17",
                    users[1],
                    new Tags(Set.of("Java", "programando"))
                    ),


            new Post(
                    Instant.parse("2024-05-23T11:41:14Z"),
                    "Formatura",
                    "https://www.imagens.com/2024-05-23",
                    users[1],
                    new Tags(Set.of("Jornada", "Faculdade")))
                    )
    );
    public Tags tags;

    public Dados() {
        tags = new Tags(new HashSet<>());
        for (Post post : posts) {
            for (String tag : post.getTags().getTags()) {
                tags.getTags().add(tag);
            }
        }

    }

}
