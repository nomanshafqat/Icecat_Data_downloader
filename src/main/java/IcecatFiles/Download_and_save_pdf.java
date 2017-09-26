package IcecatFiles;
import Object.Product;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Object;

/**
 * Downloads and saves the PDF from a url to Directory/EAN/abc.pdf
 */
public class Download_and_save_pdf {
    private static CreateDirectory createDirectory = new CreateDirectory();

    /**
     * @param link icecat link to pdf
     *
     * @param ean_folder_name //the name of sub_folder in which data will be stored which is the ean number
     * @param container_directory The directoery name
     * @return String to the of the file downloaded to
     */
    public String download(String link, String ean_folder_name, String container_directory) {
        createDirectory.mkdir(container_directory);


        String[] urlcomp = link.split("/");
        String name = urlcomp[urlcomp.length - 1];
        System.out.println(name);

        String fullpath = container_directory + "/" + ean_folder_name + "/" + name;

        try {


            URL url = new URL(link);
            InputStream in = url.openStream();

            createDirectory.mkdir(container_directory + "/" + ean_folder_name);


            Files.copy(in, Paths.get(fullpath), StandardCopyOption.REPLACE_EXISTING);
            in.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


        return fullpath;

    }

}
