package com.redmart.groceries.search.repository;

import com.redmart.groceries.common.repository.State;

public interface ISearchRepositoryCallback {
    void onStateChanged(@State int state);

}
