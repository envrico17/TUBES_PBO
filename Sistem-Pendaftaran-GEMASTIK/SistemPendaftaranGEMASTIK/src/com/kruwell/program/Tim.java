/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kruwell.program;
import java.io.*;
/**
 *
 * @author LENOVO
 */
public class Tim {
    Peserta Ketua;
    Peserta Anggota1;
    Peserta Anggota2;
    String Universitas;
    String Divisi;
    String Password;
    
    public String getUniversitas() {
        return Universitas;
    }
    public Peserta getKetua() {
        return Ketua;
    }
    public String getDivisi() {
        return Divisi;
    }
    public Peserta getAnggota1() {
        return Anggota1;
    }
    public Peserta getAnggota2() {
        return Anggota2;
    }
    public String Password() {
        return Password;
    }
    public void setData(String s) {
        Universitas = s;    
    }
    public void setDivisi(String d) {
        Divisi = d;
    }
    public void setData(String n,String i,String e,File k,File u) {
        this.Ketua = new Peserta(n,i,e,k,u);
    }
    public void setAnggota1(String n,String i,String e,File k,File u) {
        this.Anggota1 = new Peserta(n,i,e,k,u);
    }
    public void setAnggota2(String n,String i,String e,File k,File u) {
        this.Anggota2 = new Peserta(n,i,e,k,u);
    }
    public void setPassword(String p) {
        this.Password = p;
    }
}
