package com.example.ejemplowebview;

import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity 
{
	private WebView ventana;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ventana = (WebView) findViewById(R.id.webview);
		ventana.getSettings().setJavaScriptEnabled(true); //Habilita javascript que por defecto en el webview viene desactivado
		ventana.getSettings().setBuiltInZoomControls(true); //Habilita el zoom
		//ventana.loadUrl("http://desarrolloweb.com");
		ventana.loadUrl("http://galapagosislands.com");
		
		ventana.setWebViewClient(new WebViewClient()
		{
			public boolean shouldOverrideUrlLoading(WebView view, String url)
			{
				return false;
			}
		});
	}

}
