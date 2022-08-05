# JavaExercies
<h1>W3School Java Basic Programming : Exercises </h1>   

1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.<br>
  Expected Output :<br>
  Hello<br>
  Alexandra Abramov
<br> Code:
  ```java
  public static void ex1(){
        System.out.println("hello\n Alexandra Abramov\n" +
                "\n");
    }
  ```
    
2. Write a Java program to print the sum of two numbers. 
<br>    Test Data:
<br>74 + 36
<br>Expected Output :
<br>110
 <br>Code:
  ```java
  public static void ex2(){
        System.out.println(74+45);
    }
```
3.Write a Java program to divide two numbers and print on the screen. Go to the editor
<br>  Test Data :
<br>50/3
<br>Expected Output :
<br>16
 <br>Code:
  ```java
  public static void ex3(){
        System.out.println(50/3);
    }
  ```
4.Write a Java program to print the result of the following operations. Go to the editor
<br>Test Data:
<br>a. -5 + 8 * 6
<br>b. (55+9) % 9
<br>c. 20 + -3*5 / 8
<br>d. 5 + 15 / 3 * 2 - 8 % 3
<br>Expected Output :
<br>43
<br>1
<br>19
<br>13
  <br> Code:
  ```java
       public static void ex4(){
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }
  ```
5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
<br>Test Data:
<br>Input first number: 25
<br>Input second number: 5
<br>Expected Output :
<br>25 x 5 = 125
  <br> Code:
  ```java
  public static void ex5(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input first number:");
        int firstNo=scanner.nextInt();
        System.out.println("Input second number:");
        int secondNo=scanner.nextInt();
        System.out.println(firstNo+" x  "+secondNo+" = "+(firstNo*secondNo));
    }
  ```
  6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
<br>Test Data:
<br>Input first number: 125
<br>Input second number: 24
<br>Expected Output :
<br>125 + 24 = 149
<br>125 - 24 = 101
<br>125 x 24 = 3000
<br>125 / 24 = 5
<br>125 mod 24 = 5
   <br> Code:
  ```java
     public static void ex6(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input first number:");
        int firstNo=scanner.nextInt();
        System.out.println("Input second number:");
        int secondNo=scanner.nextInt();
        System.out.println(firstNo+" +  "+secondNo+" = "+(firstNo+secondNo));
        System.out.println(firstNo+" -  "+secondNo+" = "+(firstNo-secondNo));
        System.out.println(firstNo+" x  "+secondNo+" = "+(firstNo*secondNo));
        System.out.println(firstNo+" /  "+secondNo+" = "+(firstNo/secondNo));
        System.out.println(firstNo+" %  "+secondNo+" = "+(firstNo%secondNo));
    }
  ```
7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
<br>Test Data:
<br>Input a number: 8
<br>Expected Output :
<br>8 x 1 = 8
<br>8 x 2 = 16
<br>8 x 3 = 24
<br>...
<br>8 x 10 = 80  
    <br> Code:
  ```java
    public static void ex7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number:");
        int firstNo = scanner.nextInt();
        for (int i = 1; i <=10 ; i++) 
            System.out.println(firstNo + " x  " + i + " = " + (firstNo * i));
    }
```
    
8. Write a Java program to display the following pattern. Go to the editor
 <br> Sample Pattern :

```Output:
   J    a   v     v  a                                                  
   J   a a   v   v  a a                                                 
J  J  aaaaa   V V  aaaaa                                                
 JJ  a     a   V  a     a
 ```
<br> Code:
 ```java
    public static void ex8() {
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }
    
  ```
  
