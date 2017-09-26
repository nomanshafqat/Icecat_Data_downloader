package IcecatFiles;

import Object.Product;

import com.sun.corba.se.spi.orb.StringPair;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * The IcecatFiles.main function which cordinates with all of the function
 */
public class main {
    /**
     * Step1:It takes input from the user for four variables source_CSV_path ,username,password,language
     * Step2:Then it calls a csv reader class which reads the csv provided in the 'source_CSV_path' variable
     * Step3:The returned list of eans are then passed IcecatFiles.Create_URL class which converts the ean into the links
     * <p>
     * For each URL it
     * Step4:Takes the url and passes it to the IcecatFiles.Get_data class fetches the data from the url and returns a pair(headers,content)
     * step 5: The returned data is then passed to the filter_data class which which downloads/saves/updates the links in the data and returns an array of splitted data
     * Step 6: data is saved in the csv
     *
     * @param argv
     * @throws IOException
     */
    public static void main(String argv[]) throws IOException {
        String container_directory = "data";


/*      Scanner scanner = new Scanner(new InputStreamReader(System.in));

        System.out.println("Enter the absolute path to your CSV file containing the eans of the products?");
        String source_CSV_path = scanner.nextLine();

        System.out.print("IceCat username?: ");
        String username = scanner.nextLine();

        System.out.print("Password?:");
        String password = scanner.nextLine();

        System.out.print("Language?:");
        String language = scanner.nextLine();
*/

        //HardCode these if you want to otherwise uncomment
        String source_CSV_path = "/Users/nomanshafqat/IdeaProjects/Icecat_1/src/main/resources/eanlist.csv";

        String username = "";
        String password = "";


        String language = "en";
        String resultfile="data/result.csv";

        System.out.println(source_CSV_path + ":" + username + ":" + password);


        System.out.println("Reading CSV.....");
        Read_CSV read_csv = new Read_CSV();
        ArrayList<String> eans = read_csv.read(source_CSV_path);
        System.out.println(eans.size() + " EANS Read.....");


        System.out.println("Converting into url....");
        Create_URL create_url = new Create_URL();
        ArrayList<String> urls = create_url.create(eans, language);
        System.out.println(urls.size() + " urls converted.....");
        System.out.println("Example =" + urls.get(0));


        Get_data get_data = new Get_data();
        Filter_data filter_data = new Filter_data();
        String concatstr = "";

        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<String> data = new ArrayList<String>();

        for (String url : urls) {

            System.out.println("Fetching  = " + url);
            StringPair str_pair = get_data.get(url, username, password);
            String[] data_arr = filter_data.filter(str_pair, container_directory);

            if (data_arr != null) {
                data .add( String.join("\",\"", data_arr) + "\"");

                Product product = new Product(
                        data_arr[0], data_arr[1], data_arr[2], data_arr[3], data_arr[4], data_arr[5], data_arr[6], data_arr[7], data_arr[8], data_arr[9],
                        data_arr[10], data_arr[11], data_arr[12], data_arr[13], data_arr[14], data_arr[15], data_arr[16], data_arr[17], data_arr[18],
                        data_arr[19], data_arr[20], data_arr[21], data_arr[22], data_arr[23], data_arr[24], data_arr[25], data_arr[26], data_arr[27],
                        data_arr[28], data_arr[29], data_arr[30], data_arr[31], data_arr[32], data_arr[33], data_arr[34], data_arr[35], data_arr[36],
                        data_arr[37], data_arr[38], data_arr[39], data_arr[40]
                );
                productList.add(product);
            }

        }


        /*
        *    saving
        */

        OutputStreamWriter  fstream = new OutputStreamWriter(new FileOutputStream(resultfile), StandardCharsets.UTF_8);
        String headers = Filter_data.getHeaders();

        fstream.append(headers).append("\r\n");
        for(String str:data){
            fstream.write(str);

        }

        fstream.close();


        /**
         * Use variable productList as you wish it contains LIST of all fetched products
         */
        for (Product product : productList) {
            System.out.println(product.getPic500x500() + product.getEUEnergyLabel() + product.getSpecs());

            //DO SEOMETHING


        }
    }

}