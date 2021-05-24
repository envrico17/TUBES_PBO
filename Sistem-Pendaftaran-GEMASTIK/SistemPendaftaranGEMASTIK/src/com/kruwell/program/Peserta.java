package com.kruwell.program;
import java.io.*;


/**
 *
 * @author LENOVO
 */
public class Peserta {
    public String Nama;
    public String NIM;
    public String Email;
    private final File KTM;
    private final File Surat_Univ;
    
   public Peserta(String n,String i,String e,File k,File u){
        this.Nama = n;
        this.NIM = i;
        this.Email = e;
        this.KTM = k;
        this.Surat_Univ = u;
    }
   public String getNama() {
       return this.Nama;
   }
   public String getNIM() {
       return this.NIM;
   }
   public String getEmail() {
       return this.Email;
   }
   public File getKTM() {
       return this.KTM;
   }
   public File getSurat_Univ() {
       return this.Surat_Univ;
   }
}

