
package baitapthuchanh;
import java.util.Scanner;
    public class hocsinh{
     private int maso;
     private String hoten;
     private float dtb;
     public int getMaso() {
         return maso;
     }
     public void setMaso(int maso) {
         this.maso = maso;
     }
     public String getHoten(){
         return hoten;
     }
     public void setHoten(String hoten){
         this.hoten = hoten;
     }
     public float getDtb(){
         return dtb;
     }
     public void setDtb(float dtb){
         this.dtb = dtb;
     }
     public hocsinh() {
         this.maso = 0;
         this.hoten = null;
         this.dtb = 0f;
     }
     public hocsinh(int maso, String hoten, float dtb){
         this.maso = maso;
         this.hoten = hoten;
         this.dtb = dtb;
     }
     public hocsinh(hocsinh tmp){
         this.maso = tmp.maso;
         this.hoten = tmp.hoten;
         this.dtb = tmp.dtb;
     }
     public void input(){
Scanner sc = new Scanner(System.in);
System.out.println("Nhap ma so: ");
maso = sc.nextInt();
System.out.println("Nhap ho ten: ");
sc.nextLine();
hoten = sc.nextLine();
System.out.println("Nhap diem trung binh: ");
dtb = sc.nextFloat();
}
     public void output(){
         System.out.println(maso + "-" + hoten + "-" + dtb);
}

public void rank() {
    if (dtb < 5) {
        System.out.println("xep loai yeu");
    } 
    else if (dtb < 7) {
        System.out.println("xep loai trung binh");
    } 
    else if (dtb < 8) {
        System.out.println("xep loai kha");
    } 
    else if (dtb < 9) {
        System.out.println("xep loai gioi");
    } 
    else {
        System.out.println("xep loai xuat sac");
    }
}

 }       
    
