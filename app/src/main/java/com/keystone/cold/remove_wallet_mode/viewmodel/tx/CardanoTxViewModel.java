package com.keystone.cold.remove_wallet_mode.viewmodel.tx;

import android.app.Application;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.keystone.cold.remove_wallet_mode.ui.fragment.main.tx.cardano.CardanoTransaction;

import org.json.JSONObject;

public class CardanoTxViewModel extends BaseTxViewModel<CardanoTransaction> {


    public CardanoTxViewModel(@NonNull Application application) {
        super(application);
    }

    @Override
    public void parseTxData(Bundle bundle) {

    }

    @Override
    public MutableLiveData<JSONObject> parseMessage(Bundle bundle) {
        return null;
    }

    @Override
    public void handleSign() {

    }

    @Override
    public void handleSignMessage() {

    }

    @Override
    public String getSignatureUR() {
        return null;
    }
}
