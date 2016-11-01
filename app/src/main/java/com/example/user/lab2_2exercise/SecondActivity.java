package com.example.user.lab2_2exercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText editName;
    EditText editNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editName = (EditText) findViewById(R.id.editName);
        editNumber = (EditText) findViewById(R.id.editNumber);
    }

    public void confirmMessage(View v) {
        String message = editName.getText().toString();
        String message2 = editNumber.getText().toString();
        Intent intentMessage = new Intent();
        intentMessage.putExtra("Name", message);
        intentMessage.putExtra("Number", message2);
        setResult(2, intentMessage);
        finish();
    }
}
