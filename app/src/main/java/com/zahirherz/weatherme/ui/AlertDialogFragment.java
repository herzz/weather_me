package com.zahirherz.weatherme.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import com.zahirherz.weatherme.R;

/**
 * Created by zahirh on 9/16/15.
 */
public class AlertDialogFragment extends DialogFragment{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(R.string.error_title)
                .setMessage(R.string.error_msg)
                .setPositiveButton(R.string.error_ok_btn_text, null);

        AlertDialog dialog = builder.create();
        return dialog;
    }
}
