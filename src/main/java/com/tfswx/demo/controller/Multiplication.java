package com.tfswx.demo.controller;


public class Multiplication {
  public static void main(String[] args) {

    for (int i = 1; i < 10; i++) {
      for (int j = 1;j <= i; j++){
        System.out.print(i+"*"+j+"="+(i*j));
        System.out.print(" ");
      }
      System.out.print('\n');
    }
    System.out.println("********************************************************************");
    for (int i = 9; i > 0; i--) {
      for (int j = 1;j <=i; j++){
        System.out.print(j+"*"+i+"="+(i*j));
        System.out.print(" ");
      }
      System.out.print('\n');
    }

  }

}
