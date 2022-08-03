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
