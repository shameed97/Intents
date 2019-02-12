package com.example.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String message = intent.getStringExtra("shameed");
        TextView textView=findViewById(R.id.set_text);
        textView.setText(message);

    }

    public void sendexplicit(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra("shameed", "hi this me");
        Intent intent1 = Intent.createChooser(intent, "Please choose one");
        intent.setType("text/plain");
        startActivity(intent);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent1);
        }
    }


}
