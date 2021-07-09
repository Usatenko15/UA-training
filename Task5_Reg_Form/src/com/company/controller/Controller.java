package com.company.controller;

import com.company.model.Model;
import com.company.model.entity.NotUniqueLoginException;
import com.company.model.entity.NoteBook;
import com.company.view.View;

import static com.company.controller.RegexConstants.*;
import static com.company.controller.RegexConstants.REGEX_LOGIN;
import static com.company.view.TextConstant.*;
import static com.company.view.TextConstant.LOGIN_DATA;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);
        InputNoteBook inputNoteBook = new InputNoteBook(new View(), sc);
        inputNoteBook.inputLastName();
        inputNoteBook.inputUserName();

        NoteBook noteBook = getNoteBook(inputNoteBook);

    }

    private NoteBook getNoteBook(InputNoteBook inputNoteBook) {
        NoteBook noteBook = null;
        while (true) {
            try {
                noteBook = new NoteBook(inputNoteBook.getLastName(),
                        inputNoteBook.getUserName());
                break;
            } catch (NotUniqueLoginException e) {
                //e.printStackTrace();
                System.out.println("Not Unique Login " + e.getUserNameData());
                inputNoteBook.inputUserName();
            }

        }
        return noteBook;
    }
}
