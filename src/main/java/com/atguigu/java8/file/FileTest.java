package com.atguigu.java8.file;

import org.junit.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FileTest {

    @Test
    public void test1(){
        File file = new File(".");
        if (file.isDirectory()){
            List<File> files = Arrays.asList(file.listFiles());
            files.forEach(o-> System.out.println(o.getName()));
        }
    }

    @Test
    public void test2(){
        File file = new File(".");
        if (file.isDirectory()){
            List<File> files = Arrays.asList(file.listFiles());
            files.stream().filter(o->o.getName().endsWith("l")).forEach(System.out::println);
        }
    }
}
