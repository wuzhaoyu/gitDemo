package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/2/28
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class StreamTest {

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // 获取对应的平方数 map 方法用于映射每个元素到对应的结果，以下代码片段使用 map 输出了元素对应的平方数：
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        System.out.println(squaresList);
    }
}
