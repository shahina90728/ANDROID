package com.example.cal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    float mvalueone,mvaluetwo;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.tex2);
        Button but1 = findViewById(R.id.but1);
        Button but2 = findViewById(R.id.but2);
        Button but3 = findViewById(R.id.but3);
        Button butadd = findViewById(R.id.but4);
        Button but5 = findViewById(R.id.but5);
        Button but6 = findViewById(R.id.but6);
        Button but7 = findViewById(R.id.but7);
        Button butsub = findViewById(R.id.but8);
        Button but9 = findViewById(R.id.but9);
        Button but10 = findViewById(R.id.but10);
        Button but11 = findViewById(R.id.but11);
        Button butdiv = findViewById(R.id.but12);
        Button but13 = findViewById(R.id.but13);
        Button but14 = findViewById(R.id.but14);
        Button but15 = findViewById(R.id.but15);
        Button butmul = findViewById(R.id.but16);
        Button buteql = findViewById(R.id.but17);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"1");
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"2");
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"3");
            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"4");
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"5");
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"6");
            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"7");
            }
        });
        but10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"8");
            }
        });
        but11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"9");
            }
        });
        but13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+".");
            }
        });
        but14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+"0");
            }
        });
        but15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {editText.setText("");}
        });
        butadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null){
                    editText.setText("");
                }
                else {
                    mvalueone =Float.parseFloat((editText.getText()+" "));
                    add=true;
                    editText.setText(null);
                }
            }
        });
        butsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null){
                    editText.setText("");
                }
                else {
                    mvalueone =Float.parseFloat((editText.getText()+" "));
                    sub=true;
                    editText.setText(null);
                }
            }
        });
        butdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null){
                    editText.setText("");
                }
                else {
                    mvalueone =Float.parseFloat((editText.getText()+" "));
                    div=true;
                    editText.setText(null);
                }
            }
        });
        butmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText==null){
                    editText.setText("");
                }
                else {
                    mvalueone =Float.parseFloat((editText.getText()+" "));
                    mul=true;
                    editText.setText(null);
                }
            }
        });
        buteql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mvaluetwo = Float.parseFloat(editText.getText().toString());

                if (add) {
                    editText.setText(String.valueOf(mvalueone + mvaluetwo));
                    add = false;
                }
                else if (sub) {
                    editText.setText(String.valueOf(mvalueone - mvaluetwo));
                    sub = false;
                }
                else if (div) {
                    editText.setText(String.valueOf(mvalueone / mvaluetwo));
                    div = false;
                }
                else if (mul) {
                    editText.setText(String.valueOf(mvalueone * mvaluetwo));
                    mul = false;
                }
            }
        });
    }
}