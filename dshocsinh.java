package baitapthuchanh;
import java.util.Scanner;
public class dshocsinh {
    private hocsinh[] ds;
    private int soLuong;
    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng học sinh: ");
        soLuong = sc.nextInt();
        sc.nextLine();
        ds = new hocsinh[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.printf(">> Nhập học sinh thứ %d:%n", i + 1);
            ds[i] = new hocsinh();
            ds[i].input();
        }
    }
    public void xuatDS() {
        System.out.println("Danh sách học sinh:");
        for (int i = 0; i < soLuong; i++) {
            ds[i].output();
        }
    }
    public void sapXep() {
        for (int i = 0; i < soLuong - 1; i++) {
            for (int j = i + 1; j < soLuong; j++) {
                if (ds[i].getDtb() < ds[j].getDtb()) {
                    hocsinh tmp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = tmp;
                }
            }
        }
    }
}
