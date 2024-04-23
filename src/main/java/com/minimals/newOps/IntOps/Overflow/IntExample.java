package com.minimals.newOps.IntOps.Overflow;

public class IntExample {
    public static void main(java.lang.String[] args) throws java.lang.Exception {
        java.lang.System.out.println("Hello");
        byte[] salt = {80,45,56};
        new javax.crypto.spec.PBEKeySpec("very_secure".toCharArray(), salt, Integer.MAX_VALUE + Integer.MAX_VALUE + 2 + 50);
      }
}
