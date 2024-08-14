package com.gk.study.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class UploadData implements Serializable {

    private String url;

    public UploadData(String url){
        this.url = url;
    }
}
