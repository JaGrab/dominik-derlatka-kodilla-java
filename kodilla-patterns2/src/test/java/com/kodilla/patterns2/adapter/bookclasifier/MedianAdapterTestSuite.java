package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        Book book1 = new Book("John Doe", "Being a nobody", 1963, "01234");
        Book book2 = new Book("Count Dooku", "The last sandwich", 1950, "12345");
        Book book3 = new Book("Winnie the Pooh", "Honey, honey, honey...", 1975, "23456");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        //When
        MedianAdapter adapter = new MedianAdapter();
        int yearMedian = adapter.publicationYearMedian(books);
        //Then
        assertEquals(1963, yearMedian);
    }
}
