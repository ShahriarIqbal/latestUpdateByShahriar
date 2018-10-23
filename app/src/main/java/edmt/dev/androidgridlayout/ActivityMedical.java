package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityMedical extends AppCompatActivity {


    private Button MedicalNotice, MedicalResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);


        MedicalNotice = (Button) findViewById(R.id.MedicalNotice);
        MedicalResult = (Button) findViewById(R.id.MedicalResult);



        MedicalNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMedicalNotice();
            }
        });

        MedicalResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMedicalResult();
            }
        });


    }



    public  void openMedicalNotice(){
        Intent intent = new Intent(this, MedicalAllNotice.class);
        startActivity(intent);
    }

    public void openMedicalResult() {
        Intent intent = new Intent(this, MedicalAllResult.class);
        startActivity(intent);
    }



}
