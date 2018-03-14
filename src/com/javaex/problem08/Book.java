package com.javaex.problem08;

public class Book {

	private static int bookNo; 
	private static String title; 
	private static String author;
	private static int stateCode;
	
	public Book() {
	}
	
	public Book(int bookNo, String title, String author) {

		Book.bookNo = bookNo;
		Book.title = title;
		Book.author = author;
		stateCode=1;
	}


	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		Book.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		Book.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		Book.author = author;
	} 
	
	

	public int rent(Book[] books) {
		System.out.println(title+"이(가) 대여 됐습니다.");
		return stateCode=0;
	}
    
	public static void print() {
		for(int i=0;i<10;i++) {
		if(stateCode==1) {
		System.out.println(bookNo+" 책제목: "+title+" 작가: "+author+" 대여유무: 재고있음");
		}else if(stateCode==0) {
		System.out.println(bookNo+" 책제목: "+title+" 작가: "+author+" 대여유무: 대여중");
		}
		}
	}

	
	
    
    
    
}
