package aman.com.signinsignupui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    Toolbar toolbar;
    EditText email,password,name;
    CheckBox checkBox;
    ImageButton signup;
    Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);

        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);
        name = (EditText)findViewById(R.id.name);

        checkBox = (CheckBox)findViewById(R.id.checkbox);

        signup =(ImageButton)findViewById(R.id.signup);

        signin = (Button) findViewById(R.id.signin);

        signup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(SignUpActivity.this,"Sign Up Button Clicked",Toast.LENGTH_LONG).show();
            }
        });

        signin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }
}
