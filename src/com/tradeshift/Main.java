package com.tradeshift;

import com.tradeshift.model.Triangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        Triangle triangle = new Triangle.Builder().setSide1(a).setSide2(b).setSide3(c).build();
        String result = "";
        if(triangle.isTriangle()){
            result  = triangle.getTypeofTriangle();
        }
        else {
            System.out.println("A triangle cannot be formed with the given measurements!!");
        }
        System.out.println(result);

    }
}
