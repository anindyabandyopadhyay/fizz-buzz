package com.test;

public class FizzBuzz
{
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            sb.append(fizzBuzz.getFizzBuzz(i)).append("\n");
        }

        System.out.println(sb.toString());
    }

    public String getFizzBuzz(int i)
    {
        if (isFizz(i) && isBuzz(i)) {
            return FIZZ + BUZZ;
        }
        if (isFizz(i)) {
            return FIZZ;
        }
        if (isBuzz(i))
        {
            return BUZZ;
        }
        return String.valueOf(i);
    }

    private boolean isFizz(int i)
    {
        // true if divisible by 3 or has 3 in it
        return ((i % 3 == 0) || (String.valueOf(i).indexOf('3') != -1));
    }

    private boolean isBuzz(int i)
    {
        // true if divisible by 5 or has 5 in it
        return i % 5 == 0;
    }
}
