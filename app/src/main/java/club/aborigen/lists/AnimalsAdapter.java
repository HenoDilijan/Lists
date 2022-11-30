package club.aborigen.lists;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalsAdapter extends RecyclerView.Adapter<AnimalsAdapter.AnimalCardHolder> {

    private final int [] animals;

    public AnimalsAdapter(int [] arr) {
        animals = arr;
    }

    @NonNull
    @Override
    public AnimalCardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        return new AnimalCardHolder(inflater.inflate(R.layout.view_animal_card, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalCardHolder holder, int position) {
        holder.picture.setImageResource(animals[position]);
    }

    @Override
    public int getItemCount() {
        return animals.length;
    }

    static class AnimalCardHolder extends RecyclerView.ViewHolder {
        ImageView picture;
        public AnimalCardHolder(@NonNull View itemView) {
            super(itemView);
            picture = itemView.findViewById(R.id.animal_image);
        }
    }
}
