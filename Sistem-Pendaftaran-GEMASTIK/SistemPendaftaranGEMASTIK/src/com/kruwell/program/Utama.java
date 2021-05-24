/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kruwell.program;
import javax.swing.*;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Utama {
    Tim Gemastik = new Tim();
    public static void main(String args[]) {
        Scanner key = new Scanner(System.in);
        String Nama = key.nextLine();
        String NIM = key.nextLine();
        String Email = key.nextLine();
        String Password = key.nextLine();
        String Universitas = key.nextLine();
        
        String Nama_Anggota1 = key.nextLine();
        String NIM_Anggota1 = key.nextLine();
        String Email_Anggota1 = key.nextLine();
        String Nama_Anggota2 = key.nextLine();
        String NIM_Anggota2 = key.nextLine();
        String Email_Anggota2 = key.nextLine();
        
        Utama Lomba = new Utama();
        Lomba.Gemastik.setData(Universitas);
        Lomba.Gemastik.setData(Nama,NIM,Email,null,null);
        Lomba.Gemastik.setAnggota1(Nama_Anggota1,NIM_Anggota1,Email_Anggota1,null,null);
        Lomba.Gemastik.setAnggota2(Nama_Anggota2,NIM_Anggota2,Email_Anggota2,null,null);
        Lomba.Gemastik.setPassword(Password);
        Lomba.output();
    }
    public void output() {
        System.out.println("Universitas : " +Gemastik.Universitas);
        System.out.println("Nama : " +Gemastik.Ketua.Nama);
        System.out.println("NIM : " +Gemastik.Ketua.NIM);
        System.out.println("Email : "+Gemastik.Ketua.Email);
        System.out.println("Nama : "+Gemastik.Anggota1.Nama);
        System.out.println("NIM : "+Gemastik.Anggota1.NIM);
        System.out.println("Email :"+Gemastik.Anggota1.Email);
        System.out.println("Nama : "+Gemastik.Anggota2.Nama);
        System.out.println("NIM : "+Gemastik.Anggota2.NIM);
        System.out.println("Email : "+Gemastik.Anggota2.Email);
        System.out.println("Password : "+Gemastik.Password);
    }
}
