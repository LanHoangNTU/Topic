/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisisatest;

import java.util.ArrayList;

/**
 *
 * @author Lân
 */
public class ThanhVienB implements Topic.ITopicListener{
    private Topic t;
    
    public void dangKy(Topic t){
        t.themThanhVien(this);
        this.t = t;
    }
    
    public void huyDangKy(Topic t){
        t.xoaThanhVien(this);
    }

    @Override
    public void nhanThongBaoTinMoi() {
        System.out.println("Thanh vien B");
        for (int i = 0; i < t.getList().size() - 1; i++) {
            System.out.println("Tin " + (i + 1) + ": " + t.getList().get(i));
        }
        System.out.println("Tin moi: " + t.getList().get(t.getList().size() - 1));
    }

    @Override
    public void nhanThongBaoCapNhat(int i) {
        System.out.println("Thanh vien B");
        System.out.println("Tin " + i + " duoc cap nhat: " + t.getList().get(i));
    }
    
}
