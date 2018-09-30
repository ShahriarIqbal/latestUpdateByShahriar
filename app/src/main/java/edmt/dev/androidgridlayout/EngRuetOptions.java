package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EngRuetOptions extends AppCompatActivity {

    private Button RuetNotice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_ruet_options);

        RuetNotice = (Button) findViewById(R.id.RuetNotice);
        RuetNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRuetNotice();
            }
        });
    }

    public void openRuetNotice() {
        Intent intent = new Intent(this, EngRuetNotice.class);
        startActivity(intent);
    }
}
