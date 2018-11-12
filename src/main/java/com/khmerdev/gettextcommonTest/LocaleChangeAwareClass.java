package com.khmerdev.gettextcommonTest;

import org.xnap.commons.i18n.I18n;
import org.xnap.commons.i18n.I18nFactory;
import org.xnap.commons.i18n.I18nManager;
import org.xnap.commons.i18n.LocaleChangeEvent;
import org.xnap.commons.i18n.LocaleChangeListener;

public class LocaleChangeAwareClass implements LocaleChangeListener {
	
	private static I18n i18n = I18nFactory.getI18n(LocaleChangeAwareClass.class);
	
	String localizedString;
	
	
	
	public LocaleChangeAwareClass() {
		localizedString = i18n.tr("Hello, World");
        I18nManager.getInstance().addWeakLocaleChangeListener(this);
	}
	public void localeChanged(LocaleChangeEvent event) {
		// TODO Auto-generated method stub
		// update strings
        localizedString = i18n.tr("Hello, World");
	}
	

}
