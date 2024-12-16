package cn.gezi.text;

public class phoneBook {
    String name;
    String phone;

    phoneBook(String name,String phone){
        this.name = name;
        this.phone = phone;

    }

    public void show(){
        System.out.print(this.name);
    }
}
