package com.goit;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        String s = Base64.getEncoder().encodeToString("user12345".getBytes(StandardCharsets.UTF_8));
        System.out.println(s);
    }
}
