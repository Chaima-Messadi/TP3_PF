package Exemple2Qt3;

import Exemple2QT2.*;


public class Main {
    public static void parse_filename(String path, String os, boolean countFolders) {
        FilenameParser parser;
        if (os.equals("Windows")) {
            parser = new WindowsFilenameParser();
        } else if (os.equals("Linux")) {
            parser = new LinuxFilenameParser();
        } else {
            throw new IllegalArgumentException("Unsupported OS");
        }
        if (countFolders) {
            CountFolders counter;
            if (os.equals("Windows")) {
                counter = new WindowsCountFolders();
            } else if (os.equals("Linux")) {
                counter = new LinuxCountFolders();
            } else {
                throw new IllegalArgumentException("Unsupported OS");
            }
            parser = new FilenameParserWithCountFolders(parser, counter);
        }
        String r = parser.parseFilename(path);
        System.out.println(r);
        if (countFolders) {
            int folders = ((CountFolders) parser).countFolders(path);
            System.out.println(folders);
        }
    }
}
