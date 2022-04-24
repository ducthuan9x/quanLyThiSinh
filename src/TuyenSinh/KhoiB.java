package TuyenSinh;

public class KhoiB extends ThiSinh{
    public static final String Toan="toan";
    public static final String Hoa="hoá";
    public static final String Sinh="sinh";

    public KhoiB() {
    }

    public KhoiB(String soBaoDanh, String hoTen, String diaChi) {
        super(soBaoDanh, hoTen, diaChi);
    }

    @Override
    public String toString() {
        return "KhoiB"+super.toString()
                +"Toán ="+ Toan
                +"Hoá ="+Hoa
                +"Sinh ="+Sinh;
    }
}
