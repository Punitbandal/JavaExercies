import java.nio.charset.Charset;
import java.util.Scanner;

public class Basic150 {
    public static void ex1() {
        System.out.println("hello\n Alexandra Abramov\n" +
                "\n");
    }

    public static void ex2() {
        System.out.println(74 + 45);
    }

    public static void ex3() {
        System.out.println(50 / 3);
    }

    public static void ex4() {
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    public static void ex5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number:");
        int firstNo = scanner.nextInt();
        System.out.println("Input second number:");
        int secondNo = scanner.nextInt();
        System.out.println(firstNo + " x  " + secondNo + " = " + (firstNo * secondNo));
    }

    public static void ex6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number:");
        int firstNo = scanner.nextInt();
        System.out.println("Input second number:");
        int secondNo = scanner.nextInt();
        System.out.println(firstNo + " +  " + secondNo + " = " + (firstNo + secondNo));
        System.out.println(firstNo + " -  " + secondNo + " = " + (firstNo - secondNo));
        System.out.println(firstNo + " x  " + secondNo + " = " + (firstNo * secondNo));
        System.out.println(firstNo + " /  " + secondNo + " = " + (firstNo / secondNo));
        System.out.println(firstNo + " %  " + secondNo + " = " + (firstNo % secondNo));
    }

    public static void ex7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number:");
        int firstNo = scanner.nextInt();
        for (int i = 1; i <= 10; i++)
            System.out.println(firstNo + " x  " + i + " = " + (firstNo * i));
    }

    public static void ex8() {
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }

    public static void ex9() {
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }

    public static void ex10() {
        System.out.println(4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
    }

    public static void ex11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius =");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter is =" + perimeter);
        double area = Math.PI * radius * radius;
        System.out.println("Area is =" + area);
    }

    public static void ex12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Three Numbers : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("Average of the Numbers  = " + (a + b + c) / 2);
    }

    public static void ex13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width: ");
        double w = scanner.nextDouble();
        System.out.println("Enter Height: ");
        double h = scanner.nextDouble();

        System.out.println("Area is " + w + " * " + h + " = " + (w * h));
        System.out.println("Perimeter is 2 * (" + w + " + " + h + ")" + " = " + (2 * (w + h)));
    }

    public static void ex14() {
        System.out.print("* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                " * * * * *  ==================================                          \n" +
                "* * * * * * ==================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================                          \n" +
                "==============================================");

    }

    public static void ex15() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two Numbers : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("before Swap a and b will be: " + a + " " + b);
        int temp = a;
        a = b;
        b = temp;
