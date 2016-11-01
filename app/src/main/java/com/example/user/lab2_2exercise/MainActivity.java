package com.example.user.lab2_2exercise;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void editInfo(View v) {
        Intent intentGetMessage = new Intent(this, SecondActivity.class);
        startActivityForResult(intentGetMessage, 2);
    }

    public void goDial(View v) {
        TextView textViewMessage = (TextView) findViewById(R.id.textNumber);
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + textViewMessage.getText()));
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode==2)
        {
            if(null!=data)
            {
                String message = data.getStringExtra("Name");
                TextView textViewMessage = (TextView) findViewById(R.id.textName);
                textViewMessage.setText(message);

                String message2 = data.getStringExtra("Number");
                TextView textViewMessage2 = (TextView) findViewById(R.id.textNumber);
                textViewMessage2.setText(message2);
            }
        }
    }
}
