package ice_pbru.suksaovavimon.nijwaree.ice_59_nijwaree;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private Button button;

    private ListView comListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindwidget();

        buttoncon();

        creatlistView();

    }// main methd

    private void creatlistView() {
        final int[] intIcon = {R.drawable.computer, R.drawable.keyboard, R.drawable.ouse, R.drawable.joystitck, R.drawable.hub, R.drawable.speaker, R.drawable.print, R.drawable.mainboard, R.drawable.floppy, R.drawable.handy, R.drawable.cpu, R.drawable.ram, R.drawable.power,R.drawable.cd,R.drawable.hard,R.drawable.card,R.drawable.webcam,R.drawable.modem,R.drawable.scanner,R.drawable.head};
        final String[] titleString = new String[20];
        titleString[0] = "Computer";
        titleString[1] = "Keyboard";
        titleString[2] = "Mouse";
        titleString[3] = "Joystick";
        titleString[4] = "Hub";
        titleString[5] = "Speaker";
        titleString[6] = "Printer";
        titleString[7] = "Main board";
        titleString[8] = "Floppy drive";
        titleString[9] = "Handy drive";
        titleString[10] = "CPU";
        titleString[11] = "Ram";
        titleString[12] = "Power supply";
        titleString[13] = "CD-Rom";
        titleString[14] = "Harddisk";
        titleString[15] = "Display card";
        titleString[16] = "Webcam";
        titleString[17] = "Modem";
        titleString[18] = "Scanner";
        titleString[19] = "Headphone";

        String[] detailStrings = getResources().getStringArray(R.array.detail_short);

        My_Adapter my_adapter = new My_Adapter(MainActivity.this, intIcon, titleString, detailStrings);
        comListView.setAdapter(my_adapter);

        comListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(MainActivity.this, Detail_Activity.class);

                intent.putExtra("Title", titleString[i]);
                intent.putExtra("Image", intIcon[i]);
                intent.putExtra("Index", i);

                startActivity(intent);
            }
        });
    }

    private void buttoncon() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://fonaugust.wordpress.com/2014/05/21/"));
                startActivity(intent);
            }
        });
    }

    private void bindwidget() {
        button = (Button) findViewById(R.id.button);
        comListView = (ListView) findViewById(R.id.listView);

    }
}// main class
