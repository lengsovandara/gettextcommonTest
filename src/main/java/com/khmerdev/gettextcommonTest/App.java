package com.khmerdev.gettextcommonTest;

import java.io.File;

import org.xnap.commons.i18n.I18n;
import org.xnap.commons.i18n.I18nFactory;

/**
 * Hello world!
 *
 */
public class App 
{
//	 private static I18n i18n = I18nFactory.getI18n(App.class);
	private static I18n i18n = I18nFactory.getI18n(App.class, "com.khmerdev.gettextcommonTest.Messages", java.util.Locale.FRANCE);
	
    public static void main( String[] args )
    {    	    
        System.out.println( "Hello World!" );
        
        System.out.println(i18n.tr("This text will be translated"));    	
        
    	System.out.println(i18n.trn("Copied file.", "Copied files.", 1)); // will print "Copied file."
    	System.out.println(i18n.trn("Copied file.", "Copied files.", 4)); // will print "Copied files."    	
    	
    	System.out.println(i18n.tr("Folder: {0}", new File("/home/xnap-commons")));
    	System.out.println(i18n.tr("It''s {0} o''clock.", 6)); 
    	/// Will print "It's 6 o'clock". Note the double apostrophes. 
    	// See Java documentation about java.text.MessageFormat. 
    	System.out.println(i18n.trn("Night {0} of 1001", "More than 1001 nights! {0} already!", 1002, new Integer(1024))); 
    	// Will print "More than 1001 nights! 1024 already!"
    	
    	System.out.println(i18n.trc("chat (verb)", "chat")); 
    	System.out.println(i18n.trc("chat (noun)", "chat"));
    }
}
