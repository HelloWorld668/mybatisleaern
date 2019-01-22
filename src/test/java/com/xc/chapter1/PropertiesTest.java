package com.xc.chapter1;

import org.junit.Test;

import java.util.Properties;

public class PropertiesTest {
    @Test
    public void test(){
        Properties properties = new Properties();
        properties.setProperty("a","b");
        String a = properties.getProperty("a");
        System.out.println(a);
    }
}
