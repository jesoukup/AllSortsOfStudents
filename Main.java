//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: P11 All Sorts of Students
// Files: All files in Main. Classes include: Main, File, InsertionSort, SelectionSort, HeapSort
//////////////////// Interfaces include: Sort
// Course: CS 300, Term 1, Year 2
//
// Author: Joseph Soukup
// Email: jsoukup2@wisc.edu
// Lecturer's Name: Gary Dahl
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name: Komuraji Sinde
// Partner Email: sinde@wisc.edu
// Lecturer's Name: Gary Dahl
//
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
// _x__ Write-up states that pair programming is allowed for this assignment.
// _x__ We have both read and understand the course Pair Programming Policy.
// _x__ We have registered our team prior to the team registration deadline.
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully
// acknowledge and credit those sources of help here. Instructors and TAs do
// not need to be credited here, but tutors, friends, relatives, room mates
// strangers, etc do. If you received no outside help from either type of
// source, then please explicitly indicate NONE.
//
// Persons: NONE
// Online Sources: NONE
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class uses a driver to load up a file from user input and sort the data based on user input.
 */
public class Main {

    /**
     * This method uses the other classes and their methods to display the output of the sorts based
     * on user input.
     * 
     * @param args
     */
    public static void main(String[] args) {
        InsertionSort<String> insert = new InsertionSort<String>();
        SelectionSort<String> select = new SelectionSort<String>();
        HeapSort<String> heap = new HeapSort<String>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of your student data file: ");
        String filename = scan.next();
        File file = new File(filename);
        insert.sort(file.printLine(), 0); // This sorts the file in alphabetical order and displays
                                          // it.
        String input = scan.next();
        int index;
        if (input.length() > 1) { // This allows input to work when there are no spaces between
                                  // commands.
            index = Integer.parseInt(input.substring(1));
            input = input.substring(0, 1);
            if (index >= file.printLine().get(0).size()) { // This helps prevent the user from
                                                           // entering an index that is out of
                                                           // bounds.
                System.out.println("WARNING: Index is bigger than number of elements in list.");
                input = scan.next();
                if (input.length() > 1) {
                    index = Integer.parseInt(input.substring(1));
                    input = input.substring(0, 1);
                } else {
                    index = scan.nextInt();
                }
            }
        } else {
            index = scan.nextInt();
            if (index >= file.printLine().get(0).size()) {
                System.out.println("WARNING: Index is bigger than number of elements in list.");
                input = scan.next();
                if (input.length() > 1) {
                    index = Integer.parseInt(input.substring(1));
                    input = input.substring(0, 1);
                } else {
                    index = scan.nextInt();
                }
            }
        }
        while (!input.equalsIgnoreCase("q")) { // This loop will continue to take input until the
                                               // user quits the program.
            if (!input.equalsIgnoreCase("o") && !input.equalsIgnoreCase("a")
                            && !input.equalsIgnoreCase("f")) {
                System.out.println("WARNING: Unrecognized command.");
                input = scan.next();
                if (input.length() > 1) {
                    index = Integer.parseInt(input.substring(1));
                    input = input.substring(0, 1);
                    if (index >= file.printLine().get(0).size()) {
                        System.out.println(
                                        "WARNING: Index is bigger than number of elements in list.");
                        input = scan.next();
                        if (input.length() > 1) {
                            index = Integer.parseInt(input.substring(1));
                            input = input.substring(0, 1);
                        } else {
                            index = scan.nextInt();
                        }
                    }
                } else {
                    index = scan.nextInt();
                    if (index >= file.printLine().get(0).size()) {
                        System.out.println(
                                        "WARNING: Index is bigger than number of elements in list.");
                        input = scan.next();
                        if (input.length() > 1) {
                            index = Integer.parseInt(input.substring(1));
                            input = input.substring(0, 1);
                        } else {
                            index = scan.nextInt();
                        }
                    }
                }
            }
            if (input.equalsIgnoreCase("o")) { // "O" will run the heap sort.
                heap.sort(file.printLine(), index);
                input = scan.next();
                if (input.length() > 1) {
                    index = Integer.parseInt(input.substring(1));
                    input = input.substring(0, 1);
                    if (index >= file.printLine().get(0).size()) {
                        System.out.println(
                                        "WARNING: Index is bigger than number of elements in list.");
                        input = scan.next();
                        if (input.length() > 1) {
                            index = Integer.parseInt(input.substring(1));
                            input = input.substring(0, 1);
                        } else {
                            index = scan.nextInt();
                        }
                    }
                } else {
                    index = scan.nextInt();
                    if (index >= file.printLine().get(0).size()) {
                        System.out.println(
                                        "WARNING: Index is bigger than number of elements in list.");
                        input = scan.next();
                        if (input.length() > 1) {
                            index = Integer.parseInt(input.substring(1));
                            input = input.substring(0, 1);
                        } else {
                            index = scan.nextInt();
                        }
                    }
                }
            }
            if (input.equalsIgnoreCase("a")) { // "A" will run the insertion sort.
                insert.sort(file.printLine(), index);
                input = scan.next();
                if (input.length() > 1) {
                    index = Integer.parseInt(input.substring(1));
                    input = input.substring(0, 1);
                    if (index >= file.printLine().get(0).size()) {
                        System.out.println(
                                        "WARNING: Index is bigger than number of elements in list.");
                        input = scan.next();
                        if (input.length() > 1) {
                            index = Integer.parseInt(input.substring(1));
                            input = input.substring(0, 1);
                        } else {
                            index = scan.nextInt();
                        }
                    }
                } else {
                    index = scan.nextInt();
                    if (index >= file.printLine().get(0).size()) {
                        System.out.println(
                                        "WARNING: Index is bigger than number of elements in list.");
                        input = scan.next();
                        if (input.length() > 1) {
                            index = Integer.parseInt(input.substring(1));
                            input = input.substring(0, 1);
                        } else {
                            index = scan.nextInt();
                        }
                    }
                }
            }
            if (input.equalsIgnoreCase("f")) { // "F" will run the selection sort.
                select.sort(file.printLine(), index);
                input = scan.next();
                if (input.length() > 1) {
                    index = Integer.parseInt(input.substring(1));
                    input = input.substring(0, 1);
                    if (index >= file.printLine().get(0).size()) {
                        System.out.println(
                                        "WARNING: Index is bigger than number of elements in list.");
                        input = scan.next();
                        if (input.length() > 1) {
                            index = Integer.parseInt(input.substring(1));
                            input = input.substring(0, 1);
                        } else {
                            index = scan.nextInt();
                        }
                    }
                } else {
                    index = scan.nextInt();
                    if (index >= file.printLine().get(0).size()) {
                        System.out.println(
                                        "WARNING: Index is bigger than number of elements in list.");
                        input = scan.next();
                        if (input.length() > 1) {
                            index = Integer.parseInt(input.substring(1));
                            input = input.substring(0, 1);
                        } else {
                            index = scan.nextInt();
                        }
                    }
                }
            }
        }
        scan.close();
    }
}


