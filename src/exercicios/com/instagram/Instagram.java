package exercicios.com.instagram;

import exercicios.com.instagram.entities.Post;
import exercicios.com.instagram.entities.Tags;
import exercicios.com.instagram.entities.User;
import exercicios.com.instagram.exceptions.LoginException;
import exercicios.com.instagram.repositories.Dados;


import exercicios.com.instagram.entities.ScannerMod;



import java.time.Instant;

import java.util.*;

import static exercicios.com.instagram.services.Feed.generateFeed;
import static exercicios.com.instagram.services.Login.login;


public class Instagram {


    public static void main(String[] args) {


        ScannerMod sc = new ScannerMod();
        Dados data = new Dados();

        System.out.println("Bem vindo ao meu Instagram");
        System.out.println("Digite a qualquer momento S para sair");

        User user = null;
        user = data.users[0];


        do {
            try {
                user = login(data);
            } catch (LoginException e) {
                System.out.println(e);
            }
        }while(user != null);



        loop:
        while (true) {
            String resposta = sc.nextLine();
            switch (resposta) {
                case "Sair":
                    break loop;
                case "Novo post":

                    String inText = sc.nextLine();
                    String inImageUrl = sc.nextLine();
                    String inTags = sc.nextLine();
                    Set<String> tagsList = new HashSet<>(Arrays.asList(inTags.split(" ")));
                    Post newPost = new Post(Instant.now(), inText, inImageUrl, user, new Tags(tagsList));
                    data.posts.add(newPost);
                    break;
                case "Feed":

                    Tags tempTag = new Tags(Set.of());
                    List <Post> temp = generateFeed(data.posts, user.getTagsPreference(), 6);
                    for(Post p : temp){
                        System.out.println(p);
                        System.out.println();
                    }

                    break;
                case "Editar perfil":
                    String inputEditUser = sc.nextLine();
                    switch (inputEditUser){
                        case "Email":
                            System.out.println("Digite o novo Email");
                            String newEmail = sc.nextLine();
                            break;
                        case "Username":
                            break;
                        case "Tags Preference":

                            break;
                    }
                    break;
            }

        }

    }


}
