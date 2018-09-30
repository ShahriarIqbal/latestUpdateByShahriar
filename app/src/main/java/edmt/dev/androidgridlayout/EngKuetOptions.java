package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EngKuetOptions extends AppCompatActivity {

    private Button KuetNotice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_kuet_options);

        KuetNotice = (Button) findViewById(R.id.KuetNotice);
        KuetNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKuetNotice();
            }
        });
    }

    public void openKuetNotice() {
        Intent intent = new Intent(this, EngKuetNotice.class);
        startActivity(intent);
    }
}
