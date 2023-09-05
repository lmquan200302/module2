package demo;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.print("Nhập một ký tự: ");
            int i = System.in.read();
            System.out.println("Ký tự đã nhập: " + (char) i);

            // Đóng đối tượng đầu vào sau khi sử dụng
            System.in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
