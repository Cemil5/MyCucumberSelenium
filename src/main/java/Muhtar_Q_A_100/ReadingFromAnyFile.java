package Muhtar_Q_A_100;

import java.io.*;
import java.util.Scanner;

public class ReadingFromAnyFile {

    public static void main(String[] args) throws Exception {

        // read file with BufferedReader
        FileReader file1 = new FileReader("src/main/resources/textFile.txt");
        BufferedReader read = new BufferedReader(file1);
        System.out.println("read.readLine() = " + read.readLine());
        System.out.println("read.readLine() = " + read.readLine());

        // read excell file with BufferedReader (NO MEANINGFUL RESULT)
        file1 = new FileReader("src/main/resources/readTest.xlsx");
        read = new BufferedReader(file1);
        System.out.println("read.readLine() = " + read.readLine());
        System.out.println("read.readLine() = " + read.readLine());

        // read csv file with Scanner
        FileReader file2 = new FileReader("src/main/resources/readTest.csv");
        Scanner scan = new Scanner(file2);
        while (scan.hasNextLine()){
            System.out.println( scan.nextLine());
        }


        // read file with Scanner (can read csv file)
        file2 = new FileReader("src/main/resources/textFile.txt");
        scan = new Scanner(file2);
        while (scan.hasNextLine()){
            System.out.println( scan.nextLine());
        }


        // writing to a file with BufferedWriter
        FileWriter file3 = new FileWriter("src/main/resources/TextWrite.txt");
        BufferedWriter writer = new BufferedWriter(file3);
        writer.write("Hey everyone");
        writer.write("\nAre you good");
        writer.close(); // to execute writing


    }


}
