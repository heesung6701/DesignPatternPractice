package com.quokkaman;

import com.quokkaman.widget.IImage;

class ImageTag implements IImage {
    @Override
    public void paint() {
        System.out.println("Web Image");
    }
}
