package com.minimals.newOps.IntOps.IntNestedClass;

public class IntExample {
    public static void main(java.lang.String[] args) throws java.lang.Exception {
        java.lang.System.out.println("Hello");
        class NestedClass{
            int getIteration(){
                return 50;
            }
        }
        byte[] salt = {80,45,56};
        new javax.crypto.spec.PBEKeySpec("very_secure".toCharArray(), salt, new NestedClass().getIteration());
      }
}