9. Write a Java program to compute the specified expressions and print the output. Go to the editor
 <br>Test Data:
 c((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 <br>Expected Output
 <br>2.138888888888889
 <br> Code:
 ```java
    public static void ex9() {
    System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }
  ```

10. Write a Java program to compute a specified formula. Go to the editor
<br>Specified Formula :
<br>4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
<br>Expected Output
<br>2.9760461760461765
<br> Code:
 ```java
public static void ex10(){
        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
    }
 ```
  11. Write a Java program to print the area and perimeter of a circle. Go to the editor
<br>Test Data:
<br>Radius = 7.5
<br>Expected Output
<br>Perimeter is = 47.12388980384689
<br>Area is = 176.71458676442586
  <br> Code:
 ```java
  public static void ex11(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius =");
        double radius=scanner.nextDouble();

        double perimeter=2*Math.PI*radius;
        System.out.println("Perimeter is ="+perimeter);
        double area=Math.PI*radius*radius;
        System.out.println("Area is ="+ area);
    }
 ```
 
 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers. Go to the editor
  <br> Code:
 ```java
     public static void ex12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Three Numbers : ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        System.out.println("Average of the Numbers  = "+(a+b+c)/2);
    }
 ```
 
 13. Write a Java program to print the area and perimeter of a rectangle. Go to the editor
 <br>Test Data:
 <br>Width = 5.5 Height = 8.5

 <br>Expected Output
 <br>Area is 5.6 * 8.5 = 47.60
 <br>Perimeter is 2 * (5.6 + 8.5) = 28.20
  <br> Code:
 ```java
 public static void ex13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width: ");
        double w=scanner.nextDouble();
        System.out.println("Enter Height: ");
        double h=scanner.nextDouble()5.;

        System.out.println("Area is "+w+" * "+h+" = "+(w*h) );
        System.out.println("Perimeter is 2 * ("+w+" + "+h+")"+" = " + (2*(w+h)));
    }
  ```
  
  14. Write a Java program to print an American flag on the screen. Go to the editor
<br>Expected Output
```
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================
```
  <br> Code:
 ```java
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

```

or
 ```java
 public static void ex14() {
 String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
  String p2 = "==============================================";
  for (int i = 0; i < 4; i++) {
   System.out.println(p1);
  }
  System.out.println("* * * * * * ==================================");
  for (int i = 0; i < 6; i++) {
   System.out.println(p2);
  }
 }
 ```

 15. Write a Java program to swap two variables.
   <br> Code:
 ```java
   public static void ex15(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two Numbers : ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("before Swap a and b will be: "+a+" "+b);
        int temp=a;
        a=b;
        b=temp;
//        a=a+b;
//        b=a-b;
//        a=a-b;
        System.out.println("After Swap a and b will be: "+a+" "+b);
    }
 ```
 6. Write a Java program to print a face. Go to the editor
Expected Output
```
 +"""""+                                                 
[| o o |]                                                
 |  ^  |                                                 
 | '-' |                                                 
 +-----+
 ```
  
    <br> Code:
 ```java
 public static void ex16() {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
        }
```

17. Write a Java program to add two binary numbers. Go to the editor
<br>Input Data:
<br>Input first binary number: 10
<br>Input second binary number: 11
<br>Expected Output
      <br> Code:
 ```java
      public static void ex17() {
        Scanner scanner = new Scanner(System.in);
        int i=0,rem=0;
        System.out.print("Input first binary number: ");
        long  f=scanner.nextLong();
        System.out.print("Input second binary number: ");
        long  s=scanner.nextLong();
        int[] sum=new int[20] ;

        while(f!=0||s!=0){
            sum[i++]=(int)(f%10+s%10+rem)%2;
            rem=(int)(f%10+s%10+rem)/2;
            f=f/10;
            s=s/10;
        }
        if(rem!=0){
            sum[i++]=rem;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }
   ```
  
  18. Write a Java program to multiply two binary numbers. Go to the editor
<br>Input Data:
<br>Input the first binary number: 10
<br>Input the second binary number: 11
<br>Expected Output

<br>Product of two binary numbers: 110 
     <br> Code:
 ```java
  public static void ex18(){
        long binary1, binary2, multiply = 0;
        int digit, factor = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first binary number: ");
        binary1 = in.nextLong();
        System.out.print("Input the second binary number: ");
        binary2 = in.nextLong();

        while (binary2!=0){
            digit=(int) (binary2 %10);
            if (digit==1){
                binary1=binary1*factor;
                multiply=binaryProduct((int) binary1,(int) multiply);
            }
            else
                binary1=binary1*factor;

            binary2=binary2/10;
            factor=10;
        }
        System.out.print("Product of two binary numbers: " + multiply+"\n");

    }

    static int binaryProduct(int b1, int b2){
        int i=0,rem=0;
        int binary_prod_result = 0;
        int[] sum=new int[100] ;

        while(b1!=0||b2!=0){
            sum[i++]=(int)(b1%10+b2%10+rem)%2;
            rem=(int)(b1%10+b2%10+rem)/2;
            b1 = b1 / 10;
            b2 = b2 / 10;
        }
        if (rem!=0){
            sum[i++]=rem;
        }
        --i;
        
        while(i>=0){
            binary_prod_result=binary_prod_result*10+sum[i--];
        }
        return  binary_prod_result;
    }
```

19. Write a Java program to convert a decimal number to binary number. Go to the editor
<br>Input Data:
<br>Input a Decimal Number : 5
<br>Expected Output

<br>Binary number is: 101 
   <br> Code:
 ```java
  
     public static void ex19(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the Decimal number: ");

        int no=sc.nextInt();
        int[]  binNo=new int[100];
        int qou=no,i=0;
        while (qou!=0){
            binNo[i++]=qou%2;
                qou/=2;
        }
        int noInBinary=0;
        for (int j = i-1; j >=0 ; j--) {
            noInBinary=noInBinary*10+binNo[j];
        }

        System.out.println(noInBinary);
    }
 ```
 20. Write a Java program to convert a decimal number to hexadecimal number. Go to the editor
<br> nput Data:
<br> Input a decimal number: 15
<br> Expected Output

<br> Hexadecimal number is : F 
<br> Code:
 ```java
 public static void ex20(){
    Scanner sc=new Scanner(System.in);
    String x="";
    System.out.print("Input the Decimal number: ");
    int no=sc.nextInt();
    
    char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int  hexDec;
    while (no>0){
        hexDec=no%16;
        x+=hex[hexDec];
        no/=16;
    }
    System.out.println("Hexadecimal number is : "+x);

}
 ```

 21. Write a Java program to convert a decimal number to octal number. Go to the editor
  <br>Input Data:
  <br>Input a Decimal Number: 15
  <br>Expected Output

  <br>Octal number is: 17 
  <br> Code:
 ```java
  public static void ex21(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the Decimal number: ");

        int no=sc.nextInt();
        int[]  binNo=new int[100];
        int qou=no,i=0;
        while (qou!=0){
            binNo[i++]=qou%8;
            qou/=8;
        }
        int noInOct=0;
        for (int j = i-1; j >=0 ; j--) {
            noInOct=noInOct*10+binNo[j];
        }

        System.out.println(noInOct);
    }
 ``` 
 22. Write a Java program to convert a binary number to decimal number.
<br>Input Data:
<br>Input a binary number: 100
<br>Expected Output

<br>Decimal Number: 4 
  
  public static void ex22(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the binary number: ");
        int digit,decNo = 0,i=0;
        long no=sc.nextLong();
        while(no>0){
            digit=(int)no%10;
            decNo+=digit*Math.pow(2,i);
            i++;
            no/=10;
        }
        System.out.println(decNo);
    }
  
  23. Write a Java program to convert a binary number to hexadecimal number. Go to the editor
<br>Input Data:
<br>Input a Binary Number: 1101
<br>Expected Output

<br>HexaDecimal value: D
_______________________________________________________________________________________________________  
  


31. Write a Java program to check whether Java is installed on your computer. Go to the editor
<br>Expected Output
<br>Java Version: 1.8.0_71                                                            
<br>Java Runtime Version: 1.8.0_71-b15                                                
<br>Java Home: /opt/jdk/jdk1.8.0_71/jre                                               
<br>Java Vendor: Oracle Corporation                                                   
<br>Java Vendor URL: http://Java.oracle.com/                                          
<br>Java Class Path: .
  <br> Code:
 ```java 
  
   public static void ex31(){
        System.out.println("Java Version: "+System.getProperty("java.version"));
        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
        System.out.println("Java Home: "+System.getProperty("java.home"));
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: "+System.getProperty("java.class.path"));
    }
  ```
  
  32. Write a Java program to compare two numbers. Go to the editor
<br>Input Data:
<br>Input first integer: 25
<br>Input second integer: 39
<br>Expected Output

<br>25 != 39                                                                          
<br>25 < 39                                                                           
<br>25 <= 39
 <br> Code:
 ```java
public static void ex32(){
        Scanner in =new Scanner(System.in);
        System.out.println("Input Numbers: ");
        int a=in.nextInt();

        int b=in.nextInt();

        if (a==b)
            System.out.println(a+ " == "+ b);
        if (a!=b)
            System.out.println(a+ " != "+ b);
        if (a<=b)
            System.out.println(a+ " <= "+ b);
        if (a>=b)
            System.out.println(a+ " >= "+ b);
        if (a>b)
            System.out.println(a+ " > "+ b);
        if (a<b)
            System.out.println(a+ " < "+ b);

    }
  ```
  33. Write a Java program and compute the sum of the digits of an integer. Go to the editor
<br>Input Data:
<br>Input an integer: 25
<br>Expected Output

<br>The sum of the digits is: 7
<br> Code:
 ```java
  public static void ex33(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a=in.nextInt();
        int sum=0,digit=0;

        while(a>0){
            digit=a%10;
            sum+=digit;
            a/=10;
        }
        System.out.println("The sum of the digits is: "+sum);
    }
```
34. Write a Java program to compute the area of a hexagon. Go to the editor
<br>Area of a hexagon = (6 * s^2)/(4*tan(π/6))
<br>where s is the length of a side
<br>Input Data:
<br>Input the length of a side of the hexagon: 6
<br>Expected Output

<br>The area of the hexagon is: 93.53074360871938
  <br> Code:
 ```java     
  public static void ex34(){
        Scanner in =new Scanner(System.in);
            System.out.println("Input the length of a side of the hexagon:");
        double s=in.nextDouble();

        double area=(6*s*s)/(4*Math.tan(Math.PI/6));

            System.out.println("The area of the hexagon is: "+ area);
        }
        
  ```
    35. Write a Java program to compute the area of a polygon. Go to the editor
<br>Area of a polygon = (n*s^2)/(4*tan(π/n))
<br>where n is n-sided polygon and s is the length of a side
<br>Input Data:
<br>Input the number of sides on the polygon: 7
<br>Input the length of one of the sides: 6
<br>Expected Output

  <br>The area is: 130.82084798405722
   <br> Code:
 ```java 
  
 public static void ex35(){
        Scanner in =new Scanner(System.in);
        System.out.println("Input the number of sides on the polygon:");
        double n=in.nextDouble();
        System.out.println("Input the length of one of the sides:");
        double s=in.nextDouble();

        double area=(n*s*s)/(4*Math.tan(Math.PI/n));
        System.out.println("The area is:  "+area);
    } 
 ```
 36. Write a Java program to compute the distance between two points on the surface of earth. Go to the editor
Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
Input Data:
Input the latitude of coordinate 1: 25
Input the longitude of coordinate 1: 35
Input the latitude of coordinate 2: 35.5
Input the longitude of coordinate 2: 25.5
Expected Output

The distance between those points is: 1480.0848451069087 km 
<br> Code:
 ```java 
 public static void ex36() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the latitude of coordinate 1:");
        double lat1  = in.nextDouble();
        System.out.println("Input the longitude of coordinate 1:");
        double lon1 = in.nextDouble();
        System.out.println("Input the latitude of coordinate 2:");
        double lat2  = in.nextDouble();
        System.out.println("Input the longitude of coordinate 2:");
        double lon2 = in.nextDouble();
        final double r=6371.01;

        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
        //d = radius * arccos(sin(lat1 ) * sin(lat2 ) + cos(lat1 ) * cos(lat2 ) * cos(lon1 - lon2 ))
        double distance=r*Math.acos((Math.sin(lat1)*Math.sin(lat2))+(Math.cos(lat1 )*Math.cos(lat2 )*Math.cos(lon1-lon2)));

        System.out.println("The distance between those points is:"+ distance);

    }
  ```
  37. Write a Java program to reverse a string. Go to the editor
<br>Input Data:
<br>Input a string: The quick brown fox
<br>Expected Output

<br>Reverse string: xof nworb kciuq ehT
<br> Code:
 ```java 
  public static void ex37() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] s= sc.nextLine().toCharArray();
        System.out.print("Reverse string: ");

        for (int i = s.length-1; i >=0 ; i--) {
            System.out.print(s[i]);
        }
    }
```
  38. Write a Java program to count the letters, spaces, numbers and other characters of an input string. Go to the editor
<br>Expected Output

<br>The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
<br>letter: 23                                               
<br>space: 9                                                 
<br>number: 10                                         
<br>other: 6
<br> Code:
 ```java
   public static void ex38(){
        Scanner sc=new Scanner(System.in);
       // System.out.print("Input a string: ");
        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        char[] s= test.toCharArray();
            int letter=0,space=0,number=0,other=0;
        System.out.println("The string is :"+test   );

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
 ```
 39. Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there. Go to the editor
<br>Expected Output

<br>123                                                      
<br>124                                                      
<br>...                                            
                                                   
<br>431                                                      
<br>432                                                      
<br>Total number of the three-digit-number is 24
<br> Code:
 ```java
 public static void ex39(){
        int  amount=0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <=4 ; k++) {
                    if (k!=i&&k!=j&&i!=j)
                    {
                        amount++;
                        System.out.print(i+""+j+""+k+"  ");
                    }
                }
            }
        }
        System.out.println("\nTotal number of the three-digit-number is " + amount);
    }
```

40. Write a Java program to list the available character sets in charset objects. Go to the editor
<br>Expected Output
<br>List of available character sets:                                       
<br>Big5                                                                    
<br>Big5-HKSCS                                                              
<br>CESU-8                                                                  
<br>EUC-JP                                                                  
<br>EUC-KR                                                                  
<br>GB18030                                                                 
<br>GB2312                                                                  
<br>GBK                                                                     
<br>                                                     
<br>...                                            
<br>                                                   
<br>x-SJIS_0213                                                             
<br>x-UTF-16LE-BOM                                                          
<br>X-UTF-32BE-BOM                                                          
<br>X-UTF-32LE-BOM                                                          
<br>x-windows-50220                                                         
<br>x-windows-50221                                                         
<br>x-windows-874                                                           
<br>x-windows-949                                                           
<br>x-windows-950                                                           
<br>x-windows-iso2022jp
<br> Code:
 ```java
 import java.nio.charset.Charset;

 public static void ex40() {
        System.out.println("List of available character sets: ");
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }
    }
```

41. Write a Java program to print the ascii value of a given character. Go to the editor
<br>Expected Output

<br>The ASCII value of Z is :90
<br> Code:
 ```java
 public static void ex41()
    {    Scanner sc = new Scanner(System.in);
        int  ch  = 'Z';
        System.out.println("The ASCII value of Z is :\n"+ ch);
    }
```
42. Write a Java program to input and display your password. Go to the editor
<br>Expected Output

<br>Input your Password:                                                    
<br>Your password was: abc@123
<br> Code:
 ```java
-------------------------------
error
 ```
 43. Write a Java program to print the following string in a specific format (see the output). Go to the editor
Sample Output
```
Twinkle, twinkle, little star,
	How I wonder what you are! 
		Up above the world so high,   		
		Like a diamond in the sky. 
Twinkle, twinkle, little star, 
	How I wonder what you are
  ```
  <br> Code:
 ```java
  public static void ex43(){
        System.out.println("Twinkle, twinkle, little star,\n" +
                "\tHow I wonder what you are! \n" +
                "\t\tUp above the world so high,   \t\t\n" +
                "\t\tLike a diamond in the sky. \n" +
                "Twinkle, twinkle, little star, \n" +
                "\tHow I wonder what you are");
    }
```
44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. Go to the editor
<br>Sample Output:

<br>Input number: 5                                                        
<br>5 + 55  + 555
 <br> Code:
 ```java
 public static void ex44(){
        Scanner sc=new Scanner(System.in);
    System.out.println("Input Number:");
    int  n=sc.nextInt();
    char s1, s2, s3;
    System.out.printf("%d +%d%d+%d%d%d",n,n,n,n,n,n);

}
```
45. Write a Java program to find the size of a specified file. Go to the editor
<br>Sample Output:

<br>/home/students/abc.txt  : 0 bytes 
 <br> Code:
 ```java 
public static void ex45(){
    System.out.println("C:\\Users\\punit\\OneDrive\\Pictures\\abc.txt   "+ new File("abc.txt").length() + " bytes");
}
```

46. Write a Java program to display the system time.
<br>Sample Output:
<br>Current Date time: Fri Jun 16 14:17:40 IST 2017
<br> Code:
 ```java 
 public static void ex46(){
    Date date=new Date();

    System.out.println("Current Date time:"+date);
}
```
47. Write a Java program to display the current date time in specific format. Go to the editor
<br>Sample Output:

<br>Now: 03/08/2022  18:41:45.45 
 <br> Code:
 ```java 
 public static void ex47() {
        SimpleDateFormat formatDate = new SimpleDateFormat(
                "dd/MM/yyyy  HH:mm:ss.ss ");
        Date date = new Date();
        System.out.println("Now: " + formatDate.format(date));

    }
    
48. Write a Java program to print the odd numbers from 1 to 99. Prints one number per line. Go to the editor
<br>Sample Output:

1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59 61 63 65 67 69 71 73 75 77 79 81 83 85 87 89 91 93 95 97 99 
<br> Code:
 ```java 
public static void ex48(){
        for (int i = 0; i < 100; i++) {
            if (i%2 != 0) {
                System.out.print(i +" ");
            }

        }
    }
```
49. Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd. Go to the editor
<br>Sample Output:

<br>Input a number: 20                                                     
<br>1 
<br> Code:
 ```java 
   public static void ex49(){
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        if (no%2 == 0) {
            System.out.println(1);
        }
        else
            System.out.println(0);
    }
```

50. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both. Go to the editor
Sample Output:

<br>Divided by 3:                                                          
3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,              
                                                                       
<br>Divided by 5:                                                          
5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 
95,                                                                    
                                                                       
<br>Divided by 3 & 5:                                                      
15, 30, 45, 60, 75, 90,

 <br> Code:
 ```java 
public static void ex50(){
        System.out.println("Divided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i%3==0)
                System.out.print(i+",");
        }
        System.out.println();
        System.out.println("\nDivided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i%5==0)
                System.out.print(i+",");
        }
        System.out.println();
        System.out.println("\nDivided by 3 & 5: ");
        for (int i = 1; i < 100; i++) {
            if (i%5==0&&i%3==0)
                System.out.print(i+",");
        }
    }
```
51. Write a Java program to convert a string to an integer in Java. Go to the editor
<br>Sample Output:

<br>Input a number(string): 25                                             
<br>The integer value is: 25

<br> Code:
 ```java 
public static void ex51() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String s = sc.nextLine();
        int x = Integer.parseInt(s);
        System.out.printf("The integer value is: %d", x);
    }
```
52. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer. Go to the editor
Sample Output:

<br>Input the first number : 5                                             
<br>Input the second number: 10                                            
<br>Input the third number : 15                                            
<br>The result is: true
<br> Code:
 ```java 
  public static void ex52(){
        Scanner sc =new Scanner(System.in);
    System.out.println("Input the first number :");
        int a= sc.nextInt();
    System.out.println("Input the second number:");
        int b= sc.nextInt();
    System.out.println("Input the third number:");
        int c= sc.nextInt();

        if (a+b==c)
            System.out.println("The result is:"+true);
        else
            System.out.println("The result is:"+false);
}
```
53. Write a Java program that accepts three integers from the user and return true if the second number is greater than first number and third number is greater than second number. If "abc" is true second number does not need to be greater than first number. Go to the editor
<br>Sample Output:

<br>Input the first number : 5                                             
<br>Input the second number: 10                                            
<br>Input the third number : 15                                            
<br>The result is: true
<br> Code:
 ```java 
public static void ex53() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number :");
        int a = sc.nextInt();
        System.out.println("Input the second number:");
        int b = sc.nextInt();
        System.out.println("Input the third number:");
        int c = sc.nextInt();
        boolean abc=false;
        if(abc)
            System.out.println(c > b);
        else
            System.out.println((b > a  && c > b));
        }
