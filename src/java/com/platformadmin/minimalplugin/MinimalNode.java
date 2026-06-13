package com.platformadmin.minimalplugin;

import com.sas.console.plugins.AbstractNode;
import com.sas.console.plugins.TableModelInterface;

import java.util.List;

public class MinimalNode extends AbstractNode {

    public MinimalNode(final MinimalPlugin plugin) {
        super(plugin);
        setName(plugin.getName());
    }

    public TableModelInterface getListViewData() {
        return null;
    }

    public void refresh() {
        // do nothing
    }

    public List getContextMenuActions() {
        return null;
    }

    public List getToolBarActions() {
        return null;
    }

}