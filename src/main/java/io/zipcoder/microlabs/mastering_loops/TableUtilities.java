package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){

                int number = i * j;
                if (number <= 9){
                    sb.append("  "+number+" ").append("|");
                } else{
                    sb.append(" "+number+" ").append("|");
                }
            }
            sb.append("\n");

        }
        return sb.toString();
    }



    public static String getLargeMultiplicationTable() {
        StringBuilder sb2 = new StringBuilder();
        for ( int i = 1; i <=10; i++){
            for (int j = 1; j <= 10; j++){
                int number = j * i;
                if (number < 10){
                    sb2.append("  "+ number +" " + "|");
                }else if (number <= 99) {
                    sb2.append(" " + number +" " + "|");
                }else{
                    sb2.append(number + " " + "|");
                }
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public static String getMultiplicationTable(int tableize) {
        StringBuilder sb3 = new StringBuilder();
        for ( int i = 1; i <=20; i++){
            for (int j = 1; j <= 20; j++){
                int number = j * i;
                if (number < 10){
                    sb3.append("  "+ number +" " + "|");
                }else if (number <= 99) {
                    sb3.append(" " + number +" " + "|");
                }else{
                    sb3.append(number + " " + "|");
                }
            }
            sb3.append("\n");
        }
        return sb3.toString();
    }
}
