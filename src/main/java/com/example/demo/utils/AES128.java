package com.example.demo.utils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AES128 {
    private final Cipher cipher;
    private final SecretKeySpec secretKey;

    public AES128(String key) throws Exception {
        byte[] keyBytes = key.getBytes("UTF-8");
        secretKey = new SecretKeySpec(keyBytes, "AES");
        cipher = Cipher.getInstance("AES");
    }

    public String decrypt(String encryptedText) throws Exception {
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedText);
        return new String(cipher.doFinal(decodedBytes), "UTF-8");
    }
}
