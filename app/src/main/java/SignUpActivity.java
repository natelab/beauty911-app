package com.example.beauty911;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    EditText firstNameInput, lastNameInput, signupEmailInput, signupPasswordInput;
    Button signupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        firstNameInput = findViewById(R.id.firstNameInput);
        lastNameInput = findViewById(R.id.lastNameInput);
        signupEmailInput = findViewById(R.id.signupEmailInput);
        signupPasswordInput = findViewById(R.id.signupPasswordInput);
        signupBtn = findViewById(R.id.signupBtn);

        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = firstNameInput.getText().toString();
                String lastName = lastNameInput.getText().toString();
                String email = signupEmailInput.getText().toString();
                String password = signupPasswordInput.getText().toString();

                // Simple validation
                if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Add sign-up logic here (e.g., send data to database)
                    Toast.makeText(SignUpActivity.this, "Account Created!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
