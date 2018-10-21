package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EngMistOptions extends AppCompatActivity {

    private Button MistNotice, MistResult, MistDepartment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_mist_options);

        MistNotice = (Button) findViewById(R.id.MistNotice);
        MistResult = (Button) findViewById(R.id.MistResult) ;
        MistDepartment = (Button) findViewById(R.id.MistDepartment);


        MistNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMistNotice();
            }
        });

        MistResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMistResult();
            }
        });

        MistDepartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMistDepartment();
            }
        });
    }

    public void openMistNotice() {
        Intent intent = new Intent(this, EngMistNotice.class);
        startActivity(intent);
    }

    public void openMistResult(){
        Intent intent = new Intent(this, EngMistResult.class);
        startActivity(intent);
    }

    public void openMistDepartment() {
        Intent intent = new Intent(this, EngMistDepartment.class);
        startActivity(intent);
    }

}
