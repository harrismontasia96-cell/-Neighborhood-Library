package com.pluralsight;

public class Book{
    private int id;
    private String isbn, title, CheckedOutto;

    public Book(int id, String isbn, String title, String CheckedOutto, boolean isCheckedOut) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.CheckedOutto = CheckedOutto;
        this.isCheckedOut() = isCheckedOut;
    }

  public void checkout(String name){

  }

  public void checkin(){

}
public int getid() {
    return id;
}
    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCheckOutTo() {
        return CheckedOutto;
    }

    public void setCheckOutTo(String checkOutTo) {
        this.CheckedOutto = checkOutTo;
    }

    public boolean isCheckedOut() {
        return isCheckedOut();
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut() = checkedOut;
    }

}
