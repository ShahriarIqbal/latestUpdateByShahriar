package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityEngineering extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering);

        TextView optionsBuet = findViewById(R.id.TextBuet);
        TextView optionsMist = findViewById(R.id.TextMist);
        TextView optionsRuet = findViewById(R.id.TextRuet);
        TextView optionsKuet = findViewById(R.id.TextKuet);
        TextView optionsCuet = findViewById(R.id.TextCuet);

        optionsBuet.setOnClickListener(this);
        optionsMist.setOnClickListener(this);
        optionsRuet.setOnClickListener(this);
        optionsKuet.setOnClickListener(this);
        optionsCuet.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.TextBuet:
                Intent intent = new Intent(this, EngBuetOptions.class);
                startActivity(intent);
                break;

            case R.id.TextMist:
                Intent intent1 = new Intent(this, EngMistOptions.class);
                startActivity(intent1);
                break;

            case R.id.TextRuet:
                Intent intent2 = new Intent(this, EngRuetOptions.class);
                startActivity(intent2);
                break;

            case R.id.TextKuet:
                Intent intent3 = new Intent(this, EngKuetOptions.class);
                startActivity(intent3);
                break;

            case R.id.TextCuet:
                Intent intent4 = new Intent(this, EngCuetOptions.class);
                startActivity(intent4);
                break;

            default:
                break;

        }
    }




}
