package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EngCuetOptions extends AppCompatActivity {

    private Button CuetNotice, CuetSeats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_cuet_options);

        CuetNotice = (Button) findViewById(R.id.CuetNotice);
        CuetNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCuetNotice();
            }
        });
    }

    public void openCuetNotice() {
        Intent intent = new Intent(this, EngCuetNotice.class);
        startActivity(intent);
    }
}
