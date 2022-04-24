package TuyenSinh;

public class KhoiC extends ThiSinh {
    public static final String Van = "van";
    public static final String Su = "su";
    public static final String Dia = "dia";

    public KhoiC() {
    }

    public KhoiC(String soBaoDanh, String hoTen, String diaChi) {
        super(soBaoDanh, hoTen, diaChi);
    }

    @Override
    public String toString() {
        return "KhoiC " +super.toString()
                + "Văn ="+Van
                +"Sử ="+Su
                +"Địa ="+Dia;
    }
}
