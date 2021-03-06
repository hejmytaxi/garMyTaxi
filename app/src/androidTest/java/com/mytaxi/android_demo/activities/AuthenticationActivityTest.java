package com.mytaxi.android_demo.activities;

import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.rule.ActivityTestRule;

import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.espressoRobots.AuthenticationRobot;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@RunWith(AndroidJUnit4.class)
@LargeTest  // In case you have multiple Tests in the same class.
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AuthenticationActivityTest extends AuthenticationRobot {

    // Rule is used to define from where the Test Execution will start e.g.
    @Rule
    public ActivityTestRule<AuthenticationActivity> mAuthenticationActivityRule =
            new ActivityTestRule<>(AuthenticationActivity.class, true, true);

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    // Test: Perform Login without a Username
    @Test
    public void authenticationMissingUsername() {
        new AuthenticationRobot()
                .username("")
                .password("venture")
                .login()
                .showLoginSnackbar();
    }

    // Test: Perform Login without a Password
    @Test
    public void authenticationMissingPassword() {
        new AuthenticationRobot()
                .username("crazydog335")
                .password("")
                .login()
                .showLoginSnackbar();
    }

    // Test: Perform Login with an Incorrect Username
    @Test
    public void authenticationIncorrectUsername() {
        new AuthenticationRobot()
                .username("IamIncorrectUsername")
                .password("venture")
                .login()
                .showLoginSnackbar();
    }

    // Test: Perform Login with an Incorrect Password
    @Test
    public void authenticationIncorrectPassword() {
        new AuthenticationRobot()
                .username("crazydog335")
                .password("IamIncorrectPassword")
                .login()
                .showLoginSnackbar();
    }

    // Test: Perform Login with valid credentials
    @Test
    public void authenticationSuccess() {
        new AuthenticationRobot()
                .username("crazydog335")
                .password("venture")
                .login();
    }
}