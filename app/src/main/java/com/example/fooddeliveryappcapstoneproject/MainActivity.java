 package com.example.fooddeliveryappcapstoneproject;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.fooddeliveryappcapstoneproject.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

        public class EmailSignInActivity extends AppCompatActivity {

            private EditText emailEditText, passwordEditText;
            private Button signInButton;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.content_main);

                emailEditText = findViewById(R.id.enter_email);
                passwordEditText = findViewById(R.id.enter_password);
                signInButton = findViewById(R.id.signin_button);

                signInButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String email = emailEditText.getText().toString().trim();
                        String password = passwordEditText.getText().toString().trim();

                        if (email.isEmpty()) {
                            emailEditText.setError("Email is required");
                            emailEditText.requestFocus();
                            return;
                        }

                        if (password.isEmpty()) {
                            passwordEditText.setError("Password is required");
                            passwordEditText.requestFocus();
                            return;
                        }

                        mAuth.signInWithEmailAndPassword(email, password)
                                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                    @Override
                                    public void onComplete(@NonNull Task<AuthResult> task) {
                                        if (task.isSuccessful()) {
                                            Toast.makeText(EmailSignInActivity.this, "Sign in successful", Toast.LENGTH_SHORT).show();
                                        } else {
                                            Toast.makeText(EmailSignInActivity.this, "Authentication failed", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                });
                    }
                });
            }
        }
    }
}