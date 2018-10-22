package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClgMirOptions extends AppCompatActivity {

    private Button MirNotice, MirResult,MirDepartment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clg_mir_options);

        MirNotice = (Button) findViewById(R.id.MirNotice);
        MirResult = (Button) findViewById(R.id.MirResult);
        MirDepartment = (Button)findViewById(R.id.MirDepartment);


        MirNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMirNotice();
            }
        });

        MirResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMirResult();
            }
        });

        MirDepartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMirDepartment();
            }
        });


    }



    public  void openMirDepartment(){
        Intent intent = new Intent(this, ClgMirDepartment.class);
        startActivity(intent);
    }

    public void openMirNotice() {
        Intent intent = new Intent(this, ClgMirNotice.class);
        startActivity(intent);
    }

    public void openMirResult() {
        Intent intent = new Intent(this, ClgMirResult.class);
        startActivity(intent);
    }



}
