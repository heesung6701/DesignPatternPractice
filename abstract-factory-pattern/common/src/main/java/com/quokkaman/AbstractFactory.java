package com.quokkaman;

import com.quokkaman.widget.IButton;
import com.quokkaman.widget.IImage;
import com.quokkaman.widget.IImageButton;
import com.quokkaman.widget.IText;

public abstract class AbstractFactory {
    public abstract IButton makeButton();

    public abstract IImage makeImage();

    public abstract IText makeText();

    public IImageButton makeImageButton() {
        IImage image = makeImage();
        IButton button = makeButton();
        return () -> {
            image.paint();
            button.paint();
        };
    }
}
