package com.company.model.entity;

public class NoteBook {
    private String userName;
    private String lastName;

    public NoteBook(String lastName, String userName) throws NotUniqueLoginException {
        this.lastName = lastName;
        if(DBNoteBook.checkUserName(userName)) throw new NotUniqueLoginException("NotUniqueLoginException(", userName);
        this.userName = userName;
    }
}
