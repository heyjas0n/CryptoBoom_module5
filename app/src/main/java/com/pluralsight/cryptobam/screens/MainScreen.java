package com.pluralsight.cryptobam.screens;

import com.pluralsight.cryptobam.recview.CoinModel;

import java.util.List;

/**
 * Created by Jason on 3/23/2018.
 */

public interface MainScreen {
    void updateData(List<CoinModel> data);
    void setError(String msg);
}
