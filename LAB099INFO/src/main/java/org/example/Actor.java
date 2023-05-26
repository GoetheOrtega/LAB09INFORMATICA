package org.example;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class Actor {
    @JsonProperty("name")
    private String name;

    @JsonProperty("address")
    private String address;

    @JsonProperty("birthday")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    @JsonProperty("crime")
    private boolean crime;

    @JsonProperty("prisoners")
    private int prisoners;

    public Actor() {
    }

    public Actor(String name, String address, LocalDate birthday, boolean crime, int prisoners) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.crime = crime;
        this.prisoners = prisoners;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public boolean isCrime() {
        return crime;
    }

    public void setCrime(boolean crime) {
        this.crime = crime;
    }

    public int getPrisoners() {
        return prisoners;
    }

    public void setPrisoners(int prisoners) {
        this.prisoners = prisoners;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", crime=" + crime +
                ", prisoners=" + prisoners +
                '}';
    }
}
