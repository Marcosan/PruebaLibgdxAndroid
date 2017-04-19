package com.mygdx.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.mygdx.game.MyGdxGame;

public class AndroidLauncher extends AppCompatActivity {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		//initialize(new MyGdxGame(), config);
		setContentView(R.layout.activity_main);
	}
}
