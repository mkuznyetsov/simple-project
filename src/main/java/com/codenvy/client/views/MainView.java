package com.codenvy.client.views;

import com.codenvy.client.User;
import com.codenvy.client.presenters.MainPresenter;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.IsWidget;

import java.util.List;

public interface MainView extends IsWidget{
    void setInfoText(String text);

    void setPresenter(MainPresenter presenter);

    void setUsers(List<User> users);

    void setEditButtonEnabled(boolean enabled);

    void setDeleteButtonEnabled(boolean enabled);
}
