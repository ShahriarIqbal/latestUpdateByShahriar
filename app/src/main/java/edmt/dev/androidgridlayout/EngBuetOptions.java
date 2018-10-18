package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EngBuetOptions extends AppCompatActivity {

    private Button BuetNotice, BuetSeats,BuetDepartment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_buet_options);

        BuetNotice = (Button) findViewById(R.id.BuetNotice);
        BuetSeats = (Button) findViewById(R.id.BuetSeats);
        BuetDepartment = (Button)findViewById(R.id.BuetDepartment);

        BuetNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBuetNotice();
            }
        });

        BuetSeats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBuetSeats();
            }
        });

        BuetDepartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBuetDepartment();
            }
        });


    }

    public  void openBuetDepartment(){
        Intent intent = new Intent(this, EngBuetDepartment.class);
        startActivity(intent);
    }

    public void openBuetNotice() {
        Intent intent = new Intent(this, EngBuetNotice.class);
        startActivity(intent);
    }

    public void openBuetSeats() {
        Intent intent = new Intent(this, EngBuetSeats.class);
        startActivity(intent);
    }
}
