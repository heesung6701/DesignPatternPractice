package com.quokkaman;

import com.quokkaman.widget.IImage;

class Image implements IImage {
    @Override
    public void paint() {
        System.out.println("iOS Image");
    }
}
