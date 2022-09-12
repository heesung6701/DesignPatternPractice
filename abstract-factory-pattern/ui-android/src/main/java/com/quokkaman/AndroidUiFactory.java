package com.quokkaman;

import com.quokkaman.widget.IButton;
import com.quokkaman.widget.IImage;
import com.quokkaman.widget.IText;

public class AndroidUiFactory extends AbstractFactory {
    @Override
    public IButton makeButton() {
        return new Button();
    }

    @Override
    public IImage makeImage() {
        return new ImageView();
    }

    @Override
    public IText makeText() {
        return new TextView();
    }
}
