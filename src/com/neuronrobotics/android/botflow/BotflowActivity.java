package com.neuronrobotics.android.botflow;

import android.os.Bundle;

public class BotflowActivity extends org.ruboto.EntryPointActivity {
	public void onCreate(Bundle bundle) {
		getScriptInfo().setRubyClassName(getClass().getSimpleName());
	    super.onCreate(bundle);
	}
}
