package com.minimals.messagedigest.complexCase;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigestComplex {
    public static void main(String[] args) {
        MessageDigest cryptoDigest;
        try {
            cryptoDigest = MessageDigest.getInstance("MD4".replace("MD4", "MD5"));
            System.out.println(cryptoDigest.getAlgorithm());

        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error");
        }
    }
}
