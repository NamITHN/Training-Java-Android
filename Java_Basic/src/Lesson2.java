import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        // if else
        // Nhập vào 1 số kiểm tra số đó là chẵn hay lẻ
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a ");
        a = sc.nextInt();
      /*   if(a%2==0){
            System.out.println("Số chẵn");
        }else {
            System.out.println("Số lẻ");
        }*/
        // String result = (a%2==0) ? "Số chẵn" : "Số lẻ";
        //  System.out.println(result);

        // nhập vào 2 số in ra số lớn hơn
        // vòng lặp
        // ví dụ tính tổng từ 1 đến a bằng 3 cách while, do while, for
        // while
        /*int i = 1;
        int sum = 0;
        while (i <= a) {
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);*/

        // for

        int sum=0;
        for(int i=1;i<=a;i++){
            sum+=i;
        }
        System.out.println("Sum = "+sum);










    // bài tập về nhà
        // b1 nhập vào số a in ra số chẵn nhỏ hơn a (bằng 3 cách while, do while, for)
        // b2 nhập vào số a in ra số lẻ nhỏ hơn a (bằng 3 cách while, do while, for)
        // b3 nhập vào số a tính tổng số chẵn nhỏ hơn a (bằng 3 cách while, do while, for)
        // b4 nhập vào số a tính tổng số lẻ nhỏ hơn a (bằng 3 cách while, do while, for)
        // b5 nhập vào a, b, c tìm số lớn nhất
        // b6 nhập vào a, b, c tìm số nhỏ nhất
        // b7 Nhập vào tháng của 1 năm. Cho biết tháng thuộc quý mấy trongnăm
        // b8 Nhập vào số a tìm tất cả các ước của a
        // b9 Nhập vào số a tìm a!
        // b10 Viết chương trình giải và biện luận phương trình bậc nhất ax + b = 0
        // b11 Nhập vào a in ra bội của a nhỏ hơn 100
        // b12 Nhập vào 1 số kiểm tra xem nó có phải số nguyên tố hay không ?



    }
}
