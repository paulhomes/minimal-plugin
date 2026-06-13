package com.platformadmin.minimalplugin;

import com.sas.console.ConsoleInterface;
import com.sas.console.plugins.AbstractPlugin;
import com.sas.console.plugins.NodeInterface;
import com.sas.console.plugins.PluginNavigationInterface;
import com.sas.workspace.plugins.AboutInterface;

public class MinimalPlugin extends AbstractPlugin implements PluginNavigationInterface {
    private final About about = new About();

    public MinimalPlugin(final ConsoleInterface console) {
        super(console);
        setName("MinimalPlugin");
        setDescription("MinimalPlugin Description");
    }

    public String getCategoryID() {
        return PluginNavigationInterface.ENVIRONMENT;
    }

    public NodeInterface getRootNode() {
        return new MinimalNode(this);
    }

    public AboutInterface getAbout() {
        return about;
    }

    public String getTooltip() {
        return "MinimalPlugin Tooltip";
    }

    public boolean supportsDropOperations() {
        return false;
    }

}