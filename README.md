"# TwitterAppLauncher"

## I advice you check out my website for more details if you encounter an error

## https://boltskills.com/wix-v2-react-native-navigation-change-splash-screen.

## Link to generate applauncher icons

    https://romannurik.github.io/AndroidAssetStudio/icons-launcher.html#foreground.type=image&foreground.space.trim=1&foreground.space.pad=0.05&foreColor=rgba(96%2C%20125%2C%20139%2C%200)&backColor=rgb(68%2C%20138%2C%20255)&crop=0&backgroundShape=square&effects=elevate&name=ic_launcher

## Move the generated icons to

    android\app\src\main\res

## Create a drawable folder

    android\app\src\main\res\drawable

## Create a launch_screen.xml file

    android\app\src\main\res\drawable\launch_screen.xml

## Paste this inside the launch_screen.xml file

    <layer-list xmlns:android="http://schemas.android.com/apk/res/android" android:opacity="opaque">
    <item android:drawable="@color/splashBackground"/>
    <item>
        <bitmap
            android:src="@drawable/ic_launcher.png"
            android:gravity="center"
            android:width="170dp"
            android:height="122dp"
            />
    </item>
    </layer-list>

## Goto this MainActivity.java

    android\app\src\main\java\com\applauncher\MainApplication.java

## Paste this line of code inside item

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

### One more thing we can as well do is to add a

### background color for our splash screen, the default is white.

### from the first step you can observe this line of code

     <item android:drawable="@color/splashBackground"/>

## all you have to do is goto this folder

    android\app\src\main\res\values, create a file named colors.xml

    android\app\src\main\res\values\colors.xml

## Start Or install your app again

## if you want to stop the default RNN white screen

    Navigation.setDefaultOptions({
        animations: {
            push: {
                waitForRender: true,
            },
            setRoot: {
                waitForRender: true
            }
        },
    });
