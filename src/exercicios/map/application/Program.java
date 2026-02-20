package exercicios.map.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Program {
    static void main() {
        Map<String,Integer> candidatos = new HashMap<>();
        String path = "C:\\temp\\in\\in.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                String name = fields[0];
                Integer votos = Integer.parseInt(fields[1]);

                if (candidatos.containsKey(name)) {
                    int tempVotos = candidatos.get(name);
                    candidatos.put(name, tempVotos + votos);
                } else {
                    candidatos.put(name, votos);
                }
                line = br.readLine();
            }


        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        for (String k : candidatos.keySet() ){
            System.out.println(k + " : " + candidatos.get(k));
        }
    }
}
