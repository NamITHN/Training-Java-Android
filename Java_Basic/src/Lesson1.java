import java.util.Scanner;

public class Lesson1 {

    public static void main(String args[]) {
        int a = 1;
        long A = 1;
        char b = 'N';


       // System.out.println("Nam Android");
       // System.out.println("Nam"+" "+"Android");

        String c = "Nam";
        String d =  "Android";
        //System.out.println("Nam"+95);

       // System.out.println(c+d);

        long sum = a + A;
        //"sum a + A = "+(a+A)
        //System.out.println("sum "+" a "+" + "+" A "+" = "+(a+A));

        // cho e=10 f=15 k=9 in ra e - f * k =

        int a1=1;
        a1+=1; // a1=a1+1

       // System.out.println(a1);

        // g=10 in ra g-=10 và g+=10

        // nhập vào thông qua lớp Scanner
        Scanner sc = new Scanner(System.in); // mở lớp scanner
       /* System.out.println("Nhập vào số n ");
        int n = sc.nextInt();
        System.out.println("Nhập vào số m");
        long m = sc.nextLong();*/
        //System.out.println("Tổng của n và m là : "+(n+m));

        // ví dụ nhập vào n=10 và m=9 in ra 10 - 9 = 1
       // System.out.println(n +" - "+m+" = "+(n-m));

        // cho q=10 w=19 e=90 in ra q - w/e

        String name;
        System.out.println("Nhập vào tên");
        //name=sc.nextLine();
        name=sc.next();
        System.out.println("Tôi tên là "+name);

        /*bài tập về nhà
        * b1 nhập vào a b in ra a = số nhập vào b = số nhập vào
        * b2 nhập vào a b c tính a-b+c, a-b-c, a*b/c, a/b%c
        * b3 nhập vào Họ , tên, tuổi, quê quán, nghề nghiệp in ra màn hình
        * b4 nhập vào Họ , tên, năm sinh, in ra màn hình họ , tên, tuổi
        * b5 nhập vào 1 số in ra số tiếp theo
        * b6 nhập vào 1 số in ra số đằng sau nó
        * b7 nhập vào a ,b tính tổng, hiệu, tích, thương, chia lấy dư
        * b8 tính tổng s= 1+..+10
        * b9 tính tổng các số lẻ nhở hơn 10
        * b10 nhập vào năm sinh in ra tuổi
        * b11 a++,a-- được hiểu như thế nào
        * b12 a+=2, b+=10 được hiểu như thế nào
        * b13 phân biệt next() và nextLine()
        * */
    }
}
