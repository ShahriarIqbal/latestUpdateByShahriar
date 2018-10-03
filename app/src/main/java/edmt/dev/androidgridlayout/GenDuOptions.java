package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GenDuOptions extends AppCompatActivity {

    private Button DuNotice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gen_du_options);

        DuNotice = (Button) findViewById(R.id.DuNotice);
        DuNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDuNotice();
            }
        });
    }

    public void openDuNotice() {
        Intent intent = new Intent(this, GenDuNotice.class);
        startActivity(intent);
    }
}
