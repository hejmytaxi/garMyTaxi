package com.mytaxi.android_demo.espressoRobots;

import android.support.test.espresso.ViewInteraction;

import com.mytaxi.android_demo.R;

import android.support.test.espresso.Espresso;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;

public class AuthenticationRobot {

    private static final int LOGIN_USERNAME = R.id.edt_username;
    private static final int LOGIN_PASSWORD = R.id.edt_password;
    private static final int LOGIN_BUTTON = R.id.btn_login;

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

    // "android.R.id.content" (which is a LinearLayout) is the parent view to hold Snackbar's view
    // Note: Below method is not adherent to Builder Pattern as it returns 'void', and it has been
    // implemented purposely to maintain the fluency/chaining in the calling class.
    public void showLoginSnackbar() {
        Espresso.onView(allOf(withId(android.R.id.content), withText(R.string.message_login_fail), isDisplayed()));
    }
}
