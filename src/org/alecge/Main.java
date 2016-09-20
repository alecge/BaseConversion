package org.alecge;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	// syntax: Main.class <value to convert> <base of value> <base to convert to>

        // rudimentary invalid syntax catcher
        if(args.length < 2) {
            System.out.println("Incomplete Syntax.  Program will exit");
            System.exit(0);
        }
        else if(args[1].equals("2") && args[2].equals("10"))
            System.out.println("Binary to Decimal: " + binaryToDecimal(args[0]));
        else if(args[1].equals("2") && args[2].equals("8"))
            System.out.println("Binary to Octal: " + binaryToOctal(args[0]));
    }

    public static int binaryToDecimal(String binary){
        double decimal = 0;

        for(int i = binary.length(); i > 0; i--){
            // starts from MSB and moves to LSB
            //if bit == 1, 2^(i-1) is added to decimal
            //if bit == 0, nothing is added.
            if(binary.charAt(i-1) == '1')
                decimal += Math.pow(2, i-1);
            else
                decimal +=0;
        }

        //cast decimal result as int
        return (int) decimal;
    }

    public static int binaryToOctal(String binary){
        // converts binary string to char array for easier processing
        char[] processing = binary.toCharArray();
        int processingLength = processing.length;

        if(processingLength % 3 == 0){
            //if length is divisible by three separate into 3 chunks



        }
        else if(processingLength % 3 == 1){
            // if remainder is 1 read the first digit and check if it's 1
        }
        else if(processingLength % 3 == 2){
            //if remainder is 2 read first two and convert to dec
        }


        return 0;
    }
}