/**
 * This class is used to read in files and convert them into ArrayLists.
 */
class File {
    private BufferedReader br = null;
    private FileReader fr = null;
    private String filename;

    /**
     * This method constructs the File class.
     * 
     * @param filename - name of the file inputed by the user
     */
    public File(String filename) {
        this.filename = filename;
    }

    /**
     * This method reads in the file, puts each line in an array list, and then puts those array
     * lists into another array list.
     * 
     * @return - an array list of strings
     */
    public ArrayList<ArrayList<String>> printLine() {
        ArrayList<ArrayList<String>> fileLines = new ArrayList<ArrayList<String>>();
        try {
            fr = new FileReader(filename);
            br = new BufferedReader(fr);
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                ArrayList<String> line = new ArrayList<String>();
                String[] words = currentLine.split("\\s+"); // This array contains all the words in
                                                            // a line.
                if (words[1].contains(":")) {
                    words[0] = words[0] + " " + words[1];
                    for (int i = 1; i < words.length - 1; i++) {
                        words[i] = words[i + 1];
                    }
                }

                for (String word : words) {
                    word = word.replace(",", "");
                    line.add(word); // The words in the array are then added to the array list so
                                    // they can be counted as indexes.
                }
                fileLines.add(line); // Those array lists are then added to the encompassing array
                                     // list.
            }
        } catch (IOException e) { // Catches any exceptions caused by reading in files.
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return fileLines;
    }
}


/**
 * This interface contains common methods for our sort classes.
 *
 * @param <T>
 */
interface Sort<T> {

    void sort(ArrayList<ArrayList<T>> arr, int index);

    void printNumbers(ArrayList<ArrayList<T>> arr);
}


/**
 * This class is used to sort by the insertion sort algorithm.
 *
 * @param <T>
 */
class InsertionSort<T extends Comparable<T>> implements Sort<T> {

    /**
     * This method sorts the array list by the insertion sort algorithm.
     */
    @Override
    public void sort(ArrayList<ArrayList<T>> arr, int index) {
        int n = arr.size();
        for (int j = 1; j < n; j++) {
            ArrayList<T> key = arr.get(j);
            int i = j - 1;
            if (index == 0) { // This if statement is for sorting alphabetically.
                while ((i > -1) && arr.get(i).get(index).compareTo(key.get(index)) > 0) {
                    arr.set(i + 1, arr.get(i));
                    i--;
                }
                arr.set(i + 1, key);
            } else { // This else statement will be used to sort the scores.
                while ((i > -1) && Integer.compare(Integer.parseInt((String) arr.get(i).get(index)),
                                Integer.parseInt((String) key.get(index))) > 0) {
                    arr.set(i + 1, arr.get(i));
                    i--;
                }
                arr.set(i + 1, key);
            }
        }
        printNumbers(arr);
    }

