package Advanced;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingDemo {
    public void readFile(String filePath){
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            br.lines().forEach(System.out::println);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
