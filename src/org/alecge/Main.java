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
}
