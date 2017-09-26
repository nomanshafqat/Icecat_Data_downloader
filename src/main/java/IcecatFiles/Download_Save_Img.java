package IcecatFiles;

import java.awt.*;

/**
 * Downloads the Image from from URL and saves it in the container_directory/ean/pictures.jpg
 */
public class Download_Save_Img {

    private static CreateDirectory createDirectory = new CreateDirectory();
    private static Download_Image download_image = new Download_Image();
    private static Save_Image save_image = new Save_Image();


    /**
     *
     * @param url //the icecat url
     * @param ean_folder_name //the name of sub_folder in which data will be stored which is the ean number
     * @param container_directory //The directoery name
     * @return the path to the image where it is saved.
     */
    String download(String url, String ean_folder_name, String container_directory) {
        createDirectory.mkdir(container_directory);


        String[] urlcomp = url.split("/");
        String name = urlcomp[urlcomp.length - 1];
        System.out.println(name);

        createDirectory.mkdir(container_directory + "/" + ean_folder_name);

        Image image = download_image.download(url);

        String fullpath=container_directory + "/" +ean_folder_name+"/"+ name;
        save_image.save(fullpath, image);


        return fullpath;

    }

}
