package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EngMistOptions extends AppCompatActivity {

    private Button MistNotice, MistSeats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_mist_options);

        MistNotice = (Button) findViewById(R.id.MistNotice);


        MistNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMistNotice();
            }
        });
    }

    public void openMistNotice() {
        Intent intent = new Intent(this, EngMistNotice.class);
        startActivity(intent);
    }
}
