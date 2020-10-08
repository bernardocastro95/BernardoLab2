package bernardo.castro.s301073235;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
//Bernardo Silveira dos Santos Castro, StudentID: 301073235, Section 002
public class castroActivityOptions extends AppCompatActivity {

    TextView intro, address1, address2, address3, price1, price2, price3;
    ImageView option1, option2, option3;
    CheckBox check1, check2, check3;
    Button proceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_castro_options);
        option1 = findViewById(R.id.bernardoFirstOptionImage);
        option2 = findViewById(R.id.bernardoSecondtOptionImage);
        option3 = findViewById(R.id.bernardoThirdOptionImage);
        check1 = findViewById(R.id.bernardoOptionOne);
        check2 = findViewById(R.id.bernardoOptionTwo);
        check3 = findViewById(R.id.bernardoOptionThree);
        proceed = findViewById(R.id.bernardoButtonCheckout);
        intro = findViewById(R.id.bernardoIntro);
        address1 = findViewById(R.id.bernardoOption1Address);
        address2 = findViewById(R.id.bernardoOption2Address);
        address3 = findViewById(R.id.bernardoOption3Address);
        price1 = findViewById(R.id.bernardoOption1Price);
        price2 = findViewById(R.id.bernardoOption2Price);
        price3 = findViewById(R.id.bernardoOption3Price);

        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check1.isChecked()){
                    proceed.setVisibility(View.VISIBLE);
                }
                else if(!check1.isChecked() && !check2.isChecked() && !check3.isChecked()){
                    proceed.setVisibility(View.GONE);
                }
            }
        });
        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check2.isChecked()){
                    proceed.setVisibility(View.VISIBLE);
                }
                else if(!check1.isChecked() && !check2.isChecked() && !check3.isChecked()){
                    proceed.setVisibility(View.GONE);
                }
            }
        });
        check3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check3.isChecked()){
                    proceed.setVisibility(View.VISIBLE);
                }
                else if(!check1.isChecked() && !check2.isChecked() && !check3.isChecked()){
                    proceed.setVisibility(View.GONE);
                }
            }
        });

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(castroActivityOptions.this, castroActivityPaymentOptions.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.bernardoApartment:
                intro.setVisibility(View.INVISIBLE);
                option1.setImageResource(R.drawable.option1);
                option2.setImageResource(R.drawable.option2);
                option3.setImageResource(R.drawable.option3);
                check1.setVisibility(View.VISIBLE);
                check2.setVisibility(View.VISIBLE);
                check3.setVisibility(View.VISIBLE);
                address1.setText(R.string.apartment_option1_address);
                price1.setText(R.string.apartment_option1_price);
                address2.setText(R.string.apartment_option2_address);
                price2.setText(R.string.apartment_option2_price);
                address3.setText(R.string.apartment_option3_address);
                price3.setText(R.string.apartment_option3_price);
                return true;
            case R.id.bernardoDetachedHome:
                intro.setVisibility(View.INVISIBLE);
                option1.setImageResource(R.drawable.house1);
                option2.setImageResource(R.drawable.house2);
                option3.setImageResource(R.drawable.house3);
                check1.setVisibility(View.VISIBLE);
                check2.setVisibility(View.VISIBLE);
                check3.setVisibility(View.VISIBLE);
                return true;
            case R.id.bernardoSemiDetachedHome:
                intro.setVisibility(View.INVISIBLE);
                option1.setImageResource(R.drawable.semi1);
                option2.setImageResource(R.drawable.semi2);
                option3.setImageResource(R.drawable.semi3);
                check1.setVisibility(View.VISIBLE);
                check2.setVisibility(View.VISIBLE);
                check3.setVisibility(View.VISIBLE);
                return true;
            case R.id.bernardoCondominium:
                intro.setVisibility(View.INVISIBLE);
                option1.setImageResource(R.drawable.condominium1);
                option2.setImageResource(R.drawable.condominium2);
                option3.setImageResource(R.drawable.condominium3);
                check1.setVisibility(View.VISIBLE);
                check2.setVisibility(View.VISIBLE);
                check3.setVisibility(View.VISIBLE);
                return true;
            case R.id.bernardoTownHouse:
                intro.setVisibility(View.INVISIBLE);
                option1.setImageResource(R.drawable.town1);
                option2.setImageResource(R.drawable.town2);
                option3.setImageResource(R.drawable.town3);
                check1.setVisibility(View.VISIBLE);
                check2.setVisibility(View.VISIBLE);
                check3.setVisibility(View.VISIBLE);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}