package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class ActivityNational extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national);


        TextView optionsMir = findViewById(R.id.TextMirClg);
        TextView optionsTitu = findViewById(R.id.TextTituClg);
        TextView optionsTeg = findViewById(R.id.TextTegClg);



        optionsMir.setOnClickListener(this);
        optionsTitu.setOnClickListener(this);
        optionsTeg.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.TextMirClg:
                Intent intent = new Intent(this, ClgMirOptions.class);
                startActivity(intent);
                break;

            case R.id.TextTituClg:
                Intent intent1 = new Intent(this, ClgTituOptions.class);
                startActivity(intent1);
                break;

            case R.id.TextTegClg:
                Intent intent2 = new Intent(this, ClgTegOptions.class);
                startActivity(intent2);
                break;


            default:
                break;

        }
    }
}
