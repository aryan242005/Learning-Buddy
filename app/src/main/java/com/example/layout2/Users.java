package com.example.layout2;


public class Users {

    String name,email,phonenum,password;
    //  protected  Timestamp  cretedtimestamp;
    public Users() {

    }

    public Users(String name, String email, String phonenum, String password){
        this.name = name;
        this.email = email;
        this.phonenum = phonenum;
        this.password = password;



    }

   // public Timestamp getCretedtimestamp() {
     //   return cretedtimestamp;
   // }

   // public void setCretedtimestamp(Timestamp cretedtimestamp) {
     //   this.cretedtimestamp = cretedtimestamp;
    //}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }





}
