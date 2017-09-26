package IcecatFiles;

import au.com.bytecode.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *  read CSV from source_CSV_path and adds it into the arraylist

 */
public class Read_CSV {

    private String container_directory = "data";

    /**
     * read CSV from source_CSV_path and adds it into the arraylist
     *
     * @param source_CSV_path
     * @return list of eans
     * @throws IOException
     */
    public ArrayList<String> read(String source_CSV_path) throws IOException {

        CSVReader reader = new CSVReader(new FileReader(source_CSV_path));

        ArrayList<String> eanlist=new ArrayList<>();

        String[] nextLine;
        nextLine = reader.readNext();
        while ((nextLine = reader.readNext()) != null) {
            // nextLine[] is an array of values from the line
            //System.out.println(nextLine[0]);

            eanlist.add(String.valueOf(Long.valueOf( nextLine[0])));
         }
        return eanlist;
    }
}
