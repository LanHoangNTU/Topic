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
public class ThanhVienB implements Topic.ITopicListener{
    private List<String> list = new ArrayList<>();
    
    public void dangKy(Topic t){
        t.themThanhVien(this);
        list.addAll(t.getList());
    }
    
    public void huyDangKy(Topic t){
        t.xoaThanhVien(this);
    }

    @Override
    public void nhanThongBaoTinMoi(String tin) {
        System.out.println("Thanh vien B");
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.println("Tin " + (i + 1) + ": " + list.get(i));
        }
        list.add(tin);
        System.out.println("Tin moi (" + list.size() + "): " + list.get(list.size() - 1));
    }

    @Override
    public void nhanThongBaoCapNhat(int i, String tin) {
        System.out.println("Thanh vien B");
        list.set(i, tin);
        System.out.println("Tin " + (i + 1) + " duoc cap nhat: " + list.get(i));
    }
    
}
