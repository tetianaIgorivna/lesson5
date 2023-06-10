import java.util.Arrays;

public class Homework9 {
    public static int checkNumber(int ShuttleNumber) {
        if
        (
                ShuttleNumber == 4 ||
                ShuttleNumber == 14 ||
                ShuttleNumber == 24 ||
                ShuttleNumber == 34 ||
                ShuttleNumber == 44 ||
                ShuttleNumber == 54 ||
                ShuttleNumber == 64 ||
                ShuttleNumber == 74 ||
                ShuttleNumber == 84 ||
                ShuttleNumber == 104 ||
                ShuttleNumber == 114 ||
                ShuttleNumber == 124 ||
                ShuttleNumber == 134 ||
                ShuttleNumber == 154 ||
                ShuttleNumber == 9 ||
                ShuttleNumber == 19 ||
                ShuttleNumber == 29 ||
                ShuttleNumber == 59 ||
                ShuttleNumber == 69 ||
                ShuttleNumber == 79 ||
                ShuttleNumber == 99 ||
                ShuttleNumber == 109 ||
                ShuttleNumber == 119 ||
                ShuttleNumber == 129
        )
        {
            return ShuttleNumber + 1;
        }
        else if
        (
                ShuttleNumber == 39 ||
                ShuttleNumber == 139 ||
                ShuttleNumber == 89
        )
        {
            return ShuttleNumber + 11;
        }

        else if
        (
                ShuttleNumber == 40 ||
                ShuttleNumber == 41 ||
                ShuttleNumber == 42 ||
                ShuttleNumber == 43 ||
                ShuttleNumber == 45 ||
                ShuttleNumber == 46 ||
                ShuttleNumber == 47 ||
                ShuttleNumber == 48 ||
                ShuttleNumber == 49 ||
                ShuttleNumber == 140 ||
                ShuttleNumber == 141 ||
                ShuttleNumber == 142 ||
                ShuttleNumber == 143 ||
                ShuttleNumber == 144 ||
                ShuttleNumber == 90 ||
                ShuttleNumber == 91 ||
                ShuttleNumber == 93 ||
                ShuttleNumber == 94 ||
                ShuttleNumber == 95 ||
                ShuttleNumber == 96 ||
                ShuttleNumber == 97 ||
                ShuttleNumber == 98
        )
        {
            return ShuttleNumber + 10;
        }

        else return ShuttleNumber;
    }

    public static void main(String[] args) {

        int[] shuttleNumbers = new int[100];
        int shuttleNumber = 1;
        for (int i = 0; i < 100; i++) {
            shuttleNumbers[i] = checkNumber(shuttleNumber);
            shuttleNumber = checkNumber(shuttleNumbers[i]) + 1;
        }

        System.out.println("Номери космічних шатлів для перевезення людей на Марс " + Arrays.toString(shuttleNumbers));
    }

}
