package com.mytaxi.android_demo.activities;

import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.rule.ActivityTestRule;

import com.mytaxi.android_demo.R;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
@LargeTest  // In case you have multiple Tests in the same class.
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AuthenticationActivityTest {

    // Rule is used to define from where the Test Execution will start e.g.
    @Rule
    public ActivityTestRule<AuthenticationActivity> mAuthenticationActivityRule =
            new ActivityTestRule<>(AuthenticationActivity.class);

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void loginSuccess() {
        onView(withId(R.id.edt_username)).perform(typeText("crazydog335"));
        onView(withId(R.id.edt_password)).perform(typeText("venture"));
        onView(withId(R.id.btn_login)).perform(click());
    }
}