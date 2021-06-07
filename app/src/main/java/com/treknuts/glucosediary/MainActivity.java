package com.treknuts.glucosediary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText email = null;
    private EditText password = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void loginWithEmailAndPassword(EditText email, EditText password) {
        String message = String.format("Email: %s \nPassword: %s", email, password);
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}