package com.company;

import java.util.Scanner;
public class StringInfo
{
    String word;

    Scanner scan = new Scanner(System.in);

    public StringInfo()
    {
        System.out.print("What is the input string? ");

        this.word = scan.nextLine();
    }

    void NumCharacters()
    {
        System.out.print(this.word+" has "+this.word.length()+" characters.");
    }

}
