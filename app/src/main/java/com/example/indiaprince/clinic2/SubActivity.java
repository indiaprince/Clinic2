package com.example.indiaprince.clinic2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent= new Intent(this.getIntent());
        String s=intent.getStringExtra("text");
        TextView textView=findViewById(R.id.text_view);
        textView.setText(s);
    }
}
