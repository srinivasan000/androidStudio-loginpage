package com.example.srinivasan;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {
    EditText email, pass, cpass;
    Button signup;
    TextView err;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        email = findViewById(R.id.emailSignup);
        pass = findViewById(R.id.passwordSignup);
        cpass = findViewById(R.id.confirmpasswordSignup);
        signup = findViewById(R.id.signup);
        err=findViewById(R.id.error);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myemail = email.getText().toString();
                String mypass = pass.getText().toString();
                String mycpass = cpass.getText().toString();
                    String myerr=err.getText().toString();

                if (myemail == null || myemail.isEmpty() || mypass == null || mypass.isEmpty() || !mycpass.equals(mypass)) {
                   // Toast.makeText(SignupActivity.this, "Enter a valid email", Toast.LENGTH_LONG).show();
                        err.setVisibility(View.VISIBLE);
                        err.setText("some thing wrong enter valid details");
                        err.setTextColor(Color.RED);
                        
                  }else{
                  //  Toast.makeText(SignupActivity.this,"success",Toast.LENGTH_LONG).show();
                      //  err.setVisibility(View.INVISIBLE);
                        err.setText("super!!!");
                        err.setTextColor(Color.GREEN);
                        Intent intent=new Intent(SignupActivity.this,LoginActivity.class);
                        startActivity(intent);
                  }
            }
                
        });
    }
}