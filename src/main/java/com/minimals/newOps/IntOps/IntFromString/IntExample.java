package com.minimals.newOps.IntOps.IntFromString;

public class IntExample {
    public static void main(java.lang.String[] args) throws java.lang.Exception {
        java.lang.System.out.println("Hello");
        byte[] salt = {80,45,56};
        new javax.crypto.spec.PBEKeySpec("very_secure".toCharArray(), salt, Integer.parseInt("50"));
      }
}
