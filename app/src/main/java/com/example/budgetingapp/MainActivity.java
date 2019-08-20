package com.example.budgetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private Button seeBudgets;
    private Button logTransaction;
    private Button seeTransactions;
    private Button createCategory;
    private Button editCategories;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupButtons();

        seeBudgets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                startActivity(new Intent(MainActivity.this, SeeBudgetsActivity.class));
            }
        });

        logTransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                startActivity(new Intent(MainActivity.this, LogTransactionActivity.class));
            }
        });

        seeTransactions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                startActivity(new Intent(MainActivity.this, SeeTransactionsActivity.class));
            }
        });

        createCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                startActivity(new Intent(MainActivity.this, CreateCategoryActivity.class));
            }
        });

        editCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                startActivity(new Intent(MainActivity.this, EditCategoriesActivity.class));
            }
        });
    }

    protected void setupButtons() {
        seeBudgets = findViewById(R.id.seeBudgetsButton);
        logTransaction = findViewById(R.id.logTransactionButton);
        seeTransactions = findViewById(R.id.seeTransactionsButton);
        createCategory = findViewById(R.id.createCategoryButton);
        editCategories = findViewById(R.id.editCategoriesButton);
    }

}
