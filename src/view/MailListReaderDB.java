package view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReaderDB {
        
    public static List<String> read(String fileName) throws FileNotFoundException, IOException {
        List<String> mailsList = new ArrayList();
        
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null) {
            if(line.matches(".+@(.+\\.).+")){
                mailsList.add(line);
            }
        }
        return mailsList;
    }
}
