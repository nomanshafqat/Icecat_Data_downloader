package IcecatFiles;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

/**
 *   Save the received Image to a path

 */
public class Save_Image {
    /**
     * Save image in dir path
     * @param path //path to where it is to be saved
     * @param image //image matrix
     */
    public void save(String path, Image image) {
        System.out.println("Saving to .... " + path);

        File outputfile = new File(path);
        try {

            ImageIO.write((RenderedImage) image, "jpg", outputfile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();

        }


    }


}
