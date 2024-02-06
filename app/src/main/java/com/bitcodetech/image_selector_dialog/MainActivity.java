package com.bitcodetech.image_selector_dialog;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    private Button btnImageSelect;
    private ImageView imgView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnImageSelect = findViewById(R.id.btnImageSelect);
        imgView = findViewById(R.id.imgView);

        btnImageSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.bitcodetech.image_selector_dialog.ImageSelectorDialog imageselectordialog = new com.bitcodetech.image_selector_dialog.ImageSelectorDialog(MainActivity.this);
                imageselectordialog.setSetImageListener(new MySetImageListener());
                imageselectordialog.show();
            }
        });
    }

    private class MySetImageListener implements com.bitcodetech.image_selector_dialog.ImageSelectorDialog.SetImageListener{

        @Override
        public void setImage(Integer image, com.bitcodetech.image_selector_dialog.ImageSelectorDialog imageSelectorDialog) {
            imageSelectorDialog.dismiss();
            imgView.setImageResource(image);
        }
    }
}


