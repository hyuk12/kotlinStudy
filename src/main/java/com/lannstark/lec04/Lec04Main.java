package com.lannstark.lec04;

import com.lannstark.lec04.JavaMoney;

public class Lec04Main {

  public static void main(String[] args) {
    JavaMoney money1 = new JavaMoney(1_000L);
    JavaMoney money2 = money1;
    JavaMoney money3 = new JavaMoney(1_000L);
    System.out.println(money1.plus(money2));
  }

}
