/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisisatest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lân
 */
public class ThanhVienA implements Topic.ITopicListener{
    private List<String> list = new ArrayList<>();

    public ThanhVienA() {
    }
    
    public void dangKy(Topic t){
        t.themThanhVien(this);
        list.addAll(t.getList());
    }
    
    public void huyDangKy(Topic t){
        t.xoaThanhVien(this);
    }

    @Override
    public void nhanThongBaoTinMoi(String tin) {
        System.out.println("Thanh vien A");
        list.add(tin);
        System.out.println("Tin moi: " + tin);
    }

    @Override
    public void nhanThongBaoCapNhat(int i, String tin) {
        System.out.println("Thanh vien A");
        list.set(i, tin);
        System.out.println("Tin cap nhat(" + i +"): " + tin);
    }
    
}
