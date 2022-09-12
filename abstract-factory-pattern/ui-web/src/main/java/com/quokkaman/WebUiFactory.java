package com.quokkaman;

import com.quokkaman.widget.IButton;
import com.quokkaman.widget.IImage;
import com.quokkaman.widget.IText;

public class WebUiFactory extends AbstractFactory {
    @Override
    public IButton makeButton() {
        return new ButtonTag();
    }

    @Override
    public IImage makeImage() {
        return new ImageTag();
    }

    @Override
    public IText makeText() {
        return new PTag();
    }
}
