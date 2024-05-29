package com.mycompany.sda_assigment_04;
public abstract class File implements Extractable {
    protected String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public void validateFile() {
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("Invalid file name");
        }
        System.out.println("File " + fileName + " is validated");
    }
}
