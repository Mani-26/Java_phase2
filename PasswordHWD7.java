import java.util.*;
public class PasswordHWD7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();
        int input5 = sc.nextInt();
        
        int stableSum = 0;
        int unstableSum = 0;

        int[] frequencies1 = calculateDigitFrequencies(input1);
        int[] frequencies2 = calculateDigitFrequencies(input2);
        int[] frequencies3 = calculateDigitFrequencies(input3);
        int[] frequencies4 = calculateDigitFrequencies(input4);
        int[] frequencies5 = calculateDigitFrequencies(input5);

        if (isStable(frequencies1)) {
            stableSum += input1;
        } else {
            unstableSum += input1;
        }

        if (isStable(frequencies2)) {
            stableSum += input2;
        } else {
            unstableSum += input2;
        }

        if (isStable(frequencies3)) {
            stableSum += input3;
        } else {
            unstableSum += input3;
        }

        if (isStable(frequencies4)) {
            stableSum += input4;
        } else {
            unstableSum += input4;
        }

        if (isStable(frequencies5)) {
            stableSum += input5;
        } else {
            unstableSum += input5;
        }

        return stableSum - unstableSum;
    }

    public static int[] calculateDigitFrequencies(int number) {
        int[] frequencies = new int[10]; // Frequencies for digits 0 to 9

        while (number > 0) {
            int digit = number % 10;
            frequencies[digit]++;
            number /= 10;
        }

        return frequencies;
    }

    public static boolean isStable(int[] frequencies) {
        int stableFrequency = 0;

        for (int frequency : frequencies) {
            if (frequency > 0) {
                if (stableFrequency == 0) {
                    stableFrequency = frequency;
                } else if (frequency != stableFrequency) {
                    return false;
                }
            }
        }

        return true;
    }
        System.out.println("Password: " + password);
    }