package Leetcode.random;

public class ReformData {
    public static void main(String[] args) {
        System.out.println(reformatDate("20th Oct 2052"));
        System.out.println(reformatDate("6th Jun 1933"));
        System.out.println(reformatDate("26th May 1960"));
    }

    public static String reformatDate(String totalDate) {
        String[] splitDate = totalDate.split(" ");
        String date = splitDate[0];
        String dt = date.substring(0,date.length()-2);
        String month = splitDate[1];
        String year = splitDate[2];

        int dates= Integer.parseInt(dt);
        if (dates<10){
            dt="0"+dates;
        }

        String mth = switch (month) {
            case "Jan" -> "01";
            case "Feb" -> "02";
            case "Mar" -> "03";
            case "Apr" -> "04";
            case "May" -> "05";
            case "Jun" -> "06";
            case "Jul" -> "07";
            case "Aug" -> "08";
            case "Sep" -> "09";
            case "Oct" -> "10";
            case "Nov" -> "11";
            case "Dec" -> "12";
            default -> throw new IllegalStateException("Unexpected value: " + date);
        };

        return year+"-"+mth+"-"+dt;
    }
}
