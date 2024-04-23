package com.minimals.newOps.IntOps.IntIterationMultipleCall;

public class IntExample {
    public static void main(java.lang.String[] args) throws java.lang.Exception {
        java.lang.System.out.println("Hello");
        for (int i = 0; i < 50; i++){
            byte[] salt = {80,45,56};
            new javax.crypto.spec.PBEKeySpec("very_secure".toCharArray(), salt, i);
        }
      }
}
