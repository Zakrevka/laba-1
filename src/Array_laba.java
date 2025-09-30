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
        String even = new String();
        String odd = new String();
        for (int i = 0; i < numbers; i++)
        {
            if(array[i] % 2 == 0)
            {
                even += array[i];
                even += " ";
            }
            else
            {
                odd += array[i];
                odd += " ";
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }

    public void MaxNUmber() {

    }
}
