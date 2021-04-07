package com.example.liyuan.sorter;

import lombok.Data;

@Data
public class EntityTest {
    private String nMetType;

    public static void main(String[] args) {
//        EntityTest entityTest = new EntityTest();
//        entityTest.getNMetType();
//        entityTest.getnMetType();
        String s = "0|20210312|095355|3|EBB0001000226530|2|310899991010008776083|01310150999自动化B5467872|C|CNY|1000.00|-13799551.26|0|310899999700008327691|01310150999自动化B5467872||01310401999||||||||";
        String[] arr = s.split("\\|",25);
        System.out.println(s.substring(0,7));

        System.out.println("啊啊啊");
    }
}

