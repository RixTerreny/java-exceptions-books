package org.learning.java;

import org.learning.java.customException.InvalidNumberOfPagesException;
import org.learning.java.customException.NullValueException;

import java.security.InvalidParameterException;

public class Book {

    private String title;
    private String author;
    private String editor;
    private int numberPages;

    Book(String title, String author, String editor, int numberPages) throws NullValueException, InvalidNumberOfPagesException {
        if (title==null){
            throw new NullValueException();
        }else {
            this.title = title;
        }

        if (author==null){
            throw new NullValueException();
        }else {
            this.author = author;
        }

        if (editor==null){
            throw new NullValueException();
        }else {
            this.editor = editor;
        }

        if (numberPages <= 0){
            throw new InvalidNumberOfPagesException();
        }else {
            this.numberPages = numberPages;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getEditor() {
        return editor;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setTitle(String title) {
        if (title==null){
            throw new NullValueException();
        }else {
            this.title = title;
        }
    }

    public void setAuthor(String author) {
        if (author==null){
            throw new NullValueException();
        }else {
            this.author = author;
        }
    }

    public void setEditor(String editor) {
        if (editor==null){
            throw new NullValueException();
        }else {
            this.editor = editor;
        }
    }

    public void setNumberPages(int numberPages) {
        if (numberPages <= 0){
            throw new InvalidNumberOfPagesException();
        }else {
            this.numberPages = numberPages;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", editor='" + editor + '\'' +
                ", numberPages=" + numberPages +
                '}';
    }
}
