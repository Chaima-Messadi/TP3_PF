package Exemple2QT2;

public class WindowsFilenameParser implements FilenameParser {
    @Override
    public String parseFilename(String path) {
        int index = path.lastIndexOf("\\");
        return path.substring(index+1);
    }
}
