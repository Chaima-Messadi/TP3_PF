package Exemple2Qt3;

import Exemple2QT2.FilenameParser;

public class FilenameParserWithCountFolders implements FilenameParser, CountFolders{
    private FilenameParser parser;
    private CountFolders counter;

    public FilenameParserWithCountFolders(FilenameParser parser, CountFolders counter) {
        this.parser = parser;
        this.counter = counter;
    }

    @Override
    public String parseFilename(String path) {
        return parser.parseFilename(path);
    }

    @Override
    public int countFolders(String path) {
        return counter.countFolders(path);
    }
}
