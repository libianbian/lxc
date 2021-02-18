package com.example.liyuan.sorter;

import lombok.Data;

@Data
public class EntityTest {
    private String nMetType;

    public static void main(String[] args) {
        EntityTest entityTest = new EntityTest();
        entityTest.getNMetType();
//        entityTest.getnMetType();
    }
}

