package com.groupeisi.m2gl.mouhamadou_mane.service;


import com.groupeisi.m2gl.mouhamadou_mane.request.PalindromeRequest;
import com.groupeisi.m2gl.mouhamadou_mane.response.PalindromeResponse;
import org.springframework.stereotype.Service;

@Service
public class PalindromeService {

    public PalindromeResponse checkPalindrome (PalindromeRequest request){
        PalindromeResponse response = new PalindromeResponse();
        response.seIstPalindrome(request.getMotAverifier().equals(new StringBuilder(request.getMotAverifier()).reverse().toString()));
        return  response;
    }

}
