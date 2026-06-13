package com.platformadmin.minimalplugin;

import com.sas.workspace.plugins.AboutInterface;

import javax.swing.ImageIcon;
import java.util.Vector;

public class About implements AboutInterface {

    public About() {
    }

    public ImageIcon getImage() {
        return null;
    }

    public String getFormalName() {
        return "MinimalPlugin FormalName";
    }

    public String getVersion() {
        return "MinimalPlugin Version";
    }

    public String getDescription() {
        return "MinimalPlugin Description";
    }

    public String getCopyright() {
        return "MinimalPlugin Copyright";
    }

    public Vector getAdditionalInfo() {
        Vector info = new Vector();
        info.add("MinimalPlugin AdditionalInfo1");
        info.add("MinimalPlugin AdditionalInfo2");
        return info;
    }

}