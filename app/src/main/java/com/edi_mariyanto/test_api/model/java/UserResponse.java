package com.edi_mariyanto.test_api.model.java;

import com.google.gson.annotations.SerializedName;

public class UserResponse {
    @SerializedName("id")
    private int id;
    private String userName;
    @SerializedName("name")
    private String name;

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
