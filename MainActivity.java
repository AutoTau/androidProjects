package com.myappcompany.ben.logindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void clickFunction(View view){

        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);

        Log.i("info", "It worked!");
        Log.i("Name values", nameEditText.getText().toString());
        Log.i("Password Values", passwordEditText.getText().toString());

        Toast.makeText(this,"Hello " + nameEditText.getText().toString(), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
