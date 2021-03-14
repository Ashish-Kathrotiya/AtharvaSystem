package demo.AtharvaSystem.pages;

import java.io.IOException;

public class testMain {

	public static void main(String[] args) throws IOException {
		
		verifyallAvailableLinks verifyLinks = new verifyallAvailableLinks();
		
		verifyLinks.launchBrowser();
		verifyLinks.fatchAllAvailableLinks();
		 verifyLinks.iterateTheListandHitTheLinks();
	}

}
