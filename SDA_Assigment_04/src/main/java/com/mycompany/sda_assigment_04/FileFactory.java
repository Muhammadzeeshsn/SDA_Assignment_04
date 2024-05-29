package com.mycompany.sda_assigment_04;
public class FileFactory {
    public static File createFile(String fileType, String fileName) {
        if (fileType == null || fileName == null) {
            throw new IllegalArgumentException("File type and file name cannot be null");
        }
        switch (fileType.toLowerCase()) {
            case "purchaseorder":
                return new PurchaseOrderFile(fileName);
            case "invoice":
                return new InvoiceFile(fileName);
            default:
                throw new IllegalArgumentException("Invalid file type: " + fileType);
        }
    }
}