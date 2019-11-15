package assignment.lewis;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

import javax.print.attribute.IntegerSyntax;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        ArrayList names2 = new ArrayList();
        ArrayList names3 = new ArrayList();
        names3.add(0);
        names3.add(1);
        names3.add(2);
        names3.add(3);
        names3.add(4);
        names3.add(5);
        names3.add(6);
        names3.add(7);
        names3.add(8);
        names3.add(9);

        names.add("Leisha");
        names.add("Leisha");
        names.add("Tom");
        names.add("Daniel");
        names.add("Nicholas");
        names.add("Aruna");
        names.add("Anthony");
        names2.add("Anthony");
        names2.add("Tom");
        names2.add("Adam");
        names2.add("Adam");
        names2.add("Daniel");
        findLeisha(names); //question one
        findLeisha(names2); //question one
        ArrayList numberList = enterYourNumbers(); //question 2
        findYourNumber(numberList); // question 2

        findThatindex(names3,1);// question 3
        findThatindex(names3,15);// question 3
        System.out.println(numberList.size()); // question 4 is answered within the enterYourNumbers method.


    }

    public static void findLeisha(ArrayList<String> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == "Leisha") {
                count += 1;
            }
        }
        if (count > 0) {
            System.out.println("Leisha's name has been found " + count + " times");
        } else {
            System.out.println("Leisha's name has not been found in the list");
        }
    }
    public static void findYourNumber(ArrayList<Integer> arr) {
        int count = 0;
       Scanner userInput = new Scanner(System.in);
       System.out.println("Enter your number to find");
       int number = userInput.nextInt();

       for (int i = 0; i <arr.size(); i++) {
           if (arr.get(i) == number) {
               count += 1;
           }
        }
       if (count > 0) {
           System.out.println("Your number " + number +" has been found " + count + " times");
       }
       else {
           System.out.println("Your number  has not been found in the list");
       }
    }

    public static ArrayList<Integer> enterYourNumbers(){
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number in your Array list! Enter Stop to stop");

        while(sc.hasNextInt()) {
            int i = sc.nextInt();
            list.add(i);
            System.out.println("Enter Number in your Array list!");
        }
        if (list.size() > 10) {
          trimToSize(list);

        }
        return list;
    }

    public static void findThatindex(ArrayList <Integer> arr, int i) {
        try {
            int element = arr.get(i);
            System.out.println(element);
        }
        catch (Exception e) {
            System.out.println("That index does not exist");
        }
    }

    public static ArrayList<Integer> trimToSize(ArrayList<Integer> arr) {
        ArrayList <Integer> longerList = new ArrayList(arr.size());
        longerList = arr;
        return longerList;     // this will take care of question 4
    }

}

