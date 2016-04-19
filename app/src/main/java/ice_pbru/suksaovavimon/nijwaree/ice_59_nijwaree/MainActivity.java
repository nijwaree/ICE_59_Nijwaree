package ice_pbru.suksaovavimon.nijwaree.ice_59_nijwaree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button AButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindwidget();

    }// main methd

    private void bindwidget() {
        AButton = (Button) findViewById(R.id.button);

    }
}// main class
