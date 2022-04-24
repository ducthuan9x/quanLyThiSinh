package TuyenSinh;

public class QuanLyTheoKhoi {
    private QuanLy quanLy;

    public QuanLyTheoKhoi() {
    }

    public QuanLyTheoKhoi(QuanLy quanLy) {
        this.quanLy = quanLy;
    }

    public void ChonKhoi(){
        System.out.println("------MeNu------");
        System.out.println("1: Khối A");
        System.out.println("2: Khối B");
        System.out.println("3: Khối C");
        System.out.println("0: Thoát về menu");
    }

    public void KhoiA(){
        System.out.println("-------Khối A--------");
        System.out.println("Thêm Thí Sinh");
        System.out.println("Hiện Thí Sinh");
        System.out.println("Tìm Kiếm Thí Sinh");
    }
    public void KhoiB(){
        System.out.println("-------Khối B--------");
        System.out.println("Thêm Thí Sinh");
        System.out.println("Hiện Thí Sinh");
        System.out.println("Tìm Kiếm Thí Sinh");
    }
    public void KhoiC(){
        System.out.println("-------Khối C--------");
        System.out.println("Thêm Thí Sinh");
        System.out.println("Hiện Thí Sinh");
        System.out.println("Tìm Kiếm Thí Sinh");
    }
}
