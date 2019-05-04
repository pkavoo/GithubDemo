package com.sendy.helloworld;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActiviy extends AppCompatActivity {

    TextView txtUsername,txtPassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        txtUsername =findViewById(R.id.txtusername);
        txtPassword=findViewById(R.id.txtpassword);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String Strusername=bundle.getString("username");
            String Strpassword=bundle.getString("password");
            txtUsername.setText(Strusername);
            txtPassword.setText(Strpassword);

        }
    }
}



