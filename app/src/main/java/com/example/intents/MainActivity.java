package com.example.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send(View view) {
        EditText editText= findViewById(R.id.get_text);
        String message = editText.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("shameed", message);
        startActivity(intent);
    }
}
