// Java program to illustrate the fast
// input output
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    // Driver Code
    public static void main(String[] args)
            throws IOException
    {

        // Initialize the reader
        FastReader reader = new FastReader();

        // Initialize the writer
        FastWriter writer = new FastWriter();

//        // Your Code here
//
//        // Reads a single integer
//        int n = reader.readSingleInt();
//
//        // Reads a array of N number
//        // in a line
//        int a[] = reader.readIntArray(n);
//
//        // Prints a string
//        writer.writeString("SUM OF :");
//
//        // Print the array of number
//        // with spaces
//        writer.writeIntArrayWithSpaces(a);
//
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += a[i];
//        }
//
//        // Prints a single number
//        writer.writeSingleInteger(sum);
//        String s=reader.readString();
//        writer.writeString("Hello, "+s);
        Scanner scanf=new Scanner(System.in);
//        int x=scanf.nextInt();
//        long y=scanf.nextLong();
//        char z=scanf.next().charAt(0);
//        float a=scanf.nextFloat();
//        double b=scanf.nextDouble();
//        writer.writeString(x + "\n" +y+ "\n"+z+ "\n"+a+ "\n"+b);
        long x= scanf.nextLong();
        long y= scanf.nextLong();
        System.out.println(x+" + "+y+" = " +(x+y));
        System.out.println(x+" * "+y+" = " +(x*y));
        System.out.println(x+" - "+y+" = " +(x-y));
    }

    // Fast Reader Class
    public static class FastReader {

        // Reader object
        BufferedReader reader;

        // Constructor
        public FastReader()
        {
            // Initialize the reader
            reader = new BufferedReader(
                    new InputStreamReader(
                            System.in));
        }

        // String tokenizer
        StringTokenizer tokenizer;

        // Function to read integer
        public int readSingleInt()
                throws IOException
        {
            return Integer.parseInt(
                    reader.readLine());
        }

        // Function to read a single long
        public long readSingleLong()
                throws IOException
        {
            return Long.parseLong(
                    reader.readLine());
        }

        // Function to read a array of
        // numsInts integers in 1 line
        public int[] readIntArray(int numInts)
                throws IOException
        {
            int[] nums = new int[numInts];
            tokenizer
                    = new StringTokenizer(
                    reader.readLine());

            // Input Numbers
            for (int i = 0; i < numInts; i++) {
                nums[i] = Integer.parseInt(
                        tokenizer.nextToken());
            }
            return nums;
        }

        // Function to read string
        public String readString()
                throws IOException
        {
            return reader.readLine();
        }
    }

    // Fast Writer Class
    public static class FastWriter {

        // Writer object
        BufferedWriter writer;

        // Constructor
        public FastWriter()
        {

            // Initialize the writer
            writer = new BufferedWriter(
                    new OutputStreamWriter(
                            System.out));
        }

        // Function to write single integer
        public void writeSingleInteger(int i)
                throws IOException
        {
            writer.write(Integer.toString(i));
            writer.newLine();
            writer.flush();
        }

        // Function to write a single long
        public void writeSingleLong(long i)
                throws IOException
        {
            writer.write(Long.toString(i));
            writer.newLine();
            writer.flush();
        }

        // Function to write a Integer
        // of array with spaces in 1 line
        public void writeIntArrayWithSpaces(
                int[] nums)
                throws IOException
        {
            for (int i = 0; i < nums.length; i++) {
                writer.write(nums[i] + " ");
            }
            writer.newLine();
            writer.flush();
        }

        // Function to write a Integer
        // of array without spaces
        // in 1 line
        public void writeIntArrayWithoutSpaces(int[] nums)
                throws IOException
        {
            for (int i = 0;
                 i < nums.length; i++) {
                writer.write(
                        Integer.toString(
                                nums[i]));
            }
            writer.newLine();
            writer.flush();
        }

        // Function to write a String
        public void writeString(String s)
                throws IOException
        {
            writer.write(s);
            writer.newLine();
            writer.flush();
        }
    }
}