import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourFirst, minutesFirst,secFirst, hourSecond, minutesSecond, secSecond = 0;
        hourFirst = scanner.nextInt();
        minutesFirst = scanner.nextInt();
        secFirst = scanner.nextInt();
        hourSecond = scanner.nextInt();
        minutesSecond = scanner.nextInt();
        secSecond = scanner.nextInt();


//        // put your code here
//        String timeLine = scanner.nextLine();
//        scanner.close();
//        int[] numArr = Arrays.stream(timeLine.replaceAll(",", "")
//                .split(" ")).mapToInt(Integer::parseInt).toArray();
//
//        hourFirst = numArr[0];
//        minutesFirst = numArr[1];
//        secFirst = numArr[2];
//        hourSecond = numArr[3];
//        minutesSecond = numArr[4];
//        secSecond = numArr[6];

//        LocalTime t = LocalTime.parse("10,11,30 AM", DateTimeFormatter.ofPattern("hh,mm,ss a"));
//        System.out.println(t);


        LocalTime firstTime = LocalTime.of(hourFirst,minutesFirst,secFirst);
        LocalTime secondTime = LocalTime.of(hourSecond,minutesSecond,secSecond);
        long diffInSeconds = java.time.Duration.between(firstTime, secondTime).getSeconds();
        System.out.println(diffInSeconds);


//        LocalTime secondtime = LocalTime.of(3,21,1);
//
//
//        LocalTime t = LocalTime.parse(
//                "22,11,30", DateTimeFormatter.ofPattern("HH,mm,ss"));
//        System.out.println(t);
//
//        t = LocalTime.parse(
//                "10,11,30 AM", DateTimeFormatter.ofPattern("hh,mm,ss a"));
//        System.out.println(t);
//
//
//        long diffInSeconds = java.time.Duration.between(firstTime, secondtime).getSeconds();
//        System.out.println(diffInSeconds);


//        System.out.println(firstTime);
//        System.out.println(firstTime);



    }
}