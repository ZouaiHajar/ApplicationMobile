package com.example.driver;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class seet extends AppCompatActivity {

    private FirebaseAuth mAuth;
     FirebaseUser user;
    TextView text , langue ,modif;
    boolean langue_selected= true;
    Context context;
    Resources resources;
    RelativeLayout update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seet);

        mAuth = FirebaseAuth.getInstance();
        user = mAuth.getCurrentUser();

        update = findViewById(R.id.update);

        Toolbar toolbar = findViewById(R.id.app_bar);

        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(seet.this,HomePage.class);
                startActivity(i);
            }
        });

        modif=findViewById(R.id.modif);
        text = findViewById(R.id.text1);
        langue = findViewById(R.id.langue);

        text.setText(MyAPP.getLanguage());
        langue.setText(MyAPP.getSelected_language());
        modif.setText(MyAPP.getModif_pass());


        langue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] langues=  {"Francais" ,"English","العربية"};
                int chekeditem;
                if(langue_selected){
                    chekeditem = 0;

                }else {
                    chekeditem =1;
                }

                final AlertDialog.Builder builder = new AlertDialog.Builder(seet.this);
                builder.setTitle("select a language ").setSingleChoiceItems(langues, chekeditem, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        text.setText(langues[i]);
                        if(langues[i].equals("English")){
                            context = LocaleHelper.setLocale(seet.this,"en");
                            resources = context.getResources();
                            text.setText(resources.getString(R.string.language));

                            MyAPP.setLanguage(resources.getString(R.string.language));
                            MyAPP.setSelected_language(resources.getString(R.string.selected_language));
                            MyAPP.setHomeG(resources.getString(R.string.HomeG));
                            MyAPP.setHomeSeet(resources.getString(R.string.HomeSeet));
                            MyAPP.setHomeV(resources.getString(R.string.HomeV));
                            MyAPP.setHomeLogout(resources.getString(R.string.HomeLogout));
                            MyAPP.setTextGuidance(resources.getString(R.string.TextGuidance));
                            MyAPP.setModif_pass(resources.getString(R.string.modif_pass));

                            MyAPP.setReset(resources.getString(R.string.reset));
                            MyAPP.setEnterP(resources.getString(R.string.enterP));
                            MyAPP.setNo(resources.getString(R.string.No));
                            MyAPP.setYes(resources.getString(R.string.Yes));
                            MyAPP.setPRF(resources.getString(R.string.PRF));
                            MyAPP.setPRS(resources.getString(R.string.PRS));


                            modif.setText(MyAPP.getModif_pass());
                            text.setText(MyAPP.getLanguage());
                            langue.setText(MyAPP.getSelected_language());
                        }if(langues[i].equals("Francais")){

                            context = LocaleHelper.setLocale(seet.this,"fr");
                            resources = context.getResources();
                            text.setText(resources.getString(R.string.language));

                            MyAPP.setLanguage(resources.getString(R.string.language));
                            MyAPP.setSelected_language(resources.getString(R.string.selected_language));

                            MyAPP.setHomeG(resources.getString(R.string.HomeG));
                            MyAPP.setHomeSeet(resources.getString(R.string.HomeSeet));
                            MyAPP.setHomeV(resources.getString(R.string.HomeV));
                            MyAPP.setHomeLogout(resources.getString(R.string.HomeLogout));
                            MyAPP.setTextGuidance(resources.getString(R.string.TextGuidance));
                            MyAPP.setReset(resources.getString(R.string.reset));
                            MyAPP.setEnterP(resources.getString(R.string.enterP));
                            MyAPP.setNo(resources.getString(R.string.No));
                            MyAPP.setYes(resources.getString(R.string.Yes));
                            MyAPP.setPRF(resources.getString(R.string.PRF));
                            MyAPP.setPRS(resources.getString(R.string.PRS));



                            MyAPP.setModif_pass(resources.getString(R.string.modif_pass));
                            modif.setText(MyAPP.getModif_pass());
                            text.setText(MyAPP.getLanguage());
                            langue.setText(MyAPP.getSelected_language());

                        }if(langues[i].equals("العربية")){


                            context = LocaleHelper.setLocale(seet.this,"ar");
                            resources = context.getResources();
                            text.setText(resources.getString(R.string.language));

                            MyAPP.setLanguage(resources.getString(R.string.language));
                            MyAPP.setSelected_language(resources.getString(R.string.selected_language));

                            MyAPP.setHomeG(resources.getString(R.string.HomeG));
                            MyAPP.setHomeSeet(resources.getString(R.string.HomeSeet));
                            MyAPP.setHomeV(resources.getString(R.string.HomeV));
                            MyAPP.setHomeLogout(resources.getString(R.string.HomeLogout));
                            MyAPP.setTextGuidance(resources.getString(R.string.TextGuidance));

                            MyAPP.setReset(resources.getString(R.string.reset));
                            MyAPP.setEnterP(resources.getString(R.string.enterP));
                            MyAPP.setNo(resources.getString(R.string.No));
                            MyAPP.setYes(resources.getString(R.string.Yes));
                            MyAPP.setPRF(resources.getString(R.string.PRF));
                            MyAPP.setPRS(resources.getString(R.string.PRS));


                            MyAPP.setModif_pass(resources.getString(R.string.modif_pass));
                            modif.setText(MyAPP.getModif_pass());

                            text.setText(MyAPP.getLanguage());
                            langue.setText(MyAPP.getSelected_language());
                        }




                    }
                }).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                builder.create().show();

            }
        });



        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final EditText resetMail = new EditText(view.getContext());
                resetMail.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

                final AlertDialog.Builder passwordResetDialog = new AlertDialog.Builder(view.getContext());
                passwordResetDialog.setTitle(MyAPP.getReset());
                passwordResetDialog.setMessage(MyAPP.getEnterP());
                passwordResetDialog.setView(resetMail);

                passwordResetDialog.setPositiveButton(MyAPP.getYes(), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                            String mail = resetMail.getText().toString();
                             user.updatePassword(mail).addOnSuccessListener(new OnSuccessListener<Void>() {
                                 @Override
                                 public void onSuccess(Void unused) {
                                     Toast.makeText(seet.this, MyAPP.getPRS(), Toast.LENGTH_SHORT).show();
                                 }
                             }).addOnFailureListener(new OnFailureListener() {
                                 @Override
                                 public void onFailure(@NonNull Exception e) {
                                     Toast.makeText(seet.this, MyAPP.getPRF(), Toast.LENGTH_SHORT).show();
                                 }
                             });
                    }
                });
                passwordResetDialog.setNegativeButton(MyAPP.getNo(), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                passwordResetDialog.create().show();

            }
        });



    }
}