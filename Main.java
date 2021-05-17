import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
     System.out.println("Nhập chuỗi của bạn: ");
        char kytu ='o';
        int count=0;
        int count1=0;
        String chuoi = sc.nextLine();
        System.out.println("Tất cả kí tự o trong chuỗi trên là: ");
        for (int i=1; i<chuoi.length(); i++){
            if(chuoi.charAt(i)==kytu){
                System.out.println(kytu);
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự "+kytu+"trong chuoi"+chuoi+" = "+ count);

        System.out.println("Nhập chuỗi tiếp theo của bạn: ");
        String chuoi1=sc.nextLine();

        for (int i = 0; i < chuoi1.length(); i++) {
            if (chuoi1.charAt(i) != ' ') {
                count1++;
                while (chuoi1.charAt(i) != ' ' && chuoi1.charAt(i) != ',' && chuoi1.charAt(i) != '.' && i < chuoi1.length() - 1) {
                    i++;
                }
            }
        }

        System.out.println("Số từ trong chuỗi"+chuoi1+ " = "+ count1);
    }
}
