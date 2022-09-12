package com.quokkaman;

import com.quokkaman.widget.IButton;

class Button implements IButton {
    @Override
    public void paint() {
        System.out.println("iOS Button");
    }
}
