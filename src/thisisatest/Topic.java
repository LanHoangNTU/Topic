/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisisatest;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Lân
 */
public class Topic {
    private ArrayList<String> list = new ArrayList<>();
    private ArrayList<ITopicListener> listeners = new ArrayList<>();

    public Topic() {
    }

    public ArrayList<String> getList() {
        return list;
    }
    
    public void themMoi(String tin){
        list.add(tin);
        for (int i = 0; i < listeners.size(); i++) {
            listeners.get(i).nhanThongBaoTinMoi(tin);
        }
    }
    
    public void capNhat(int index, String tin){
        list.set(index, tin);
        for (int i = 0; i < listeners.size(); i++) {
            listeners.get(i).nhanThongBaoCapNhat(index, tin);
        }
    }
    
    public void themThanhVien(ITopicListener listener){
        listeners.add(listener);
    }
    
    public void xoaThanhVien(ITopicListener listener){
        listeners.remove(listener);
    }
    
    public static interface ITopicListener{
        public void nhanThongBaoTinMoi(String tb);
        public void nhanThongBaoCapNhat(int i, String tb);
    }
}
