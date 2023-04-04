package Exemple2QT2;

public class Main {

    public static void parse_filename(String path, String os) {
        FilenameParser parser;
        if (os.equals("Windows")) {
            parser = new WindowsFilenameParser();
        } else if (os.equals("Linux")) {
            parser = new LinuxFilenameParser();
        } else {
            throw new IllegalArgumentException("Unsupported OS");
        }
        String r = parser.parseFilename(path);
        System.out.println(r);
    }
}
