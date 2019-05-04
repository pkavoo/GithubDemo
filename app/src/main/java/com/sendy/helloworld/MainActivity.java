package com.sendy.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edUsername, edPassword;
    String username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edUsername=findViewById(R.id.editText);
        edPassword=findViewById(R.id.editText2);
    }

    public void login(View view){
        Intent intent=new Intent(getApplicationContext(),SecondActiviy.class);
        username=edUsername.getText().toString();
        password=edPassword.getText().toString();

        intent.putExtra("username",username);
        intent.putExtra("password",password);

        startActivity(intent);

    }
}