```
54. Write a Java program that accepts three integers from the user and return true if two or more of them (integers ) have the same rightmost digit. The integers are non-negative. Go to the editor
<br>Sample Output:

<br>Input the first number : 5                                             
<br>Input the second number: 10                                            
<br>Input the third number : 15                                            
<br>The result is: true
<br> Code:
 ```java 
public static void ex54(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Input the first number :");
                int a = sc.nextInt();
                System.out.println("Input the second number:");
                int b = sc.nextInt();
                System.out.println("Input the third number:");
                int c = sc.nextInt();

                int r1=a%10,r2=b%10,r3=c%10;

                if (r3==r1||r3==r2)
                    System.out.println(true);
                else
                    System.out.println(false);
            }

```
55. Write a Java program to convert seconds to hour, minute and seconds. Go to the editor
<br>Sample Output:

<br>Input seconds: 86399                                                   
<br>23:59:59
<br> Code:
 ```java 
 public static void ex55(){
        Scanner sc=new Scanner(System.in);
            System.out.println("Input seconds:");
            int sec= sc.nextInt();
            int hr,mm,ss;
            ss=sec%60; //86399%60=59
            hr=sec/60;//86399/60=1439
            mm=hr%60;//1439%60=59
            hr=hr/60;//1439/60=23

            System.out.println(hr+":"+mm+":"+ss);
            System.out.println();
        }
 ```

56. Write a Java program to find the number of values in a given range divisible by a given value. Go to the editor
For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
<br>Sample Output:

<br>5
<br> Code:
 ```java 
