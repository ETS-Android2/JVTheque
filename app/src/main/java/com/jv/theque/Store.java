package com.jv.theque;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Store {

    @SerializedName("id")
    @Expose
    public String id;

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("slug")
    @Expose
    public String slug;

    @NonNull
    @Override
    public String toString() {
        return "Id : "+id+"\n"+
                "name : "+name+"\n"+
                "Slug : "+slug+"\n";
    }
}
