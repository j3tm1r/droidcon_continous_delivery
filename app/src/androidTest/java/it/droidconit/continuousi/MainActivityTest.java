package it.droidconit.continuousi;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Jetmir on 06/04/2017.
 */

public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> rule
            = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void showsHelloWorld() {
        onView(withId(R.id.hellow)).check(matches(withText("Hello World!")));
    }
}
