package cn.luoluo.chatbot.api.interfaces;


import org.junit.Test;

import java.util.Scanner;

public class ScannerApiTest {


    public static void main(String[] args) {
        System.out.println("你想对服务器说什么 ");
        Scanner input = new Scanner(System.in);
        String next = input.nextLine();
        System.out.println(next);
    }


    @Test
    public void test() {
        System.out.println("你想对服务器说什么 ");
        Scanner input = new Scanner(System.in);
        String next = input.nextLine();

    }
}
