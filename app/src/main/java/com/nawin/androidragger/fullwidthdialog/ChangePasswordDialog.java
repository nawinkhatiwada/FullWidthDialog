package com.nawin.androidragger.fullwidthdialog;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;


/**
 * Created on 11/24/17.
 */

public class ChangePasswordDialog extends DialogFragment {
    private Dialog dialog;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        dialog = new Dialog(getActivity(), R.style.FullWidth_Dialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_change_password, null);
        dialog.setContentView(view);
        dialog.show();
        return dialog;
    }
}
