package com.example.location;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EmailValidation extends AppCompatActivity {

    EditText email;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_validation);

        email = findViewById(R.id.et_email);
        save = findViewById(R.id.bt_save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateEmailAddress(email);

            }
        });
    }
    private void validateEmailAddress(EditText email) {
        String emailInput = email.getText().toString();

        if (!emailInput.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()) {
            Toast.makeText(EmailValidation.this, "Email validate successfully", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(EmailValidation.this, "Invalid email address", Toast.LENGTH_LONG).show();

        }
    }
}