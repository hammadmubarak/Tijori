package com.puzzlers.akseer.akseer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

    }
public void openMainActivity(View view){
    startActivity(new Intent(LoginActivity.this, MainActivity.class));


}
    public void openSignUpActivity(View view){
        startActivity(new Intent(LoginActivity.this, SignupActivity.class));


    }
}
