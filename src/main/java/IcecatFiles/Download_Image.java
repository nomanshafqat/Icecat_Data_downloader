package IcecatFiles;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
/**
 * Download the image from the url
 *
 */
public class Download_Image {

    /**
     * Download the image from the link
     * @param link link of the image
     * @return image matrix
     */
    public Image download(String link) {
        System.out.println("Downloading.... " + link);

        Image image = null;
        try {
            URL url = new URL(link);
            image = ImageIO.read(url);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;

    }


}
