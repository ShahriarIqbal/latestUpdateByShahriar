package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityGeneral extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        TextView OptionsDu = findViewById(R.id.TextDu);
        TextView OptionsRu = findViewById(R.id.TextRu);
        TextView OptionsCu = findViewById(R.id.TextCu);
        TextView OptionsJahangir = findViewById(R.id.TextJahangirU);
        TextView OptionsJagannath = findViewById(R.id.TextJagannathU);
        TextView OptionsComilla= findViewById(R.id.TextComU);



        OptionsDu.setOnClickListener(this);
        OptionsRu.setOnClickListener(this);
        OptionsCu.setOnClickListener(this);
        OptionsJahangir.setOnClickListener(this);
        OptionsJagannath.setOnClickListener(this);
        OptionsComilla.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.TextDu:
                Intent intent = new Intent(this, GenDuOptions.class);
                startActivity(intent);
                break;

            case R.id.TextRu:
                Intent intent1 = new Intent(this, GenRuOptions.class);
                startActivity(intent1);
                break;

            case R.id.TextCu:
                Intent intent2 = new Intent(this, GenCuOptions.class);
                startActivity(intent2);
                break;

            case R.id.TextJahangirU:
                Intent intent3 = new Intent(this, GenJahangirOptions.class);
                startActivity(intent3);
                break;

            case R.id.TextJagannathU:
                Intent intent4 = new Intent(this, GenJagannathOptions.class);
                startActivity(intent4);
                break;

            case R.id.TextComU:
                Intent intent5 = new Intent(this, GenComillaOptions.class);
                startActivity(intent5);
                break;






            default:
                break;
        }
    }


}
