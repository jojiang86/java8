package com.atguigu.java8.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 一.Stream的三个步骤
 * 1.创建stream
 *      a.用Collection提供的stream()或parallelStream()
 *      b.Arrays.stream()
 *      c.Stream.of()
 *      d.产生无限流
 *        Stream.iterate()
 *        Stream.generate()
 *
 * 2.中间操作，仅返回stream()
 *
 * 3.终止操作（延迟加载，即以上先定义，调用的时候再执行）,有返回值
 *      a.查找与匹配
 *      b.归约与收集
 *
 * 4.如果返回值有可能为空，则用Optional<T>接收
 *
 *
 */
public class TestStreamAPI1 {

    /*
    中间操作，仅返回stream()
    a.filter/limit/skip/distinct
    b.map:接受一个lambda（处理器），并将他映射到每一个元素上使用
      flatmap：将流集合，拆分拼接成一个平铺流
     */
    @Test
    public void test1() {

    }

    /*
 .终止操作（延迟加载，即以上先定义，调用的时候再执行）,有返回值
   a.查找与匹配
    allMatch    #检查是否匹配所有元素
    anyMatch    #检查是否匹配至少一个元素
    noneMatch   #检查是否没有匹配元素
    findFist    #返回第一个元素
    findAny     #返回当前流中任意元素
    count       #返回流中元素总个数
    max         #返回流中最大值
    min         #返回流中最小值
     */
    @Test
    public void test2() {

    }

    /*
    b.归约与收集
    reduce(T identity, BinaryOperator)/reduce(BinaryOperator)   #可以将流中的元素反复结合起来，返回一个新值
    collect     #将流转换为其他形式，接收一个Collector的实现，用于给Stream中元素做汇总的方法
     */
    @Test
    public void test3() {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Integer integer = list.stream().reduce(0,(e1,e2)->e1+e2);
        System.out.println(integer);

        Optional<Integer> op = list.stream().reduce((e1, e2)->e1+e2);
        System.out.println(op.get());

        HashSet<Integer> hs = list.stream().collect(Collectors.toCollection(HashSet::new));

    }
}
