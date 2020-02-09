package me.jdragon.onion.chapter02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author choijaeyong on 2020/02/09.
 * @project onion
 * @description
 */
public class StringCalculatorTest {

  private StringCalculator stringCalculator;

  @BeforeEach
  public void setUp() {
    stringCalculator = new StringCalculator();
  }

  @Test
  public void add_null_or_emptyString() {
    int i = stringCalculator.add(null);
    System.out.println(i);
    assertThat(stringCalculator.add(null)).isEqualTo(0);
    assertThat(stringCalculator.add("")).isEqualTo(0);
  }

  @Test
  public void given_number_then_return_integer() {
    assertThat(stringCalculator.add("3")).isEqualTo(3);
  }

  @Test
  public void given_two_number_then_return_added_number() {
    assertThat(stringCalculator.add("1,2")).isEqualTo(3);
  }

  @Test
  public void split() {
    assertThat("1".split(",")).isEqualTo(new String[] {"1"});
  }

}
