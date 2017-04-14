package webclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-14.
 */
public class URLDemo {
    public static void main(String[] args){
        try {
            URL url = new URL("http://www.president.go.kr/");

//            URLConnection conn = url.openConnection();

//            String contentType = conn.getContentType();
//            String encoding = conn.getContentEncoding();

            InputStream is = url.openStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String line ="";
            List<String > wordList = new ArrayList<>();
            while((line = br.readLine()) != null){
//                System.out.println(line);
                String[] word = line.split(" ");

                for(String e: word){
                    wordList.add(e);
                }
            }

            //분석
            int count = 0;
            for(String e: wordList){
                if(!e.trim().equals("")){
                    count++;
                }
            }
            System.out.println(count);

            System.out.println("count: " + wordList.size());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
