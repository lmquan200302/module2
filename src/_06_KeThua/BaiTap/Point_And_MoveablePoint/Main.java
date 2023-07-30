package _06_KeThua.BaiTap.Point_And_MoveablePoint;

public class Main {
    public static void main(String[] args) {
        System.out.println("Diem xuat phat ban dau la");
        Point point = new Point(3.3f,4.4f);

        MavablePoint mavablePoint = new MavablePoint(3.3f,4.4f,1.1f,2.2f);
        System.out.println(mavablePoint);
    }
}
