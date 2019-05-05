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

public class LoginActivity extends AppCompatActivity {

    Toolbar toolbar;
    EditText email, password;
    CheckBox checkBox;
    ImageButton signin;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        toolbar = (Toolbar) findViewById(R.id.toolbar);

        // setting and displaying the custom action bar up indicator
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);

        checkBox = (CheckBox) findViewById(R.id.checkbox);

        signin = (ImageButton) findViewById(R.id.signin);

        signup = (Button) findViewById(R.id.signup);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this, "Sign In Button Clicked", Toast.LENGTH_LONG).show();
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(i);
            }
        });
    }

    // navigate user to the precious activity on Pressing the Custom Up Navigation
    @Override
    public boolean onSupportNavigateUp() {
        super.onSupportNavigateUp();
        onBackPressed();
        return true;
    }
}



