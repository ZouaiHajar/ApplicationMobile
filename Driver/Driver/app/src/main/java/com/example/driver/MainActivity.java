package com.example.driver;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;



public class MainActivity extends AppCompatActivity {

    MyAPP myAPP;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myAPP = new MyAPP("Hello Sir, Madam Police Officer this application is at your service, to Change your Password, Change the application language please go to the menu and click on Configuration. to see the list of violations close to you please go to the menu and click on violations to exit the application it just click on Logout","Guidance",
                "Violation","settings",
                "Logout","English" ,
                "Change the language","Change your password",
                "Reset your Password ?","Enter your new Password ","Yes","No","Password Reset Successfully","Password Reset faild");

        mAuth = FirebaseAuth.getInstance();
        if(mAuth.getCurrentUser() != null ){
            finish();
            return;
        }

        Button btn = findViewById(R.id.log);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              authenticateUser();
            }
        });


    }

    private void authenticateUser(){
        EditText log = findViewById(R.id.login);
        EditText pass = findViewById(R.id.pass);

        String login = log.getText().toString();
        String password = pass.getText().toString();

        if(login.isEmpty() || password.isEmpty()){
            Toast.makeText(this,"Please fill all fields",Toast.LENGTH_LONG).show();
            return;
        }

        mAuth.signInWithEmailAndPassword(login, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                                 ShowHome();
                        } else {
                            Toast.makeText(MainActivity.this,"Authentication failed",Toast.LENGTH_LONG).show();
                        }
                    }
        });

    }

    private void  ShowHome(){
        Intent intent = new Intent(this,HomePage.class);
        System.out.println("oooooooook");
        startActivity(intent);
        finish();
    }


}