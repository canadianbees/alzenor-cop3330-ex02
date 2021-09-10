package com.company;

import java.util.Scanner;
public class StringInfo
{
    String word;

    Scanner scan = new Scanner(System.in);

    //get the word from user input
    public StringInfo()
    {
        System.out.print("What is the input string? ");

        this.word = scan.nextLine();
    }

    //prints number of characters
    void NumCharacters()
    {
        System.out.print(this.word+" has "+this.word.length()+" characters.");
    }

}
