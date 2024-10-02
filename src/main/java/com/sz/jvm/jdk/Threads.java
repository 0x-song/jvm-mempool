package com.sz.jvm.jdk;

/**
 * @Author
 * @Date 2024-10-01 21:57
 * @Version 1.0
 */
public class Threads {

    public native static void createVM();

    public static void main(String[] args) {
        System.load("E:\\WD\\diy\\jvm-mempool\\dll\\libjvm_mempool_c.dll");
        Threads.createVM();
    }
}
