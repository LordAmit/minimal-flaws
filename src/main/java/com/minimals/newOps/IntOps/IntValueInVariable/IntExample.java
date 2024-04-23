package com.minimals.newOps.IntOps.IntValueInVariable;

import javax.crypto.spec.PBEKeySpec;

public class IntExample {
    public static void main(java.lang.String[] args) throws java.lang.Exception {
        java.lang.System.out.println("Hello");
        int iterCount = 50;
        byte[] salt = {80,45,56};
        new PBEKeySpec("very_secure".toCharArray(), salt, iterCount, 256);
      }
}
