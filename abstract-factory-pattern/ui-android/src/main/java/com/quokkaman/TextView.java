package com.quokkaman;

import com.quokkaman.widget.IText;

class TextView implements IText {
    @Override
    public void paint() {
        System.out.println("Android Text");
    }
}
