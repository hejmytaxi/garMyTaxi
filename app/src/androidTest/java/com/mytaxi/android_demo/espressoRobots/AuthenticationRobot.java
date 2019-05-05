package com.mytaxi.android_demo.espressoRobots;

import android.support.test.espresso.ViewInteraction;

import com.mytaxi.android_demo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.core.AllOf.allOf;

public class AuthenticationRobot {

    static int LOGIN_USERNAME = R.id.edt_username;
    static int LOGIN_PASSWORD = R.id.edt_password;
    static int LOGIN_BUTTON = R.id.btn_login;

    public AuthenticationRobot username(String username) {
        ViewInteraction usernameEditText = onView(allOf(withId(LOGIN_USERNAME), isDisplayed()));
        usernameEditText.perform(replaceText(username), closeSoftKeyboard());
        return this;
    }

    public AuthenticationRobot password(String password) {
        ViewInteraction passwordEditText = onView(allOf(withId(LOGIN_PASSWORD), isDisplayed()));
        passwordEditText.perform(replaceText(password), closeSoftKeyboard());
        return this;
    }

    public AuthenticationRobot login() {
        ViewInteraction loginButton = onView(allOf(withId(LOGIN_BUTTON), isDisplayed()));
        loginButton.perform(click());
        return this;
    }
}
