package com.hackthe6ix.proprice.domain.request;

public class ProductRequest {

    private String encoded_img;

    public ProductRequest(){}
    public ProductRequest(String encoded_img) {
        this.encoded_img = encoded_img;
    }

    public String getEncoded_img() {
        return encoded_img;
    }

    public void setEncoded_img(String encoded_img) {
        this.encoded_img = encoded_img;
    }
}