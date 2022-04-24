package TuyenSinh;

public class KhoiA extends ThiSinh{
    public static final String Toan="toan";
    public static final String Ly="ly";
    public static final String Hoa="hoa";


    public KhoiA() {
    }

    public KhoiA(String soBaoDanh, String hoTen, String diaChi) {
        super(soBaoDanh, hoTen, diaChi);
    }

    @Override
    public String toString() {
        return "KhoiA{}" + super.toString()
                + "toan=" +Toan
                +"lý =" +Ly
                +"Hoá = "+ Hoa;
    }
}
