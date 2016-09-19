package org.alecge;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	// syntax: Main.class <value to convert> <base of value> <base to convert to>

        if(args[1] == '2' && args[2] == '10')
            System.out.println("Binary to Decimal: " + binaryToDecimal(args[0]));
    }
    public static int binaryToDecimal(String binary){
        double decimal = 0;

        for(int i = binary.length(); i > 0; i--){
            if(binary.charAt(i-1) == '1')
                decimal += Math.pow(2, i-1);
            else
                decimal +=0;
        }

        return (int) decimal;
    }
    public static int binaryToOctal(String binary){
        char[] processing = binary.toCharArray();
        int processingLength = processing.Length();

        if(processingLength % 3 == 0){
            //if length is divisible by three separate into 3 chunks
        }
        else if(processingLength % 3 == 1){
            // if remainder is 1 read the first digit and check if it's 1
        }
        else if(processingLength % 3 == 2){
            //if remainder is 2 read first two and convert to dec
        }



    }
}
