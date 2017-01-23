package com.subbu.mybasiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnadd,btnsub,btndiv,btnmul;
    private EditText no1,no2;
    private TextView no3;
    String num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnadd = (Button) findViewById(R.id.add);
        btnsub = (Button) findViewById(R.id.min);
        btndiv = (Button) findViewById(R.id.div);
        btnmul = (Button) findViewById(R.id.mul);
        no1 = (EditText) findViewById(R.id.textView);
        no2 = (EditText) findViewById(R.id.textView2);
        no3 = (TextView) findViewById(R.id.textView3);
        btnadd.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        addclicked(v);
                    }
                }
        );
        btnsub.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        subclicked(v);
                    }
                }
        );
        btndiv.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        divclicked(v);
                    }
                }
        );
        btnmul.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        mulclicked(v);
                    }
                }
        );
    }
    public void addclicked(View view)
    {
        num1=no1.getText().toString();
        num2=no2.getText().toString();
        float addi=((Float.parseFloat(num1))+(Float.parseFloat(num2)));
        no3.setText(String.valueOf(addi));
    }
    public void subclicked(View v)
    {
        num1=no1.getText().toString();
        num2=no2.getText().toString();
        Float addi=((Float.parseFloat(num1))-(Float.parseFloat(num2)));
        no3.setText(String.valueOf(addi));
    }
    public void divclicked(View v)
    {
        num1=no1.getText().toString();
        num2=no2.getText().toString();
        try {
            float addi = ((Float.parseFloat(num1)) / (Float.parseFloat(num2)));
            no3.setText(String.valueOf(addi));
        }
        catch(Exception e)
        {
            no3.setText("Not Divisible by Zero");
        }
    }
    public void mulclicked(View v)
    {
        num1=no1.getText().toString();
        num2=no2.getText().toString();
        int addi=((Integer.parseInt(num1))*(Integer.parseInt(num2)));
        no3.setText(String.valueOf(addi));
    }
    }
