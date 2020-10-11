package bernardo.castro.s301073235;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//Bernardo Silveira dos Santos Castro, StudentID: 301073235, Section 002
public class castroActivityCardForm extends AppCompatActivity {

    EditText number, name, movie, food, city;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.castro_activity_card_form);
        submit = findViewById(R.id.bernardoButtonForm);
        number = findViewById(R.id.bernardoCardNumber);
        name = findViewById(R.id.bernardoCardName);
        movie = findViewById(R.id.bernardoFavoriteMovie);
        food = findViewById(R.id.bernardoFavoriteFood);
        city = findViewById(R.id.bernardoFavoriteCity);

        /*submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {*/
                /*number.getText().toString();
                name.getText().toString();
                movie.getText().toString();
                food.getText().toString();
                city.getText().toString();*/
                //Toast.makeText(getApplicationContext(), getString(R.string.payment), Toast.LENGTH_SHORT).show();
                //startActivity(new Intent(castroActivityCardForm.this, bernardoActivity.class));
            }
        });
    }

}