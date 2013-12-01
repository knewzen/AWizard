package dev.dworks.lib.wizard.demo;

import android.os.Bundle;

import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

import dev.dworks.lib.wizard.WizardActivity;

public class OrderWizardActivity extends WizardActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		mWizardModel = new SandwichWizardModel(this);
		super.onCreate(savedInstanceState);
		setWizardModel(mWizardModel);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.order, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			finish();
			break;
		case R.id.action_cancel:
			finish();
			break;
		}
		return super.onOptionsItemSelected(item);
	}
}
