package com.atguigu.java8.IO;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 1.数据由 内存 向 磁盘，称为输出
 *   数据由 磁盘 向 内存，称为输入
 *
 * 2.InputStream是所有输入流的父类
 *   OutputStream是所有输出流的父类
 *
 * 3.FileInputStream和FileOutuptStream是字节流（低级流），可以直接读写字节，读写一定建立在低级流的基础上进行
 *   文件输入输出流只可以读写文件，不能读写图片/视频...
 *
 * 4.InputStreamReader和OutputStreamWriter是转换流（高级流），可以将其他高级流与低级流连接，可以实现字符读写
 *
 * 5.其他高级流包括BufferedReader/BufferedWriter(块读写字符),PrintWriter(自动flush)，BufferOutputStream(块写字节)
 *
 */
public class IOTest {

    @Test
    public void test() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(
                                new FileOutputStream("name.txt"))));

        PrintWriter writer1 = new PrintWriter(new OutputStreamWriter(new FileOutputStream("name.txt")));
        PrintWriter writer2 = new PrintWriter(new FileOutputStream("name.txt"));

    }
}
