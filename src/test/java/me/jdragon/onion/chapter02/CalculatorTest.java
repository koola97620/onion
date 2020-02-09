package me.jdragon.onion.chapter02;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author choijaeyong on 2020/02/09.
 * @project onion
 * @description
 */
class CalculatorTest {

  @Test
  public void add() {
    Calculator calculator = new Calculator();
    System.out.println(calculator.add(6,3));
    int add = calculator.add(6, 3);
    assertThat(add).isEqualTo(9);
  }

}