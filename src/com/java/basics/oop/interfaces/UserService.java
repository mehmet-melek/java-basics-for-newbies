package com.java.basics.oop.interfaces;

public interface UserService {

    //public int variableInInterface;
    public int variableInInterface = 1;
    // ınterfacelerden obje oluşturamadığımız için direkt olarak interface üzerinden ilgili değere ulaşabiliriz.
    // Değer set edilmiş olması gerekli çünkü interface üzerinde getter/setter metodlarını kullanamıyoruz.
    // Inteface üzerinde tanımlanan değişkenleri static veya final olarak belirtmeye gerek yok.
    
    void setNameById(int id,String name);
    
    String getNameById(int id);
    
    int getIdByName(String name);
    
}