public static void ex56(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Input x:");
            int x= sc.nextInt();
            System.out.println("Input y:");
            int y= sc.nextInt();
            System.out.println("Input p:");
            int p= sc.nextInt();
            int count=0;

            for (int i = x; i <= y ; i++) {
                if(i % p==0)
                        count++;
                }
            System.out.println(count);
        }

```
57. Write a Java program to accepts an integer and count the factors of the number. Go to the editor
<br>Sample Output:

<br>Input an integer: 25                                                   
<br>3
<br> Code:
 ```java 
public static void ex57(){
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter integer:");
            int count=0;
            int n=sc.nextInt();
            for (int i = 1; i <=n; i++) {
                if (n%i==0){
                    count++;
                }
            }
            System.out.println(count);
        }

```
58. Write a Java program to capitalize the first letter of each word in a sentence. Go to the editor
<br>Sample Output:

<br>Input a Sentence: the quick brown fox jumps over the lazy dog.         
<br>The Quick Brown Fox Jumps Over The Lazy Dog.

<br> Code:
 ```java 
    public static void ex58(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String line=sc.nextLine();
        String upper_case_line="";
        Scanner lineScanner=new Scanner(line);

        while (lineScanner.hasNext()){
            String word=lineScanner.next();
            upper_case_line+=Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
        }

        System.out.println(upper_case_line);
    }
    
 ```
 59. Write a Java program to convert a given string into lowercase. Go to the editor
<br>Sample Output:

<br>Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.           
<br>the quick brown fox jumps over the lazy dog.   
      
<br> Code:
 ```java 
    public static void ex59(){
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            s=s.toLowerCase();
                System.out.println(s);
             }
