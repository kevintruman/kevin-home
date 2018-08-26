package com.dev.kev.view;

import com.dev.kev.design.KevDesign;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;

@SuppressWarnings("serial")
@SpringView(name = "")
public class KevView extends KevDesign implements View {
	
	public void enter(ViewChangeEvent event) {
		listenerSetting();
    }
	
	void listenerSetting() {
		img_ig.addClickListener(e -> {
			getUI().getPage().open("https://instagram.com/kevintruman", null);
		});
	}

}
