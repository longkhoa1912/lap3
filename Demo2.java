package baitapthuchanh;
public class Demo2 {
    public static void main(String[] args) {
        dshocsinh danhsach = new dshocsinh();
        System.out.println("nhap danh sach hoc sinh");
        danhsach.nhapDS();
        System.out.println("danh sach ban dau");
        danhsach.xuatDS();
        danhsach.sapXep();
        System.out.println("danh sach sau khi sap xep giam dan theo diem trung binh");
        danhsach.xuatDS();
    }
}
