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
        guiThongBaoTinMoi();
    }
    
    public void capNhat(int i, String tin){
        list.set(i, tin);
        guiThongBaoTinCapNhat(i);
    }
    
    public void themThanhVien(ITopicListener listener){
        listeners.add(listener);
    }
    
    public void xoaThanhVien(ITopicListener listener){
        listeners.remove(listener);
    }
    
    public void guiThongBaoTinMoi(){
        for (int i = 0; i < listeners.size(); i++) {
            listeners.get(i).nhanThongBaoTinMoi();
        }
    }
    
    public void guiThongBaoTinCapNhat(int index){
        for (int i = 0; i < listeners.size(); i++) {
            listeners.get(i).nhanThongBaoCapNhat(index);
        }
    }
    
    public static interface ITopicListener{
        public void nhanThongBaoTinMoi();
        public void nhanThongBaoCapNhat(int i);
    }
}
