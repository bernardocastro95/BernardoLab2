package bernardo.castro.s301073235;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

public class castroActivityOptions extends AppCompatActivity {

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


        //Bernardo Silveira dos Santos Castro, StudentID: 301073235, Section 002
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
                option1.setImageResource(R.drawable.option1);
                option2.setImageResource(R.drawable.option2);
                option3.setImageResource(R.drawable.option3);
                check1.setVisibility(View.VISIBLE);
                check2.setVisibility(View.VISIBLE);
                check3.setVisibility(View.VISIBLE);
                proceed.setVisibility(View.VISIBLE);
                return true;
            case R.id.bernardoDetachedHome:
                option1.setImageResource(R.drawable.house1);
                option2.setImageResource(R.drawable.house2);
                option3.setImageResource(R.drawable.house3);
                check1.setVisibility(View.VISIBLE);
                check2.setVisibility(View.VISIBLE);
                check3.setVisibility(View.VISIBLE);
                proceed.setVisibility(View.VISIBLE);
                return true;
            case R.id.bernardoSemiDetachedHome:
                //option1.setIm
                //option1.setIm
                //option1.setIm
                check1.setVisibility(View.VISIBLE);
                check2.setVisibility(View.VISIBLE);
                check3.setVisibility(View.VISIBLE);
                proceed.setVisibility(View.VISIBLE);
                return true;
            case R.id.bernardoCondominium:
                //option1.setIm
                //option1.setIm
                //option1.setIm
                check1.setVisibility(View.VISIBLE);
                check2.setVisibility(View.VISIBLE);
                check3.setVisibility(View.VISIBLE);
                proceed.setVisibility(View.VISIBLE);
                return true;
            case R.id.bernardoTownHouse:
                //option1.setIm
                //option1.setIm
                //option1.setIm
                check1.setVisibility(View.VISIBLE);
                check2.setVisibility(View.VISIBLE);
                check3.setVisibility(View.VISIBLE);
                proceed.setVisibility(View.VISIBLE);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}