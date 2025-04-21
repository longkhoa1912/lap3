package baitapthuchanh;
public class Demo1 {
    public static void main(String[] args) {
        hocsinh hs1 = new hocsinh();
        hs1.input();
        hs1.output();
        hocsinh hs2 = new hocsinh(111, "nguyen kim khanh", 7.8f);
        hs2.output();
        hocsinh hs3 = new hocsinh(hs2);
        hs3.output();
        hs3.setHoten("nhatlinh");
        hs3.output();
        float max = hs1.getDtb();
        String ht = hs1.getHoten();
        if (max < hs2.getDtb()) {
            max = hs2.getDtb();
            ht = hs2.getHoten();
        }
        if (max < hs3.getDtb()) {
            max = hs3.getDtb();
            ht = hs3.getHoten();
        }
        System.out.println("Hoc sinh " + ht + " co DTB cao nhat la: " + max);
    }
}
