package Exemple2QT2;

public class LinuxFilenameParser implements FilenameParser{
    @Override
    public String parseFilename(String path) {
        int index = path.lastIndexOf("/");
        return path.substring(index+1);
    }
}
