package TuyenSinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyTheoKhoi qltk=new QuanLyTheoKhoi();
        QuanLy quanLy=new QuanLy();
        Scanner scanner=new Scanner(System.in);
//        quanLy.add(new KhoiA("123","kk","hn"));
//        quanLy.display();
        qltk.ChonKhoi();
        int choice=0;
        choice=scanner.nextInt();
        if(choice==1){
            qltk.KhoiA();
            int choice1=0;
            choice1=scanner.nextInt();

            do {
                try {
//      bắt ngoại lệ1
                    choice1 = Integer.parseInt(scanner.nextLine());
                }catch (NumberFormatException a){
//                System.out.println("nhập sai , trở lại menu");
                    continue;
                }

                if(choice1==1){
                    System.out.println("nhập số báo danh ");
                    String soBaoDanh=scanner.nextLine();
                    System.out.println("nhập họ tên ");
                    String hoTen=scanner.nextLine();
              System.out.println("nhập địa chỉ ");
                    String diaChi=scanner.nextLine();
                    quanLy.add(new KhoiA(soBaoDanh,hoTen,diaChi));
                    quanLy.display();
                }
                else if(choice1==2){
//       tìm kiem theo so bao danh
                    System.out.println("nhập số báo danh ");
                    String soBaoDanh=scanner.nextLine();
                    quanLy.searchById(soBaoDanh);

                }
                else if(choice1==3){
//      trở về menu
                    qltk.ChonKhoi();
                }

            }while (choice1!=0);

        }
        else if(choice==2){
            qltk.KhoiB();

            int choice2=0;
            choice2=scanner.nextInt();

            do {
                try {
//      bắt ngoại lệ1
                    choice2 = Integer.parseInt(scanner.nextLine());
                }catch (NumberFormatException a){
//                System.out.println("nhập sai , trở lại menu");
                    continue;
                }

                if(choice2==1){
                    System.out.println("nhập số báo danh ");
                    String soBaoDanh=scanner.nextLine();
                    System.out.println("nhập họ tên ");
                    String hoTen=scanner.nextLine();
                    System.out.println("nhập địa chỉ ");
                    String diaChi=scanner.nextLine();
                    quanLy.add(new KhoiB(soBaoDanh,hoTen,diaChi));
                    quanLy.display();
                }
                else if(choice2==2){
//       tìm kiem theo so bao danh
                    System.out.println("nhập số báo danh ");
                    String soBaoDanh=scanner.nextLine();
                    quanLy.searchById(soBaoDanh);

                }
                else if(choice2==3){
//      trở về menu
                    qltk.ChonKhoi();
                }

            }while (choice2!=0);


        }
        else if(choice==3){
            qltk.KhoiC();

            int choice3=0;
            choice3=scanner.nextInt();

            do {
                try {
//      bắt ngoại lệ1
                    choice3 = Integer.parseInt(scanner.nextLine());
                }catch (NumberFormatException a){
//                System.out.println("nhập sai , trở lại menu");
                    continue;
                }

                if(choice3==1){
                    System.out.println("nhập số báo danh ");
                    String soBaoDanh=scanner.nextLine();
                    System.out.println("nhập họ tên ");
                    String hoTen=scanner.nextLine();
                    System.out.println("nhập địa chỉ ");
                    String diaChi=scanner.nextLine();
                    quanLy.add(new KhoiB(soBaoDanh,hoTen,diaChi));
                    quanLy.display();
                }
                else if(choice3==2){
//       tìm kiem theo so bao danh
                    System.out.println("nhập số báo danh ");
                    String soBaoDanh=scanner.nextLine();
                    quanLy.searchById(soBaoDanh);

                }
                else if(choice3==3){
//      trở về menu
                    qltk.ChonKhoi();
                }

            }while (choice3!=0);


        }
        else{
            System.exit(0);
        }

    }
}
