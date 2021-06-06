/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Mauricio Rios
 */
package ex05;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String first = myApp.getFirst();
        String second = myApp.getSecond();
        int num1 = Integer.parseInt(first);
        int num2 = Integer.parseInt(second);
        int sum = myApp.getSum(num1, num2);
        int sub = myApp.getSub(num1, num2);
        int multi = myApp.getMulti(num1, num2);
        int div = myApp.getDiv(num1, num2);
        String outputString = myApp.generateOutputString(num1, num2, sum, sub, multi, div);
        myApp.printOutput(outputString);
    }

    public String getFirst() {
        System.out.print("Whats is the first number? ");
        return in.nextLine();
    }

    public String getSecond() {
        System.out.print("Whats is the second number? ");
        return in.nextLine();
    }

    public int getSum(int num1, int num2) {
        return num1 + num2;
    }

    public int getSub(int num1, int num2) {
        return num1 - num2;
    }

    public int getMulti(int num1, int num2) {
        return num1 * num2;
    }

    public int getDiv(int num1, int num2) {
        return num1 / num2;
    }

    public String generateOutputString(int num1, int num2, int sum, int sub, int multi, int div) {
        return num1+" + "+num2+" = "+sum+"\n"+num1+" - "+num2+" = "+sub+"\n"+num1+" * "+num2+" = "+multi+"\n"+num1+" / "+num2+" = "+div;
    }

    public void printOutput(String outputString) {
        System.out.print(outputString);
    }

}
