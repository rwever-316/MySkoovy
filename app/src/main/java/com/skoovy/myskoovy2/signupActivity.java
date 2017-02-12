package com.skoovy.myskoovy2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class signupActivity extends Activity {

    private EditText editTextFirstName;
    private EditText editTextLastName;

    public static String firstName;
    public static String lastName;

    ImageButton button1;
    ImageButton button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        //Retrieve text values entered for first name and last name
        editTextFirstName =  (EditText) findViewById(R.id.firstName);
        editTextLastName = (EditText) findViewById(R.id.lastName);

        //Tell my buttons to listen up!
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        button1 = (ImageButton) findViewById(R.id.activityBsignupButton);
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //get text from values entered and trim whitespace
                firstName = editTextFirstName.getText().toString().trim();
                lastName = editTextLastName.getText().toString().trim();

                //Detect empty fields before allowing user to continue to next activity
                if(TextUtils.isEmpty(firstName)){
                    //firstName is empty
                    Toast.makeText(getApplicationContext(), "Please enter firstName", Toast.LENGTH_SHORT).show();
                    //stopping the function from executing further
                    return;
                }
                if(TextUtils.isEmpty(lastName)){
                    //lastName is empty
                    Toast.makeText(getApplicationContext(), "Please enter lastName", Toast.LENGTH_SHORT).show();
                    //stopping the function from executing further
                    return;
                }

                //Both text fields were filled, so we allow user to continue to next activity
                //place logic here to do login action
                Toast.makeText(getApplicationContext(), "activityB signup button clicked", Toast.LENGTH_SHORT).show();

                //declare where you intend to go
                Intent intent3 = new Intent(signupActivity.this, signupCreateUsernameActivity.class);
                //now make it happen
                startActivity(intent3);
            }
        });

        button2 = (ImageButton) findViewById(R.id.backButton);
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //place logic here to do back button action
                finish();
            }
        });
    }


}
