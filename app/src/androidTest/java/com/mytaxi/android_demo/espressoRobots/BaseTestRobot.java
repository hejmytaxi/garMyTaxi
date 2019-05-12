package com.mytaxi.android_demo.espressoRobots;

import android.support.test.espresso.Espresso;

import com.mytaxi.android_demo.R;

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;

public class BaseTestRobot {

    public void showSnackbar() {
        Espresso.onView(allOf(withId(android.R.id.content), withText(R.string.message_login_fail), isDisplayed()));
    }

}
