package Exemple2Qt3;

public class LinuxCountFolders implements CountFolders{
    @Override
    public int countFolders(String path) {
        int count = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == '\\') {
                count++;
            }
        }
        return count;
    }
}