```
60. Write a Java program to find the penultimate (next to last) word of a sentence. Go to the editor
<br>Sample Output:

<br>Input a String: The quick brown fox jumps over the lazy dog.
<br>Penultimate word: lazy
 <br> Code:
 ```java 
 public static void ex60(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String s=sc.nextLine();

        String[] str=s.split("[ ]+");
        System.out.println("Penultimate word:"+str[str.length-2]);
    }
```
61. Write a Java program to reverse a word. Go to the editor
<br>Sample Output:

<br>Input a word: dsaf
<br>Reverse word: fasd
<br> Code:
 ```java 
  public static void ex61(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a Word: ");
        String s=sc.next();
        s=s.trim();

        String result="";
        char[] c=s.toCharArray();

        for (int i = c.length-1; i >=0; i--) {
            result+= c[i];
        }
        System.out.println("Reverse word: "+result);
    }
```
 
 
 62. Write a Java program that accepts three integer values and return true if one of them is 20 or more and less than the substractions of others. Go to the editor
<br>Sample Output:

<br>Input the first number : 15                                            
<br>Input the second number: 20                                            
<br>Input the third number : 25                                            
<br>false

<br> Code:
 ```java

public static void ex62() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number :");
        int a = sc.nextInt();
        System.out.println("Input the second number:");
        int b = sc.nextInt();
        System.out.println("Input the third number:");
        int c = sc.nextInt();
        //15 20 50 -> one of them  20
        //50-15=35 is grater than 20
        

        System.out.println(Math.abs(a - b) >= 20 || Math.abs(b - c) >= 20 || Math.abs(a - c) >= 20);
    }
