// src/main/java/com/example/app/HelloWorld.java
package com.example.app;

/**
 * Lớp HelloWorld đơn giản để kiểm tra build và run trên Jenkins.
 */
public class HelloWorld {

    /**
     * Phương thức main là điểm bắt đầu của ứng dụng.
     * Nó sẽ in ra một thông điệp chào mừng.
     * @param args Các đối số dòng lệnh (không được sử dụng trong ví dụ này).
     */
    public static void main(String[] args) {
        System.out.println("Xin chào từ ứng dụng Java đơn giản!");
        System.out.println("Ứng dụng này đã được build và chạy thành công bởi Jenkins.");
    }
}