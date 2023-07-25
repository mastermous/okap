package com.groupeisi.m2gl.mouhamadou_mane.response;

public class PalindromeResponse {

    private boolean isPalindrome ;

    public PalindromeResponse(){

    }

    public PalindromeResponse(boolean response ){
        this.isPalindrome = response;
    }

    public boolean getIsPalindrome(){
        return isPalindrome;
    }

    public void seIstPalindrome(boolean palendrome) {
        isPalindrome = palendrome;
    }
}
