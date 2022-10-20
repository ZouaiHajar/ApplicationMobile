package com.example.driver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class HomePage extends AppCompatActivity implements View.OnClickListener{

    private CardView guidance , violation , settings , logout ;
    TextView gui , vio , se , log ;
     FirebaseAuth mfirebase ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        gui = findViewById(R.id.gui);
        vio = findViewById(R.id.vio);
        se = findViewById(R.id.s);
        log  = findViewById(R.id.log);


        gui.setText(MyAPP.getHomeG());
        vio.setText(MyAPP.getHomeV());
        se.setText(MyAPP.getHomeSeet());
        log.setText(MyAPP.getHomeLogout());

        mfirebase = FirebaseAuth.getInstance();

        guidance = findViewById(R.id.Guidance);
        violation = findViewById(R.id.Violation);
        settings = findViewById(R.id.seet);
        logout = findViewById(R.id.logout);

        guidance.setOnClickListener(this);
        violation.setOnClickListener(this);
        settings.setOnClickListener(this);
        logout.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i ;
        switch (view.getId()){
            case R.id.Guidance: i = new Intent(this,guidance.class);startActivity(i); break;
            case R.id.Violation: i = new Intent(this,guidance.class);startActivity(i);break;
            case R.id.seet: i = new Intent(this,seet.class);startActivity(i);break;
            case R.id.logout:
                mfirebase.signOut();
                i = new Intent(this,MainActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
                finish();
                break;
            default: break;
        }
    }
}