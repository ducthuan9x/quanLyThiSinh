package TuyenSinh;

import java.util.ArrayList;
import java.util.List;

public class QuanLy {
    List<ThiSinh>thiSinhList=new ArrayList<ThiSinh>();

    public QuanLy() {
    }

    public QuanLy(List<ThiSinh> thiSinhList) {
        this.thiSinhList = thiSinhList;
    }

    public void add(ThiSinh thiSinh){
        this.thiSinhList.add(thiSinh);
    }
    public void display(){
        for (int i = 0; i < thiSinhList.size(); i++) {
            System.out.println(thiSinhList.get(i));
        }
    }
    public int searchById(String soBaoDanh){
        for (int i = 0; i < thiSinhList.size(); i++) {
            if(this.thiSinhList.get(i).getSoBaoDanh().equals(soBaoDanh)) {

                System.out.println(thiSinhList.get(i));
                return i;
            }

        }
        return -1;
    }
}