```    

63. Write a Java program that accepts two integer values from the user and return the larger values. However if the two values are the same, return 0 and return the smaller value if the two values have the same remainder when divided by 6.
<br>Sample Output:
<br>Input the first number : 12                                            
<br>Input the second number: 13                                            
<br>Result: 13

<br>Code:
```java
 public static void ex63(){
        //1.return the larger values.
        //2.if the two values are the same, return 0
        //3.return the smaller value if the two values have the same remainder when divided by 6.
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number :");
        int a = sc.nextInt();
        System.out.println("Input the second number:");
        int b = sc.nextInt();
        if (a==b)
            System.out.println(0);
        else if (a%6==b%6)
        {
            int x=a<b?a:b;
            System.out.println(x);
        }
        else{
            int y=a>b?a:b;
            System.out.println(y);}
    }
```
64. Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers. Go to the editor
<br>Sample Output:

<br>Input the first number : 35                                            
<br>Input the second number: 45                                            
<br>Result: true
<br>Code:
```java
public static void ex64(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the first number :");
        int a = sc.nextInt();
        System.out.println("Input the second number:");
        int b = sc.nextInt();

        if (a<25||b>75){
            System.out.println("false");
        }
        int x=a%10;
        int y=b%10;
        a/=10;
        b/=10;
        System.out.println(x==a||y==b||a==b||y==x);
        }
```
65. Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator. Go to the editor
<br>Sample Output:

<br>Input the first number : 19                                            
<br>Input the second number: 7                                             
<br>5   

<br>Code:
```java
  public static void ex65(){
            Scanner sc = new Scanner(System.in);

            System.out.println("Input the first number :");
            int a = sc.nextInt();
            System.out.println("Input the second number:");
            int b = sc.nextInt();

            int divided =a/b;
            int rem=a-(b*divided);
            System.out.println(rem);
         //   System.out.println(a%b);
        }
