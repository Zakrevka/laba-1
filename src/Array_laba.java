import java.util.Scanner;

public class Array_laba {
    Scanner scanner = new Scanner(System.in);
    public int numbers;
    public int[] array;
    public Array_laba(int _numbers) {
        numbers = _numbers;
        array = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public void display() {
        for(int i = 0; i < numbers; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void evenOrOdd() {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for (int i = 0; i < numbers; i++)
        {
            if(array[i] % 2 == 0)
            {
                even.append(array[i]).append(" ");
            }
            else
            {
                odd.append(array[i]).append(" ");
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }

    public void MaxMinNumber() {
        int max = array[0];
        int min = array[0];
        if (array.length == 1)
        {
            System.out.println("Can't find min and max number");
        }
        for (int i = 1 ; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Max number is: " + max + ". Min number is: " + min);
    }

    public void Divide3Or9() {
        StringBuilder numbers_divides = new StringBuilder();
        for(int i = 0; i < array.length; i++)
        {
            if (array[i] % 3 == 0 || array[i] % 9 == 0)
            {
                numbers_divides.append(array[i]).append(" ");
            }
        }
        System.out.println("Numbers that divide by 3 or 9: " + numbers_divides);
    }

    public void Divide5And7() {
        StringBuilder numbers_divides = new StringBuilder();
        for(int i = 0; i < array.length; i++)
        {
            if (array[i] % 5 == 0 && array[i] % 7 == 0) {
                numbers_divides.append(array[i]).append(" ");
            }
        }
        System.out.println("Numbers that divide by 5 and 7: " + numbers_divides);
    }

    public void NotEqualNumbers() {
        StringBuilder NotEqualNumbers = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 100 && array[i] < 999)
            {
                int hundreds = array[i] / 100;
                int tens = (array[i] / 10) % 10;
                int units = array[i] % 10;
                if (hundreds != tens && hundreds != units && tens != units)
                {
                    NotEqualNumbers.append(array[i]).append(" ");
                }
            }
        }
        System.out.println("Not equal numbers: " + NotEqualNumbers);
    }
}
