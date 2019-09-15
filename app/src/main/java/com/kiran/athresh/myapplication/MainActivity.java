package com.kiran.athresh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button add;
    private Button sub;
    private Button div;
    private Button mul;
    private TextView result;
    private EditText num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI();
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a= Integer.parseInt(num1.getText().toString());
                int b =Integer.parseInt(num2.getText().toString());
                int c= a+b;
                result.setText(String.valueOf(c));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int c= a- b;
                result.setText(String.valueOf(c));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int c= a/b;
                result.setText(String.valueOf(c));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int c= a*b;
                result.setText(String.valueOf(c));
            }
        });
    }

    private void setupUI() {
        add=(Button)findViewById(R.id.Add);
        sub=(Button)findViewById(R.id.Sub);
        div=(Button)findViewById(R.id.Div);
        mul=(Button)findViewById(R.id.Mul);
        result=(TextView)findViewById(R.id.Ans);
        num1=(EditText)findViewById(R.id.Num_1);
        num2=(EditText)findViewById(R.id.Num_2);

    }
}
