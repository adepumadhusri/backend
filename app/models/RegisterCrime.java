package models;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class RegisterCrime {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Integer Id;

    @Basic
    @JsonProperty("crimetype")
    private String Crimetype;

    @Basic
    @JsonProperty("gender")
    private String Gender;

    @Basic
    @JsonProperty("age")
    private Integer Age;

    @Basic
    @JsonProperty("city")
    private String City;

    @Basic
    @JsonProperty("latiVal")
    private String LatiVal;

    @Basic
    @JsonProperty("description")
    private String Description;

    @Basic
    @JsonProperty("longiVal")
    private  String LongiVal;

    @Basic
    @JsonProperty("suspect")
    private  String Suspect;

    @Basic
    @JsonProperty("urls")
    private String urls;

    @Basic
    @JsonProperty("info")
    private String Info;

    @Basic
    @JsonProperty("heading")
    private String Heading;





    public RegisterCrime(Integer id,String crimetype,String gender,Integer age,String city,String latival,String description,String longival,String suspect,String urls,String info,String heading){


        Id=id;
        Crimetype=crimetype;
        Gender=gender;
        Age=age;
        City=city;
        LatiVal=latival;
        LongiVal=longival;
        Description=description;
        Suspect=suspect;
        this.urls = urls;
        Info=info;
        Heading=heading;

    }

    public RegisterCrime(){

    }


    public String getCrimetype() {
        return Crimetype;
    }

    public void setCrimetype(String crimetype) {
        this.Crimetype = crimetype;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        this.Age = age;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public String getLatiVal() {
        return LatiVal;
    }

    public void setLatiVal(String latiVal) {
        this.LatiVal = latiVal;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getSuspect() {
        return Suspect;
    }

    public void setSuspect(String suspect) {
        this.Suspect = suspect;
    }

    public String getLongiVal() {
        return LongiVal;
    }

    public void setLongiVal(String longiVal) {
        this.LongiVal = longiVal;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUrls() {return urls;}

    public void setUrls(String urls) { this.urls = urls; }

    public String getInfo() {
        return Info;
    }

    public void setInfo(String info) {
        this.Info = info;
    }

    public String getHeading() {
        return Heading;
    }

    public void setHeading(String heading) {
        this.Heading=heading;
    }



}


