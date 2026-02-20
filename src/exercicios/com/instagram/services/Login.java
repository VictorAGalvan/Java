package exercicios.com.instagram.services;

import exercicios.com.instagram.entities.ScannerMod;
import exercicios.com.instagram.entities.User;
import exercicios.com.instagram.exceptions.LoginException;
import exercicios.com.instagram.repositories.Dados;

public class Login {
    public static User login (Dados data) throws LoginException{
        ScannerMod s = new ScannerMod();
        String name;
        String password;
        boolean validUser = false;


        System.out.println("Faça login");

        System.out.print("User:");
        name = s.nextLine();


        System.out.print("Senha:");
        password = s.nextLine();

            for (int i = 0; i < data.users.length; i++) {
                String tempName = data.users[i].getName();
                if (tempName.equals(name)) {
                    if (data.users[i].getPassword().equals(password)) {
                        return data.users[i];
                    } else {
                        throw new LoginException("Usúario ou Senha está incorreto");
                    }
                }
                if (i == data.users.length-1) {
                    throw new LoginException("Usúario ou Senha está incorreto \nTente Novamente!");
                }
            }
            return null;



    }
}
