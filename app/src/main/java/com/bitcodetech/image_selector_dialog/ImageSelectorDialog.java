package com.bitcodetech.image_selector_dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



public class ImageSelectorDialog extends Dialog {
    private Context context;
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;
    private ImageView img5;
    private ImageView img6;
    private Button btnSelect;
    boolean image1, image2, image3, image4, image5, image6;

    public interface SetImageListener {
        void setImage(Integer image, ImageSelectorDialog imageSelectorDialog);
    }

    private SetImageListener setImageListener = null;

    public void setSetImageListener(SetImageListener setImageListener) {
        this.setImageListener = setImageListener;
    }

    public ImageSelectorDialog(Context context) {
        super(context);
        this.context = context;

        setContentView(R.layout.imageselectordialog);
        initView();


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image1 = true;
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image2 = true;
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image3 = true;
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image4 = true;
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image5 = true;
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image6 = true;
            }
        });

        btnSelect.setOnClickListener(new BtnSelectClickListener());
    }

    private class BtnSelectClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            if (setImageListener != null) {
                if (image1 == true) {
                    setImageListener.setImage(R.drawable.artura, ImageSelectorDialog.this);
                } else if (image2 == true) {
                    setImageListener.setImage(R.drawable.ferrari, ImageSelectorDialog.this);
                } else if (image3 == true) {
                    setImageListener.setImage(R.drawable.intro, ImageSelectorDialog.this);
                } else if (image4 == true) {
                    setImageListener.setImage(R.drawable.jesko, ImageSelectorDialog.this);
                } else if (image5 == true) {
                    setImageListener.setImage(R.drawable.lambo, ImageSelectorDialog.this);
                } else if (image6 == true) {
                    setImageListener.setImage(R.drawable.mclaren, ImageSelectorDialog.this);
                }
            }
        }
    }
    public void initView() {
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        btnSelect = findViewById(R.id.btnSelect);
    }
}
