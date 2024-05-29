package com.mycompany.sda_assigment_04;
import java.util.ArrayList;
import java.util.List;

public class FileExtractor {
    private List<Extractable> files;

    public FileExtractor() {
        files = new ArrayList<>();
    }

    public void addFile(String fileType, String fileName) {
        File file = FileFactory.createFile(fileType, fileName);
        files.add(file);
        System.out.println("File added for extraction: " + file.getFileName());
    }

    public void extractAllData() {
        for (Extractable file : files) {
            file.extractData();
        }
    }

   }