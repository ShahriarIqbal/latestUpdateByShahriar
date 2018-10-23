package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GenDuOptions extends AppCompatActivity {

    private Button DuNotice, DuResult, DuDepartment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gen_du_options);

        DuNotice = (Button) findViewById(R.id.DuNotice);
        DuResult = (Button) findViewById(R.id.DuResult);
        DuDepartment = (Button) findViewById(R.id.DuDepartment);




        DuNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDuNotice();
            }
        });

        DuResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDuResult();
            }
        });

        DuDepartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDuDepartment();
            }
        });

    }

    public void openDuNotice() {
        Intent intent = new Intent(this, GenDuNotice.class);
        startActivity(intent);
    }

    public void openDuResult() {
        Intent intent = new Intent(this, GenDuResult.class);
        startActivity(intent);
    }


    public void openDuDepartment() {
        Intent intent = new Intent(this, GenDuDepartment.class);
        startActivity(intent);
    }



}
