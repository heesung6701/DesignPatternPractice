package com.quokkaman;

import com.quokkaman.widget.IText;

class Text implements IText {
    @Override
    public void paint() {
        System.out.println("iOS Text");
    }
}
