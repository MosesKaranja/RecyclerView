package com.example.recylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<AminoAcidModel> aminoAcidModels = new ArrayList<>();

    int[] aminoAcidImages = {R.drawable.britain, R.drawable.china, R.drawable.france, R.drawable.germany, R.drawable.india, R.drawable.indonesia,
            R.drawable.italy, R.drawable.kenya, R.drawable.portugal, R.drawable.spain, R.drawable.vietnam};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.my_recyclerView);

        setUpAminoAcidModels();

        AA_RecyclerViewAdapter adapter = new AA_RecyclerViewAdapter(this, aminoAcidModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    private void setUpAminoAcidModels(){
        String[] aminoAcidNames = getResources().getStringArray(R.array.amino_acids_full_txt);
        String[] aminoAcidAbbreviation = getResources().getStringArray(R.array.amino_acids_one_letter_txt);
        String[] aminoAcidAbbreviationSmall = getResources().getStringArray(R.array.amino_acids_three_letter_txt);

        for (int i=0;i < aminoAcidNames.length;i++){
            aminoAcidModels.add(new AminoAcidModel(aminoAcidNames[i], aminoAcidAbbreviation[i], aminoAcidAbbreviationSmall[i], aminoAcidImages[i]));

        }


    }
}