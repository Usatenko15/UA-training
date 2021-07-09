package com.company.model.entity;

public enum DBNoteBook {
    NOTE_ONE("Taraba", "meduza123"),
    NOTE_TWO("Gorovenko", "macho3"),
    NOTE_THREE("Koval", "rigardo1");

    private final String lastName;
    private final String userName;

    DBNoteBook(String lastName, String userName) {
        this.lastName = userName;
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public static boolean checkUserName (String userNameData) {
        for (DBNoteBook noteBook: DBNoteBook.values()) {
            if (noteBook.getUserName().equals(userNameData)) {return true; }
        }
        return false;
    }
}
