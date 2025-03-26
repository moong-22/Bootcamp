package com.exam;

import com.data.Book;

public class BookEx01 {
    public static void main(String[] args) {
        Book book =  new Book( "하마","사자" );
        System.out.println(book.name);
        System.out.println(book.author);
    }
}
