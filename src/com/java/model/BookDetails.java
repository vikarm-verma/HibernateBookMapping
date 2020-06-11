package com.java.model;

public class BookDetails {
	
private int bookDetailsId;
private transient int bookId;
private String bookName;
private String studentName;
private String studentClass;
private String dateOfIssue;

public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public int getBookDetailsId() {
	return bookDetailsId;
}
public void setBookDetailsId(int bookDetailsId) {
	this.bookDetailsId = bookDetailsId;
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentClass() {
	return studentClass;
}
public void setStudentClass(String studentClass) {
	this.studentClass = studentClass;
}
public String getDateOfIssue() {
	return dateOfIssue;
}
public void setDateOfIssue(String dateOfIssue) {
	this.dateOfIssue = dateOfIssue;
}

}
