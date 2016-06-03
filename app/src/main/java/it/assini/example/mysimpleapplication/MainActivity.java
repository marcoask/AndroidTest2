package it.assini.example.mysimpleapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonTap(View view) {

        EditText editName =  (EditText) findViewById(R.id.editText);
        String name = editName.getText().toString();

        Toast myToast = Toast.makeText(getApplicationContext(), name, Toast.LENGTH_LONG);
        myToast.show();

        TextView output1 = (TextView) findViewById(R.id.output1);
        output1.setText(name);

        Uri gmmIntentUri = Uri.parse("geo:0,0?q=1600 Amphitheatre Parkway, Mountain+View, California");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }
}
