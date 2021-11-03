package com.ooppractice;

public class BookRunner {
    public static void main(String[] args) {

        Book artOfProgramming = new Book(200);
        Book effectiveJava = new Book(300);
        Book cleanCode = new Book(400);

        System.out.println(artOfProgramming.getNoOfPages());
        System.out.println(effectiveJava.getNoOfPages());
        System.out.println(cleanCode.getNoOfPages());

        artOfProgramming.setNoOfPages(1);
        artOfProgramming.increaseNoOfCopies(220);
        System.out.println(artOfProgramming.getNoOfPages());

        effectiveJava.setNoOfPages(111);
        System.out.println(effectiveJava.getNoOfPages());

        cleanCode.setNoOfPages(200);
        System.out.println(cleanCode.getNoOfPages());
    }
}
