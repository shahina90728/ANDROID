package com.example.sharedpreference;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        TextView names = findViewById(R.id.intname);
        TextView phnos = findViewById(R.id.intphno);
        TextView emails = findViewById(R.id.intemail);
        TextView pwd = findViewById(R.id.intpwd);



        String name = getIntent().getStringExtra("Keyusername");
        String phno = getIntent().getStringExtra("Keyphoneno");
        String email = getIntent().getStringExtra("Keyemail");
        String password = getIntent().getStringExtra("Keypassword");

        names.setText("name :" + name);
        phnos.setText("phoneno :" + phno);
        emails.setText("email:" + email);
        pwd.setText("pwd :" + password);

    }
}