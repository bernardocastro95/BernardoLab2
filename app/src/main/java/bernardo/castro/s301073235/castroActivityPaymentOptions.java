package bernardo.castro.s301073235;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

//Bernardo Silveira dos Santos Castro, StudentID: 301073235, Section 002
public class castroActivityPaymentOptions extends AppCompatActivity {

    RadioGroup group;
    RadioButton cash, card;
    Button form;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.castro_activity_payment_options);
        group = findViewById(R.id.bernardoRadioGroup);
        cash = findViewById(R.id.bernardoCashButton);
        card = findViewById(R.id.bernardoCardButton);
        form = findViewById(R.id.bernardoButtonForm);

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.bernardoCashButton:
                        form.setVisibility(View.INVISIBLE);
                        Toast.makeText(getApplicationContext(), getString(R.string.cash_selected), Toast.LENGTH_LONG).show();
                        break;
                    case R.id.bernardoCardButton:
                        form.setVisibility(View.VISIBLE);
                        break;
                    default:
                        break;
                }
            }
        });
        form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(castroActivityPaymentOptions.this, castroActivityCardForm.class));
            }
        });
    }

}