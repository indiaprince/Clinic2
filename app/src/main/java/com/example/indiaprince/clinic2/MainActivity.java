package com.example.indiaprince.clinic2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int k=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);   //xml 잡아줌  layout


        final TextView text=findViewById(R.id.text);
        Button btn1=findViewById(R.id.button1);
        btn1.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                if(k%3==0) {
                    text.setText("HI");
                }
                else if(k%3==1){
                    text.setText("My Name Is");
                }
                else if(k%3==2){
                    text.setText("Hyeon Su Han");
                }
                k++;
            }
        });
        Button btn2=findViewById(R.id.button2);
        final EditText editText=findViewById(R.id.edit_text);
        btn2.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this, SubActivity.class);
                intent.putExtra("text",String.valueOf(editText.getText()));
                startActivity(intent);
            }
        });

    }


}
