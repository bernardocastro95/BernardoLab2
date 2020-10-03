package bernardo.castro.s301073235;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class castroActivityOptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_castro_options);
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
                Toast.makeText(this, "Apartment", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.bernardoDetachedHome:
                return true;
            case R.id.bernardoSemiDetachedHome:
                return true;
            case R.id.bernardoCondominium:
                return true;
            case R.id.bernardoTownHouse:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}