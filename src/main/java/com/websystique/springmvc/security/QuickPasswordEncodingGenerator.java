package com.websystique.springmvc.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by Khang Nguyen on 02/17/2017.
 * khang.nguyen@banvien.com
 */
public class QuickPasswordEncodingGenerator {
    public static void main(String[] args) {
        String password = "abc125";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodeString = passwordEncoder.encode(password);
        System.out.print(encodeString);
    }
}
