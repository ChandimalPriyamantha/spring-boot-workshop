package com.aiLab.faceDetection;

import java.util.UUID;

public class Test {

    public static void main(String[] args) {
        String uniqueID = generateUniqueID();
        System.out.println("Unique ID: " + uniqueID);
    }

    public static String generateUniqueID() {
        return UUID.randomUUID().toString();
    }

}
