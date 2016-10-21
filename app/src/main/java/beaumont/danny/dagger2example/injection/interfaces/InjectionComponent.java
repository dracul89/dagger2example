package beaumont.danny.dagger2example.injection.interfaces;

import javax.inject.Singleton;

import beaumont.danny.dagger2example.DaggerApplication;
import beaumont.danny.dagger2example.activities.MainActivity;
import beaumont.danny.dagger2example.injection.modules.NetworkModule;
import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class})
public interface InjectionComponent {
    // we define what classes we are going to inject into.
    void inject(MainActivity mainActivity);
    void inject(DaggerApplication application);
}
