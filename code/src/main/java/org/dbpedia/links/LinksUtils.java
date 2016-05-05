package org.dbpedia.links;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

/**
 * @author Dimitris Kontokostas
 * @since 29/4/2016 4:00 μμ
 */
public final class LinksUtils {
    private LinksUtils(){}

    /**
     * Gets all File transitively from a root folder (input), it returns both files and directories
     */
    public static List<File> getAllFilesInFolderOrFile (File input)
    {
        List<File> fileList = new ArrayList<>();
        if(input.isDirectory()) {

            fileList.add(input);

            stream(input.listFiles()).forEach(file ->  {

                if (file.isDirectory()) {
                    fileList.addAll(getAllFilesInFolderOrFile(file));
                } else {
                    fileList.add(file);
                }
            });
        }
        if(input.isFile())
        {
            fileList.add(input);
        }

        return fileList;
    }

    public static List<File> filterFileWithEndsWith(List<File> files, String endsWith) {
        return files.stream()
                .filter( f -> f.getAbsolutePath().endsWith(endsWith) )
                .collect(Collectors.toList());
    }
}
