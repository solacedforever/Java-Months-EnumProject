package com.company;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Month aMonth = Month.JANUARY;
        System.out.println("Please select a month:");
        for (Month month : Month.values())
        {
          System.out.println(month.getEnglishName());
        }
        String input = new Scanner(System.in).nextLine();
        Month startMonth = Month.valueOf(input.toUpperCase());
        List<String> months = new ArrayList<>();
        useOrdinal(startMonth,months);
        System.out.println(months);

    }
  static private void useOrdinal(Month start, List<String> months) {
    for (Month month : Month.values()) {
      if (month.ordinal() >= start.ordinal()) {
        months.add(month.getEnglishName());
      }
    }
  }
}
