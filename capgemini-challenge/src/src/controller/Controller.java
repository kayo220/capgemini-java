/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author kayos
 */
public class Controller {
    
    
    /**
     * Return a string with ascending order of "*" for each line from 1 to number.
     * Example of use: challenge(3) => "*\n**\n***" 
     * @param number Integer
     * @return text String
     */
    public String challege01(int number){
        String text = "";
        
        for(int i = 1; i<=number; i++){
            text += String.join("", Collections.nCopies(i, "*"))+"\n";
        }
        
        return number>=1 ? text.substring(0, text.length()-1) : text;
    }
    
    /**
     * Given a password, return the number of characters that need to be inserted for a strong one respecting the following rules.
     * It must contain at least: 1 lower letter, 1 upper letter, 1 number, and 1 special character.
     * @param password String
     * @return Integer
     */
    public int challege02(String password){
        Pattern lowerLetter = Pattern.compile("^(.*[a-z].*)");
        Pattern upperLetter = Pattern.compile("^(.*[A-Z].*)");
        Pattern number = Pattern.compile("^(.*[0-9].*)");
        Pattern specialCharacter = Pattern.compile("^(.*[!@#$%^&*()-+].*)");
        int countNeedChacters = 0;
        Matcher hasLowerLetter = lowerLetter.matcher(password);
        countNeedChacters = hasLowerLetter.matches() ? countNeedChacters :countNeedChacters+1;
        Matcher hasUpperLetter = upperLetter.matcher(password);
        countNeedChacters = hasUpperLetter.matches() ? countNeedChacters :countNeedChacters+1;
        Matcher hasNumber = number.matcher(password);
        countNeedChacters = hasNumber.matches() ? countNeedChacters :countNeedChacters+1;
        Matcher hasSpecialCharacter = specialCharacter.matcher(password);
        countNeedChacters = hasSpecialCharacter.matches() ? countNeedChacters :countNeedChacters+1;
        int needCharacters = 0;
        if(password.length()+needCharacters >= 6){
            needCharacters = countNeedChacters;
        }else if(password.length() + needCharacters < 6){
            needCharacters = 6 - (password.length() + needCharacters);
        }
        return needCharacters;
    }
    
    
    /**
     * return the number of occurrences of anagrams in a String
     * @param anagram String
     * @return numberOfAnagrams Integer
     */
    public int challege03(String anagram){
        LinkedList<String> allStrings = allSubstrings(anagram);
        int count = 0;
        for(int i = 0; i<allStrings.size(); i++){
            char[] aux = allStrings.get(i).toCharArray();
            Arrays.sort(aux);
            String verifica = new String(aux);
            for(int j = i+1; j < allStrings.size(); j++){
                char[] aux2 = allStrings.get(j).toCharArray();
                Arrays.sort(aux2);
                String verifica2 = new String(aux2);
                if(verifica2.equals(verifica)){
                    count++;
                }
                
            }
        }
        return count;
    }
    
    /**
     * Return all substrings in an Array
     * @param str
     * @return LinkedList
     * Based on https://www.geeksforgeeks.org/java-lang-string-substring-java/
     */
    public static LinkedList<String> allSubstrings(String str)
    {
        int n = str.length();
        LinkedList<String> allSubStrings = new LinkedList<String>();
        for (int i = 0; i < n; i++){
           for (int j = i+1; j <= n; j++){
                    allSubStrings.add(str.substring(i, j));
            }
       }
       return allSubStrings;
    }
}
