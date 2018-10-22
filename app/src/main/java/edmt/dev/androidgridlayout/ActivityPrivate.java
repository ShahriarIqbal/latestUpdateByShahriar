package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityPrivate extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private);

        TextView optionsEW = findViewById(R.id.TextEWPriv);
        TextView optionsNS = findViewById(R.id.TextNSPriv);
        TextView optionsDI = findViewById(R.id.TextDafPriv);
        TextView optionsBRAC = findViewById(R.id.TextBPriv);
        TextView optionsGreen = findViewById(R.id.TextGPriv);
        TextView optionsAhsan = findViewById(R.id.TextAPriv);

        optionsEW.setOnClickListener(this);
        optionsNS.setOnClickListener(this);
        optionsDI.setOnClickListener(this);
        optionsBRAC.setOnClickListener(this);
        optionsGreen.setOnClickListener(this);
        optionsAhsan.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.TextEWPriv:
                Intent intent = new Intent(this, PrivEWOptions.class);
                startActivity(intent);
                break;

            case R.id.TextNSPriv:
                Intent intent1 = new Intent(this, PrivNSOptions.class);
                startActivity(intent1);
                break;

            case R.id.TextDafPriv:
                Intent intent2 = new Intent(this, PrivDafOptions.class);
                startActivity(intent2);
                break;

            case R.id.TextBPriv:
                Intent intent3 = new Intent(this, PrivBRACOptions.class);
                startActivity(intent3);
                break;

            case R.id.TextGPriv:
                Intent intent4 = new Intent(this, PrivGreenOptions.class);
                startActivity(intent4);
                break;

            case R.id.TextAPriv:
                Intent intent5 = new Intent(this, PrivAhsanOptions.class);
                startActivity(intent5);
                break;

            default:
                break;

        }
    }



}
