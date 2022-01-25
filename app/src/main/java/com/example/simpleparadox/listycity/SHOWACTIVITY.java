package com.example.simpleparadox.listycity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SHOWACTIVITY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showactivity);
        Intent intent = getIntent();
        TextView tv = findViewById(R.id.tv);
        tv.setText(intent.getStringExtra("value"));
        Button b = findViewById(R.id.Back);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(SHOWACTIVITY.this, MainActivity.class);
                SHOWACTIVITY.this.startActivity(send);
            }
        });
    }

}