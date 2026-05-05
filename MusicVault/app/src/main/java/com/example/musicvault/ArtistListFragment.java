package com.example.musicvault;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

public class ArtistListFragment extends ListFragment {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String[] artists = {
                "The Weeknd",
                "Dua Lipa",
                "Drake",
                "Billie Eilish",
                "Post Malone",
                "Ariana Grande",
                "Kendrick Lamar",
                "Taylor Swift",
                "Bad Bunny",
                "SZA"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                requireActivity(),
                android.R.layout.simple_list_item_1,
                artists
        );
        setListAdapter(adapter);
    }
}