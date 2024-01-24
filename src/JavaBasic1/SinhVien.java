package JavaBasic1;

public class SinhVien {

    public String school = "DHU";
    static String country = "VN";

    public void sinhVien1(){

        String name1 = "An";
        int age1 = 21;
        String address1 = "HCM";
        this.school = school;
        System.out.println(name1 + " " + age1 + " " + address1 + " " + school + " " + ThongTin.langu3);
    }
    public void sinhVien2(){

        String name2 = "Bao";
        int age2 = 22;
        String address2 = "HN";
        this.school = school;
        System.out.println(name2 + " " + age2 + " " + address2 + " " + school + " " + ThongTin.langu2);
    }


    public static void main(String[] args) {
        System.out.println("Sinh vien: " + country);
        SinhVien Obj = new SinhVien();
        Obj.sinhVien1();
        Obj.sinhVien2();

    }
}
