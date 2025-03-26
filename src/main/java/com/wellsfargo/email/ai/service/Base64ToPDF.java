package com.wellsfargo.email.ai.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class Base64ToPDF {

    public static FileOutputStream convertBase64ToPDF(String content) throws FileNotFoundException {
        // Base64-encoded string (replace with your actual Base64 data)
        FileOutputStream fos = new FileOutputStream("Decoded_Document.pdf");

        try {
            // Decode Base64 string to byte array
            byte[] decodedBytes = Base64.getDecoder().decode(content);

            // Save byte array as a PDF file
            try (fos) {
                fos.write(decodedBytes);
            }

            System.out.println("PDF file successfully created: Decoded_Document.pdf");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fos;
    }
}
