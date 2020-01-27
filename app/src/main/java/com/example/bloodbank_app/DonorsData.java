package com.example.bloodbank_app;

import java.util.Date;

public class DonorsData {
    public String email;
    public String name;
    public String password;
    public String bloodtype;
    public String phone;
    public String city;
    public String Adress;
    public Date dateOfRequest = new Date();
    public int prive;

    public DonorsData(String email,String name,String password,String bloodtype,String phone,String city,String Adress,Date dateOfRequest )
    {
        this.email=email;
        this.name=name;
        this.password=password;
        this.bloodtype=bloodtype;
        this.phone=phone;
        this.city=city;
        this.Adress=Adress;
        this.dateOfRequest=dateOfRequest;
        this.prive=prive;

    }


}
