package me.jdragon.onion.chapter02;

/**
 * @author choijaeyong on 2020/02/09.
 * @project onion
 * @description
 */
public class StringCalculator {

  public StringCalculator() {

  }

  public int add(String text) {
    if (text == null || text.isEmpty()) {
      return 0;
    }

    if (text.contains(",")) {
      String[] numbers = text.split(",");
      int sum =0;
      for (String value : numbers) {
        sum += Integer.parseInt(value);
      }
      return sum;
    }


    return Integer.parseInt(text);
  }
}
