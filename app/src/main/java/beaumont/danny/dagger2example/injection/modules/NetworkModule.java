package beaumont.danny.dagger2example.injection.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class NetworkModule {

    @Provides
    @Singleton
    Retrofit getRetrofit() {
        // just doing a basic retrofit this can be extended to Observables and conversion factories,  etc..
        return new Retrofit.Builder().baseUrl("http://127.0.0.1").build();
    }

    @Provides
    String getString() {
        return "Hey I work!";
    }
}
