package com.quokkaman;

import com.quokkaman.widget.IButton;

class ButtonTag implements IButton {
    @Override
    public void paint() {
        System.out.println("Web Button");
    }
}
