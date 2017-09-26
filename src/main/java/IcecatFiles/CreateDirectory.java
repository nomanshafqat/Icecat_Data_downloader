package IcecatFiles;

import java.io.File;

/**
 * checks if a directory already existas at this path if not creates one there

 */
public class CreateDirectory
{
    /**
     * checks if a directory already existas at this path if not creates one there
     * @param path path to directory
     */
    public void mkdir(String path)
    {

        File dir = new File(path);

        // attempt to create the directory here
        boolean successful = dir.mkdir();
        if (successful |   dir.exists())
        {
            // creating the directory succeeded
        }
        else
        {
            // creating the directory failed
            System.out.println("failed trying to create the directory");
        }
    }
}