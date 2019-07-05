package com.example.android.fisher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout bookFish, shoppingFish,placeStore,sellingStore,eWallet;
    private ImageView imgBook, imgShopping,imgPlaces, imgSell,imgWallet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        initialization();

    }

    private void initialization()
    {
        bookFish = findViewById(R.id.book);
        shoppingFish = findViewById(R.id.shopping);
        placeStore = findViewById(R.id.GoToPlaces);
        sellingStore = findViewById(R.id.sell);
        eWallet = findViewById(R.id.wallet);


        imgBook = findViewById(R.id.img_book);
        imgShopping = findViewById(R.id.img_shopping);
        imgPlaces = findViewById(R.id.img_GoToPlaces);
        imgSell = findViewById(R.id.img_sell);
        imgWallet = findViewById(R.id.img_wallet);



        bookFish.setOnClickListener(this);
        shoppingFish.setOnClickListener(this);
        placeStore.setOnClickListener(this);
        sellingStore.setOnClickListener(this);
        eWallet.setOnClickListener(this);


        imgBook.setOnClickListener(this);
        imgShopping.setOnClickListener(this);
        imgPlaces.setOnClickListener(this);
        imgSell.setOnClickListener(this);
        imgWallet.setOnClickListener(this);


    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.img_book:
                startActivity(new Intent(DashboardActivity.this,BookFishActivity.class));
                break;
            case R.id.img_shopping:
                startActivity(new Intent(DashboardActivity.this,ShoppingActivity.class));
                break;
            case R.id.img_GoToPlaces:
                startActivity(new Intent(DashboardActivity.this,GoToPlacesActivity.class));
                break;
            case R.id.img_sell:
                startActivity(new Intent(DashboardActivity.this,SellActivity.class));
                break;
            case R.id.img_wallet:
                startActivity(new Intent(DashboardActivity.this,WalletActivity.class));
                break;
        }
    }
}
