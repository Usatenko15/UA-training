package com.company.controller;

import com.company.view.View;

import java.util.Scanner;

import static com.company.controller.RegexConstants.*;
import static com.company.controller.RegexConstants.REGEX_LOGIN;
import static com.company.view.TextConstant.*;
import static com.company.view.TextConstant.LOGIN_DATA;

public class InputNoteBook {
    private View view;
    private Scanner sc;

    private String lastName;
    private String userName;

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public InputNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputLastName() {
        UtilityController utilityController =
                new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;
        this.lastName =
                utilityController.inputStringValueWithScanner
                        (FIRST_NAME, str);
    }

    public void inputUserName() {
        UtilityController utilityController =
                new UtilityController(sc, view);
        this.userName =
                utilityController.inputStringValueWithScanner
                        (LOGIN_DATA, REGEX_LOGIN);
    }
}
