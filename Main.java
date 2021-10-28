package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Carpet carpet = new Carpet(5);
        Floor floor = new Floor(5,5);
        Calculator calculator = new Calculator(floor, carpet);

        System.out.println(calculator.getTotalCost());



    }


}
