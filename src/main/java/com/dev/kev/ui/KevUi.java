package com.dev.kev.ui;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.ui.Component;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
@SpringUI
@SpringViewDisplay
public class KevUi extends UI implements ViewDisplay {

	@Override
	public void showView(View view) {
		// TODO Auto-generated method stub
		this.setContent((Component) view);
	}

	@Override
	protected void init(VaadinRequest request) {
		// TODO Auto-generated method stub

	}

}
