package com.example.owaspatividade;

import android.app.Activity;

import androidx.test.espresso.Espresso;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import com.example.owaspatividade.ui.login.LoginActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class LoginTest {

    @Rule
    public ActivityTestRule<LoginActivity> activityRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void testRegisterclick() {
        Espresso.onView(withId(R.id.btnRegister))
                .perform(click());
    }
}
