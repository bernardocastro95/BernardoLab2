package bernardo.castro.s301073235;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
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
        submit = findViewById(R.id.bernardoSubmitCardButton);
        number = findViewById(R.id.bernardoCardNumber);
        name = findViewById(R.id.bernardoCardName);
        movie = findViewById(R.id.bernardoFavoriteMovie);
        food = findViewById(R.id.bernardoFavoriteFood);
        city = findViewById(R.id.bernardoFavoriteCity);

        name.setFilters(new InputFilter[] {
                new InputFilter() {
                    public CharSequence filter(CharSequence src, int start,
                                               int end, Spanned dst, int dstart, int dend) {
                        if(src.equals("")){ // for backspace
                            return src;
                        }
                        if(src.toString().matches("[a-zA-Z ]+")){
                            return src;
                        }
                        return name.getText().toString();
                    }
                }
        });
        movie.setFilters(new InputFilter[] {
                new InputFilter() {
                    public CharSequence filter(CharSequence src, int start,
                                               int end, Spanned dst, int dstart, int dend) {
                        if(src.equals("")){ // for backspace
                            return src;
                        }
                        if(src.toString().matches("[a-zA-Z ]+")){
                            return src;
                        }
                        return movie.getText().toString();
                    }
                }
        });
        city.setFilters(new InputFilter[] {
                new InputFilter() {
                    public CharSequence filter(CharSequence src, int start,
                                               int end, Spanned dst, int dstart, int dend) {
                        if(src.equals("")){ // for backspace
                            return src;
                        }
                        if(src.toString().matches("[a-zA-Z ]+")){
                            return src;
                        }
                        return city.getText().toString();
                    }
                }
        });
        food.setFilters(new InputFilter[] {
                new InputFilter() {
                    public CharSequence filter(CharSequence src, int start,
                                               int end, Spanned dst, int dstart, int dend) {
                        if(src.equals("")){ // for backspace
                            return src;
                        }
                        if(src.toString().matches("[a-zA-Z ]+")){
                            return src;
                        }
                        return food.getText().toString();
                    }
                }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.getText().toString();
                name.getText().toString();
                movie.getText().toString();
                food.getText().toString();
                city.getText().toString();
                Toast.makeText(getApplicationContext(), getString(R.string.payment), Toast.LENGTH_SHORT).show();
                startActivity(new Intent(castroActivityCardForm.this, bernardoActivity.class));
            }
        });
    }

}