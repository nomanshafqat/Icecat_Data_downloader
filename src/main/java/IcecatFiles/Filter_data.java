package IcecatFiles;

import com.sun.corba.se.spi.orb.StringPair;

import java.util.ArrayList;

/**
 * Downloads/saves/updates the links in the data and returns an array of splitted data
 */
public class Filter_data {
    static int a = 0, b = 0;
    private static String headers = "";

    public static String getHeaders() {
        return headers;
    }

    public static void setHeaders(String headers) {
        Filter_data.headers = headers;
    }

    /**
     * Gets the pair and the container directory splits them if data is valid it downloads all the files using and updates the links
     * IcecatFiles.Download_Save_Img is used to download and save images
     * IcecatFiles.Download_and_save_pdf is used for PDFs
     *
     * @param str_pair            a pair of(Header,Content) strings
     * @param container_directory is a folder name which will hold the all the downloaded data and the csv
     * @return Array of string containing new data adapted to the new links
     */
    public String[] filter(StringPair str_pair, String container_directory) {
        a++;
        String header = str_pair.getFirst();
        String data = str_pair.getSecond();


        String[] data_arr = data.split("\",\"");
        String[] head_arr = header.split("\",\"");
        String[] filtered_data = new String[41];
        String[] new_headers = new String[41];


        //System.out.print(header);
        System.out.print(data);

        System.out.println(data_arr[3]);

        if (data_arr[3].equals("")) {
            b++;
            System.out.println(head_arr.length + " > " + data_arr.length);

            for (int i = 0; i < head_arr.length; i++) {
                System.out.println(i + "->" + head_arr[i] + ":" + data_arr[i]);
                String ean_upc = data_arr[1];



                //concatenate all the specs
                if (i > 40) {
                    System.out.print("in concat");
                    filtered_data[40] += data_arr[i] + " <br> ";


                } else if (data_arr[i].contains(".jpg")) {

                    String links = data_arr[i];


                    if (links.contains("|")) {

                        ArrayList<String> newlinks = new ArrayList<String>();

                        String[] list = links.split("\\|");

                        for (int j = 0; j < list.length; j++) {

                            System.out.print(">");

                            Download_Save_Img download_save_img = new Download_Save_Img();
                            String savedpath = download_save_img.download(list[j], ean_upc, container_directory);

                            newlinks.add(savedpath);

                        }
                        String concatstr = String.join("|", newlinks);
                        System.out.println(concatstr);
                        filtered_data[i] = concatstr;
                    } else {


                        Download_Save_Img download_save_img = new Download_Save_Img();
                        String savedpath = download_save_img.download(data_arr[i], ean_upc, container_directory);


                        filtered_data[i] = savedpath;

                    }

                    new_headers[i]=head_arr[i];

                } else if (data_arr[i].contains(".pdf")) {
                    System.out.println("Dowloading..." + data_arr[i] + " ------------------------");

                    Download_and_save_pdf download_and_save_pdf = new Download_and_save_pdf();

                    String savedpath = download_and_save_pdf.download(data_arr[i], ean_upc, container_directory);
                    filtered_data[i] = savedpath;

                    new_headers[i]=head_arr[i];

                } else {
                    filtered_data[i] = data_arr[i];
                    new_headers[i]=head_arr[i];


                }

            }
            headers=String.join("\",\"",new_headers)+"\"";

            return filtered_data;


        }

        System.out.println(b + "/" + a);


        return null;
    }
}
