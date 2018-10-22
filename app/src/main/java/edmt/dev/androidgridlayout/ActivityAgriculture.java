package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityAgriculture extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture);

        TextView optionsBAU = findViewById(R.id.TextBangAgriU);
        TextView optionsSheikhMujib = findViewById(R.id.TextBangabandhuAgriU);
        TextView optionsSherBang = findViewById(R.id.TextSherAgriU);
        TextView optionsSylhet = findViewById(R.id.TextSylAgriU);


        optionsBAU.setOnClickListener(this);
        optionsSheikhMujib.setOnClickListener(this);
        optionsSherBang.setOnClickListener(this);
        optionsSylhet.setOnClickListener(this);



    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.TextBangAgriU:
                Intent intent = new Intent(this, AgriBAUOptions.class);
                startActivity(intent);
                break;

            case R.id.TextBangabandhuAgriU:
                Intent intent1 = new Intent(this, AgriBangabandhuOptions.class);
                startActivity(intent1);
                break;

            case R.id.TextSherAgriU:
                Intent intent2 = new Intent(this, AgriSherOptions.class);
                startActivity(intent2);
                break;

            case R.id.TextSylAgriU:
                Intent intent3 = new Intent(this, AgriSylhetOptions.class);
                startActivity(intent3);
                break;



            default:
                break;

        }
    }



}
