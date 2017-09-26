package IcecatFiles;

import java.util.ArrayList;

/**
 * Takes a list of eans and converts them into working links
 */
public class Create_URL {
    /**
     *
     * @param eans list of eans
     * @param language languge code e.g. en,fr,ru
     * @return List of URLs
     */
    public ArrayList<String> create(ArrayList<String> eans, String language){

        ArrayList<String> urls=new ArrayList<String>();

        for(String ean:eans) {

            //String url="http://openIcecat-xml:freeaccess@data.icecat.biz/xml_s3/xml_server3.cgi?ean_upc="+ean+";lang="+language +";output=productcsv";
            String url="http://data.icecat.biz/xml_s3/xml_server3.cgi?ean_upc="+ean+";lang="+language +";output=productcsv";

            urls.add(url);

        }
        return  urls;


    }

}
