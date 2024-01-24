package JavaBasic5;

import java.util.HashMap;
import java.util.Map;

public class NhanVien_Map {
    public static void main(String[] args) {
        Map<String, String> info = new HashMap<String, String>();
        info.put("Full Name: ", "Nguyen A");
        info.put("Age: ", "23");
        info.put("Country: ", "Ho Chi Minh");
        for (Map.Entry<String, String> entry :  info.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }

    }
}
