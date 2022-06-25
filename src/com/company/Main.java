package com.company;

public class Main {

    public static void main(String[] args) {
        int intOperandA = 2;
        int intOperandB = 8;
        int intSum = 3;
        int intProduct = 4;
        int intDifference = 5;
        int intQuotient = 6;
        int intModulo = 7;
        double doubleOperandA = 3.50;
        double doubleOperandB = 4.50;
        double doubleSum = 5.50;
        double doubleProduct = 6.50;
        double doubleDifference = 7.50;
        double doubleQuotient = 8.50;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB +  "  is " + intSum);
        intDifference = intOperandB - intOperandA;
        System.out.println("The difference using ints of " + intOperandB + " " + intOperandA +  "  is " + intDifference);
        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " " + intOperandB +  "  is " + intProduct);
        intQuotient = intOperandB / intOperandA;
        System.out.println("The quotient using ints of " + intOperandB + " " + intOperandA +  "  is " + intQuotient);
        intModulo = intOperandB % intOperandA;
        System.out.println("The modulo using ints of " + intOperandB + " " + intOperandA +  "  is " + intModulo);

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The double sum using ints of " + doubleOperandA + " " + doubleOperandB +  "  is " + doubleSum);
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The double product using ints of " + doubleOperandA + " " + doubleOperandB +  "  is " + doubleProduct);
        doubleDifference = doubleOperandB - doubleOperandA;
        System.out.println("The double difference using ints of " + doubleOperandB + " " + doubleOperandA +  "  is " + doubleDifference);
        doubleQuotient = doubleOperandB / doubleOperandA;
        System.out.println("The double quotient using ints of " + doubleOperandB + " " + doubleOperandA +  "  is " + doubleQuotient);




        // write your code here
    }
}
