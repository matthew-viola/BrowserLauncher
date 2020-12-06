package edu.temple.browserlauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    go = findViewById(R.id.btnGo);
    go.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String url = "https://temple.edu";
            Intent sendIntent = new Intent();
     //       sendIntent.setAction(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse(url));
            String title = "Select the browser";
            Intent chooser = Intent.createChooser(sendIntent, title);
            if(sendIntent.resolveActivity(getPackageManager()) != null){
                startActivity(chooser);
            }

        }
    });
    }


}