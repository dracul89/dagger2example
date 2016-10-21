package beaumont.danny.dagger2example.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import beaumont.danny.dagger2example.R;
import beaumont.danny.dagger2example.injection.Injector;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Inject
    String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Injector.getComponent().inject(this);
        TextView text = (TextView)findViewById(R.id.textView);
        text.setText(string);
    }
}