//        a=a+b;
//        b=a-b;
//        a=a-b;
        System.out.println("After Swap a and b will be: " + a + " " + b);
    }

    public static void ex16() {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }

    public static int ex17() {
        Scanner scanner = new Scanner(System.in);
        int i = 0, rem = 0;
        int binary_prod_result = 0;
        System.out.print("Input first binary number: ");
        long f = scanner.nextLong();
        System.out.print("Input second binary number: ");
        long s = scanner.nextLong();
        int[] sum = new int[20];

        while (f != 0 || s != 0) {
            sum[i++] = (int) (f % 10 + s % 10 + rem) % 2;
            rem = (int) (f % 10 + s % 10 + rem) / 2;
            f = f / 10;
            s = s / 10;
        }
        if (rem != 0) {
            sum[i++] = rem;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
        while (i >= 0) {
            binary_prod_result = binary_prod_result * 10 + sum[i--];
        }
        return binary_prod_result;
    }

    public static void ex18() {
        long binary1, binary2, multiply = 0;
        int digit, factor = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first binary number: ");
        binary1 = in.nextLong();
        System.out.print("Input the second binary number: ");
        binary2 = in.nextLong();

        while (binary2 != 0) {
            digit = (int) (binary2 % 10);
            if (digit == 1) {
                binary1 = binary1 * factor;
                multiply = binaryProduct((int) binary1, (int) multiply);
            } else
                binary1 = binary1 * factor;

            binary2 = binary2 / 10;
            factor = 10;
        }
        System.out.print("Product of two binary numbers: " + multiply + "\n");

    }


    static int binaryProduct(int b1, int b2) {
        int i = 0, rem = 0;
        int binary_prod_result = 0;
        int[] sum = new int[100];

        while (b1 != 0 || b2 != 0) {
            sum[i++] = (int) (b1 % 10 + b2 % 10 + rem) % 2;
            rem = (int) (b1 % 10 + b2 % 10 + rem) / 2;
            b1 = b1 / 10;
            b2 = b2 / 10;
        }
        if (rem != 0) {
            sum[i++] = rem;
        }
        --i;

        while (i >= 0) {
            binary_prod_result = binary_prod_result * 10 + sum[i--];
        }

        return binary_prod_result;
    }

    public static void ex19() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the Decimal number: ");

        int no = sc.nextInt();
        int[] binNo = new int[100];
        int qou = no, i = 0;
        while (qou != 0) {
            binNo[i++] = qou % 2;
            qou /= 2;
        }
        int noInBinary = 0;
        for (int j = i - 1; j >= 0; j--) {
            noInBinary = noInBinary * 10 + binNo[j];
        }

        System.out.println(noInBinary);
    }

    public static void ex20() {
        Scanner sc = new Scanner(System.in);
        String x = "";
        System.out.print("Input the Decimal number: ");
        int no = sc.nextInt();

        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int hexDec;
        while (no > 0) {
            hexDec = no % 16;
            x += hex[hexDec];
            no /= 16;
        }
        System.out.println("Hexadecimal number is : " + x);

    }

    public static void ex21() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the Decimal number: ");

        int no = sc.nextInt();
        int[] binNo = new int[100];
        int qou = no, i = 0;
        while (qou != 0) {
            binNo[i++] = qou % 8;
            qou /= 8;
        }
        int noInOct = 0;
        for (int j = i - 1; j >= 0; j--) {
            noInOct = noInOct * 10 + binNo[j];
        }

        System.out.println(noInOct);
    }

    public static void ex22() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the binary number: ");
        int digit, decNo = 0, i = 0;
        long no = sc.nextLong();

        while (no > 0) {
            digit = (int) no % 10;
            decNo += digit * Math.pow(2, i);
            i++;
            no /= 10;
        }

        System.out.println(decNo);


    }


    public static void ex31() {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
    }

    public static void ex32() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Numbers: ");
        int a = in.nextInt();

        int b = in.nextInt();

        if (a == b)
            System.out.println(a + " == " + b);
        if (a != b)
            System.out.println(a + " != " + b);
        if (a <= b)
            System.out.println(a + " <= " + b);
        if (a >= b)
            System.out.println(a + " >= " + b);
        if (a > b)
            System.out.println(a + " > " + b);
        if (a < b)
            System.out.println(a + " < " + b);

    }

    public static void ex33() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a = in.nextInt();
        int sum = 0, digit = 0;

        while (a > 0) {
            digit = a % 10;
            sum += digit;
            a /= 10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }

    public static void ex34() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the length of a side of the hexagon:");
        double s = in.nextDouble();

        double area = (6 * s * s) / (4 * Math.tan(Math.PI / 6));

        System.out.println("The area of the hexagon is: " + area);
    }

    public static void ex35() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number of sides on the polygon:");
        double n = in.nextDouble();
        System.out.println("Input the length of one of the sides:");
        double s = in.nextDouble();

        double area = (n * s * s) / (4 * Math.tan(Math.PI / n));
        System.out.println("The area is:  " + area);
    }

    public static void ex36() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the latitude of coordinate 1:");
        double lat1 = in.nextDouble();
        System.out.println("Input the longitude of coordinate 1:");
        double lon1 = in.nextDouble();
        System.out.println("Input the latitude of coordinate 2:");
        double lat2 = in.nextDouble();
        System.out.println("Input the longitude of coordinate 2:");
        double lon2 = in.nextDouble();
        final double r = 6371.01;

        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
        //d = radius * arccos(sin(lat1 ) * sin(lat2 ) + cos(lat1 ) * cos(lat2 ) * cos(lon1 - lon2 ))
        double distance = r * Math.acos((Math.sin(lat1) * Math.sin(lat2)) + (Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2)));

        System.out.println("The distance between those points is:" + distance);

    }

    public static void ex37() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] s = sc.nextLine().toCharArray();
        System.out.print("Reverse string: ");

        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i]);
        }
    }

    public static void ex38() {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Input a string: ");
        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        char[] s = test.toCharArray();
        int letter = 0, space = 0, number = 0, other = 0;
        System.out.println("The string is :" + test);

        for (int i = 0; i < test.length(); i++) {
            if (Character.isAlphabetic(s[i]))
                letter++;
            else if (Character.isDigit(s[i]))
                number++;
            else if (Character.isSpaceChar(s[i]))
                space++;
            else
                other++;


        }
        System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + number);
        System.out.println("other: " + other);
    }

    public static void ex39() {
        int amount = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (k != i && k != j && i != j) {
                        amount++;
                        System.out.print(i + "" + j + "" + k + "  ");
                    }
                }
            }
        }
        System.out.println("\nTotal number of the three-digit-number is " + amount);

    }

    public static void ex40() {
        System.out.println("List of available character sets: ");
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }
    }
    public static void ex41()
    {    Scanner sc = new Scanner(System.in);
        int  ch  = 'Z';
        System.out.println("The ASCII value of Z is :\n"+ ch);
    }

    public static void main(String[] args) {

        ex41();
    }

}