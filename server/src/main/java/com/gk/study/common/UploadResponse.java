package com.gk.study.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class UploadResponse implements Serializable {

    private int errno;
    private UploadData data;


    public UploadResponse(int errno, UploadData data){
        this.errno = errno;
        this.data = data;
    }
}
