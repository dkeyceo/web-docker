package com.dkey;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate l = LocalDate.now();
        LocalDateTime lt = LocalDateTime.now();
        System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(l));
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(l));
        System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(lt));
    }
}
