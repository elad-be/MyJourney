package com.example.user.myjourney;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
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

    private FirebaseAuth mAuth;
    private Button Login; //= (Button)findViewById(R.id.login_button);
    private EditText UserEmail; //= (EditText) findViewById(R.id.username);
    private EditText UserPassword;// = (EditText)findViewById(R.id.password);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login = (Button)findViewById(R.id.login_button);
        UserEmail = (EditText) findViewById(R.id.username);
        UserPassword = (EditText)findViewById(R.id.password);
        mAuth = FirebaseAuth.getInstance();




        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                String email = UserEmail.getText().toString();
                String password = UserPassword.getText().toString();
                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult> () {

                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {


                                    Toast.makeText(MainActivity.this, "you are Logged In successfully.", Toast.LENGTH_SHORT).show();

                                } else {
                                    String message = task.getException().getMessage();
                                    Toast.makeText(MainActivity.this, "Error occured: " + message, Toast.LENGTH_SHORT).show();

                                }

                        }});

                        }

        });








    }
}
