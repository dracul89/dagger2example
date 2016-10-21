package beaumont.danny.dagger2example;

import android.app.Application;

import javax.inject.Inject;

import beaumont.danny.dagger2example.injection.Injector;
import retrofit2.Retrofit;

/*
* remember when creating a custom application
* to update the AndroidManifest.xml to include
* android:name=".DaggerApplication"
*/
public class DaggerApplication extends Application {

    @Inject
    Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();
        setupDagger();
    }

    private void setupDagger() {
        Injector.initializeComponent();
        Injector.getComponent().inject(this);
    }
}
