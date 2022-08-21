package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.loginbtn);
        EditText usrnme = findViewById(R.id.usrnme);
        EditText passwd = findViewById(R.id.passwd);

        String username = usrnme.getText().toString();
        String password = passwd.getText().toString();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.equals("hello") && password.equals("hello")){
                    Toast.makeText(getApplicationContext(),"Login Successfull",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Check UserName or Password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}