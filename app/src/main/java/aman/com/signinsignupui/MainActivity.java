package aman.com.signinsignupui;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button signIn, signUp;
    // Get the transition name from the string resource


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.tour);
        signIn =(Button)findViewById(R.id.signin);
        signUp =(Button)findViewById(R.id.signup);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ViewProfileActivity.class));
            }
        });

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                MainActivity.this,
                                view,   // Starting view
                                getString(R.string.btnSignInTransitionName)    // transition String
                        );
                //Start the Intent
                ActivityCompat.startActivity(
                        MainActivity.this,
                        new Intent(MainActivity.this,LoginActivity.class),
                        options.toBundle());

            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                MainActivity.this,
                                view,   // Starting view
                                getString(R.string.btnSignUpTransitionName)    // transition String
                        );
                //Start the Intent
                ActivityCompat.startActivity(
                        MainActivity.this,
                        new Intent(MainActivity.this,SignUpActivity.class),
                        options.toBundle());
            }
        });
    }
}
