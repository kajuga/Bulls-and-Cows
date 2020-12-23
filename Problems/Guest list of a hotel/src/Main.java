//put imports you need here


import java.util.*;

class Main {
    public static void main(String[] args) {

        int number = 12241;
        int digit = ((number % 100) / 10) % 10;
        System.out.println(digit);



//        List<String> guests = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        String line = null;
//        while (sc.hasNextLine()) {
//            line = sc.nextLine();
//            if (line.equals("")) break;
//            Scanner scanner = new Scanner(line);
//            while (scanner.hasNext()) {
//                guests.add(scanner.next());
//            }
//        }
//        Collections.reverse(guests);
//        for (String str : guests) {
//            System.out.println(str);
//        }
    }
}