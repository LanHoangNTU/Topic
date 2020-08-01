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
public class ThanhVienA implements Topic.ITopicListener{
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
        System.out.println("Thanh vien A");
        ArrayList<String> ds = t.getList();
        System.out.println("Tin moi: " + ds.get(ds.size() - 1));
    }

    @Override
    public void nhanThongBaoCapNhat(int i) {
        System.out.println("Thanh vien A");
        System.out.println("Tin cap nhat: " + t.getList().get(i));
    }
    
}
