package com.example.database;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button bt1, bt2;
    TextView txt1;
    DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        txt1 = findViewById(R.id.txt1);


        dbHelper = new DatabaseHelper(this);


        bt1.setOnClickListener(v -> {

            String name = edit1.getText().toString().trim();
            String email = edit2.getText().toString().trim();

            if (name.isEmpty() || email.isEmpty()) {
                Toast.makeText(
                        MainActivity.this,
                        "Please enter the name and email",
                        Toast.LENGTH_SHORT
                ).show();
                return;
            }

            boolean inserted = dbHelper.insertData(name, email);

            if (inserted) {
                Toast.makeText(
                        MainActivity.this,
                        "Data inserted successfully",
                        Toast.LENGTH_SHORT
                ).show();

                edit1.setText("");
                edit2.setText("");

            } else {
                Toast.makeText(
                        MainActivity.this,
                        "Insertion failed",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        bt2.setOnClickListener(v -> {
            String data = dbHelper.getAllData();
            txt1.setText(data);
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (dbHelper != null) {
            dbHelper.close();
        }
    }
}