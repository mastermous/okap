package com.groupeisi.m2gl.mouhamadou_mane.request;

import com.groupeisi.m2gl.mouhamadou_mane.response.PalindromeResponse;

public class PalindromeRequest {

    private String motAverifier;

    public PalindromeRequest(){

    }

    public PalindromeRequest(String mot){
        this.motAverifier = mot;
    }

    public String getMotAverifier(){
        return motAverifier;
    }

    public void setMotAverifier (String mot){
        this.motAverifier = mot ;
    }
}
