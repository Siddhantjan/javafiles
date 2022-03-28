package task;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PickValuefromLogs {
    public static void main(String[] args) throws IOException {
        String s = Files.readString(Paths.get("/home/siddhant/IdeaProjects/java files/src/task/logs"));
        //  System.out.println(s);
        // System.out.println(s);
        final String regex = "[0-3][0-9]-[a-zA-Z]+-[0-9]+ [0-9][0-9] [0-9][0-9]:[0-9][0-9]:[0-9][0-9].[0-9]+ [A-Z][A-Z] \\[[a-z]+\\] ";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(s);
        String[] str = s.split(regex);
        for(int i = 1;i<str.length;i++){
            String p = str[i];
            String sub= p.substring(1,p.length()-3);
            String [] strings= sub.split(",\n");
           // System.out.println(strings.length);
            for (int j = 0;j<strings.length;j++){
                strings[j]=strings[j].trim();
             //   System.out.println(j+" "+strings[j]);

                if(strings[j].contains("\"id\"")){
                    System.out.println(strings[j]);
                }
                if(strings[j].contains("\"metric.name\"")){
                    System.out.println(strings[j]);
                }
                if(strings[j].contains("\"error.code\"")){
                    System.out.println(strings[j]);
                }
                if(strings[j].contains("\"event.timestamp\"")){
                    System.out.println(strings[j]);
                }


            }
            //System.out.println(Arrays.toString(strings));
            System.out.println();
        }
    }
}