```

66. Write a Java program to compute the sum of the first 100 prime numbers. Go to the editor
<br>Sample Output:

<br>Sum of the first 100 prime numbers: 24133 
<br>Code:
```java
public static void ex66() {
        int count = 0, sum = 1, n = 0;
    
        while (count < 100) {
            n++;
            if (n % 2 != 0) {
                if (isPrime(n)) {
                    sum += n;
                }
                count++;
            }
    
        }
        System.out.println(sum);
        }
        public static boolean isPrime ( int n){
            for (int i = 3; i * i <= n; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
```
67. Write a Java program to insert a word in the middle of the another string. Go to the editor
Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
<br>Sample Output:

<br>Python Tutorial 3.0
<br>Code:
```java
public static void ex67(){

        String main_string = "Python 3.0";
        String word = "Tutorial";
        System.out.println(main_string.substring(0,7)+word+main_string.substring(6));
    }
```

68. Write a Java program to create a new string of 4 copies of the last 3 characters of the original string. The length of the original string must be 3 and above. Go to the editor
<br>Sample Output:

<br>3.03.03.03.0
<br>Code:
```java
public static void ex68(){

        String main_string = "Python 3.0";
        String word = main_string.substring(main_string.length()-3);

        System.out.println(word+word+word+word);


    }
```

69. Write a Java program to extract the first half of a string of even length. Go to the editor
<br>Test Data: Python
<br>Sample Output:
<br>Pyt
<br>Code:
```java
public static void ex70(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Str1 = ");
        String short_string=sc.next();
        System.out.println("Str2 = ");
        String long_string=sc.next();
        String main=short_string+long_string+short_string;
        System.out.println(main);
    }
 ```
 71. Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the strings must be 1 and above. Go to the editor
Test Data: Str1 = Python
Str2 = Tutorial
Sample Output:

ythonutorial

72. Write a Java program to create a new string taking first three characters from a given string. If the length of the given string is less than 3 use "#" as substitute characters. Go to the editor
Test Data: Str1 = " "
Sample Output:

###
public static void ex69(){
        String main_string = "Python";
        String word = main_string.substring(0,(main_string.length()/2));
        System.out.println(word);
    }
```
70. Write a Java program to create a string in the form short_string + long_string + short_string from two strings. The strings must not have the same length. Go to the editor
<br>Test Data: Str1 = Python
<br>Str2 = Tutorial
<br>Sample Output:
<br>Code:
```java
public static void ex70(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Str1 = ");
        String short_string=sc.next();
        System.out.println("Str2 = ");
        String long_string=sc.next();
        String main=short_string+long_string+short_string;
        System.out.println(main);
    }
 ```
 71. Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the strings must be 1 and above. Go to the editor
Test Data: Str1 = Python
Str2 = Tutorial
Sample Output:

ythonutorial
<br>Code:
```java
public static void ex71(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Str1 = ");
        String short_string=sc.next();
        System.out.println("Str2 = ");
        String long_string=sc.next();
        String main=short_string.substring(1)+long_string.substring(1);

        System.out.println(main);
    }
 ```
72. Write a Java program to create a new string taking first three characters from a given string. If the length of the given string is less than 3 use "#" as substitute characters. Go to the editor
Test Data: Str1 = " "
Sample Output:

###
<br>Code:
```java
 public static void ex72() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Str1 = ");
//        String short_string = sc.next();
        String short_string="12";


        if (short_string.isEmpty()){
            System.out.println("###");
        }
        else if (short_string.length()==1)
            System.out.println(short_string.charAt(0)+"##");
        else if (short_string.length()==2)
            System.out.println(short_string.substring(0,2)+"#");
        else
            System.out.println(short_string.substring(0,3));
    }
```
73. Write a Java program to create a new string taking first and last characters from two given strings. If the length of either string is 0 use "#" for missing character. Go to the editor
<br>Test Data: str1 = "Python"
<br>str2 = " "
<br>Sample Output:
<br>P#
<br>Code:
```java
 public static void ex73(){
        String str1="";
        String str2="sgha";
        if (str1.isEmpty()) {
            System.out.println("#"+str2.substring(str2.length()-1));
        }
        else if (str2.isEmpty()) {
            System.out.println(str1.charAt(0)+"#");
        }
        else
        System.out.println(str1.charAt(0)+str2.substring(str2.length()-1));
    }
```


74. Write a Java program to test if 10 appears as either the first or last element of an array of integers. The length of the array must be greater than or equal to 2.
<br>Sample Output:
<br>Test Data: array = 10, -20, 0, 30, 40, 60, 10
<br>Code:
```java
 public static void ex74(){
        int[] a={10, -20, 0, 30, 40, 60 , 10};
        System.out.println((a.length >= 2) &&(a[0]==10 && a[a.length-1]==10));
    }
```

75. Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2. Go to the editor
<br>Test Data: array = 50, -20, 0, 30, 40, 60, 10
<br>Sample Output:
<br>false

<br>Code:
```java
   public static void ex75(){
        int[] a={50, -20, 0, 30, 40, 60, 10};
        System.out.println((a.length >= 2) && (a[0]==a[a.length-1]));

    }
```
76. Write a Java program to test if the first or the last element of two array of integers are same. The length of the array must be greater than or equal to 2. Go to the editor
<br>Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
<br>array2 = 45, 20, 10, 20, 30, 50, 11
<br>Sample Output:
<br>false
    <br>Code:
    ```java
     public static void ex76(){
        int[] a={50, -20, 0, 30, 40, 60, 10};
        int[] b={ 45 ,46,50};
        System.out.println((a.length >= 2&&b.length>=2) && (a[0]==b[b.length-1]));
    }
```   

77. Write a Java program to create a new array of length 2 from two arrays of integers with three elements and the new array will contain the first and last elements from the two arrays. Go to the editor
<br>Test Data: array1 = 50, -20, 0
<br>array2 = 5, -50, 10
<br>Sample Output:
<br>Array1: [50, -20, 0]                                                   
<br>Array2: [5, -50, 10]                                                   
<br>New Array: [50, 10]
  <br>Code:
    ```java
     public static void ex77() {
        int[] a = {50, -20, 0};
        int[] b = {5, -50, 10};
        int[] c = new int[2];
        if ((a.length >= 2 && b.length >= 2)) {
            c[0] = a[0];
            c[1] = b[b.length - 1];
        }
        System.out.println("Array1:" + Arrays.toString(a));
        System.out.println("Array2:" + Arrays.toString(b));
        System.out.println("New Array::" + Arrays.toString(c));

    }
 ```
 
 78. Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7. Go to the editor

<br>Sample Output:
<br>Original Array: [5, 7]                                                 
<br>true 

<br>code:
```java
public static void ex78() {
        int[] a = {4, 5, 7, 32, 2, 1, 23};
        boolean x = false;
        for (int i = 0; i < a.length; i++)
            if ((a[i] == 4 || a[i] == 7))
                x = true;
        System.out.println(x);
    }
```
79. Write a Java program to reverses an array (length 3) of integers in left direction. Go to the editor
<br>Sample Output:

<br>Original Array: [20, 30, 40]                                           
<br>reverses Array: [40, 30, 20]
<br>Code:
```java
public static void ex79() {
        int[] a = {50, -20, 33};
        int temp;
        System.out.println("Original Array: " + Arrays.toString(a));
        for (int i = 0; i < (a.length - 1); i++) {
            temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        System.out.println("" + Arrays.toString(a));
    }
```
79. Write a Java program to rotate an array (length 3) of integers in left direction. Go to the editor
<br>Sample Output:
<br>Original Array: [20, 30, 40]                                           
<br>Rotated Array: [30, 40, 20]
```java
public static void ex79v2() {
        int[] a = {50, -20, 33 , 22 , 33};
        int temp=a[a.length-1];;
        System.out.println("Original Array: " + Arrays.toString(a));
        for (int i = a.length-1; i > 0; i--) 
            a[i] = a[i-1];
        a[0]=temp;
        System.out.println("" + Arrays.toString(a));
    }
```
80. Write a Java program to get the larger value between first and last element of an array (length 3) of integers . Go to the editor
<br>Sample Output:
<br>Original Array: [20, 30, 40]                                           
<br>Larger value between first and last element: 40 

<br>Code:
```java
public static void ex80() {
        int[] a = {20, 30, 40,44,1};
        int f=a[0];
        int l=a[a.length-1];
        int x=f>l?f:l;
        System.out.println(Arrays.toString(a));
        System.out.println("Larger value between first and last element:"+x);
    }
```

81. Write a Java program to swap the first and last elements of an array (length must be at least 1) and create a new array. Go to the editor
<br>Sample Output:
<br>Original Array: [20, 30, 40]                                           
<br>New array after swaping the first and last elements: [40, 30, 20]
<br>Code:
```java
public static void ex81() {
        int[] a = {20, 30, 40,44,1};
        int f=a[0];
        System.out.println("Original Array: "+Arrays.toString(a));
        a[0]=a[a.length-1];
        a[a.length-1]=f;

        System.out.println("New array after swaping the first and last elements:"+Arrays.toString(a));
    }
```
82. Write a Java program to find the largest element between first, last, and middle values from an array of integers (even length). Go to the editor
<br>Sample Output:
<br>Original Array: [20, 30, 40, 50, 67]                                   
<br>Largest element between first, last, and middle values: 67 
<br>Code:
```java
public static void ex82() {
        int[] a = {200, 30, 40,44,100};
        int first=a[0];
        int last=a[a.length-1];
        int mid=a[(a.length-1)/2];

        if (first>last&&first>mid)
            System.out.println("Larger value between first and last element:"+first);
        else if (last>first&&last>mid)
            System.out.println("Larger value between first and last element:"+last);
        else
            System.out.println("Larger value between first and last element:"+mid);
    }
```
83. Write a Java program to multiply corresponding elements of two arrays of integers. Go to the editor
<br>Sample Output:
<br>Array1: [1, 3, -5, 4]                                                                                                           
<br>Array2: [1, 4, -5, -2]                                                 
<br>Result: 1 12 25 -8

<br>Code:
```java
  public static void ex83(){
        int[] a = {1, 3, -5, 4};
        int[] b = {1, 4, -5, -2};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]*b[i] +" ");
        }
    }
```
84. Write a Java program to take the last three characters from a given string and add the three characters at both the front and back of the string. String length must be greater than three and more. Go to the editor
<br>Test data: "Python" will be "honPythonhon"
<br>Sample Output:
<br>honPythonhon
<br>Code:
```java
public static void ex84() {
    String s="Python";
    String sub=s.substring(s.length()-3);
        if (s.length()>3)
        System.out.println(sub+s+sub);
    }
```
85. Write a Java program to check if a string starts with a specified word. Go to the editor
<br>Sample Data: string1 = "Hello how are you?"
<br>Sample Output:
<br>true
<br> Code:
```java
public static void ex85() {
        String s="Hello how are you?";
        System.out.println(s.startsWith("Hello"));

    }
```
86. Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3 and add 1 if n is odd, repeat the process until n = 1. 
<br> Code:
```java
 public static void ex86(){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int cou=0;
        while (n != 1) {
            cou++;
            if (n%2==0){
                n/=2;
            }
            else
                n = (3 * n + 1) / 2;

        }
        System.out.println("\nValue of n = "+n);
        System.out.println("count of loop: "+cou);
    }
```

