package JavaBasic4;

import java.util.ArrayList;
import java.util.List;

public class For_Array {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        for(int i=0; i<= 50; i++){
            if(i % 2 == 0){
                arrayList.add(i);
            }
        }

        for (int j : arrayList){
            System.out.print(j +" ");
        }
    }
}
