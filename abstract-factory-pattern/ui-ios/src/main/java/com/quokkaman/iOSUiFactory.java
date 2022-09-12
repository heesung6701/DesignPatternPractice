package com.quokkaman;

import com.quokkaman.widget.IButton;
import com.quokkaman.widget.IImage;
import com.quokkaman.widget.IText;

public class iOSUiFactory extends AbstractFactory {
    @Override
    public IButton makeButton() {
        return new Button();
    }

    @Override
    public IImage makeImage() {
        return new Image();
    }

    @Override
    public IText makeText() {
        return new Text();
    }
}
