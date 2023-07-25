package com.groupeisi.m2gl.mouhamadou_mane.service;


import com.groupeisi.m2gl.mouhamadou_mane.request.PalindromeRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PalindromeServiceTest {
    private final PalindromeService palindromeService = new PalindromeService();

    @Test
    public void testPalindrome() {
        assertTrue(palindromeService.checkPalindrome(new PalindromeRequest("radar")).getIsPalindrome());
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(palindromeService.checkPalindrome(new PalindromeRequest("hello")).getIsPalindrome());
    }
}

