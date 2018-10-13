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

public class ActivityRegister extends AppCompatActivity {

    private Button bt3;
    private EditText et3, et4;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mAuth = FirebaseAuth.getInstance();


        et3 = findViewById(R.id.et3);
        et4 = findViewById(R.id.et4);
        bt3 = findViewById(R.id.bt3);

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sign_Up();
            }
        });

    }

    private void sign_Up(){
        String  email = et3.getText().toString().trim(); ///Take input from EditText:Username
        String password = et4.getText().toString().trim();///Take input from EditText:Password

        if(email.isEmpty()||password.isEmpty()) {
            Toast.makeText(getApplicationContext(),"Please Fill Up!!",Toast.LENGTH_LONG).show();
        }
        else {

            mAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                FirebaseUser user = mAuth.getCurrentUser();


                                Intent intent = new Intent(ActivityRegister.this, ActivityLogin.class);
                                startActivity(intent);
                                Toast.makeText(getApplicationContext(), "Account Created.", Toast.LENGTH_SHORT).show();

                            }
                            else {
                                Toast.makeText(getApplicationContext(), "Account Creation Failed", Toast.LENGTH_SHORT).show();
                            }

                        }
                    });

        }


    }
}
