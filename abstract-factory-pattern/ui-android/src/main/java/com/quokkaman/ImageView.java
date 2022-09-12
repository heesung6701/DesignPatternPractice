package com.quokkaman;

import com.quokkaman.widget.IImage;

class ImageView implements IImage {
    @Override
    public void paint() {
        System.out.println("Android Image");
    }
}
