package com.example.zheng.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        final Intent intent = getIntent();
        Toast.makeText(AnotherActivity.this,intent.getStringExtra("warnning"), Toast.LENGTH_LONG).show();
        final EditText input2 = (EditText)findViewById(R.id.input2) ;
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.putExtra("result",input2.getText().toString());
                setResult(0,intent);
                finish();
            }
        });
    }
}
