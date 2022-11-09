package com.example.nexttry;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText fstNo, sndNo;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fstNo = findViewById(R.id.firstInt);
        sndNo = findViewById(R.id.secondInt);
        res = findViewById(R.id.result);
        Button add = findViewById(R.id.add);
        Button subs = findViewById(R.id.subs);
        Button mul = findViewById(R.id.mul);
        Button div = findViewById(R.id.div);
        Button clear = findViewById(R.id.clearAll);
        add.setOnClickListener(v -> {
            if ((fstNo.getText().length() > 0) && (sndNo.getText().length() > 0)) {
                String fno = fstNo.getText().toString();
                String sno = sndNo.getText().toString();
                int a = Integer.parseInt(fno);
                int b = Integer.parseInt(sno);
                int result = a + b;
                String s = String.valueOf(result);
                res.setText(s);
            } else {
                Toast toast = Toast.makeText(MainActivity.this, "Enter The Required Numbers", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        subs.setOnClickListener(v -> {
            if ((fstNo.getText().length() > 0) && (sndNo.getText().length() > 0)) {
                String fno = fstNo.getText().toString();
                String sno = sndNo.getText().toString();
                int a = Integer.parseInt(fno);
                int b = Integer.parseInt(sno);
                int result = a - b;
                String s = String.valueOf(result);
                res.setText(s);
            } else {
                Toast toast = Toast.makeText(MainActivity.this, "Enter The Required Numbers", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        mul.setOnClickListener(v -> {
            if ((fstNo.getText().length() > 0) && (sndNo.getText().length() > 0)) {
                String fno = fstNo.getText().toString();
                String sno = sndNo.getText().toString();
                int a = Integer.parseInt(fno);
                int b = Integer.parseInt(sno);
                int result = a * b;
                String s = String.valueOf(result);
                res.setText(s);
            } else {
                Toast toast = Toast.makeText(MainActivity.this, "Enter The Required Numbers", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        div.setOnClickListener(v -> {
            if ((fstNo.getText().length() > 0) && (sndNo.getText().length() > 0)) {
                String fno = fstNo.getText().toString();
                String sno = sndNo.getText().toString();
                int a = Integer.parseInt(fno);
                int b = Integer.parseInt(sno);
                int result = a / b;
                String s = String.valueOf(result);
                res.setText(s);
            } else {
                Toast toast = Toast.makeText(MainActivity.this, "Enter The Required Numbers", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        clear.setOnClickListener(v -> {
            fstNo.setText("");
            sndNo.setText("");
            res.setText("");
        });
    }
}