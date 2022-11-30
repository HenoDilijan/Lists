package club.aborigen.lists;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.DisplayMetrics;

public class MainActivity extends AppCompatActivity {
    private final int [] animals = { R.drawable.deer, R.drawable.tiger,
            R.drawable.fox, R.drawable.squrrel, R.drawable.zebra };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView animalsList = findViewById(R.id.animals_list);
        animalsList.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false) {
            @Override
            public boolean checkLayoutParams(RecyclerView.LayoutParams lp) {
                lp.width = getWidth() * 2 / 3; //makes next item partially visible
                return true;
            }
        });
        animalsList.setAdapter(new AnimalsAdapter(animals));
    }
}
