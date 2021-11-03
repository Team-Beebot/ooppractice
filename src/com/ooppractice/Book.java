package com.ooppractice;

public class Book {

    //state of class Book.
    private int noOfPages;

    // constructor...in java
    Book(int noOfPages){
        this.noOfPages = noOfPages;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void increaseNoOfCopies(int howMany){
        setNoOfPages(this.noOfPages + howMany);
    }

    public void setNoOfPages(int noOfPages) {
        if(noOfPages > 0){
        this.noOfPages = noOfPages;

    }

}
}