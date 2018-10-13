package edmt.dev.androidgridlayout;

import android.content.Intent;
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
import com.google.firebase.auth.FirebaseUser;

public class ActivityLogin extends AppCompatActivity {

    private Button bt1, bt2;
    private EditText et1, et2;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();

        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign_In();
            }
        });


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityLogin.this, ActivityRegister.class);
                startActivity(intent);
            }
        });


    }

    public void sign_In(){


        String email = et1.getText().toString().trim(); ///Take input from EditText:Username
        String password = et2.getText().toString().trim(); ///Take input from EditText:Password

        if(email.isEmpty()||password.isEmpty()) {
            Toast.makeText(getApplicationContext(),"Please Fill Up!!",Toast.LENGTH_LONG).show();
        }
        else {

            mAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                FirebaseUser user = mAuth.getCurrentUser();

                                ///Login successfull hole ki korbe seta likhte hobe
                                Intent intent = new Intent (ActivityLogin.this, MainActivity.class);
                                startActivity(intent);
                                Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();

                            }
                            else {
                                Toast.makeText(getApplicationContext(), "Enter Valid Email or Password", Toast.LENGTH_SHORT).show();
                            }

                        }
                    });
        }

    }



}
