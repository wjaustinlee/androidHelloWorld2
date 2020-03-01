package com.example.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World 2");

        final TextView showCountTextView = findViewById(R.id.textView);


        findViewById(R.id.main_toastButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast myToast = Toast.makeText(getApplicationContext(), R.string.toastMessage, Toast.LENGTH_SHORT);
                myToast.show();
            }
        });

        findViewById(R.id.main_countUpButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String countUpString = showCountTextView.getText().toString();
                Integer countUp = Integer.parseInt(countUpString);
                countUp++;
                showCountTextView.setText(countUp.toString());
            }
        });

    }
}
