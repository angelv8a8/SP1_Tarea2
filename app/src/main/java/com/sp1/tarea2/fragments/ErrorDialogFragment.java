 package com.sp1.tarea2.fragments;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class ErrorDialogFragment extends DialogFragment {

	
	private Dialog dialog = null;
	
	public ErrorDialogFragment()
	{
		 super();
	}
	
	public void setDalog(Dialog dialog)
	{
		this.dialog = dialog;
	}
	
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		
		return dialog;
	}
	
}
