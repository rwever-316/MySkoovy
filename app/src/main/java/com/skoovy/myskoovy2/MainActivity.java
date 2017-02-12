package com.skoovy.myskoovy2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends Activity {

    ImageButton button1;
    ImageButton button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    public void addListenerOnButton(){
        //programatically link button to ImageButton & setup listening
        button1 = (ImageButton) findViewById(R.id.loginButton);
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //place logic here to do login action
                Toast.makeText(getApplicationContext(), "login button clicked", Toast.LENGTH_SHORT).show();

                //declare where you intend to go
                //Intent intent1 = new Intent(MainActivity.this, loginActivity.class);
                //now make it happen
                //startActivity(intent1);
            }
        });

        //programatically link button to ImageButton & setup listening
        button2 = (ImageButton) findViewById(R.id.signupButton);
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //declare where you intend to go
                Intent intent2 = new Intent(MainActivity.this, signupActivity.class);
                //now make it happen
                startActivity(intent2);
            }
        });
    };


}
