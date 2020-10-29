package com.example.budget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.cv_goals).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoals();
            }
        });

        findViewById(R.id.cv_Categories).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategories();
            }
        });

        findViewById(R.id.cv_expenses).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExpenses();
            }
        });
    }

    private void openExpenses() {
        Intent intent = new Intent(this, expensesActivity.class);
        startActivity(intent);
    }

    private void openCategories() {
        Intent intent = new Intent(this, categoriesActivity.class);
        startActivity(intent);
    }

    private void openGoals() {
        Intent intent = new Intent(this, goalsActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}