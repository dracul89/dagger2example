package beaumont.danny.dagger2example.injection;


import beaumont.danny.dagger2example.injection.interfaces.DaggerInjectionComponent;
import beaumont.danny.dagger2example.injection.interfaces.InjectionComponent;
import beaumont.danny.dagger2example.injection.modules.NetworkModule;

public class Injector {

    private static InjectionComponent component;

    private Injector() {
    }

    public static void initializeComponent() {
        component = DaggerInjectionComponent.builder()
                .networkModule(new NetworkModule())
                .build();
    }

    public static InjectionComponent getComponent() {
        return component;
    }
}
