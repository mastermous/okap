package com.groupeisi.m2gl.mouhamadou_mane.controller;

import com.groupeisi.m2gl.mouhamadou_mane.request.PalindromeRequest;
import com.groupeisi.m2gl.mouhamadou_mane.response.PalindromeResponse;
import com.groupeisi.m2gl.mouhamadou_mane.service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PalindromeController {

    @Autowired
    public PalindromeService palindromeService;

    @PostMapping("/chackpalindrome")
    public ResponseEntity<PalindromeResponse> checkPalindrome(@RequestBody PalindromeRequest palindrome){
        PalindromeResponse response = palindromeService.checkPalindrome(palindrome);
        if (response.getIsPalindrome() == true){
           return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
    }


}
