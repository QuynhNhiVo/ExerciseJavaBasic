package JavaBasic5;

import java.util.ArrayList;

public class NhanVien_ArrayList {
    public void getInfo(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Nguyen A");
        list.add("23");
        list.add("Ho Chi Minh");
        list.add("Viet Nam");

        for(int i= 0 ; i < list.size(); i++){
            System.out.println(list.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        NhanVien_ArrayList info = new NhanVien_ArrayList();
        info.getInfo();

    }
}
