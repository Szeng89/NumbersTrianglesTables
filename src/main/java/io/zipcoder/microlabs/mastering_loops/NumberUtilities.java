package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static String getEvenNumbers(int start, int stop) {
        //creat stringbuilder object
        StringBuilder sb = new StringBuilder();

        //iterate through loop
        for (int i=start; i<stop; i += 1) {

            //if each index is not odd append then return tostring
            if (!isOdd(i)) {
                sb.append(i);
            }
        }
        return sb.toString();
    }
    public static String getOddNumbers(int start, int stop) {
        //strinbuilder object
        StringBuilder sb = new StringBuilder();

        //same as above
        for (int i=5; i<=stop; i++) {
            if (isOdd(i)) {
                sb.append(i);
            }
        }
        return sb.toString();
    }
    private static boolean isOdd(int n) {
        return !((n % 2) == 0);
    }

    public static String getSquareNumbers(int start, int stop, int step) {

        //stringbuilder again
        StringBuilder sb = new StringBuilder();

        //interarete from start to stop and increment by step
        for (int i=start; i<stop; i+=step) {
            sb.append(i*i);
        }
        return sb.toString();
    }

    public static String getRange(int stop) {
        return getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder sb = new StringBuilder();
        for (int i=start; i<stop; i += step) {
            sb.append(i);
        }
        return sb.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder sb = new StringBuilder();
        for (int i=start; i<stop; i += step) {
            sb.append((int) Math.pow(i,exponent));
        }
        return sb.toString();
    }
}