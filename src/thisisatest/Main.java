/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisisatest;

/**
 *
 * @author Lân
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Topic t = new Topic();
        ThanhVienA a = new ThanhVienA();
        ThanhVienB b = new ThanhVienB();
        t.themMoi("Tin 1");
        a.dangKy(t);
        b.dangKy(t);
        t.themMoi("Tin 2");
        t.themMoi("Tin 3");
        t.capNhat(1, "Cap Nhat");
    }
    
}
