package com.quokkaman;

import com.quokkaman.widget.IText;

class PTag implements IText {
    @Override
    public void paint() {
        System.out.println("Web Text");
    }
}
