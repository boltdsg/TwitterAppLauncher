package com.applauncher;

import com.reactnativenavigation.NavigationActivity;

public class MainActivity extends NavigationActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(this.createSplashLayout());
    }

    public LinearLayout createSplashLayout() {
        LinearLayout splash = new LinearLayout(this);
        Drawable launch_screen_bitmap = ContextCompat.getDrawable(getApplicationContext(), R.drawable.launch_screen);
        splash.setBackground(launch_screen_bitmap);

        return splash;
    }
}
