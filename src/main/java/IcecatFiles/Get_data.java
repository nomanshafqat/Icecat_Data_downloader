package IcecatFiles;

import com.sun.corba.se.spi.orb.StringPair;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Base64;

/**
 * Takes the url and passes it to the IcecatFiles.Get_data class fetches the data from the url and returns a pair(headers,content)
 */
public class Get_data {
    /**
     * @param link     //link to the icecat file
     * @param username //icecat username
     * @param password //icecat password
     * @return Stringpair(Headers_of_csv, content_of_that_product)
     * @throws IOException
     */
    public StringPair get(String link, String username, String password) {

        String webPage = link;
        try {


            URL url = new URL(link);
            URLConnection urlConnection = url.openConnection();
            String userPassword = username + ":" + password;
            String encoding = new sun.misc.BASE64Encoder().encode(userPassword.getBytes());
            URLConnection uc = url.openConnection();
            uc.setRequestProperty("Authorization", "Basic " + encoding);
            uc.connect();


            InputStream is = uc.getInputStream();
            InputStreamReader sr = new InputStreamReader(is, Charset.forName("UTF-8").newDecoder());
            BufferedReader br = new BufferedReader(sr);

            String header = br.readLine();
            String data = br.readLine();


            StringPair str_pair = new StringPair(header, data);
            return str_pair;

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;

    }

}