    /**
     * This method prints out the array list as well as formats the print to be more readable.
     */
    @Override
    public void printNumbers(ArrayList<ArrayList<T>> arr) {
        for (ArrayList<T> i : arr) {
            for (T j : i) {
                if (j == i.get(0) || j == i.get(i.size() - 1)) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(j + ", ");
                }
            }
            System.out.println();
        }
    }
}


/**
 * This class is used to sort by the selection sort algorithm.
 *
 * @param <T>
 */
class SelectionSort<T extends Comparable<T>> implements Sort<T> {

    /**
     * This method sorts the array list by the selection sort algorithm.
     */
    @Override
    public void sort(ArrayList<ArrayList<T>> arr, int index) {
        for (int i = 0; i < arr.size() - 1; i++) {
            int pos = i;
            for (int j = i; j < arr.size(); j++) {
                if (index == 0) { // This if statement is for sorting alphabetically.
                    if (arr.get(j).get(index).compareTo(arr.get(pos).get(index)) < 0) {
                        pos = j;
                    }
                } else { // This else statement will be used to sort the scores.
                    if (Integer.compare(Integer.parseInt((String) arr.get(j).get(index)),
                                    Integer.parseInt((String) arr.get(pos).get(index))) < 0) {
                        pos = j;
                    }
                }
            }
            ArrayList<T> min = arr.get(pos);
            arr.set(pos, arr.get(i)); // This replaces the elements to sort the array list.
            arr.set(i, min);
        }
        printNumbers(arr);
    }

    /**
     * This method prints out the array list as well as formats the print to be more readable.
     */
    @Override
    public void printNumbers(ArrayList<ArrayList<T>> arr) {
        for (ArrayList<T> i : arr) {
            for (T j : i) {
                if (j == i.get(0) || j == i.get(i.size() - 1)) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(j + ", ");
                }
            }
            System.out.println();
        }
    }
}


/**
 * This class is used to sort by the heap sort algorithm.
 *
 * @param <T>
 */
class HeapSort<T extends Comparable<T>> implements Sort<T> {

    /**
     * This method sorts the array list by the heap sort algorithm.
     */
    @Override
    public void sort(ArrayList<ArrayList<T>> arr, int index) {
        int n = arr.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i, index);
        }
        for (int i = n - 1; i >= 0; i--) {
            ArrayList<T> a = arr.get(i);
            ArrayList<T> b = arr.get(0);
            ArrayList<T> temp = arr.get(0);
            b = arr.get(i);
            a = temp;
            arr.set(i, a); // This replaces the elements to sort the array list.
            arr.set(0, b);
            heapify(arr, i, 0, index); // This calls on heapify to maintain heap properties.
        }
        printNumbers(arr);
    }

    public void heapify(ArrayList<ArrayList<T>> arr, int n, int i, int index) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (index == 0) { // This if statement is for sorting alphabetically.
            if (l < n && arr.get(l).get(index).compareTo(arr.get(largest).get(index)) > 0) {
                largest = l;
            }
            if (r < n && arr.get(r).get(index).compareTo(arr.get(largest).get(index)) > 0) {
                largest = r;
            }
            if (largest != i) {
                ArrayList<T> a = arr.get(i);
                ArrayList<T> b = arr.get(largest);
                ArrayList<T> swap = arr.get(i);
                a = arr.get(largest);
                b = swap;
                arr.set(i, a); // This replaces the elements to sort the array list.
                arr.set(largest, b);
                heapify(arr, n, largest, index); // Recursively calls heapify to maintain heap
                                                 // properties.
            }
        } else { // This else statement will be used to sort the scores.
            if (l < n && Integer.parseInt((String) arr.get(l).get(index)) > Integer
                            .parseInt((String) arr.get(largest).get(index)))
                largest = l;
            if (r < n && Integer.parseInt((String) arr.get(r).get(index)) > Integer
                            .parseInt((String) arr.get(largest).get(index)))
                largest = r;
            if (largest != i) {
                ArrayList<T> a = arr.get(i);
                ArrayList<T> b = arr.get(largest);
                ArrayList<T> swap = arr.get(i);
                a = arr.get(largest);
                b = swap;
                arr.set(i, a); // This replaces the elements to sort the array list.
                arr.set(largest, b);
                heapify(arr, n, largest, index); // Recursively calls heapify to maintain heap
                                                 // properties.
            }
        }
    }

    /**
     * This method prints out the array list as well as formats the print to be more readable.
     */
    @Override
    public void printNumbers(ArrayList<ArrayList<T>> arr) {
        for (ArrayList<T> i : arr) {
            for (T j : i) {
                if (j == i.get(0) || j == i.get(i.size() - 1)) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(j + ", ");
                }
            }
            System.out.println();
        }
    }
}
